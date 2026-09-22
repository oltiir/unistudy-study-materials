# 12 - Searching Applications

## Burimi i mbuluar

- `35SearchingApplications.pdf`

Kjo temë tregon si kombinohen `SET` dhe `ST` për probleme reale. Në provim prit pyetje “cili është key, cili value dhe cilën strukturë zgjedhim?”.

## Set

Set ruan keys unikë, pa values të lidhura. API: `add`, `contains`, `remove`, `size`, `iterator`.

Mund të implementohet si symbol table ku value është një placeholder, ose me `HashSet`/`TreeSet`.

## WhiteList dhe BlackList

1. Lexo listën dhe fute në Set.
2. Lexo inputin.
3. WhiteList printon vetëm keys që gjenden.
4. BlackList printon vetëm keys që nuk gjenden.

Aplikime: spell checker, visited URLs, parental control, spam IPs, karta të vjedhura.

Kompleksiteti për `N` keys të listës dhe `Q` queries varet nga Set: me hash, expected `O(N+Q)`; me balanced tree `O((N+Q)log N)`.

## Dictionary lookup

Nga CSV zgjidhen fusha key dhe value. Ndërtohet `ST<String,String>` dhe për çdo query bëhet `get`.

Shembuj:

- domain -> IP;
- IP -> domain (indeks i kundërt);
- codon -> amino acid;
- login -> emër/seksion.

Nëse një key mund të ketë shumë values, `ST<Key,Value>` nuk mjafton; përdor `ST<Key,SET<Value>>`.

## Inverted index / FileIndex

Qëllimi: për një fjalë gjej të gjithë skedarët ku shfaqet.

- Key: fjala.
- Value: Set i skedarëve.

```text
for çdo file:
    for çdo word:
        nëse key mungon, krijo Set bosh
        shto file në Set-in e word
```

Set shmang që i njëjti file të përsëritet për të njëjtën fjalë.

## Concordance

Qëllimi: për një fjalë gjej çdo pozitë dhe kontekstin rreth saj.

- Key: fjala.
- Value: Set/list e indekseve ku shfaqet.

Pas query, për çdo indeks `k` printohen fjalët p.sh. `k-4..k+4`, me kontroll kufijsh.

File index ruan dokumentet; concordance ruan pozitat brenda tekstit.

## Sparse vector

Në vector shumë të madh me pak elemente jo-zero, array shpenzon `O(N)` hapësirë. Symbol table ruan vetëm:

- key = indeks;
- value = vlera jo-zero.

`get(i)` kthen 0 kur key mungon. Dot product me dense vector iteron vetëm në `nnz` indekset jo-zero:

`sum += this[i] * that[i]`.

Koha `O(nnz)`, hapësira `O(nnz)`, ku `nnz` është numri i elementeve jo-zero.

## Sparse matrix

Matrica përfaqësohet si array i sparse vectors, një për çdo rresht. Matrix-vector multiplication llogarit dot product për secilin rresht. Në vend të `O(N²)`, puna bëhet proporcionale me numrin total të vlerave jo-zero, plus overhead për rreshtat.

## Zgjedhja e strukturës

| Nevoja | Struktura |
|---|---|
| vetëm membership | Set |
| një value për key | `ST<Key,Value>` |
| shumë values për key | `ST<Key,SET<Value>>` |
| rend/range/floor | Tree-based ST/Set |
| lookup i shpejtë pa rend | Hash-based ST/Set |
| të dhëna numerike sparse | ST indeks -> vlerë |

## Gabimet tipike

- Përdor list në vend të Set dhe krijon duplikate.
- Ndërron key/value në inverted index.
- Në dictionary me repeated key mbishkruan value kur duhej Set.
- Sparse vector ruan edhe zeros dhe humb përfitimin.
- Dot product iteron në të gjithë `N` në vend të vetëm keys jo-zero.

## Kontrolli i njohurive

1. Dallimi mes Set dhe Symbol Table?
2. Cilat janë key/value në FileIndex dhe Concordance?
3. Pse përdoret `SET<File>` si value?
4. Çfarë përfitimi jep sparse representation?

## Ushtrime

1. Dizajno indeks: student -> kurset dhe kurs -> studentët.
2. Jep strukturën për search engine të thjeshtë: fjalë -> dokumente -> pozita.
3. Për vector me `N=1,000,000` dhe 20 vlera jo-zero, krahaso hapësirën dhe punën e dot product me array dhe sparse ST.
