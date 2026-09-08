# 10 – Ushtrime për nesër sipas roadmap-it

Kjo fletë është për ushtrim pasi të mësohet tema përkatëse. Mos shiko zgjidhjet menjëherë.

> **Mënyra e punës:** shkruaj formulën, shpjego pse përdoret, zëvendëso të dhënat, llogarit dhe bëj një kontroll të rezultatit.

## Niveli 0 – Kontrolli i bazave

### 1. Mbledhja mod 2

Llogarit:

1. (1010+0111)
2. (1111+1010)
3. (1+1+1)
4. (1+1+1+1+1+1)

### 2. Vektorët binarë

1. Shkruaj të gjithë vektorët e (V(3,2)).
2. Sa vektorë ka (V(5,2))?
3. Për kodin (C[9,5]), gjej (n,k,r=n-k) dhe numrin (2^k) të mesazheve.

---

# Pjesa A – Kodet

## 3. Pesha dhe largesa e Hammingut

Jepen:

[
x=101101,qquad y=111001
]

Gjej:

1. (w(x));
2. (w(y));
3. (x+y) mod 2;
4. (d(x,y));
5. verifiko (d(x,y)=w(x+y)).

## 4. Kodi linear

Jepet:

[
C={000,110,011,101}
]

1. Kontrollo nëse zeroja është në (C).
2. Mblidh çdo çift të nevojshëm mod 2.
3. Vendos nëse (C) është linear.
4. Gjej një bazë.
5. Gjej (k) nga (2^k=|C|).
6. Ndërto matricën gjeneruese (G).

## 5. Gjenerimi i kodit nga (G)

Jepet:

[
G=
egin{bmatrix}
1&1&0\
0&1&1
end{bmatrix}
]

1. Shkruaj të gjitha mesazhet me (k=2) bita.
2. Për secilin mesazh llogarit (c=mG).
3. Shkruaj kodin (C).
4. Gjej (d(C)).

## 6. Zgjatja me paritet dhe forma polinomiale

Përdor kodin:

[
C={000,100,010,110}
]

