# Detyrat nga provimi real — zgjidhje hap pas hapi

Këto zgjidhje bazohen në pesë pyetjet që shihen në fotografi. Pyetja 4 nuk është në fotografitë e dërguara.

## Strategjia e pikëve

| Pyetja | Tema | Pikë |
|---|---|---:|
| 1 | Big Data — Variety | 10 |
| 2 | K-Means, një epoch | 15 |
| 3 | Naive Bayes me hyrje kategorike dhe numerike | 20 |
| 5 | Rrjet neural, purelin dhe backpropagation | 20 |
| 6 | F1-score për klasën B | 15 |
|  | **Gjithsej që shihen** | **80** |

Nëse kufiri i kalimit është 50/100, pyetjet 1, 2, 3 dhe 6 vlejnë së bashku 60 pikë. Këto janë prioriteti kryesor.

---

# 1. Big Data: çka është Variety? — 10 pikë

**Variety** nënkupton shumëllojshmërinë e formateve, strukturave dhe burimeve të të dhënave që duhet të ruhen dhe analizohen.

Tri kategoritë kryesore:

- **Structured:** tabela me rreshta dhe kolona, p.sh. databazë SQL me klientë dhe porosi.
- **Semi-structured:** nuk ka skemë tabelare fikse, por ka tags/keys, p.sh. JSON, XML dhe log files.
- **Unstructured:** nuk ka model të paracaktuar, p.sh. fotografi, video, audio, email dhe tekst i lirë.

Pse është sfidë? Sepse formatet e ndryshme nuk mund të ruhen, kërkohen dhe analizohen gjithmonë me të njëjtën metodë.

**Përgjigjja e shkurtër për provim:**  
“Variety është shumëllojshmëria e llojeve dhe burimeve të të dhënave në Big Data. Ajo përfshin të dhëna structured, semi-structured dhe unstructured, si tabela SQL, JSON/XML, tekst, fotografi, audio dhe video. Sfida është integrimi dhe analizimi i tyre me metoda të ndryshme.”

---

# 2. K-Means: një epoch — 15 pikë

Jepen centroidët fillestarë:

$$
K_1=(1.4,3.3), \qquad K_2=(-5.4,0.7)
$$

Pikat:

$$
(3.5,2.2),(-2,1.7),(4.6,0.4),(-3,1),(0,-2.5),(-4,5)
$$

Formula e distancës:

$$
d((a,b),K)=\sqrt{(a-K_a)^2+(b-K_b)^2}
$$

## Distancat dhe caktimi

| Pika | Distanca nga \(K_1\) | Distanca nga \(K_2\) | Cluster |
|---|---:|---:|---:|
| (3.5, 2.2) | 2.371 | 9.026 | 1 |
| (-2, 1.7) | 3.758 | 3.544 | 2 |
| (4.6, 0.4) | 4.319 | 10.004 | 1 |
| (-3, 1) | 4.965 | 2.419 | 2 |
| (0, -2.5) | 5.967 | 6.277 | 1 |
| (-4, 5) | 5.661 | 4.522 | 2 |

Pra:

$$
C_1=\{(3.5,2.2),(4.6,0.4),(0,-2.5)\}
$$

$$
C_2=\{(-2,1.7),(-3,1),(-4,5)\}
$$

Centroidët e rinj merren me mesatare koordinatë më koordinatë:

$$
K_1'=
\left(
\frac{3.5+4.6+0}{3},
\frac{2.2+0.4-2.5}{3}
\right)
=(2.7,0.0333)
$$

$$
K_2'=
\left(
\frac{-2-3-4}{3},
\frac{1.7+1+5}{3}
\right)
=(-3,2.5667)
$$

**Përgjigjja finale pas një epoch:**

