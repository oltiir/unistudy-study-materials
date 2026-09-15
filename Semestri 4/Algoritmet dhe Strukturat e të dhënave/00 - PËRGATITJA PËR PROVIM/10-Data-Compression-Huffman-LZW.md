# 10 - Data Compression: Huffman dhe LZW

Video përkatëse: [Ligjërata 11](https://www.youtube.com/watch?v=bIy2dd4gFOs) dhe [Ushtrimi 11](https://www.youtube.com/watch?v=5_NZc0FpNHA).

## 1. Çka është kompresimi?

Kompresimi e paraqet informacionin me më pak bitë.

### Lossless

Pas dekompresimit merret saktësisht input-i origjinal.

Shembuj: ZIP, PNG, Huffman, LZW.

### Lossy

Disa informacione humben për të arritur kompresim më të madh.

Shembuj: JPEG me humbje, MP3.

Në këtë lëndë Huffman dhe LZW janë lossless.

## 2. Bit, byte dhe kodim

- bit është 0 ose 1;
- 8 bitë janë 1 byte;
- ASCII klasik përdor 7/8 bitë për karakter, varësisht reprezentimit;
- fixed-length code përdor të njëjtin numër bitësh për çdo simbol;
- variable-length code lejon gjatësi të ndryshme.

Në variable-length code duhet të dimë ku përfundon një kod dhe fillon tjetri.

## 3. Prefix-free code

Kodi është prefix-free nëse asnjë kod i një simboli nuk është prefix i kodit të një simboli tjetër.

Kod i vlefshëm:

```text
A = 0
B = 10
C = 110
D = 111
```

`0` nuk është fillimi i kodeve tjera; `10` nuk është fillimi i një kodi tjetër.

Kod i pavlefshëm:

```text
A = 0
B = 01
```

Kur lexojmë `01`, nuk dimë nëse është A pastaj diçka tjetër, apo B.

Pemët binare prodhojnë natyrshëm kode prefix-free: kodi i simbolit është rruga nga root te leaf.

## 4. Huffman Coding

Huffman u jep kode të shkurtra simboleve të shpeshta dhe kode më të gjata simboleve të rralla.

### Input-i i algoritmit

Frekuenca e çdo simboli.

### Struktura

Min-priority queue me nyja.

Çdo nyjë ka:

- simbol, nëse është leaf;
- frekuencë;
- child majtas;
- child djathtas.

## 5. Ndërtimi i Huffman Trie

1. Numëro frekuencat.
2. Krijo nga një leaf për secilin simbol me frekuencë pozitive.
3. Fut leaves në min-PQ sipas frekuencës.
4. Nxirr dy nyjat me frekuencën më të vogël.
5. Krijo parent me shumën e frekuencave.
6. Fut parent prapa në PQ.
7. Përsërit derisa të mbetet një nyjë: root.

```text
while pq.size > 1:
    left = pq.delMin()
    right = pq.delMin()
    parent = Node(freq = left.freq + right.freq)
    parent.left = left
    parent.right = right
    pq.insert(parent)
```

## 6. Shembull i plotë: MISSISSIPPI

Frekuencat:

| Simboli | M | I | S | P |
|---|---:|---:|---:|---:|
| Frekuenca | 1 | 4 | 4 | 2 |

### Bashkimet

1. Nxirr M(1) dhe P(2); krijo nyjën 3.
2. Queue ka 3, I(4), S(4).
3. Nxirr 3 dhe një nga frekuencat 4; krijo 7.
4. Bashko 4 dhe 7; root ka 11.

Për shkak të barazimit I(4)/S(4), forma mund të ndryshojë. Një kod i vlefshëm:

```text
I = 0
S = 11
P = 101
M = 100
```

### Kompresimi

`MISSISSIPPI` bëhet:

```text
M   I S  S  I S  S  I P   P   I
100 0 11 11 0 11 11 0 101 101 0
```

Payload ka:

```text
M: 1 * 3 = 3 bitë
I: 4 * 1 = 4 bitë
S: 4 * 2 = 8 bitë
P: 2 * 3 = 6 bitë
Total = 21 bitë
```

Kjo nuk përfshin overhead-in e ruajtjes/transmetimit të trie-së ose tabelës së kodeve.

## 7. Krijimi i code table nga trie

Ec nga root:

- majtas shto `0`;
- djathtas shto `1`;
- kur arrin leaf, rruga është kodi.

```text
buildCode(node x, prefix):
    nëse x është leaf:
        code[x.char] = prefix
        kthehu

    buildCode(x.left, prefix + "0")
    buildCode(x.right, prefix + "1")
```

## 8. Huffman decompression

1. Fillo në root.
2. Lexo bit.
3. Për 0 shko majtas; për 1 shko djathtas.
4. Kur arrin leaf, output simbolin.
5. Kthehu në root dhe vazhdo me bitin tjetër.

Prefix-free siguron se çdo leaf e përcakton qartë fundin e një kodi.

## 9. Serializimi i trie-së

Decoder duhet ta njohë pemën. Një mënyrë:

- shkruaj `1` për leaf, pastaj karakterin;
- shkruaj `0` për internal node, pastaj serializo majtas dhe djathtas.

Në stream duhen zakonisht:

1. reprezentimi i trie-së;
2. numri i karaktereve origjinale;
3. payload-i i kompresuar.

Numri origjinal ndihmon decoder-in të dijë kur të ndalet, sidomos kur byte-i i fundit ka padding bits.

## 10. Optimaliteti i Huffman

Huffman prodhon prefix-free code optimal për frekuencat e dhëna: minimizon shumën e peshuar të gjatësive të kodeve.

```text
cost = Σ frequency(symbol) * codeLength(symbol)
```

Ai nuk garanton kompresimin më të mirë të mundshëm për çdo model kompleks të të dhënave; është optimal brenda klasës së symbol-by-symbol prefix codes për frekuencat e dhëna.

## 11. Run-Length Encoding - ide bazë

RLE zëvendëson seri të njëjta me `(simbol, numër)`.

```text
AAAAABBCCC -> A5 B2 C3
```

Punon mirë kur ka shumë përsëritje të njëpasnjëshme. Mund ta zmadhojë input-in kur simboli ndryshon shpesh.

## 12. LZW

LZW kodifikon stringje që përsëriten, jo vetëm karaktere individuale.

Encoder dhe decoder fillojnë me të njëjtin dictionary bazë dhe i shtojnë hyrjet në të njëjtin rend. Prandaj dictionary nuk ka nevojë të transmetohet i plotë.

## 13. LZW compression

Dictionary fillestar përmban karakteret bazë.

Algoritmi:

1. Gjej prefix-in më të gjatë `w` të input-it që ekziston në dictionary.
2. Output kodin e `w`.
3. Nëse ka karakter të ardhshëm `c`, shto `w+c` në dictionary.
4. Vazhdo nga karakteri `c`.

Formë tjetër ekuivalente:

```text
w = karakteri i parë

për çdo karakter të ardhshëm c:
    nëse w+c ekziston në dictionary:
        w = w+c
    përndryshe:
        output code(w)
        shto w+c në dictionary
        w = c

output code(w)
```

## 14. Shembull LZW i vogël

Input:

```text
ABABABA
```

Supozojmë dictionary fillestar:

```text
A=1, B=2
```

Kodet e reja fillojnë nga 3.

| Hapi | w | c | w+c në dictionary? | Output | Hyrja e re |
|---:|---|---|---|---|---|
| 1 | A | B | jo | 1 | AB=3 |
| 2 | B | A | jo | 2 | BA=4 |
| 3 | A | B | po | - | w bëhet AB |
| 4 | AB | A | jo | 3 | ABA=5 |
| 5 | A | B | po | - | w bëhet AB |
| 6 | AB | A | po | - | w bëhet ABA |
| fund | ABA | - | - | 5 | - |

Output:

```text
1, 2, 3, 5
```

## 15. LZW decompression

Decoder fillon me dictionary bazë.

Në mënyrë konceptuale:

1. Lexo kodin e parë dhe output stringun e tij.
2. Lexo kodin tjetër dhe gjej stringun përkatës.
3. Shto në dictionary: `previousString + firstCharacter(currentString)`.
4. Output currentString.
5. Vazhdo.

### Rasti special

Ndonjëherë merret një kod që sapo do të krijohet dhe nuk është ende në dictionary të decoder-it.

Në atë rast:

```text
currentString = previousString + firstCharacter(previousString)
```

Ky nuk është gabim; është rast i parashikuar i LZW.

## 16. Huffman kundrejt LZW

| Huffman | LZW |
|---|---|
| Bazohet në frekuenca simbolesh | Bazohet në stringje/patterns që përsëriten |
| Ndërton binary trie | Ndërton dictionary |
| Kodet kanë gjatësi të ndryshme | Zakonisht output janë kode dictionary |
| Duhet të përshkruhet trie/code table | Dictionary rikrijohet nga decoder-i |
| Përdor min-PQ | Përdor symbol table/dictionary |

## 17. Gabimet klasike

1. Të bashkohen dy frekuencat më të mëdha në Huffman; duhen dy më të voglat.
2. Të harrohet kthimi i parent-it në priority queue.
3. Të mendohet se kodet 0/1 janë unike. Forma mund të ndryshojë, kostoja jo.
4. Të krijohet kod ku një kod është prefix i tjetrit.
5. Në dekompresim, të mos kthehemi në root pas leaf.
6. Në LZW, të output-ohet `w+c` kur nuk ekziston; output-ohet kodi i `w`, pastaj shtohet `w+c`.
7. Të harrohet output-i final i `w`.

## Kontrollo veten

1. Çka do të thotë lossless?
2. Çka është prefix-free?
3. Cilat dy nyja bashkon Huffman?
4. Si dekompresohet një Huffman stream?
5. Çka output-on LZW kur `w+c` nuk ekziston?
6. Çka shtohet në dictionary?

### Përgjigjet

1. Dekompresimi e rikthen input-in saktësisht.
2. Asnjë kod nuk është prefix i një kodi tjetër.
3. Dy me frekuencën më të vogël.
4. Lexohen bitët dhe ndiqet 0 majtas/1 djathtas deri në leaf.
5. Kodin e `w`.
6. Stringu `w+c`.

