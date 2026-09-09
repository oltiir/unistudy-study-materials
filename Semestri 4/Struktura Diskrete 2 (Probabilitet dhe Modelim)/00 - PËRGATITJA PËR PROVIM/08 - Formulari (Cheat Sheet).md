# 08 – Formulari: gjithçka në një faqe (rilexo mëngjesin e provimit)

## KODET
- Mbledhja mod 2: 1+1 = 0. d(x,y) = nr. pozicionesh të ndryshme = w(x+y). **d(C) linear = pesha min jo-zero.**
- Zbulon **d−1**, korrigjon **⌊(d−1)/2⌋**. Kodi linear C[n,k]: 2ᵏ fjalëkode, shkalla k/n.
- **c = m·G** (shuma e rreshtave të G ku m ka 1). Dy forma: G = [I_k | P] ⇒ H = [Pᵀ | I_r]; ose forma e fotografive **H = [I_r | Q] ⇒ G = [Qᵀ | I_k]**. Në të dyja: H·cᵀ = 0 dhe G·Hᵀ = 0.
- **Sindroma s = H·rᵀ**: 0 → OK; = kolona j → gabim në bitin j.
- **Hamming [7,4], forma e provimit:** H ka kolonat 111,110,101,100,011,010,001. Renditja c=(m₁,m₂,m₃,p₁,m₄,p₂,p₃); p₁=m₁+m₂+m₃, p₂=m₁+m₂+m₄, p₃=m₁+m₃+m₄. Për m=0110 del **c=0110011**.
- **Grupi standard**: rreshti 1 = C; rreshtat tjerë = udhëheqës (pesha min, i papërdorur) + C. r → udhëheqësi i rreshtit = gabimi; c = kreu i kolonës.
- **Polinomiale**: c₀c₁…c_{n−1} ↔ c₀ + c₁x + … . **c(x) = m(x)·g(x)**. Dekodim: r(x) ÷ g(x) → mbetja 0: OK, mesazhi = herësi; ≠ 0: gabim, sindroma xⁱ mod g → pozicioni i.
- g vlen për kod ciklik ⇔ deg g = n−k dhe **g | xⁿ + 1**. x⁷+1 = (x+1)(x³+x+1)(x³+x²+1). x⁸+1 = (x+1)⁸.
- **ISBN-10:** 10d₁+9d₂+…+d₁₀ ≡ 0 (mod 11), X=10. **ISBN-13:** pesha 1,3,…; **UPC-A:** pesha 3,1,…; shifra e fundit e bën shumën 0 (mod 10).
- **Pariteti 2D:** rreshti + kolona me paritet të gabuar lokalizojnë një gabim bit; katër cepat e një drejtkëndëshi mund të mos zbulohen.

## PROBABILITETI
- **P(A) = m/n**. P(Ā) = 1−P(A). P(A∪B) = P(A)+P(B)−P(AB). Disjunkte: P(A+B) = P(A)+P(B).
- **P(B|A) = P(AB)/P(A)**. Varura: P(AB) = P(A)P(B|A). Pavarura: P(AB) = P(A)P(B). P(ABC) = P(A)P(B|A)P(C|AB).
- **Prob. i plotë**: P(A) = Σ P(Hₖ)P(A|Hₖ). **Bajes**: P(Hᵢ|A) = P(Hᵢ)P(A|Hᵢ)/P(A).
- **Pa kthim** (hipergjeometrike): P(X=k) = C(B,k)·C(N−B,n−k)/C(N,n). E(X) = n·B/N. Ose pema: shumëzo radhazi × numri i renditjeve C(n,k).
- **Me kthim** (binomiale): P(X=k) = C(n,k)pᵏqⁿ⁻ᵏ, E = np, D = npq. Puason: λᵏe^{−λ}/k!.
- **E(X) = Σxᵢpᵢ**, **E(X²) = Σxᵢ²pᵢ**, **D(X) = E(X²) − [E(X)]²**, σ = √D. Σpᵢ = 1 GJITHMONË.
- **Z=X+Y:** P(Z=z)=ΣₓP(X=x,Y=z−x); me pavarësi =ΣₓP(X=x)P(Y=z−x). E(Z)=E(X)+E(Y); me pavarësi D(Z)=D(X)+D(Y).
- C(n,k) = n!/(k!(n−k)!). C(21,3) = 1330, C(23,3) = 1771, C(24,3) = 2024, C(12,3) = 220, C(14,2) = 91.

