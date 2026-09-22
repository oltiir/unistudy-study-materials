# 11 - Hash Tables

## Burimet e mbuluara

- `34HashTables.pdf`
- `Hash Tables - Detyra të zgjidhura.docx`
- `Hash Tables - Detyra të zgjidhura me Stringje.docx`
- `Hash Tables - Detyrat e shtëpisë.docx`
- `Double Hashing with Strings & Cuckoo Hashing.docx`

## Plani bazë

Hash function e kthen key në indeks `0..M-1`. Dy keys të ndryshme mund të japin të njëjtin indeks: **collision**. Hash table duhet të ketë:

1. hash function të mirë;
2. kontroll me `equals`;
3. strategji për collision;
4. resize/rehash për load factor të shëndoshë.

Expected `O(1)` vlen nën shpërndarje të mirë; worst case është `O(N)`.

## Kontrata equals-hashCode

Nëse `x.equals(y)`, patjetër `x.hashCode()==y.hashCode()`. E kundërta nuk është e domosdoshme. Për objekte të personalizuara përfshi të njëjtat fusha logjike në `equals` dhe `hashCode`.

Indeksi tipik Java:

```java
(key.hashCode() & 0x7fffffff) % M
```

Maska shmang indeks negativ.

## Horner për String

Java String përdor bazë 31:

`h = s[0]*31^(L-1) + ... + s[L-1]`.

Llogaritja iteruese është më e sigurt:

```text
h = 0
for çdo karakter c:
    h = 31*h + code(c)
```

Për `COOL`: nis me C=67, pastaj `h=31h+79`, përsëri O=79, pastaj L=76. Pas kësaj apliko modulo `M` sipas detyrës.

## Separate chaining

Array me `M` buckets; çdo bucket është linked list.

- Hash në bucket `i`.
- Search/put vetëm në listën `i`.
- Collision ruhet në të njëjtin bucket.

Load factor `alpha=N/M` është gjatësia mesatare e zinxhirit. Materiali teorik synon konstante dhe sugjeron resize sipas kufijve. Në detyrat e ushtrimeve mund të jepen rregulla specifike 3/5; ndiq rregullin e detyrës edhe nëse ndryshon nga implementimi i ligjëratës.

## Linear probing

Open addressing: çdo slot mban maksimum një key; provo slotet vijues:

`h_i(x) = (f(x) + i) mod M`, `i=0,1,2...`.

Search ndalon kur gjen key ose slot vërtet bosh. Wrap-around bëhet me modulo. `M>N` dhe load factor zakonisht mbahet `<=1/2` për performancë.

Problem: primary clustering.

## Quadratic probing

Sipas materialit të ushtrimeve:

`h_i(x) = (f(x) + i + i²) mod M`.

Gjithmonë përdor formulën që jep profesori, sepse variante të tjera përdorin `c1*i+c2*i²`. Shëno `i=0` për tentimin e parë dhe rrite vetëm pas collision.

## Double hashing

`h_i(x) = (h1(x) + i*h2(x)) mod M`.

Në material:

- `h1(x)=f(x) mod M`;
- `h2(x)=M-(f(x) mod M)`.

Hapi duhet të jetë jo-zero dhe relativisht prime me `M` që të vizitohen slotet. `M` prime e lehtëson këtë.

Shembull: nëse `M=13`, `f(x) mod 13=5`, atëherë `h2=8`; tentimet janë `5,0,8,3,...` modulo 13.

## Cuckoo hashing

Ka dy pozita të mundshme nga dy hash functions. Në insert, nëse pozita është e zënë, key e re e dëbon të vjetrën; e vjetra shkon në pozitën alternative. Cikli i dëbimeve mund të kërkojë rehash. Search kontrollon vetëm pozitat kandidate, prandaj ka worst-case konstant për lookup në modelin ideal.

## Rolling hash

Përdoret për window të String-ut: nga hash i dritares aktuale hiq kontributin e karakterit që del, shumëzo me bazën dhe shto karakterin e ri. Është ide qendrore në Rabin-Karp; collision duhet verifikuar me krahasim real.

## Deletion

- Chaining: hiq node nga lista.
- Linear probing: nuk mund të vendosësh thjesht `null`, sepse do të prishej rruga e kërkimit. Përdor tombstone ose rehash cluster-in pasues.
- Cuckoo: hiq nga njëra prej dy pozitave.

## Resize dhe rehash

Kur `M` ndryshon, duhet të rillogaritet indeksi për çdo key, sepse `hash % M` ndryshon. Kopjimi i slotit në të njëjtin indeks është gabim.

## Chaining kundrejt probing

| Veti | Chaining | Linear probing |
|---|---|---|
| Load factor | mund të jetë >1 | duhet <1, zakonisht <=1/2 |
| Collision | linked list | slot tjetër |
| Cache | më dobët | më mirë |
| Deletion | e thjeshtë | delikate |
| Clustering | më pak sensitiv | primary clustering |

## Hash table kundrejt balanced tree

Hash table është më e shpejtë expected për simple keys dhe nuk kërkon rend. Red-black BST ka garanci `O(log N)` dhe mbështet `min`, `max`, `floor`, ranges dhe iterim të renditur.

## Algorithmic complexity attack

Një kundërshtar mund të zgjedhë keys që kolidojnë dhe ta kthejë `HashMap` nga expected `O(1)` në `O(N)`. Hash cryptographic është më rezistent, por zakonisht shumë i shtrenjtë për symbol table të zakonshme.

## Gabimet tipike

- Fillon probing me `i=1` në vend të `i=0`.
- Harron modulo pas çdo tentimi.
- Në double hashing e rillogarit `h2` me `i` ose e lejon zero.
- Nuk rehash pas resize.
- Te String përdor pozitën e karakterit në vend të kodit ASCII/Unicode.
- Thotë se collision do të thotë keys të barabarta.

## Kontrolli i njohurive

1. Cila është kontrata mes `equals` dhe `hashCode`?
2. Pse linear probing nuk mund të ketë `M==N` të mbushur plot?
3. Pse duhet rehash pas resize?
4. Dallimi mes chaining dhe open addressing?

## Ushtrime

- Linear: `f(x)=2x-1`, keys `6,48,36,27,42,26,38,29,17,5`.
- Double: `f(x)=3x²+x`, keys `12,47,11,19,43,2,36,15,31`.
- Separate chaining: `f(x)=4x-1`, keys `31,14,42,70,10,28,44,91,16,22`.
- Quadratic: `f(x)=3x-2`, keys `7,25,11,52,13,25,34,72,85,94`.
