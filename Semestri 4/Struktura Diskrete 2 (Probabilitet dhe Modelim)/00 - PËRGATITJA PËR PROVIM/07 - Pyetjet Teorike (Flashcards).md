# 07 – Pyetjet teorike: përgjigje të gatshme (3–4 pikë secila, 12–16 pikë gjithsej)

> Në provim vijnë 4 pyetje teorike. Këto 30 mbulojnë pyetjet e katër provimeve të ruajtura dhe temat teorike të syllabusit.
> Mëso përgjigjen **2–4 fjali + formulë + shembull**. Kaq mjafton për pikë të plota.

---

## KODET

**1. Çfarë quajmë fjalëkod?**
Fjalëkod (codeword) është një sistem i radhitur me n simbole nga alfabeti GF(q) (për kode binare: një varg bitash), i cili i takon kodit C. Te kodi linear çdo fjalëkod përftohet si c = m·G. Shembull: 1011010 është fjalëkod i kodit Hamming [7,4].

**2. Çfarë quajmë distancë (largesë) minimale Hamming dhe si caktohet?**
Largesa Hamming d(x,y) = numri i pozicioneve ku fjalëkodet x dhe y ndryshojnë. Largesa minimale e kodit d(C) = min d(x,y) për x ≠ y në C. Për kod **linear** caktohet më lehtë: d(C) = pesha më e vogël e një fjalëkodi jo-zero. Kodi zbulon d−1 dhe korrigjon ⌊(d−1)/2⌋ gabime. Shembull: C = {00000, 00111, 11111} → d = 2.

**3. Çfarë quajmë peshë Hamming?**
w(c) = numri i koordinatave të ndryshme nga zero. w(11011) = 4. Për kode binare d(x,y) = w(x + y).

**4. Çfarë quajmë gjenerator matricë për kodin C?**
Matricë G me përmasa k×n, rreshtat e së cilës janë k fjalëkode **linearisht të pavarura** të kodit linear C[n,k]. Çdo fjalëkod është kombinim linear i rreshtave: c = m·G, ku m është mesazhi k-bitësh. Forma standarde G = [I_k | P]. Shembull: Hamming [7,4] ka G 4×7.

**5. Çfarë quajmë matricë të kontrollit për kodin C?**
Matricë H me përmasa (n−k)×n e tillë që c ∈ C ⇔ H·cᵀ = 0 (ekuivalent: G·Hᵀ = 0). Nëse G = [I|P] atëherë H = [Pᵀ|I]. Përdoret për dekodim: sindroma s = H·rᵀ; s = 0 → s'ka gabim; s = kolona j → gabim në pozicionin j.

**6. Kur quhen vektorët linearisht të varur?**
Vektorët v₁,…,vₖ janë linearisht të varur nëse ekzistojnë skalarë α₁,…,αₖ **jo të gjithë zero** me α₁v₁ + … + αₖvₖ = 0; d.m.th. njëri shprehet përmes të tjerëve. Përndryshe janë linearisht të pavarur. Mod 2: 110, 011, 101 janë të varur sepse 110 + 011 = 101.

**7. Çfarë është kodi Hamming C[7,4]?**
Kod linear binar me n = 7, k = 4 (3 bita kontrolli), 16 fjalëkode, largesë minimale 3, që korrigjon deri në 1 gabim. Matrica H ka si kolona të gjithë vektorët jo-zero 3-bitësh. Shkalla 4/7.

**8. Çfarë është kodi ciklik / polinomi gjenerues?**
Kod linear ku zhvendosja ciklike e çdo fjalëkodi është përsëri fjalëkod. Fjalëkodet shihen si polinome; të gjitha janë shumëfisha të polinomit gjenerues g(x) me shkallë n−k, i cili pjesëton xⁿ − 1. Kodimi c(x) = m(x)g(x); dekodimi me pjesëtim: mbetja ≠ 0 → gabim.

**9. Çfarë është shkalla e kodit?**
Raporti k/n (gjatësia e mesazhit / gjatësia e fjalëkodit). ISBN-10: 9/10; kodi i përsëritshëm 5: 1/5; Hamming: 4/7.

---

## PROBABILITETI

**10. Çfarë quajmë ngjarje të volitshme? Jep përkufizimin klasik të probabilitetit.**
Ngjarje e volitshme për A është çdo ngjarje elementare e cila e realizon A (kuti me 7 kuq, 5 bardhë; A = "kuq" → 7 ngjarje të volitshme). Përkufizimi klasik: nëse eksperimenti ka n ngjarje elementare të njëmundshme dhe m prej tyre janë të volitshme për A, atëherë **P(A) = m/n**. Shembull: P(numër tek te zari) = 3/6 = 1/2.

