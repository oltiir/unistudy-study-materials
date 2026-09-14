# Provimi Simulues — Big Data

**Koha:** 90 minuta  
**Pikët:** 100  
**Synimi për kalim në simulim:** 50+

Mos i shiko zgjidhjet derisa ta përfundosh pjesën e parë.

---

# Pjesa A — Pyetjet

## 1. Bazat e Big Data — 10 pikë

a) Shpjego pesë V-të e Big Data. (5p)  
b) Jep nga një shembull për structured, semi-structured dhe unstructured data. (3p)  
c) Shpjego dallimin mes batch dhe streaming. (2p)

## 2. Machine Learning — 6 pikë

Vendosi algoritmet në supervised ose unsupervised:

- K-Means
- K-NN
- SOM
- Naive Bayes
- Linear Regression
- Perceptron

Pastaj shpjego dallimin mes classification dhe regression.

## 3. K-Means — 14 pikë

Jepen pikat:

$$
X_1=(1,1),\quad X_2=(2,1),\quad X_3=(5,4),\quad X_4=(6,5)
$$

Centroidët fillestarë:

$$
C_1=(1,1),\qquad C_2=(6,5)
$$

a) Llogarit distancën e secilës pikë nga të dy centroidët.  
b) Cakto clusters.  
c) Llogarit centroidët e rinj.

## 4. K-NN — 10 pikë

Jepen:

| Pika | Klasa |
|---|---|
| (1,1) | A |
| (2,1) | A |
| (4,3) | B |
| (5,5) | B |
| (3,2) | B |

Klasifiko (Q=(2,2)) për (K=3), duke përdorur distancën Euklidiane.

## 5. Bayes — 10 pikë

Një sëmundje prek 2% të popullatës. Testi ka:

$$
P(+\mid S)=0.95
$$

$$
P(-\mid 
eg S)=0.90
$$

Gjej (P(Smid +)).

## 6. Naive Bayes — 10 pikë

Në dataset ka 10 mostra: 6 të klasës A dhe 4 të klasës B.

Për inputin (X=(x_1=T,x_2=F)) dihet:

$$
P(x_1=T\mid A)=\frac46,\quad P(x_2=F\mid A)=\frac36
$$

$$
P(x_1=T\mid B)=\frac14,\quad P(x_2=F\mid B)=\frac34
$$

Gjej klasën e X me Naive Bayes.

## 7. Simple Linear Regression — 12 pikë

Për pikat:

$$
(1,2),\quad(2,3),\quad(3,5)
$$

a) Llogarit $\sum x$, $\sum y$, $\sum xy$ dhe $\sum x^2$.  
b) Gjej (w_1,w_0).  
c) Parashiko y kur (x=4).

## 8. Decision Tree — 8 pikë

Një node ka 4 mostra A dhe 2 mostra B.

a) Llogarit Gini impurity.  
b) Një split jep Left=(3A,0B), Right=(1A,2B). Llogarit weighted Gini.  
c) A është split-i më i pastër se parent-i?

## 9. Perceptron — 10 pikë

Jepen:

$$
x=(2,-1),\quad w=(2,-1),\quad b=0,\quad\eta=0.05,\quad d=0
$$

Përdor step function me $y=1$ kur $net\ge 0$.

a) Gjej net dhe y.  
b) Gjej error-in (e=d-y).  
c) Përditëso të dy peshat dhe bias-in.

## 10. SOM, MLP dhe Gradient Descent — 10 pikë

a) Në SOM, (x=(0,2)), winner (w=(1,0)), (alpha=0.5). Gjej (w'). (3p)  
b) Shkruaj forward pass-in e një MLP me një hidden layer. (3p)  
c) Me (J(w)=(w-3)^2), (w_0=0), (alpha=0.1), bëj një gradient descent update. (4p)

---

# Pjesa B — Zgjidhjet

## 1. Bazat

- Volume = sasia.
- Velocity = shpejtësia.
- Variety = formatet e ndryshme.
- Veracity = cilësia/besueshmëria.
- Value = dobia që nxirret.

Structured: tabelë SQL. Semi-structured: JSON/XML. Unstructured: foto/video/audio.  
Batch përpunon grupe periodikisht; streaming përpunon eventet vazhdimisht.

## 2. Machine Learning

