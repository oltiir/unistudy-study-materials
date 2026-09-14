# Përgatitja për Provim — Bazat e Teknologjive Big Data

**Student:** Olti Ramadani  
**Provimi:** 15 shtator 2026, ora 13:00  
**Qëllimi:** përgatitje “pass-first” nga syllabusi, shënimet me dorë dhe burime zyrtare.

> Mos e mëso këtë si libër. Për çdo temë mëso: **si njihet pyetja → hapat → formula → një ushtrim**.

## Renditja e mësimit

1. [Big Data dhe llojet e Machine Learning](#1-big-data-dhe-machine-learning)
2. [K-Means](#2-k-means)
3. [K-NN](#3-k-nearest-neighbors-k-nn)
4. [Bayes dhe Naive Bayes](#4-bayes-dhe-naive-bayes)
5. [Regresioni](#5-regresioni)
6. [Decision Trees](#6-decision-trees)
7. [SOM](#7-kohonen-self-organizing-map-som)
8. [Perceptron](#8-discrete-perceptron)
9. [MLP dhe Backpropagation](#9-multilayer-perceptron-mlp)
10. [Gradient Descent](#10-gradient-descent)
11. [Cheat sheet](#11-cheat-sheet)
12. [Pyetje kontrolli](#12-pyetje-kontrolli)

---

# 1. Big Data dhe Machine Learning

## Çka është Big Data?

Big Data janë të dhëna me madhësi, shpejtësi ose kompleksitet të tillë që metodat tradicionale nuk mjaftojnë për ruajtjen, përpunimin dhe analizën e tyre. Ideja nuk është vetëm “shumë GB”; rëndësi kanë edhe shpejtësia e ardhjes, formatet e ndryshme, cilësia dhe dobia.

## 5V-të

| V | Kuptimi | Pyetja që duhet ta kujtosh | Shembull |
|---|---|---|---|
| **Volume** | Sasia e madhe | Sa të dhëna kemi? | Miliona transaksione |
| **Velocity** | Shpejtësia | Sa shpejt krijohen/përpunohen? | Sensorë në kohë reale |
| **Variety** | Shumëllojshmëria | Në çfarë formatesh vijnë? | SQL, JSON, foto, video |
| **Veracity** | Besueshmëria | A janë të sakta dhe të pastra? | Duplikate, mungesa, zhurmë |
| **Value** | Vlera | Çfarë përfitimi nxjerrim? | Parashikim, vendimmarrje |

**Truk për memorie:** “Sasia, Shpejtësia, Shumëllojshmëria, Saktësia, Vlera”.

## Llojet e të dhënave

- **Structured:** skemë fikse, rreshta dhe kolona. Shembull: tabelë SQL.
- **Semi-structured:** nuk ka tabelë të ngurtë, por ka etiketa/çelësa. Shembull: JSON, XML.
- **Unstructured:** nuk ka skemë të paracaktuar. Shembull: tekst i lirë, fotografi, audio, video.

## Batch kundrejt streaming

- **Batch:** grumbullohen të dhënat dhe përpunohen në grupe. Shembull: raporti i shitjeve çdo natë.
- **Streaming:** përpunohen vazhdimisht sapo mbërrijnë. Shembull: zbulimi i mashtrimit gjatë pagesës.

## Teknologjitë kryesore

- **HDFS:** i ndan skedarët e mëdhenj në blocks dhe i shpërndan në DataNodes. NameNode ruan metadata; replikimi jep fault tolerance.
- **MapReduce:** Map prodhon çifte key-value; shuffle/sort i grupon sipas key; Reduce i përmbledh.
- **Spark:** përpunim i shpërndarë, shpesh në memorie; RDD është koleksion immutable, i particionuar dhe fault-tolerant.
- **Kafka:** platformë e shpërndarë për event streaming.
- **NoSQL:** databaza jo-relacionale të përshtatshme për shkallëzim dhe skema fleksibile.

## Machine Learning

Modeli është marrëdhënie matematikore e mësuar nga të dhënat për të bërë prediction.

| Lloji | Ka labels? | Qëllimi | Algoritme të syllabusit |
|---|---:|---|---|
| **Supervised** | Po | Parashikon output të njohur | K-NN, Naive Bayes, Regression, Decision Tree, Perceptron, MLP |
| **Unsupervised** | Jo | Gjen strukturë/grupe | K-Means, SOM |
| **Classification** | Po | Output kategori | A/B, spam/not-spam |
| **Regression** | Po | Output numër | çmimi, temperatura |

**Pyetje klasike:** K-Means ka **K**, K-NN ka **K**, por:
- K-Means: K = numri i clusters, unsupervised.
- K-NN: K = numri i fqinjëve, supervised.

---

# 2. K-Means

## Si njihet pyetja?

Jepen pika pa klasa, numri K dhe centroidët fillestarë. Kërkohen distancat, cluster-i i secilës pikë dhe centroidët e rinj.

## Algoritmi

1. Zgjidh K centroidë fillestarë.
2. Llogarit distancën e çdo pike nga çdo centroid.
3. Cakto pikën te centroidi më i afërt.
4. Për çdo cluster, llogarit mesataren e pikave.
5. Përsërit derisa caktimet/centroidët të mos ndryshojnë.

### Distanca Euklidiane

[
d(X,C)=sqrt{sum_{j=1}^{m}(x_j-c_j)^2}
]

Në 2D:

[
d=sqrt{(x_1-c_1)^2+(x_2-c_2)^2}
]

### Centroidi i ri

[
C_k=rac{1}{n_k}sum_{X_iin cluster_k}X_i
]

## Shembull

Pikat: (X_1=(1,1)), (X_2=(1,2)), (X_3=(4,4)), (X_4=(5,4)).  
Centroidët: (C_1=(1,1)), (C_2=(5,4)).

- (X_1): (d(C_1)=0), (d(C_2)=5) → cluster 1.
- (X_2): (d(C_1)=1), (d(C_2)=sqrt{20}) → cluster 1.
- (X_3): (d(C_1)=sqrt{18}), (d(C_2)=1) → cluster 2.
- (X_4): (d(C_1)=5), (d(C_2)=0) → cluster 2.

Centroidët e rinj:

[
C_1'=left(rac{1+1}{2},rac{1+2}{2}ight)=(1,1.5)
]

[
C_2'=left(rac{4+5}{2},rac{4+4}{2}ight)=(4.5,4)
]

## Gabime tipike

- Mos e harro rrënjën katrore.
- Krahaso distancat e së njëjtës pikë, jo distanca nga pika të ndryshme.
- Në update futen vetëm pikat e atij cluster-i.
- Një iteracion nuk do të thotë domosdoshmërisht fund.
- K-Means është i ndjeshëm ndaj centroidëve fillestarë dhe shkallës së features.

---

# 3. K-Nearest Neighbors (K-NN)

## Si njihet?

Ka dataset me klasa, një pikë të re dhe një vlerë K. Duhet të klasifikohet pika e re.

## Hapat

1. Llogarit distancën nga pika e re te secila pikë trajnuese.
2. Renditi distancat nga më e vogla.
3. Merr K fqinjët e parë.
4. Bëj majority vote.
5. Në weighted K-NN, fqinjët më afër kanë peshë më të madhe, shpesh (1/d).

## Shembull

Pika e re (Q=(2,2)):

| Pika | Klasa | Distanca nga Q |
|---|---|---:|
| (1,1) | A | (sqrt2=1.41) |
| (2,1) | A | (1) |
| (4,4) | B | (sqrt8=2.83) |
| (3,3) | B | (sqrt2=1.41) |

Për (K=3), fqinjët janë A, A, B → **Q klasifikohet A**.

## Çka duhet ditur

- K-NN është supervised dhe “lazy learner”: nuk ndërton model kompleks gjatë training.
- K i vogël është i ndjeshëm ndaj noise; K shumë i madh i zbut kufijtë.
- Për dy klasa shpesh merret K tek që të shmanget barazimi.
- Features duhet të kenë shkallë të ngjashme; ndryshe një feature dominon distancën.

---

# 4. Bayes dhe Naive Bayes

## Bayes Theorem

[
P(Amid B)=rac{P(Bmid A)P(A)}{P(B)}
]

- (P(A)): prior.
- (P(Bmid A)): likelihood.
- (P(B)): evidence.
- (P(Amid B)): posterior.

## Shembulli i testit për kancer

Jepen:

[
P(C)=0.008,quad P(
eg C)=0.992
]

[
P(+mid C)=0.98,quad P(+mid
eg C)=0.03
]

[
P(Cmid +)=
rac{0.98cdot0.008}
{0.98cdot0.008+0.03cdot0.992}
]

[
P(Cmid +)=rac{0.00784}{0.03760}approx0.2085=20.85%
]

**Ideja:** sensitivity 98% nuk do të thotë se një person pozitiv ka 98% probabilitet të ketë kancer. Prior-i i vogël dhe false positives ndikojnë shumë.

## Naive Bayes

Supozon që features janë conditionally independent kur klasa dihet:

[
P(Cmid x_1,ldots,x_n)propto P(C)prod_iP(x_imid C)
]

Llogarit një score për secilën klasë dhe zgjedh score-in më të madh. Denominator-i (P(X)) mund të hiqet kur vetëm krahasohen klasat.

## Categorical/Bernoulli Naive Bayes

Nëse klasa A ka 4 mostra dhe feature (x_1=T) paraqitet 3 herë:

[
P(x_1=Tmid A)=rac34
]

Pastaj shumëzohen prior-i dhe probabilitetet e të gjitha features.

### Zero probability dhe Laplace smoothing

Nëse një kategori s’është paraqitur asnjëherë, probabiliteti 0 do ta bëjë produktin 0. Me Laplace smoothing:

[
P(x_i=tmid C)=rac{N_{t,C}+1}{N_C+n_i}
]

ku (n_i) është numri i kategorive të feature-it.

## Gaussian Naive Bayes

Përdoret për features numerike. Për secilin feature dhe klasë llogariten veçmas mesatarja dhe varianca:

[
mu=rac{sum x_i}{N}
]

[
sigma^2=rac{sum(x_i-mu)^2}{N}
]

[
P(xmid C)=
rac{1}{sqrt{2pisigma_C^2}}
e^{-rac{(x-mu_C)^2}{2sigma_C^2}}
]

Në fund:

[
Score(C)=P(C)prod_iP(x_imid C)
]

**Gabim tipik:** një mean/variance i vetëm për krejt datasetin. Duhet një për çdo feature brenda çdo klase.

---

# 5. Regresioni

## Simple Linear Regression

[
hat y=w_0+w_1x
]

- (w_0): intercept — y kur x=0.
- (w_1): slope — sa ndryshon y kur x rritet për 1.

[
w_1=rac{Nsum xy-sum xsum y}
{Nsum x^2-(sum x)^2}
]

[
w_0=rac{sum y-w_1sum x}{N}
]

## Shembull i plotë

Pikat: ((1,2),(2,3),(3,5)).

[
N=3, sum x=6, sum y=10, sum xy=23, sum x^2=14
]

[
w_1=rac{3(23)-6(10)}{3(14)-6^2}
=rac{9}{6}=1.5
]

[
w_0=rac{10-1.5(6)}3=rac13approx0.333
]

Modeli:

[
hat y=0.333+1.5x
]

Për (x=4):

[
hat y=0.333+1.5(4)=6.333
]

## Multiple Linear Regression

[
hat y=w_0+w_1x_1+w_2x_2
]

Forma e përgjithshme:

[
W=(X^TX)^{-1}X^Ty
]

Për llogaritje me dy features, përdor centered sums:

[
S_{11}=sum(x_1-ar x_1)^2,quad
S_{22}=sum(x_2-ar x_2)^2
]

[
S_{12}=sum(x_1-ar x_1)(x_2-ar x_2)
]

[
S_{1y}=sum(x_1-ar x_1)(y-ar y),quad
S_{2y}=sum(x_2-ar x_2)(y-ar y)
]

[
D=S_{11}S_{22}-S_{12}^2
]

[
w_1=rac{S_{1y}S_{22}-S_{2y}S_{12}}D,quad
w_2=rac{S_{2y}S_{11}-S_{1y}S_{12}}D
]

[
w_0=ar y-w_1ar x_1-w_2ar x_2
]

Për dy outputs (y_1,y_2), bëhet regresioni veçmas për secilin output.

---

# 6. Decision Trees

Decision Tree është metodë supervised për classification dhe regression. Modeli krijon rregulla “if–then”.

- **Root:** pyetja e parë.
- **Internal node:** pyetje/ndarje.
- **Branch:** rezultat i pyetjes.
- **Leaf:** klasa ose vlera finale.

## Gini impurity

[
Gini=1-sum_kp_k^2
]

- Gini = 0 → node i pastër.
- Gini më i vogël → ndarje më e mirë.

## Entropy

[
H(S)=-sum_kp_klog_2p_k
]

## Information Gain

[
IG=H(parent)-sum_jrac{|S_j|}{|S|}H(S_j)
]

Zgjidhet split-i me **Information Gain më të madh** ose impurity të ponderuar më të vogël.

## Shembull Gini

Parent ka 4 A dhe 2 B:

[
Gini(parent)=1-(4/6)^2-(2/6)^2=0.444
]

Një split jep:

- Left: 3 A, 0 B → Gini = 0.
- Right: 1 A, 2 B → (Gini=1-(1/3)^2-(2/3)^2=0.444).

[
Gini_{split}=rac36(0)+rac36(0.444)=0.222
]

Ndarja e uli impurity nga 0.444 në 0.222.

## Avantazhe dhe mangësi

- I kuptueshëm dhe nuk kërkon domosdoshmërisht scaling.
- Mund të bëjë overfitting.
- Kufizohet me max depth, min samples ose pruning.
- Ndryshime të vogla në data mund të krijojnë pemë tjetër.

---

# 7. Kohonen Self-Organizing Map (SOM)

SOM është rrjet neural **unsupervised** që harton të dhëna me shumë dimensione në një grid, duke ruajtur afërsinë topologjike.

## Hapat

1. Inicializohen weight/codebook vectors.
2. Merret input-i (X).
3. Llogaritet distanca nga X te çdo neuron.
4. Neuroni me distancën më të vogël është BMU/winner.
5. Përditësohet winner-i dhe fqinjët e tij.
6. Zvogëlohen learning rate dhe neighborhood me kohë.
7. Përsëritet për inputet.

[
w_j(t+1)=w_j(t)+alpha(t)h_{cj}(t)[x-w_j(t)]
]

Pa neighborhood factor:

[
w_{ri}=w_{vjetër}+alpha(x-w_{vjetër})
]

Shembull:

[
x=(0,2),quad w=(1,0),quad alpha=0.5
]

[
w'=(1,0)+0.5[(0,2)-(1,0)]=(0.5,1)
]

Pesha lëviz **drejt inputit**. Nëse del më larg, kontrollo shenjën.

## SOM kundrejt K-Means

- Të dy janë unsupervised dhe përdorin afërsi.
- K-Means përditëson centroidin me mesataren e cluster-it.
- SOM përditëson gradualisht winner-in dhe fqinjët, duke ruajtur topologjinë.

---

# 8. Discrete Perceptron

Perceptron është classifier linear me një neuron.

[
net=sum_iw_ix_i+b
]

Step function:

[
y=
egin{cases}
1,&netge0\
0,&net<0
end{cases}
]

[
e=d-y
]

[
w_i'=w_i+eta e x_i
]

[
b'=b+eta e
]

## Shembull nga forma e shënimeve

[
x=(2,-1),quad w=(2,-1),quad b=0,quad eta=0.05,quad d=0
]

[
net=2(2)+(-1)(-1)+0=5
]

Pra (y=1), ndërsa (e=0-1=-1).

[
w_1'=2+0.05(-1)(2)=1.9
]

[
w_2'=-1+0.05(-1)(-1)=-0.95
]

[
b'=0+0.05(-1)=-0.05
]

Përsëritet për datasetin derisa gabimet të ndalen ose arrihet numri i iteracioneve. Perceptron nuk zgjidh probleme jo-linearisht të ndashme si XOR.

---

# 9. Multilayer Perceptron (MLP)

MLP ka input layer, një ose më shumë hidden layers dhe output layer. Hidden layers me activation jo-lineare e lejojnë të mësojë marrëdhënie jo-lineare.

## Forward pass

Për hidden neuron:

[
z_h=sum_iw_{ih}x_i+b_h
]

[
h=sigma(z_h),qquad sigma(z)=rac1{1+e^{-z}}
]

Për output:

[
z_o=sum_hw_{ho}h+b_o
]

[
y=sigma(z_o)
]

## Backpropagation

Nëse përdoret (e=d-y):

[
delta_o=(d-y)y(1-y)
]

[
delta_h=h(1-h)sum_o w_{ho}delta_o
]

Update:

[
w_{ho}'=w_{ho}+etadelta_oh
]

[
w_{ih}'=w_{ih}+etadelta_hx_i
]

Bias-i përditësohet po njësoj, por inputi i bias-it është 1.

**Renditja në test:**

1. Llogarit net dhe activation të hidden neurons.
2. Llogarit net dhe activation të output-it.
3. Llogarit error/delta të output-it.
4. Update hidden→output weights.
5. Propago error-in prapa.
6. Update input→hidden weights.

Mos harro derivatin e sigmoidit:

[
sigma'(z)=sigma(z)[1-sigma(z)]
]

---

# 10. Gradient Descent

Gradient Descent minimizon loss function duke lëvizur parametrat në drejtimin e kundërt të gradientit:

[
w'=w-alpharac{partial J}{partial w}
]

[
b'=b-alpharac{partial J}{partial b}
]

- (alpha): learning rate.
- gradienti pozitiv → w zvogëlohet.
- gradienti negativ → w rritet.
- (alpha) shumë i vogël → trajnim i ngadalshëm.
- (alpha) shumë i madh → kalon minimumin/divergon.
- convergence → loss-i nuk ulet më ndjeshëm.

## Shembull i shkurtër

[
J(w)=(w-3)^2,qquad J'(w)=2(w-3)
]

Me (w_0=0), (alpha=0.1):

[
gradient=-6
]

[
w_1=0-0.1(-6)=0.6
]

Iteracioni tjetër:

[
gradient=2(0.6-3)=-4.8
]

[
w_2=0.6-0.1(-4.8)=1.08
]

w afrohet gradualisht te minimumi (w=3).

---

# 11. Cheat Sheet

| Nëse pyetja thotë… | Algoritmi | Çka bën menjëherë |
|---|---|---|
| “K clusters/centroids” | K-Means | Distanca → assign → mesatarja |
| “Pika e re, K fqinjë, klasa” | K-NN | Distanca → sort → vote |
| “Winner/BMU/codebook vectors” | SOM | Distanca → winner → update drejt inputit |
| “Prior/likelihood/posterior” | Bayes | Numerator / evidence |
| “Shumë features kategorike” | Naive Bayes | Prior × likelihoods për çdo klasë |
| “Mean, variance, normal distribution” | Gaussian NB | Gaussian likelihood për feature/klasë |
| “Best-fit line” | Regression | Shumat → (w_1) → (w_0) → prediction |
| “Root/split/Gini/entropy” | Decision Tree | Impurity para/pas → split-i më i mirë |
| “Net, step, error” | Perceptron | net → y → e → update |
| “Hidden layer/sigmoid” | MLP | forward → delta output → backprop |
| “Minimize loss/learning rate” | Gradient Descent | parameter − rate × gradient |

## Formulat që duhen ditur pa shikuar

[
d=sqrt{sum(x_i-c_i)^2}
]

[
P(Amid B)=rac{P(Bmid A)P(A)}{P(B)}
]

[
P(Cmid X)propto P(C)prod_iP(x_imid C)
]

[
hat y=w_0+w_1x
]

[
net=sum_iw_ix_i+b
]

[
w'=w+eta(d-y)x
]

[
w'=w-alpha
abla J(w)
]

---

# 12. Pyetje kontrolli

Provo pa shikuar përgjigjet.

1. Cilat janë 5V-të?
2. Dallimi mes structured dhe semi-structured?
3. Dallimi kryesor mes supervised dhe unsupervised?
4. K-Means dhe K-NN: çka përfaqëson K?
5. Kur ndalet K-Means?
6. Pse K-NN ka nevojë për scaling?
7. Çka është prior-i?
8. Pse quhet “naive” Naive Bayes?
9. Kur përdoret Gaussian Naive Bayes?
10. Çka tregon slope (w_1)?
11. Gini 0 çka do të thotë?
12. Çka është BMU në SOM?
13. Pse SOM përditëson edhe fqinjët?
14. Si llogaritet error-i në Perceptron?
15. Pse Perceptron nuk e zgjidh XOR?
16. Çka shton MLP krahasuar me Perceptron?
17. Cili është derivati i sigmoidit?
18. Çka ndodh nëse learning rate është shumë i madh?
19. Çka do të thotë convergence?
20. Dallimi mes batch dhe streaming?

## Përgjigje të shkurtra

1. Volume, Velocity, Variety, Veracity, Value.
2. Structured ka skemë fikse; semi-structured ka tags/keys por jo tabelë të ngurtë.
3. Supervised ka labels; unsupervised jo.
4. Numri i clusters; numri i fqinjëve.
5. Kur assignments/centroidët nuk ndryshojnë ndjeshëm.
6. Që feature me vlera numerikisht të mëdha të mos dominojë distancën.
7. Probabiliteti para evidencës.
8. Supozon pavarësi kushtore mes features.
9. Për features numerike që modelohen me shpërndarje normale.
10. Ndryshimin mesatar të y për një rritje 1 të x.
11. Node është plotësisht i pastër.
12. Neuroni me distancën më të vogël nga inputi.
13. Për të ruajtur topologjinë.
14. (e=d-y).
15. XOR nuk është linearisht i ndashëm.
16. Hidden layers dhe activation jo-lineare.
17. (sigma(z)(1-sigma(z))).
18. Mund të overshoot/divergjojë.
19. Loss-i nuk ulet më ndjeshëm.
20. Batch përpunon grupe; streaming përpunon evente që mbërrijnë vazhdimisht.

---

# Burimet

- [Syllabusi i lëndës dhe shënimet e studentit](../../)
- [IBM — What is Big Data?](https://www.ibm.com/think/topics/big-data)
- [Apache Hadoop — HDFS Architecture](https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-hdfs/HdfsDesign.html)
- [Apache Hadoop — MapReduce Tutorial](https://hadoop.apache.org/docs/stable/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html)
- [Apache Spark — RDD Programming Guide](https://spark.apache.org/docs/latest/rdd-programming-guide.html)
- [Apache Kafka — Introduction](https://kafka.apache.org/documentation/)
- [Google — Types of Machine Learning](https://developers.google.com/machine-learning/intro-to-ml/what-is-ml)
- [scikit-learn — K-Means/Clustering](https://scikit-learn.org/stable/modules/clustering.html)
- [scikit-learn — Nearest Neighbors](https://scikit-learn.org/stable/modules/neighbors.html)
- [scikit-learn — Naive Bayes](https://scikit-learn.org/stable/modules/naive_bayes.html)
- [scikit-learn — Linear Models](https://scikit-learn.org/stable/modules/linear_model.html)
- [scikit-learn — Decision Trees](https://scikit-learn.org/stable/modules/tree.html)
- [scikit-learn — Neural Networks](https://scikit-learn.org/stable/modules/neural_networks_supervised.html)
- [Google — Gradient Descent](https://developers.google.com/machine-learning/crash-course/linear-regression/gradient-descent)