**11. Përmend disa veti të probabiliteteve.**
(1) 0 ≤ P(A) ≤ 1; (2) P(Ω) = 1, P(∅) = 0; (3) P(Ā) = 1 − P(A); (4) A ⊂ B ⇒ P(A) ≤ P(B); (5) A, B disjunkte ⇒ P(A+B) = P(A)+P(B); (6) P(A∪B) = P(A)+P(B)−P(AB); (7) A, B të pavarura ⇒ P(AB) = P(A)P(B).

**12. Çfarë quajmë ngjarje të varura dhe të pavarura? Jep shembull.**
Dy ngjarje janë **të pavarura** nëse ndodhja e njërës nuk ndikon në probabilitetin e tjetrës: P(AB) = P(A)·P(B). Shembull: dy hedhje të monedhës; tërheqje me kthim. Janë **të varura** nëse ndikon: P(AB) = P(A)·P(B|A). Shembull: tërheqje e dy lëmsheve pa kthim – pas të parës ndryshon përbërja e kutisë.

**13. Çfarë është probabiliteti i kushtëzuar?**
P(B|A) = P(AB)/P(A) – probabiliteti i B me kusht që A ka ndodhur. Shembull: zari, dihet ≤ 4; P(çift | ≤4) = (2/6)/(4/6) = 1/2.

**14. Për çfarë shërben formula e Bajesit dhe cila është?**
Nëse H₁,…,Hₙ është sistem i plotë hipotezash (disjunkte, shuma Ω) dhe A ngjarje me P(A) > 0, atëherë **P(Hᵢ|A) = P(Hᵢ)·P(A|Hᵢ) / Σₖ P(Hₖ)·P(A|Hₖ)**. Shërben për të gjetur probabilitetin e **shkakut (hipotezës)** pasi është vërejtur pasoja A – "probabiliteti i hipotezave". Emëruesi është formula e probabilitetit të plotë. Shembull: artikulli me defekt – nga cila fabrikë është më e mundshme.

**15. Çfarë është formula e probabilitetit të plotë?**
P(A) = Σ P(Hₖ)·P(A|Hₖ), kur H₁,…,Hₙ formojnë sistem të plotë hipotezash. Shembull: dy kuti, zgjidhet kutia me monedhë, tërhiqet lëmsh.

**16. Çfarë është ndryshorja e rastit, ligji i shpërndarjes, pritja matematike dhe dispersioni?**
Ndryshore e rastit X: funksion që çdo ngjarjeje elementare i shoqëron një numër real. Diskrete – merr vlera të numërueshme x₁, x₂, … me probabilitete p₁, p₂, … (Σpᵢ = 1). Ligji i shpërndarjes = tabela (xᵢ / pᵢ). Pritja matematike E(X) = Σxᵢpᵢ (mesatarja e pritur). Dispersioni D(X) = E(X²) − [E(X)]² = Σ(xᵢ − E(X))²pᵢ (masa e shpërndarjes rreth mesatares). σ = √D(X).

**17. Çfarë është shpërndarja binomiale?**
Numri X i sukseseve në n prova të pavarura me probabilitet p në çdo provë: P(X=k) = C(n,k)pᵏqⁿ⁻ᵏ, q = 1−p; E(X) = np, D(X) = npq. Shembull: 3 ushtarë me p = 0.6, X = numri i qëllimeve.

---

## STATISTIKA

**18. Çfarë është statistika? Popullimi dhe mostra?**
Statistika = shkenca e grumbullimit, organizimit, prezantimit, analizimit dhe interpretimit të të dhënave numerike për vendimmarrje në kushte pasigurie. Popullimi = të gjitha njësitë me interes; mostra = pjesë përfaqësuese e popullimit, mbi bazën e së cilës nxirren përfundime për popullimin. Statistika deskriptive përshkruan (tabela, mesatare), inferenciale përgjithëson nga mostra.

**19. Cilat janë parametrat e pozicionit dhe të dispersionit?**
Pozicioni: mesi aritmetik x̄ = Σfx/N, gjeometrik G = (Πxᶠ)^(1/N), harmonik H = N/Σ(f/x), moda (vlera më e shpeshtë), mediana (vlera e mesit), kuartilet. Dispersioni: dispersioni σ² = Σf(x−x̄)²/N, devijimi standard σ, mënjanimi interkuartil IQR = Q₃ − Q₁, amplituda (max − min).

---

## FUNKSIONET GJENERUESE DHE REKURENCAT

**20. Çfarë quajmë funksion gjenerues?**
Funksioni gjenerues i vargut a₀, a₁, a₂, … është seria fuqi **f(x) = a₀ + a₁x + a₂x² + … = Σ aₖxᵏ**, ku kufizat e vargut janë koeficientët e serisë. Shembull: 1,1,1,… → 1/(1−x); 1,2,3,… → 1/(1−x)². Përdoret për të shprehur vargje në formë të mbyllur, për të kombinuar vargje dhe për të zgjidhur rekurenca.

