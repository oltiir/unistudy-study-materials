# 12 – Materiali shtesë nga fotografitë: zgjidhje të verifikuara

Ky dokument mbledh çka mësuam nga fotografitë e provimeve dhe zgjidhjet e shkruara me dorë. Metoda e përdorur në fletë ruhet, por çdo llogaritje kontrollohet veçmas.

> **Rregulli për provim:** shkruaje gjithmonë konventën e matricave dhe renditjen e biteve para se të fillosh. Matrica të ndryshme mund të përshkruajnë kode ekuivalente, por nuk duhet të përzihen brenda së njëjtës zgjidhje.

---

## 1. Konventa që përdoret në shënimet e dorës

Në shënime përdoret kryesisht:

\[
H=[I_r\mid Q],\qquad G=[Q^T\mid I_k]
\]

ku:

- \(n\) = gjatësia e fjalëkodit;
- \(k\) = numri i biteve të mesazhit;
- \(r=n-k\) = numri i biteve të kontrollit;
- \(H\) ka madhësi \(r\times n\);
- \(G\) ka madhësi \(k\times n\).

Pse funksionon?

\[
GH^T=[Q^T\mid I_k]
\begin{bmatrix}I_r\\Q^T\end{bmatrix}
=Q^T+Q^T=0
\]

Në mod 2 çdo element i mbledhur me vetveten jep zero.

Forma tjetër \(G=[I_k\mid P]\), \(H=[P^T\mid I_r]\) është po ashtu e saktë. Dallimi është vetëm renditja e kolonave. Për detyrat e fotografuara përdor formën e shënimeve, që përgjigjja të duket si ajo e ligjëratave.

---

## 2. Hamming \(C[7,4]\) sipas konventës së profesorit

### Hapi 1: Parametrat

\[
n=7,\qquad k=4,\qquad r=n-k=3
\]

Prandaj \(H\) është \(3\times7\), \(G\) është \(4\times7\), ndërsa sindroma ka 3 bita.

### Hapi 2: Matrica \(H\)

Në shënime kolonat renditen nga \(111\) deri te \(001\):

\[
H=
\begin{bmatrix}
1&1&1&1&0&0&0\\
1&1&0&0&1&1&0\\
1&0&1&0&1&0&1
\end{bmatrix}
\]

Kolonat 4, 6 dhe 7 janë \(100,010,001\), pra formojnë \(I_3\). Për këtë arsye bitat e kontrollit vendosen në pozitat 4, 6 dhe 7.

Renditja e fjalëkodit është:

\[
c=(m_1,m_2,m_3,p_1,m_4,p_2,p_3)
\]

### Hapi 3: Nxirr formulat nga rreshtat e \(H\)

Nga \(Hc^T=0\):

\[
m_1+m_2+m_3+p_1=0
\quad\Rightarrow\quad
p_1=m_1+m_2+m_3
\]

\[
m_1+m_2+m_4+p_2=0
\quad\Rightarrow\quad
p_2=m_1+m_2+m_4
\]

\[
m_1+m_3+m_4+p_3=0
\quad\Rightarrow\quad
p_3=m_1+m_3+m_4
\]

### Hapi 4: Shembulli real \(m=0110\)

\[
m_1=0,\quad m_2=1,\quad m_3=1,\quad m_4=0
\]

\[
p_1=0+1+1=0
\]

\[
p_2=0+1+0=1
\]

\[
p_3=0+1+0=1
\]

Vendosi sipas renditjes \((m_1,m_2,m_3,p_1,m_4,p_2,p_3)\):

\[
\boxed{c=0110011}
\]

Ky është rezultati që përputhet me zgjidhjen e fotografuar. Rezultate si \(0110110\) mund të dalin nga një renditje tjetër sistematike; nuk duhet t'i përziejmë formulat e njërës renditje me pozitat e tjetrës.

---

## 3. Hamming \(C[9,5]\): matricat e fotografuara

\[
n=9,\qquad k=5,\qquad r=9-5=4
\]

Prandaj:

\[
H:4\times9,\qquad G:5\times9
\]

Matrica e kontrollit e përdorur në shënime është:

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
=[I_4\mid Q]
\]

Kolonat janë jo-zero dhe të ndryshme, prandaj një sindromë jo-zero mund ta identifikojë një pozitë të vetme gabimi.

Nga \(G=[Q^T\mid I_5]\) fitojmë:

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

Kontrolli i detyrueshëm:

\[
GH^T=0
\]

---

## 4. Kodi ciklik: korrigjimi i një gabimi në shënime

Në variantin e fotografuar jepen:

\[
f=1010011,\qquad g(x)=1+x+x^3
\]

Në këtë detyrë biti i majtë përfaqëson fuqinë më të lartë:

\[
f(x)=x^6+x^4+x+1
\]

Kontrolli i saktë është:

\[
x^6+x^4+x+1=(x^3+1)(x^3+x+1)
\]

Pra:

\[
\frac{f(x)}{g(x)}=x^3+1,\qquad \text{mbetja}=0
\]

Përfundimi:

- \(f\) është tashmë fjalëkod i pranueshëm;
- nuk zbulohet gabim;
- mesazhi i dekoduar është \(m(x)=x^3+1\), pra \(m=1001\).

