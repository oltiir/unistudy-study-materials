# 09 - Regular Expressions dhe NFA

Video përkatëse: [Ligjërata 10](https://www.youtube.com/watch?v=5kXoXfFUshU) dhe [Ushtrimi 10](https://www.youtube.com/watch?v=vs2Te_JFTpc).

## 1. Çka është Regular Expression?

Regular expression, regex, është mënyrë për të përshkruar një bashkësi stringjesh.

Regex nuk është vetëm një string që kërkohet fjalë për fjalë. Ai mund të përshkruajë zgjedhje, përsëritje dhe grupe.

## 2. Operatorët bazë

### Concatenation

`AB` do të thotë A pastaj B. Pranon vetëm `AB`.

### Alternation

`A|B` do të thotë A ose B.

### Kleene star

`A*` do të thotë zero ose më shumë A.

Pranon:

```text
"", A, AA, AAA, ...
```

### Plus

`A+` do të thotë një ose më shumë A.

Pranon:

```text
A, AA, AAA, ...
```

Nuk pranon string bosh.

### Optional

`A?` do të thotë zero ose një A.

Pranon `""` ose `A`.

### Wildcard

`.` zakonisht pranon cilindo karakter të vetëm.

### Parentheses

Parentheses bëjnë grupim dhe kontrollojnë prioritetin.

```text
AB|CD
```

zakonisht do të thotë `(AB)|(CD)`.

```text
A(B|C)D
```

pranon `ABD` ose `ACD`.

## 3. Precedence

Rendi tipik:

1. `*`, `+`, `?`;
2. concatenation;
3. `|`.

Kur ka dyshim, përdor parentheses. Në provim parentheses e bëjnë përgjigjen shumë më të qartë.

## 4. Çka është automati?

Automati ka:

- gjendje, states;
- gjendje fillestare;
- transitions;
- gjendje pranuese.

Ai e lexon input-in karakter pas karakteri dhe ndryshon gjendje.

## 5. DFA kundrejt NFA

### DFA

Deterministic Finite Automaton ka saktësisht një transition për çdo kombinim `(state, input character)`.

Në çdo moment ekziston një gjendje aktive.

### NFA

Nondeterministic Finite Automaton mund të ketë:

- zero, një ose disa transitions për të njëjtin karakter;
- epsilon transitions që nuk konsumojnë karakter.

Në çdo moment mund të ketë një bashkësi gjendjesh aktive.

NFA e pranon stringun nëse ekziston të paktën një rrugë që përfundon në accept state pasi lexohet i gjithë input-i.

## 6. Epsilon transition

Epsilon transition, `ε`, lejon kalimin në gjendje tjetër pa lexuar karakter nga input-i.

Përdoret për:

- zgjedhjen `A|B`;
- hyrjen/daljen e një grupi;
- kalimin rreth `*`;
- përsëritjen e `*`.

## 7. Epsilon closure

Epsilon closure e një bashkësie gjendjesh është çdo gjendje që mund të arrihet duke përdorur vetëm epsilon transitions, duke përfshirë gjendjet fillestare.

Gjatë simulimit:

1. gjej epsilon closure të gjendjes fillestare;
2. lexo një karakter;
3. ndiq transitions që pranojnë atë karakter;
4. gjej epsilon closure të gjendjeve të reja;
5. përsërit.

## 8. Ndërtimi konceptual i NFA nga regex

Për regex `A(B|C)*D`:

1. krijo transition për A;
2. krijo degëzim epsilon për B ose C;
3. krijo epsilon transitions që lejojnë përsëritje ose dalje nga `*`;
4. krijo transition për D;
5. gjendja pas D është accept state.

Nuk duhet ta vizatosh nga memoria pa e analizuar regex-in. Shëno fillimisht operatorët dhe parentheses.

## 9. Simulimi i NFA

Shembull i thjeshtë për regex `A(B|C)D` dhe input `ACD`.

1. Fillojmë te state para A.
2. Lexojmë A dhe kalojmë te grupi `(B|C)`.
3. Epsilon closure aktivizon degën B dhe degën C.
4. Lexojmë C; mbetet vetëm rruga e degës C.
5. Lexojmë D dhe arrijmë accept state.
6. Input-i ka përfunduar dhe accept state është aktiv, prandaj pranohet.

Nëse accept state arrihet para se të mbarojë input-i, stringu ende nuk pranohet. Duhet të konsumohen të gjitha karakteret.

## 10. Si ndërtohet regex për një listë fjalësh?

Mos i bashko fjalët menjëherë me `|`. Gjej prefix-in e përbashkët dhe faktorizoje.

### BOOK, BOOT, BOAT, BOO, BOT

Të gjitha fillojnë me `BO`.

Suffix-et janë:

```text
OK, OT, AT, O, T
```

Një regex e saktë:

```text
BO(O(K|T)?|A?T)
```

Kontrolli:

- `O(K|T)?` jep O, OK, OT;
- `A?T` jep T ose AT.

Me prefix BO marrim saktësisht pesë fjalët.

`BOOOK` refuzohet dhe `BOOTS` refuzohet.

### HOUSE, HORSE, HOUR, HORSER

Prefix i përbashkët: `HO`.

```text
HO(U(SE|R)|RSE(R)?)
```

- `U(SE|R)` jep USE ose UR;
- `RSE(R)?` jep RSE ose RSER.

`HORSEY` refuzohet. `HOUSE` pranohet.

### CATCH, CATE, CAT, CATTLE, CATALOG

Prefix: `CAT`.

Suffix-et: `CH`, `E`, bosh, `TLE`, `ALOG`.

```text
CAT(CH|E|TLE|ALOG)?
```

`?` në fund e lejon suffix-in bosh, pra fjalën CAT.

### MIND, MINE, MIN, MINER, MINT

Prefix: `MIN`.

```text
MIN(D|E(R)?|T)?
```

- alternativa e jashtme bosh jep MIN;
- D jep MIND;
- E me R optional jep MINE/MINER;
- T jep MINT.

### DRIVE, DIVE, DIE, DIVER, DRIVER

Një regex e qartë:

```text
D(R?IVE|IE|IVER|RIVER)
```

Kontrollo çdo degë veçmas. `DIVINE` dhe `DRIVES` refuzohen.

## 11. Intrusion Detection Systems

Regex dhe automatet mund të përdoren për të njohur modele në network traffic, logs ose payloads.

Shembull: një rregull mund të kërkojë një pattern të dyshimtë në request. Avantazhi është se automati e skanon stream-in në mënyrë sistematike.

Kufizimi: regex standard përshkruan regular languages. Modelet që kërkojnë numërim të pakufizuar ose struktura të balancuara nuk përshkruhen gjithmonë nga finite automata.

## 12. Kompleksiteti konceptual

Për simulimin klasik të NFA nga regex me `M` gjendje mbi text me `N` karaktere, puna mund të shprehet si `O(MN)` në implementim të përgjithshëm, sepse për çdo karakter përpunohet një bashkësi gjendjesh/transitions.

Detaji i saktë varet nga reprezentimi dhe numri i transitions, por në provim ideja kryesore është se nuk provohen të gjitha stringjet e mundshme; simulohet bashkësia e states aktive.

## 13. Gabimet klasike

1. Të harrohet se `*` lejon edhe zero paraqitje.
2. Të ngatërrohet `*` me `+`.
3. Të mos përdoren parentheses dhe të ndryshohet kuptimi.
4. Të konsiderohet string i pranuar sapo preket accept state, pa përfunduar input-i.
5. Të ndiqet vetëm një rrugë në NFA; duhet mbajtur bashkësia e states aktive.
6. Të harrohet epsilon closure pas çdo karakteri.
7. Regex-i të pranojë fjalë shtesë që nuk janë në listë.

## Kontrollo veten

1. Çka pranon `A*`?
2. Çka dallon NFA nga DFA?
3. A konsumon karakter epsilon transition?
4. Kur pranohet input-i?
5. Pse përdoret epsilon closure?
6. Jep regex për MIN, MIND, MINE, MINER, MINT.

### Përgjigjet

1. Zero ose më shumë A.
2. NFA mund të ketë disa gjendje aktive dhe epsilon transitions; DFA ka një gjendje aktive.
3. Jo.
4. Kur input-i ka përfunduar dhe accept state është aktiv.
5. Për t'i përfshirë të gjitha gjendjet e arritshme pa konsumuar input.
6. `MIN(D|E(R)?|T)?`.