**21. Çfarë është ekuacioni rekurent linear homogjen? Sqaro zgjidhjen e përgjithshme.**
Ekuacion i formës c₀aₙ + c₁aₙ₋₁ + … + cₘaₙ₋ₘ = 0 me koeficientë konstantë (johomogjen nëse ana e djathtë është f(n) ≠ 0). Zgjidhja: zëvendësojmë aₙ = rⁿ dhe marrim **ekuacionin karakteristik** c₀rᵐ + c₁rᵐ⁻¹ + … + cₘ = 0. Nëse rrënjët r₁,…,rₘ janë të ndryshme: aₙ = α₁r₁ⁿ + … + αₘrₘⁿ. Nëse rᵢ ka shumëfishitet s: pjesa e saj është (α₀ + α₁n + … + α_{s−1}n^{s−1})rᵢⁿ. Zgjidhja e përgjithshme ka m konstante arbitrare që caktohen nga m kushtet fillestare. Për johomogjenen: aₙ = h(n) + p(n).

**22. Çfarë thotë teorema binomiale e zgjeruar?**
Për çdo numër të plotë n (edhe negativ): (1 + x)ⁿ = Σ C(n,k)xᵏ, ku C(n,k) = n(n−1)…(n−k+1)/k!. Për n negativ: C(−n,k) = (−1)ᵏC(n+k−1,k), prandaj (1−x)⁻ⁿ = Σ C(n+k−1,k)xᵏ. Shembull: 1/(1−x)² = Σ(k+1)xᵏ.

## TEMAT SHTESË NGA SYLLABUSI

**23. Si testohet hipoteza për mesataren e një popullimi normal?**
Formulohet H₀: μ=μ₀ dhe alternativa μ≠μ₀, μ>μ₀ ose μ<μ₀. Kur σ dihet, z=(x̄−μ₀)/(σ/√n); kur σ nuk dihet, t=(x̄−μ₀)/(s/√n), df=n−1. Refuzohet H₀ kur statistika bie në rajonin kritik; për test Z dykahësh me α=0.05 kufijtë janë ±1.96.

**24. Çfarë është funksioni gjenerues eksponencial?**
FGE e vargut (aₙ) është E(x)=Σaₙxⁿ/n!, prandaj aₙ=n!·[xⁿ]E(x). Ndryshe nga FG e zakonshme, vargu 1,1,1,… ka FGE eˣ, kurse vargu cⁿ ka FGE eᶜˣ. Prodhimi i dy FGE-ve jep konvolucionin binomial cₙ=ΣC(n,k)aₖbₙ₋ₖ.

---

## SHTESA NGA SHËNIMET E DORËS

**25. Si kontrollohen ISBN-10, ISBN-13 dhe UPC-A?**
ISBN-10 plotëson \(10d_1+9d_2+\cdots+d_{10}\equiv0\pmod{11}\), ku X mund të përfaqësojë 10. ISBN-13 përdor peshat 1,3,1,3,… dhe UPC-A peshat 3,1,3,1,… mbi shifrat e të dhënave; shifra e fundit zgjidhet që shuma të jetë 0 mod 10.

**26. Çfarë është kodi me paritet dydimensional?**
Bitat vendosen në matricë dhe shtohet paritet për çdo rresht e kolonë. Një gabim i vetëm jep një rresht dhe një kolonë me paritet të gabuar; prerja e tyre e lokalizon dhe e korrigjon bitin. Katër gabime në cepat e një drejtkëndëshi mund të mbeten të pazbuluara.

**27. Si gjendet shpërndarja e Z=X+Y?**
Në përgjithësi \(P(Z=z)=\sum_xP(X=x,Y=z-x)\). Nëse X dhe Y janë të pavarura, \(P(Z=z)=\sum_xP(X=x)P(Y=z-x)\); produktet që japin të njëjtën shumë z bashkohen. Gjithmonë \(E(Z)=E(X)+E(Y)\), ndërsa për pavarësi \(D(Z)=D(X)+D(Y)\).

**28. Çfarë është mesatarja kuadratike?**
\(Q=\sqrt{\sum f_ix_i^2/N}\). Për të dhëna pozitive vlen \(H\le G\le\bar{x}\le Q\).

**29. Çfarë është mënjanimi mesatar absolut?**
\(\operatorname{MAD}=\sum f_i|x_i-\bar{x}|/N\). Ai përdor largesat absolute nga mesatarja, ndryshe nga devijimi standard që përdor katrorët e largesave.

**30. Cili është dallimi mes IQR-së dhe mënjanimit kuartil?**
IQR është \(Q_3-Q_1\). Mënjanimi kuartil (semi-interquartile range) është \((Q_3-Q_1)/2\), pra gjysma e IQR-së.

