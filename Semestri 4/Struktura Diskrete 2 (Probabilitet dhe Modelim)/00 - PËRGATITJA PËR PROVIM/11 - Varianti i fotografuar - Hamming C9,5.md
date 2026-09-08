# 11 – Varianti i fotografuar: Hamming C[9,5]

Ky është varianti i provimit që përmban ndërtimin e (H) dhe (G) për (C[9,5]). Dy nga fotografitë e dërguara paraqesin të njëjtin variant.

---

## Detyra 1 – Kodo (m=0110) me Hamming (C[7,4])

Përdorim formën sistematike:

[
G=[I_4mid P]
]

me:

[
P=
egin{bmatrix}
1&1&0\
1&0&1\
0&1&1\
1&1&1
end{bmatrix}
]

Mesazhi është:

[
m=0110
]

Bitat 1 janë në pozitat 2 dhe 3, prandaj (c=mG) është shuma mod 2 e rreshtave 2 dhe 3:

[
0100101+0010011=0110110
]

Pra:

[
oxed{c=0110110}
]

Kontrolli:

[
Hc^T=000
]

---

## Detyra 2 – Ndërto (H) dhe (G) për (C[9,5])

### Hapi 1: Lexo parametrat

Nga (C[9,5]):

[
n=9,qquad k=5
]

Numri i bitave të kontrollit është:

[
r=n-k=9-5=4
]

Prandaj:

- (H) ka (r=4) rreshta dhe (n=9) kolona;
- (G) ka (k=5) rreshta dhe (n=9) kolona;
- sindroma ka 4 bita.

[
H:4	imes9,qquad G:5	imes9
]

Kontrolli për korrigjimin e një gabimi:

[
2^rge n+1
]

[
2^4=16ge10
]

Pra 4 bita sindrome mjaftojnë për rastin “pa gabim” dhe 9 pozitat e mundshme të një gabimi.

### Hapi 2: Zgjidh kolonat e (H)

Për ta lokalizuar një gabim, kolonat e (H) duhet të jenë:

- jo-zero;
- të ndryshme nga njëra-tjetra.

Për formë sistematike, katër kolonat e fundit i vendosim si (I_4). Një zgjedhje e vlefshme është:

[
H=
left[
egin{array}{ccccc|cccc}
1&1&1&0&0&1&0&0&0\
1&0&0&1&1&0&1&0&0\
0&1&0&1&0&0&0&1&0\
0&0&1&0&1&0&0&0&1
end{array}
ight]
]

Kolonat janë:

[
1100, 1010, 1001, 0110, 0101, 1000, 0100, 0010, 0001
]

Të nënta janë jo-zero dhe të ndryshme.

### Hapi 3: Ndaje (H=[P^Tmid I_4])

Pesë kolonat e para formojnë (P^T):

[
P^T=
egin{bmatrix}
1&1&1&0&0\
1&0&0&1&1\
0&1&0&1&0\
0&0&1&0&1
end{bmatrix}
]

Pas transponimit:

[
P=
egin{bmatrix}
1&1&0&0\
1&0&1&0\
1&0&0&1\
0&1&1&0\
0&1&0&1
end{bmatrix}
]

### Hapi 4: Ndërto (G=[I_5mid P])

[
G=
left[
egin{array}{ccccc|cccc}
1&0&0&0&0&1&1&0&0\
0&1&0&0&0&1&0&1&0\
0&0&1&0&0&1&0&0&1\
0&0&0&1&0&0&1&1&0\
0&0&0&0&1&0&1&0&1
end{array}
ight]
]

### Hapi 5: Kontrolli

Duhet të vlejë:

[
GH^T=0
]

Kjo ndodh sepse:

[
G=[I_5mid P],qquad H=[P^Tmid I_4]
]

dhe në mod 2:

[
GH^T=P+P=0
]

