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