## STATISTIKA (të dhëna të grupuara, xᵢ = mesi i klasës, h = gjerësia, F = kumulative)
- **x̄ = Σfx/N**. **G = e^{(Σ f·ln x)/N}**. **H = N/Σ(f/x)**. **Q = √(Σfx²/N)**. Për të dhëna pozitive: **H ≤ G ≤ x̄ ≤ Q**.
- **MAD = Σf|x−x̄|/N**. **IQR = Q₃−Q₁**; mënjanimi kuartil = IQR/2.
- **Mo = L + (fₘ−f₁)/[(fₘ−f₁)+(fₘ−f₂)]·h** (klasa me f max; f₁ para, f₂ pas).
- **Me = L + (N/2 − F_para)/fₘ·h**. **Q₁**: N/4. **Q₃**: 3N/4. **IQR = Q₃−Q₁**. Pₖ: kN/100.
- **σ² = Σf(x−x̄)²/N = Σfx²/N − x̄²**, σ = √σ². (Me N−1 nëse kërkohet mostër.)
- Centili i vlerës x: [F_para + (x−L)/h·f]/N·100.
- **Testi i mesatares:** H₀:μ=μ₀. σ dihet: z=(x̄−μ₀)/(σ/√n). σ s'dihet: t=(x̄−μ₀)/(s/√n), df=n−1. Me α=.05: dykahësh |z|>1.96; njëkahësh z>1.645 ose z<−1.645.

## FUNKSIONET GJENERUESE
- 1,1,1,… → **1/(1−x)**; 1,0,1,0,… → **1/(1−x²)**; 1,c,c²,… → 1/(1−cx); 1,2,3,… → **1/(1−x)²**; 0,1,2,3,… → x/(1−x)².
- k zero në fillim → **·xᵏ**. a,b,a,b,… → **(a + bx)/(1−x²)**. Mbledhja, ·c, derivimi (a₁,2a₂,3a₃…), integrimi.
- **(1−x)⁻ⁿ = Σ C(n+k−1, k)xᵏ**; **(1+x)⁻ⁿ = Σ (−1)ᵏC(n+k−1, k)xᵏ**; me cx → ·cᵏ. C(k+3,3) = (k+1)(k+2)(k+3)/6; C(k+2,2) = (k+1)(k+2)/2; C(k+1,1) = k+1.
- Eksponent pozitiv → thjesht zgjero: (1+2x)² = 1 + 4x + 4x².
- **FGE:** E(x)=Σaₙxⁿ/n!, aₙ=n!·[xⁿ]E(x). 1,1,1,…→eˣ; cⁿ→eᶜˣ; n→xeˣ; n(n−1)→x²eˣ. Prodhimi: cₙ=ΣC(n,k)aₖbₙ₋ₖ.

## REKURENCAT
- aₙ = rⁿ → **ekuacioni karakteristik**. Rrënjë të ndryshme: αr₁ⁿ + βr₂ⁿ. Dyfishe: (α + βn)rⁿ. Trefishe: (α + βn + γn²)rⁿ.
- Johomogjene aₙ = h(n) + p(n). f(n) = k·bⁿ: b jo rrënjë → p = A·bⁿ; b rrënjë (shumëf. m) → **p = A·nᵐ·bⁿ**. f(n) polinom shk. d: p = A₀+…+A_d n^d (·nᵐ nëse 1 është rrënjë).
- Rendi: (1) rrënjët, (2) p(n) me A nga zëvendësimi, (3) α, β nga a₀, a₁ te **h + p**, (4) **kontrollo a₂**.
