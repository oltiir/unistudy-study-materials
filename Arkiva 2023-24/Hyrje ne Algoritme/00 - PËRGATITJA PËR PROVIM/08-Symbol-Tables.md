# 08 - Symbol Tables

## Burimi i mbuluar

- `31ElementarySymbolTables.pdf`

## Abstraksioni key-value

Symbol table lidh një **key** unik me një **value**. Njihet edhe si map/dictionary/associative array.

API bazë:

- `put(key,value)`: insert ose update;
- `get(key)`: value ose `null` nëse mungon;
- `contains`, `delete`, `size`, `isEmpty`, `keys`.

Konventa e materialit: values nuk janë `null`; prandaj `contains(k)` mund të jetë `get(k)!=null`. Çelësat duhet të jenë immutable, sepse ndryshimi i key pas insertimit prish kërkimin.

## equals, compareTo dhe hashCode

- `equals`: barazi logjike; duhet reflexive, symmetric, transitive dhe false ndaj null.
- `compareTo`: rend total; përdoret nga strukturat e renditura.
- `hashCode`: përdoret nga hash tables; nëse `x.equals(y)`, hash codes duhet të jenë të njëjta.

## Sequential search në linked list

Ruhet listë e pasortuar me çifte key-value.

- Search: skano deri te key -> worst `O(N)`.
- Put: skano për update; nëse mungon, shto në fillim -> worst `O(N)` për shkak të kontrollit të duplikatit.
- Mesatarisht search hit rreth `N/2` krahasime.

Avantazh: implementim i thjeshtë dhe pa kërkesë për rend.

## Ordered array dhe binary search

Mbahen dy arrays paralele `keys[]`, `vals[]`, të renditura sipas key.

`rank(key)` kthen numrin e keys më të vegjël se key; nëse key ekziston, është indeksi i tij; nëse jo, është pozita ku duhet futur.

```java
int rank(Key key) {
    int lo=0, hi=N-1;
    while (lo<=hi) {
        int mid=lo+(hi-lo)/2;
        int cmp=key.compareTo(keys[mid]);
        if (cmp<0) hi=mid-1;
        else if (cmp>0) lo=mid+1;
        else return mid;
    }
    return lo;
}
```

- Search `O(log N)`.
- Insert/delete `O(N)` sepse duhet zhvendosur suffix-i.
- Iterim i renditur `O(N)`.

## Ordered operations

- `min`, `max`;
- `floor(k)`: key më i madh `<= k`;
- `ceiling(k)`: key më i vogël `>= k`;
- `rank(k)`: numri i keys `< k`;
- `select(r)`: key me rank `r`;
- range `keys(lo,hi)` dhe `size(lo,hi)`.

Në ordered array: `min/max/select` janë `O(1)`; `floor/ceiling/rank` `O(log N)`; insertion mbetet `O(N)`.

## Shembull

Keys: `[A,C,E,H,L,M,P,R,S,X]`.

- `rank(P)=6`;
- `select(6)=P`;
- `floor(Q)=P`;
- `ceiling(Q)=R`;
- search për Q mbaron me `lo=7`, që është pozita e insertimit.

## Shembuj të zgjidhur hap pas hapi

### `put` bën update, jo key të dytë

Fut sekuencën `S,E,A,R,C,H,E`, ku value është indeksi i karakterit:

| Hapi | `put` | Çfarë ndodh | Size |
|---:|---|---|---:|
| 0 | `S -> 0` | key i ri | 1 |
| 1 | `E -> 1` | key i ri | 2 |
| 2 | `A -> 2` | key i ri | 3 |
| 3 | `R -> 3` | key i ri | 4 |
| 4 | `C -> 4` | key i ri | 5 |
| 5 | `H -> 5` | key i ri | 6 |
| 6 | `E -> 6` | `E` ekziston; value `1` zëvendësohet me `6` | 6 |

Gjendja logjike finale është `{A:2, C:4, E:6, H:5, R:3, S:0}`. Renditja fizike varet nga implementimi, por key `E` shfaqet vetëm një herë.

### Binary search dhe `rank`

Në keys `[A,C,E,H,L,M,P,R,S,X]` kërko `Q`:

1. `lo=0, hi=9, mid=4`: `keys[4]=L`; `Q>L`, prandaj `lo=5`.
2. `mid=7`: key është `R`; `Q<R`, prandaj `hi=6`.
3. `mid=5`: key është `M`; `Q>M`, prandaj `lo=6`.
4. `mid=6`: key është `P`; `Q>P`, prandaj `lo=7`.
5. Tani `lo=7>hi=6`; `Q` mungon dhe `rank(Q)=7`.

Pozita 7 është para `R`; prandaj `floor(Q)=P` dhe `ceiling(Q)=R`.

### Detyrë për ty

Për keys `[B,D,G,K,N,T]`, gjej me trace të plotë `rank(H)`, `floor(H)`, `ceiling(H)` dhe pozitën ku do të insertohej `H`. Pastaj përsërite për key ekzistues `K` dhe shpjego pse `rank(K)` është edhe indeksi i tij.

## Zgjedhja e implementimit

| Implementimi | Search | Insert | Ordered ops |
|---|---:|---:|---|
| unordered linked list | `N` | `N` | Jo |
| ordered array | `log N` | `N` | Po |
| BST | varet nga lartësia | varet nga lartësia | Po |
| red-black BST | `log N` | `log N` | Po |
| hash table | expected `1` | expected `1` | Jo |

## Gabimet tipike

- Mendon se binary search e bën insertimin `O(log N)`; gjetja po, zhvendosja jo.
- Ngatërron `rank` me value.
- Përdor key mutable.
- Lejon dy entries me key të njëjtë në vend që `put` të bëjë update.

## Kontrolli i njohurive

1. Çfarë kthen `rank` kur key mungon?
2. Dallimi mes `floor` dhe `ceiling`?
3. Pse ordered array ka insert linear?
4. Kur do të zgjidhje linked list në vend të ordered array?

## Ushtrim

Ndërto tabelën për sekuencën `S E A R C H E X A M P L E`, ku value është indeksi i fundit. Shkruaj gjendjen pas çdo update dhe pastaj gjej `rank(G)`, `floor(G)`, `ceiling(G)`.
