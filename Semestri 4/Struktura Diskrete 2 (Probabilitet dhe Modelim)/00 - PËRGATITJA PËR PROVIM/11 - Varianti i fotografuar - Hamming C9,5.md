# 11 – Varianti i fotografuar: Hamming C[9,5]

Ky është varianti i provimit që përmban ndërtimin e (H) dhe (G) për (C[9,5]). Dy nga fotografitë e dërguara paraqesin të njëjtin variant.

---

## Detyra 1 – Kodo \(m=0110\) me Hamming \(C[7,4]\)

Zgjidhja e fotografuar përdor kolonat e \(H\) në këtë rend:

\[
111,\ 110,\ 101,\ 100,\ 011,\ 010,\ 001
\]

\[
H=
\begin{bmatrix}
1&1&1&1&0&0&0\\
1&1&0&0&1&1&0\\
1&0&1&0&1&0&1
\end{bmatrix}
\]

Identiteti \(I_3\) gjendet në kolonat 4, 6 dhe 7, prandaj:

\[
c=(m_1,m_2,m_3,p_1,m_4,p_2,p_3)
\]

Nga \(Hc^T=0\):

\[
p_1=m_1+m_2+m_3,\qquad
p_2=m_1+m_2+m_4,\qquad
p_3=m_1+m_3+m_4
\]

Për \(m=0110\):

\[
p_1=0,\qquad p_2=1,\qquad p_3=1
\]

\[
\boxed{c=0110011}
\]

> Ky rezultat përputhet me shënimin e dorës. \(0110110\) është rezultat i një forme tjetër sistematike, jo i renditjes së përdorur në këtë variant.

---

## Detyra 2 – Ndërto \(H\) dhe \(G\) për \(C[9,5]\)

### Hapi 1: Lexo parametrat

\[
n=9,\qquad k=5,\qquad r=n-k=4
\]

Prandaj:

\[
H:4\times9,\qquad G:5\times9
\]

Sindroma ka 4 bita sepse ka nga një bit për secilin prej 4 rreshtave të \(H\).

### Hapi 2: Përdor formën e fotografuar

Në fletë përdoret:

\[
H=[I_4\mid Q]
\]

\[
H=
\left[
\begin{array}{cccc|ccccc}
1&0&0&0&1&1&0&0&1\\
0&1&0&0&1&1&1&1&0\\
0&0&1&0&0&1&0&1&1\\
0&0&0&1&0&1&1&1&1
\end{array}
\right]
\]

Nëntë kolonat janë jo-zero dhe të ndryshme. Kjo lejon që sindroma ta identifikojë secilën prej 9 pozitave të një gabimi.

### Hapi 3: Transpono \(Q\)

Kur \(H=[I_4\mid Q]\), matrica gjeneruese është:

\[
G=[Q^T\mid I_5]
\]

\[
G=
\left[
\begin{array}{cccc|ccccc}
1&1&0&0&1&0&0&0&0\\
1&1&1&1&0&1&0&0&0\\
0&1&0&1&0&0&1&0&0\\
0&1&1&1&0&0&0&1&0\\
1&0&1&1&0&0&0&0&1
\end{array}
\right]
\]

### Hapi 4: Kontrollo

\[
GH^T=Q^T+Q^T=0
\]

Kjo është arsyeja pse matrica \(G\) ndërtohet me \(Q^T\), jo me \(Q\).

> Mund të përdoret edhe forma alternative \(G=[I_5\mid P]\), \(H=[P^T\mid I_4]\), por në këtë variant ndiq formën e fotografuar.


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
