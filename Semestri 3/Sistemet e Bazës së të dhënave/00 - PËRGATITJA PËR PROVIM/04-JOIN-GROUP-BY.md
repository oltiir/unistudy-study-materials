# 04 — JOIN, GROUP BY dhe HAVING pa hamendje

Burimi: ligjëratat 8–9 dhe [ushtrimi real i spitalit, me zgjidhje](../11%20-%20Ligjërata%209/Ushtrime%209%20-%20Zgjidhja/toBeExecutedByStudents-G3b-Zgjidhja.sql).

## 1. Pse JOIN?

`Spitali(Id, Emri)` dhe `Doktori(Id, Emri, Spitali)`: që të marrësh emrin e spitalit të një doktori, gjej përputhjen `Doktori.Spitali = Spitali.Id`.

```sql
SELECT d.Emri AS Doktori, s.Emri AS Spitali
FROM Doktori AS d
INNER JOIN Spitali AS s ON d.Spitali = s.Id;
```

Shiko kartat në [laborator](laboratori.html): së pari përcakto për çdo rresht të majtë cilin rresht të djathtë e përputh ON, pastaj shih nëse ruhet rreshti pa përputhje.

| Lloji | Rreshtat që i ruan | Shembull |
| --- | --- | --- |
| `INNER JOIN` | vetëm çiftet që përputhen | doktorët që kanë spital |
| `LEFT JOIN` | **të gjithë të majtët**, pa përputhje marrin NULL djathtas | të gjitha spitalet, edhe bosh |
| `RIGHT JOIN` | të gjithë të djathtët | mund ta rishkruash me LEFT duke ndërruar rendin |
| `FULL OUTER JOIN` | të dy anët, edhe të papërputhurit | tabelat me boshllëqe në secilën anë |
| `CROSS JOIN` | çdo rresht majtas me çdo rresht djathtas | 3 × 4 = 12 rreshta |

Për “spitalet pa pacientë”, ruaj spitalet majtas, pastaj filtro vetëm ata pa ndeshje:

```sql
SELECT s.Id, s.Emri
FROM Spitali AS s
LEFT JOIN Pacienti AS p ON p.Spitali = s.Id
WHERE p.Id IS NULL;
```

**Gabim i zakonshëm:** `LEFT JOIN ... WHERE p.Vendbanimi = 'Lipjan'` heq rreshtat ku p është NULL dhe e shndërron praktikisht në inner join për këtë filtër. Nëse do t'i ruash të gjithë spitalet dhe vetëm të bashkosh pacientët nga Lipjani, vendose filtrin te `ON ... AND p.Vendbanimi = 'Lipjan'`. Nëse do vetëm spitalet me pacientë nga Lipjani, WHERE ka kuptim.

**M:N në 3 hapa:** `Doktori d JOIN Diagnoza_Doktori dd ON ... JOIN Diagnoza di ON ...`. Te çdo ON lidh FK me PK. Nuk mund të kalosh direkt nga doktori te diagnoza pa tabelën lidhëse.

## 2. Agregimet

`COUNT(*)` numëron rreshtat e grupit; `COUNT(p.Id)` numëron vetëm pacientët e gjetur. `SUM`, `AVG`, `MIN`, `MAX` operojnë mbi vlera jo NULL; AVG është mesatarja e tyre.

```sql
SELECT s.Id, s.Emri, COUNT(d.Id) AS NrDoktoreve
FROM Spitali AS s
LEFT JOIN Doktori AS d ON d.Spitali = s.Id
GROUP BY s.Id, s.Emri
ORDER BY NrDoktoreve DESC;
```

Pse `COUNT(d.Id)` dhe jo `COUNT(*)`? LEFT JOIN prodhon një rresht edhe kur spitali s'ka doktor, me `d.Id = NULL`. `COUNT(*)` do të kthente **1** gabimisht për spitalin bosh; `COUNT(d.Id)` kthen **0**.

## 3. WHERE kundrejt HAVING

```sql
SELECT s.Id, s.Emri, COUNT(d.Id) AS NrDoktoreve
FROM Spitali s
JOIN Doktori d ON d.Spitali = s.Id
WHERE d.PagaMujore >= 1000
GROUP BY s.Id, s.Emri
HAVING COUNT(d.Id) >= 2
ORDER BY NrDoktoreve DESC;
```

**Rrjedha mendore:** FROM/JOIN → WHERE (heq rreshta) → GROUP BY (krijon grupe) → HAVING (heq grupe) → SELECT → ORDER BY. Query më sipër kërkon spitale me së paku 2 doktorë **me pagë >= 1000**, jo spitale me së paku 2 doktorë gjithsej. Në SQL Server, çdo kolonë jo e agreguar në SELECT duhet të jetë në GROUP BY.

Për “**më pak se 3 pacientë, edhe spitalet me zero**”:

```sql
SELECT s.Id, s.Emri, COUNT(p.Id) AS NrPacienteve
FROM Spitali s
LEFT JOIN Pacienti p ON p.Spitali = s.Id
GROUP BY s.Id, s.Emri
HAVING COUNT(p.Id) < 3;
```

Në zgjidhjen e vjetër të ushtrimit 9, detyra 13 përdor `INNER JOIN` dhe `COUNT(*)`; kështu humben spitalet me **zero** pacientë. Përfshiji vetëm nëse fjalia “të gjithë spitalet me më pak se 3” i nënkupton edhe ato me zero; kjo pyetje e gjuhës së kërkesës ndryshon përgjigjen.

## 4. Kur JOIN shumëfishon rezultatet

Nëse një spital ka 2 doktorë dhe 3 pacientë, `Spitali JOIN Doktori JOIN Pacienti` mund të japë **2 × 3 = 6** rreshta për atë spital. `COUNT(d.Id)` del 6, jo 2. Zgjidh me agregime të ndara, nënpyetje, ose `COUNT(DISTINCT d.Id)` nëse është e përshtatshme. Në ushtrimin 9, pyetja 10 bashkon pacientët dhe doktorët **përmes diagnozës së përbashkët**; kjo nuk dëshmon domosdoshmërisht që doktori konkret e ka trajtuar pacientin. Për atë kuptim nevojitet lidhje e shprehur me `Pacienti.Doktori` ose regjistër trajtimesh.

## Provo vetë

1. Shfaq spitalet që kanë **saktësisht 2 doktorë**.
2. Shfaq doktorët që **nuk kanë asnjë diagnozë**.
3. Shfaq çdo spital dhe numrin e pacientëve, përfshi zero. Pastaj filtro vetëm ata me `0`.

<details><summary>Zgjidhjet</summary>

```sql
SELECT s.Id, s.Emri
FROM Spitali s JOIN Doktori d ON d.Spitali = s.Id
GROUP BY s.Id, s.Emri HAVING COUNT(d.Id) = 2;

SELECT d.Id, d.Emri
FROM Doktori d LEFT JOIN Diagnoza_Doktori dd ON dd.Doktori_id = d.Id
WHERE dd.Doktori_id IS NULL;

SELECT s.Id, s.Emri, COUNT(p.Id) AS Nr
FROM Spitali s LEFT JOIN Pacienti p ON p.Spitali = s.Id
GROUP BY s.Id, s.Emri;
-- Për zero: shto HAVING COUNT(p.Id) = 0 pas GROUP BY.
```
</details>