1. Gjej bazën dhe dimensionin.
2. Shto bit pariteti çift secilit fjalëkod.
3. Ndërto matricën e re (G').
4. Shkruaj secilin fjalëkod të zgjatur si polinom duke përdorur konventën:
   [
   c_0c_1c_2c_3leftrightarrow c_0+c_1x+c_2x^2+c_3x^3
   ]

## 7. Hamming (C[7,4]): ndërtimi dhe kodimi

1. Gjej (n,k,r).
2. Kontrollo kushtin (2^rge n+1).
3. Ndërto një matricë (H) me 7 kolona jo-zero dhe të ndryshme, duke e vendosur (I_3) në fund.
4. Ndaje (H=[P^Tmid I_3]).
5. Ndërto (G=[I_4mid P]).
6. Kontrollo (GH^T=0).
7. Kodo mesazhin:
   [
   m=0110
   ]
8. Kontrollo (Hc^T=0).

## 8. Hamming (C[7,4]): gabimi dhe sindroma

Përdor të njëjtat (G,H) nga detyra 7.

1. Merre fjalëkodin e gjetur për (m=0110).
2. Ndrysho vetëm bitin e pestë dhe quaje rezultatin (r).
3. Llogarit:
   [
   s=Hr^T
   ]
4. Krahaso sindromën me kolonat e (H).
5. Gjej pozitën e gabimit.
6. Korrigjo (r) dhe nxirre mesazhin.

## 9. Hamming (C[9,5])

1. Gjej (r=n-k).
2. Shpjego pse sindroma ka 4 bita.
3. Zgjidh 9 vektorë jo-zero dhe të ndryshëm me gjatësi 4.
4. Rregullo kolonat që katër të fundit të formojnë (I_4).
5. Ndërto (H=[P^Tmid I_4]).
6. Ndërto (G=[I_5mid P]).
7. Kontrollo dimensionet dhe (GH^T=0).

## 10. Grupi standard (a+C)

Përdor matricën:

[
G=
egin{bmatrix}
1&1&0\
0&1&1
end{bmatrix}
]

dhe vektorin e pranuar:

[
r=101
]

1. Gjenero kodin (C).
2. Shkruaj rreshtin e parë të grupit standard.
3. Zgjidh udhëheqës me peshë minimale.
4. Formo klasat (a+C) derisa të përfshihet (V(3,2)).
5. Gjej (r) në tabelë.
6. Gjej gabimin, fjalëkodin e korrigjuar dhe mesazhin.

## 11. Kodi polinomial

Jepen:

[
m=1001,qquad g(x)=x^3+x+1
]

1. Ktheje mesazhin në (m(x)).
2. Llogarit (c(x)=m(x)g(x)) mod 2.
3. Ktheje (c(x)) në vektor.
4. Trego gjatësinë e fjalëkodit.

## 12. Kontrollimi me pjesëtim polinomial

Jepen:

[
r=1110011,qquad g(x)=x^3+x^2+x+1
]

1. Ktheje (r) në (r(x)).
2. Pjesëtoje (r(x)) me (g(x)) në mod 2.
3. Gjej herësin dhe mbetjen.
4. Vendos nëse është zbuluar gabim dhe shpjego pse.

---

# Pjesa B – Probabiliteti

## 13. Tërheqja pa kthim

Në një kuti ka 9 të bardha, 6 të kuqe dhe 6 të verdha. Tërhiqen 3 pa kthim. (X) është numri i të bardhave.

1. Gjej vlerat e mundshme të (X).
2. Llogarit (P(X=k)) për secilin (k).
3. Ndërto tabelën e shpërndarjes.
4. Kontrollo që shuma e probabiliteteve është 1.
5. Gjej (E(X)), (E(X^2)) dhe (D(X)).

## 14. I njëjti model me numra të tjerë

Në një parking ka 10 vetura të kuqe, 7 të zeza dhe 7 të bardha. Dalin 3 pa kthim. (X) është numri i veturave të kuqe.

Zgjidhi të njëjtat pesë kërkesa si në detyrën 13.

## 15. Dy parkingje

Parkingu i parë ka 6 të bardha, 3 të zeza dhe 5 të kuqe. Parkingu i dytë ka 4 të bardha, 5 të zeza dhe 3 të kuqe. Dy vetura kalojnë rastësisht nga i pari në të dytin, pastaj nga i dyti zgjidhet një veturë.

Gjej probabilitetin që vetura e zgjedhur të jetë e bardhë duke përdorur hipotezat:

- kaluan 0 të bardha;
- kaloi 1 e bardhë;
- kaluan 2 të bardha.

---

# Pjesa C – Statistika

## 16. Tabela e plotë e provimit

| Pesha në kg | 60–62 | 62–64 | 64–66 | 66–68 | 68–70 | 70–72 |
|---|---:|---:|---:|---:|---:|---:|
| (f_i) | 10 | 14 | 35 | 26 | 9 | 6 |

Gjej me radhë:

1. (N), (h), meset (x_i) dhe frekuencat kumulative;
2. mesin aritmetik;
3. mesin gjeometrik;
4. mesin harmonik;
5. modën;
6. medianën;
7. variancën dhe devijimin standard;
8. (Q_1,Q_3), IQR dhe mënjanimin kuartil;
9. histogramin;
10. kontrollin (Hle Glear x).

## 17. Variant tjetër

| Gjatësia në cm | 150–155 | 155–160 | 160–165 | 165–170 | 170–175 | 175–180 |
|---|---:|---:|---:|---:|---:|---:|
| (f_i) | 18 | 22 | 40 | 20 | 9 | 11 |

Zgjidhi të njëjtat kërkesa si në detyrën 16.

---

# Pjesa D – Funksionet gjeneruese

## 18. Nga vargu te funksioni

Gjej funksionin gjenerues të vargut:

[
0,0,0,0,7,3,7,3,7,3,ldots
]

Duhet të tregosh:

1. funksionin e vargut (7,3,7,3,ldots);
2. pse emëruesi është (1-x^2);
3. pse katër zerot japin faktor (x^4);
4. kontrollin duke zgjeruar termat e parë.

## 19. Nga funksioni te vargu

Shkruaj pesë anëtarët e parë dhe formulën e (a_k) për secilin:

[
rac1{(1+2x)^2},qquad
rac1{(1+2x)^4},qquad
rac1{(1-3x)^4}
]

## 20. Rekurenca homogjene

Zgjidh:

[
a_n=2a_{n-1}+3a_{n-2},qquad a_0=1,quad a_1=3
]

Trego ekuacionin karakteristik, rrënjët, konstantet dhe kontrollin me (a_2).

## 21. Rekurenca johomogjene

Zgjidh:

[
a_n=9a_{n-1}-14a_{n-2}+2^n,qquad a_0=1,quad a_1=1
]

Shpjego pse zgjidhja e veçantë duhet të përmbajë faktorin (n).

---

# Pjesa E – Teoria

Për secilën shkruaj 2–4 fjali, formulën dhe një shembull kur ka kuptim:

1. Çfarë është fjalëkodi?
2. Çfarë është matrica gjeneruese (G)?
3. Çfarë është matrica e kontrollit (H)?
4. Çfarë është sindroma?
5. Çfarë është largesa minimale e Hammingut?
6. Kur janë vektorët linearisht të pavarur?
7. Çfarë është probabiliteti klasik?
8. Çfarë janë ngjarjet e varura dhe të pavarura?
9. Për çfarë shërben formula e Bayes-it?
10. Çfarë është funksioni gjenerues i një vargu?

---

## Si kontrollohen përgjigjet

Pas tentimit tënd, krahasoji me:

- [01 – Teoria e Kodeve](<./01 - Teoria e Kodeve.md>)
- [02 – Probabiliteti](<./02 - Probabiliteti.md>)
- [03 – Statistika](<./03 - Statistika.md>)
- [04 – Funksionet Gjeneruese dhe Rekurencat](<./04 - Funksionet Gjeneruese dhe Rekurencat.md>)
- [05 – Provimet e Kaluara – Zgjidhje të Plota](<./05 - Provimet e Kaluara - Zgjidhje të Plota.md>)
- [06 – Detyra për Ushtrim me zgjidhje](<./06 - Detyra për Ushtrim (me zgjidhje).md>)

> Mos u shqetëso nëse fillimisht nuk i zgjidh të gjitha. Qëllimi është të identifikosh hapin ku bllokohesh; pastaj atë hap e mësojmë bashkë.