**Unsupervised:** K-Means, SOM.  
**Supervised:** K-NN, Naive Bayes, Linear Regression, Perceptron.

Classification jep kategori; regression jep vlerë numerike.

## 3. K-Means

$$
d(X_1,C_1)=0,\quad d(X_1,C_2)=\sqrt{41}\approx6.40
$$

$$
d(X_2,C_1)=1,\quad d(X_2,C_2)=\sqrt{32}\approx5.66
$$

$$
d(X_3,C_1)=5,\quad d(X_3,C_2)=\sqrt2\approx1.41
$$

$$
d(X_4,C_1)=\sqrt{41}\approx6.40,\quad d(X_4,C_2)=0
$$

Cluster 1: (X_1,X_2). Cluster 2: (X_3,X_4).

$$
C_1'=\left(\frac{1+2}{2},\frac{1+1}{2}\right)=(1.5,1)
$$

$$
C_2'=\left(\frac{5+6}{2},\frac{4+5}{2}\right)=(5.5,4.5)
$$

## 4. K-NN

Nga (Q=(2,2)):

$$
d((1,1),Q)=\sqrt2\approx1.41\quad[A]
$$

$$
d((2,1),Q)=1\quad[A]
$$

$$
d((4,3),Q)=\sqrt5\approx2.24\quad[B]
$$

$$
d((5,5),Q)=\sqrt{18}\approx4.24\quad[B]
$$

$$
d((3,2),Q)=1\quad[B]
$$

Tre më të afërt: A, B, A → **klasa A**.

## 5. Bayes

Specificity 90% do të thotë:

$$
P(+\mid
eg S)=0.10
$$

$$
P(S\mid+)=
\frac{0.95(0.02)}
{0.95(0.02)+0.10(0.98)}
$$

$$
=\frac{0.019}{0.117}\approx0.1624=16.24%
$$

## 6. Naive Bayes

$$
Score(A)=P(A)P(T\mid A)P(F\mid A)
$$

$$
=\frac6{10}\cdot\frac46\cdot\frac36=0.20
$$

$$
Score(B)=\frac4{10}\cdot\frac14\cdot\frac34=0.075
$$

Meqë (0.20>0.075), X klasifikohet **A**.

## 7. Regression

$$
N=3,\quad\sum x=6,\quad\sum y=10,\quad\sum xy=23,\quad\sum x^2=14
$$

$$
w_1=\frac{3(23)-6(10)}{3(14)-6^2}=\frac96=1.5
$$

$$
w_0=\frac{10-1.5(6)}3=\frac13\approx0.333
$$

$$
\hat y=0.333+1.5x
$$

Për (x=4):

$$
\hat y=0.333+6=6.333
$$

## 8. Decision Tree

$$
Gini(parent)=1-(4/6)^2-(2/6)^2=0.444
$$

Left është i pastër:

$$
Gini(L)=0
$$

$$
Gini(R)=1-(1/3)^2-(2/3)^2=0.444
$$

$$
Gini(split)=\frac36(0)+\frac36(0.444)=0.222
$$

Po: impurity u zvogëlua nga 0.444 në 0.222.

## 9. Perceptron

$$
net=2(2)+(-1)(-1)+0=5
$$

$$
y=1,\qquad e=0-1=-1
$$

$$
w_1'=2+0.05(-1)(2)=1.9
$$

$$
w_2'=-1+0.05(-1)(-1)=-0.95
$$

$$
b'=0+0.05(-1)=-0.05
$$

## 10. SOM, MLP dhe Gradient Descent

SOM:

$$
w'=(1,0)+0.5[(0,2)-(1,0)]=(0.5,1)
$$

MLP forward pass:

$$
z_h=W_hx+b_h,\quad h=\sigma(z_h)
$$

$$
z_o=W_oh+b_o,\quad y=\sigma(z_o)
$$

Gradient descent:

$$
J'(w)=2(w-3)
$$

Në (w_0=0), gradienti është (-6):

$$
w_1=0-0.1(-6)=0.6
$$

---

# Vlerësimi

- **80–100:** shumë mirë; përsërit vetëm gabimet.
- **65–79:** je në zonë të mirë për kalim.
- **50–64:** kalimi është i mundshëm; rishiko pyetjet e humbura.
- **Nën 50:** mëso fillimisht K-Means, K-NN, Bayes, Regression, Perceptron dhe 5V.