> Në zgjidhjen me dorë është shkruar një mbetje jo-zero, por ajo llogaritje nuk është e saktë.

---

## 5. Ndryshoret e rastit: \(Z=X+2Y\)

Jepen ndryshore të pavarura:

| \(x\) | -2 | 0 | 4 | 6 |
|---:|---:|---:|---:|---:|
| \(P(X=x)\) | 0.1 | 0.6 | 0.2 | 0.1 |

| \(y\) | -1 | 0 | 1 |
|---:|---:|---:|---:|
| \(P(Y=y)\) | 0.7 | 0.1 | 0.2 |

Për çdo çift llogarisim \(z=x+2y\) dhe shumëzojmë probabilitetet. Vlerat që japin të njëjtin \(z\) mblidhen.

| \(z\) | -4 | -2 | 0 | 2 | 4 | 6 | 8 |
|---:|---:|---:|---:|---:|---:|---:|---:|
| \(P(Z=z)\) | 0.07 | 0.43 | 0.08 | 0.26 | 0.09 | 0.05 | 0.02 |

Kontrolli: shuma është 1.

\[
E(Z)=\sum zP(Z=z)=\boxed{0.2}
\]

\[
E(Z^2)=8.4
\]

\[
D(Z)=E(Z^2)-[E(Z)]^2=8.4-0.04=\boxed{8.36}
\]

---

## 6. Statistika: varianti 150–180 cm

| Intervali | 150–155 | 155–160 | 160–165 | 165–170 | 170–175 | 175–180 |
|---|---:|---:|---:|---:|---:|---:|
| \(f\) | 17 | 21 | 40 | 20 | 10 | 12 |
| mesi \(x_i\) | 152.5 | 157.5 | 162.5 | 167.5 | 172.5 | 177.5 |
| kumulative \(F\) | 17 | 38 | 78 | 98 | 108 | 120 |

\[
N=120
\]

Rezultatet e kontrolluara:

| Madhësia | Rezultati |
|---|---:|
| Mesi aritmetik | \(\bar x=163.375\) |
| Mesi gjeometrik | \(G\approx163.215\) |
| Mesi harmonik | \(H\approx163.056\) |
| Mediana | \(Me=162.75\) |
| Moda | \(Mo\approx162.44\) |
| Devijimi standard | \(\sigma\approx7.265\) |
| \(Q_1\) | \(158.095\) |
| \(Q_3\) | \(168\) |
| Mënjanimi interkuartil \((Q_3-Q_1)/2\) | \(4.952\) |

Kontroll i shpejtë që kap gabimet:

\[
H\le G\le\bar x
\]

Të tria mesataret duhet të jenë brenda intervalit 150–180. Prandaj rezultati \(H=194.64\) i shkruar në fletë nuk mund të jetë i saktë.

---

## 7. Funksionet gjeneruese të fotografuara

### Vargu \(4,3,4,3,\ldots\)

\[
4,3,4,3,\ldots=(3,3,3,3,\ldots)+(1,0,1,0,\ldots)
\]

\[
F(x)=\frac3{1-x}+\frac1{1-x^2}
=\boxed{\frac{4+3x}{1-x^2}}
\]

### \(F(x)=\dfrac1{(1-4x)^3}\)

Formula:

\[
(1-ax)^{-r}=\sum_{k\ge0}\binom{k+r-1}{r-1}a^kx^k
\]

Me \(a=4\), \(r=3\):

\[
a_k=\binom{k+2}{2}4^k
\]

Termat e parë:

\[
\boxed{1,12,96,640,3840,\ldots}
\]

### \(F(x)=\dfrac1{(1+2x)^2}\)

\[
a_k=(-1)^k(k+1)2^k
\]

\[
\boxed{1,-4,12,-32,80,-192,\ldots}
\]

---

## 8. Çka duhet marrë nga këto fotografi

Fotografitë e konfirmojnë se në provim përsëriten:

1. Hamming \(C[7,4]\): kodimi i një mesazhi;
2. Hamming \(C[9,5]\): ndërtimi i \(H\) dhe \(G\);
3. kodet ciklike: pjesëtimi me \(g(x)\) dhe dekodimi;
4. shpërndarja e \(Z=X+2Y\);
5. statistika me intervale;
6. funksionet gjeneruese në të dy drejtimet;
7. katër përkufizime të shkurtra teorike.

Këto nuk e ndryshojnë roadmap-in; e bëjnë më të saktë dhe tregojnë konventën që duhet përdorur në provim.

---

## 9. Gabimet në shënimet e dorës që nuk duhen mësuar

- Për \(1010011\div(1+x+x^3)\), mbetja është **0**, jo \(x^2+x+1\).
- Për tabelën 51–101, mesi gjeometrik është afërsisht **73.26** dhe mediana **72.33**.
- Për tabelën 150–180, mesi harmonik është afërsisht **163.06**, jo 194.64.
- Për të njëjtën tabelë, devijimi standard është afërsisht **7.26**, jo 0.66.
- Gjithmonë kontrollo: \(\sum p_i=1\), \(H\le G\le\bar x\), dhe \(GH^T=0\).