> Matricat mund të duken ndryshe nëse kolonat renditen ndryshe. Përgjigjja është e vlefshme nëse kolonat e (H) janë jo-zero, të ndryshme, pjesa identitet është vendosur në përputhje me (G), dhe (GH^T=0).

---

## Detyra 3 – Kontrollo (r=1100110) me (g(x)=x^3+x+1)

Vektori:

[
r=1100110
]

bëhet:

[
r(x)=1+x+x^4+x^5
]

Pjesëtimi mod 2 jep:

[
r(x)=(1+x+x^2)g(x)+x
]

Mbetja është:

[
s(x)=x
eq0
]

Prandaj:

[
oxed{	ext{Ka pasur gabim gjatë transmetimit.}}
]

---

## Detyra 4 – Statistika e pikëve

| Pikët | 51–61 | 61–71 | 71–81 | 81–91 | 91–101 |
|---|---:|---:|---:|---:|---:|
| (f_i) | 16 | 35 | 30 | 9 | 20 |

### Numri i studentëve

[
N=16+35+30+9+20=110
]

Meset e intervaleve janë:

[
56, 66, 76, 86, 96
]

### Mesi aritmetik

[
sum f_ix_i=16(56)+35(66)+30(76)+9(86)+20(96)=8180
]

[
ar x=rac{8180}{110}approxoxed{74.36}
]

### Mesi gjeometrik

[
G=expleft(rac{sum f_iln x_i}{N}ight)approxoxed{73.26}
]

### Mediana

Frekuencat kumulative janë:

[
16, 51, 81, 90, 110
]

[
rac N2=55
]

Pozita 55 ndodhet në klasën (71-81):

[
Me=71+rac{55-51}{30}cdot10
]

[
oxed{Meapprox72.33}
]

### Moda

Klasa modale është (61-71), sepse ka frekuencën më të madhe (35):

[
Mo=61+
rac{35-16}{(35-16)+(35-30)}cdot10
]

[
oxed{Moapprox68.92}
]

---

## Detyra 5 – 10 të kuqe, 7 të zeza, 7 të bardha

Janë gjithsej:

[
N=24
]

Tërhiqen 3 pa kthim dhe (X) është numri i veturave të kuqe.

[
Xin{0,1,2,3}
]

Formula:

[
P(X=k)=rac{inom{10}{k}inom{14}{3-k}}{inom{24}{3}}
]

[
inom{24}{3}=2024
]

| (k) | (P(X=k)) | Përafërsisht |
|---:|---:|---:|
| 0 | (rac{364}{2024}) | 0.1798 |
| 1 | (rac{910}{2024}) | 0.4496 |
| 2 | (rac{630}{2024}) | 0.3113 |
| 3 | (rac{120}{2024}) | 0.0593 |

Kontrolli:

[
364+910+630+120=2024
]

Pra shuma e probabiliteteve është 1.

### Pritja matematike

[
E(X)=sum kP(X=k)=oxed{1.25}
]

Kontroll i shpejtë:

[
E(X)=3cdotrac{10}{24}=1.25
]

### Dispersioni

[
D(X)=E(X^2)-[E(X)]^2approxoxed{0.6658}
]

---

## Detyra 6 – Vargu nga (f(x)=rac1{(1+2x)^2})

Përdorim:

[
(1+2x)^{-2}
=
sum_{k=0}^{infty}
(-1)^k(k+1)2^kx^k
]

Prandaj:

[
a_k=(-1)^k(k+1)2^k
]

Termat e parë janë:

[
oxed{1,-4,12,-32,80,-192,ldots}
]

---

## Teoria e këtij varianti

Duhet të mundesh t'i japësh shkurt:

1. Kur janë vektorët linearisht të pavarur?
2. Çfarë është një fjalëkod?
3. Çfarë është probabiliteti klasik dhe formula e tij?
4. Çfarë është funksioni gjenerues i një vargu?

Përgjigjet e kontrolluara gjenden te [07 – Pyetjet Teorike](<./07 - Pyetjet Teorike (Flashcards).md>).