$$
\boxed{K_1'=(2.7,0.0333)},\qquad
\boxed{K_2'=(-3,2.5667)}
$$

---

# 3. Naive Bayes për \((V1=A,V2=-3)\) — 20 pikë

Dataset-i:

| V1 | V2 | Y |
|---|---:|---|
| B | 2 | Z |
| B | 3 | Z |
| A | 1 | Z |
| A | -2 | T |
| B | -1 | Z |
| B | 5 | T |

V1 është kategorike, ndërsa V2 është numerike. Prandaj për V1 përdorim probabilitet kategorik, kurse për V2 densitetin Gaussian.

## Hapi 1: priorët

Klasa Z paraqitet 4 herë; T paraqitet 2 herë:

$$
P(Z)=\frac46,\qquad P(T)=\frac26
$$

## Hapi 2: probabiliteti i \(V1=A\)

$$
P(A\mid Z)=\frac14,\qquad P(A\mid T)=\frac12
$$

## Hapi 3: parametrat Gaussian për V2

Për Z kemi \(V2=\{2,3,1,-1\}\):

$$
\mu_Z=1.25,\qquad s_Z^2\approx2.9167
$$

Për T kemi \(V2=\{-2,5\}\):

$$
\mu_T=1.5,\qquad s_T^2=24.5
$$

Me formulën:

$$
P(x\mid C)=
\frac{1}{\sqrt{2\pi s_C^2}}
e^{-\frac{(x-\mu_C)^2}{2s_C^2}}
$$

për \(x=-3\):

$$
P(-3\mid Z)\approx0.010561
$$

$$
P(-3\mid T)\approx0.053315
$$

## Hapi 4: scores pa normalizim

$$
Score(Z)=P(Z)P(A\mid Z)P(-3\mid Z)
$$

$$
Score(Z)\approx\frac46\cdot\frac14\cdot0.010561
\approx0.001760
$$

$$
Score(T)=P(T)P(A\mid T)P(-3\mid T)
$$

$$
Score(T)\approx\frac26\cdot\frac12\cdot0.053315
\approx0.008886
$$

Meqë \(Score(T)>Score(Z)\):

$$
\boxed{(A,-3)\ klasifikohet\ në\ klasën\ T}
$$

**Kujdes:** nëse V2 trajtohet gabimisht si kategorike, vlera -3 nuk paraqitet në dataset dhe të dy scores dalin zero. Meqë V2 është numerike dhe në shënime është Gaussian Naive Bayes, duhet përdorur Gaussian-i.

---

# 5. Rrjeti neural me purelin — 20 pikë

Nga figura lexohen:

$$
x_1=-2.1,\quad x_2=3.2,\quad d=4.5,\quad \eta=0.5
$$

Peshat:

$$
w_{11}=-1,\ w_{21}=0.5,\ w_{12}=1.5,\ w_{22}=0.5
$$

$$
w_{32}=2,\ w_{42}=-3,\ w_{13}=-1,\ w_{23}=0.5
$$

Të gjitha aktivizimet janë **purelin**, pra \(f(net)=net\) dhe \(f'(net)=1\). Bias nuk ka.

## Forward pass

Daljet e shtresës së parë:

$$
a_1=x_1w_{11}=(-2.1)(-1)=2.1
$$

$$
a_2=x_2w_{21}=(3.2)(0.5)=1.6
$$

Daljet e shtresës së dytë:

$$
a_3=a_1w_{12}+a_2w_{22}
=(2.1)(1.5)+(1.6)(0.5)=3.95
$$

$$
a_4=a_1w_{32}+a_2w_{42}
=(2.1)(2)+(1.6)(-3)=-0.6
$$

Dalja e rrjetit:

$$
\hat y=a_3w_{13}+a_4w_{23}
=(3.95)(-1)+(-0.6)(0.5)=-4.25
$$

Gabimi:

$$
e=d-\hat y=4.5-(-4.25)=8.75
$$

## Ndryshimi i \(w_{13}\)

Për output neuron:

$$
\delta_o=e\cdot f'(net)=8.75
$$

$$
w_{13}'=w_{13}+\eta\delta_o a_3
$$

$$
w_{13}'=-1+(0.5)(8.75)(3.95)
$$

$$
\boxed{w_{13}'=16.28125}
$$

## Ndryshimi i \(w_{22}\)

Delta e neuronit të sipërm në shtresën e dytë llogaritet me peshën e vjetër \(w_{13}=-1\):

$$
\delta_3=\delta_o w_{13}f'(net)=8.75(-1)=-8.75
$$

$$
w_{22}'=w_{22}+\eta\delta_3a_2
$$

$$
w_{22}'=0.5+(0.5)(-8.75)(1.6)
$$

$$
\boxed{w_{22}'=-6.5}
$$

Peshat përditësohen në mënyrë simultane: për backpropagation përdoren peshat e vjetra.

---

# 6. F1-score i klasës B — 15 pikë

Klasa B trajtohet si pozitive; A dhe C si “jo B”.

Nga tabela:

- **TP = 3:** actual B dhe predicted B.
- **FP = 3:** predicted B, por actual nuk është B.
- **FN = 4:** actual B, por predicted nuk është B.
- **TN = 8:** as actual as predicted nuk është B.

Precision:

$$
Precision_B=\frac{TP}{TP+FP}
=\frac{3}{3+3}=0.5
$$

Recall:

$$
Recall_B=\frac{TP}{TP+FN}
=\frac{3}{3+4}=\frac37\approx0.4286
$$

F1-score:

$$
F1_B=
\frac{2\cdot Precision\cdot Recall}{Precision+Recall}
$$

ose më shpejt:

$$
F1_B=\frac{2TP}{2TP+FP+FN}
=\frac6{6+3+4}
=\frac6{13}
\approx0.4615
$$

$$
\boxed{F1_B\approx0.462=46.15\%}
$$

---

# Çka duhet të mësosh së pari

1. K-Means: distancat, caktimi, mesatarja e centroidit.
2. F1: numëro TP, FP, FN; pastaj përdor \(2TP/(2TP+FP+FN)\).
3. Variety: definicioni dhe tri llojet e të dhënave.
4. Naive Bayes: prior × likelihood; kategorike + Gaussian për hyrje numerike.
5. Rrjeti neural: forward pass, error, update i output weight, pastaj backprop te hidden weight.

Mos e le asnjë pyetje bosh. Edhe nëse nuk arrin rezultatin final, formula, zëvendësimi i vlerave dhe hapat japin pikë të pjesshme.
