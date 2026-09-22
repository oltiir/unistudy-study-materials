# Cheat Sheet - Hyrje në Algoritme

## Kompleksitetet

`1 < log N < N < N log N < N² < N³ < 2^N`

- Cikle njëri pas tjetrit: mblidhi, mbaj dominuesin.
- Cikle të futura: shumëzoji.
- `i++`: zakonisht `N`; `i*=2`: `log N`.
- `1+2+...+N = N(N+1)/2 = Theta(N²)`.

## Sortimet

| Algoritmi | Best | Average | Worst | Stable | In-place |
|---|---:|---:|---:|---|---|
| Selection | `N²` | `N²` | `N²` | Jo | Po |
| Insertion | `N` | `N²` | `N²` | Po | Po |
| Shell 3x+1 | - | varet | rreth `N^(3/2)` në material | Jo | Po |
| Merge | `N log N` | `N log N` | `N log N` | Po | Jo |
| Quick | `N log N` | `N log N` | `N²` | Jo | Po |
| 3-way Quick | `N` me pak vlera unike | `N log N` | `N²` | Jo | Po |
| Heap | `N log N` | `N log N` | `N log N` | Jo | Po |

## Invariantet

- Selection: prefix final i sortuar.
- Insertion: prefix i sortuar, jo domosdo final.
- Merge: output prefix ka elementet më të vegjël të dy gjysmave.
- Quick 2-way: pas partition, pivot final.
- Quick 3-way: `<v | =v | unknown | >v`.
- Heap sortdown: prefix heap, suffix final i sortuar.

## Stack / Queue

- Stack = LIFO: `push/pop` në majë.
- Queue = FIFO: `enqueue` në fund, `dequeue` në fillim.
- Postfix operator: `right=pop`, `left=pop`, pastaj `left op right`.
- Resizing array: double kur plot, half kur 1/4 plot.

## Heap

Me indeksim 1-based:

- parent `k/2`;
- children `2k`, `2k+1`;
- insert -> fund + `swim`;
- delMax -> swap root/fund + `sink`;
- construction: `k=N/2` deri `1`;
- sortdown: swap `1,N`, `N--`, sink.

## Symbol table

- `put`, `get`, `delete`, `contains`, `keys`.
- `rank(k)` = sa keys janë `<k`.
- `select(r)` = key me rank `r`.
- `floor(k)` = max key `<=k`.
- `ceiling(k)` = min key `>=k`.

## BST

- Majtas `< root`, djathtas `> root`.
- Search/insert/delete `O(h)`.
- Inorder LVR = ascending.
- Preorder VLR; Postorder LRV.
- Delete me 2 fëmijë: successor `min(right)` ose predecessor `max(left)`.

## Red-black BST

Rregullat:

1. red-right -> rotateLeft;
2. red-left-left -> rotateRight;
3. dy fëmijë red -> flipColors;
4. root black.

Red link majtas bashkon dy nodes në një 3-node.

## Hashing

- Linear: `(f(x)+i) mod M`.
- Quadratic në material: `(f(x)+i+i²) mod M`.
- Double: `(h1(x)+i*h2(x)) mod M`.
- Materiali: `h1=f mod M`, `h2=M-(f mod M)`.
- String Horner: `h=31*h+charCode`.
- Resize kërkon rehash.
- Chaining: shumë keys në bucket/list.
- Open addressing: një key për slot, provo slot tjetër.

## Pyetjet që duhet t'i bësh vetes

1. Cili është input size `N`?
2. Cili invariant duhet të mbahet?
3. Cilat janë pointerët dhe kufijtë?
4. A ka duplikate?
5. A kërkohet stable/in-place/ordered operations?
6. A po analizoj average apo worst case?
