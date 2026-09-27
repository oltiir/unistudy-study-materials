# 07 — Detyra gjatë mësimit dhe provë 100 pikë

**Mos i hap zgjidhjet pa bërë përpjekje në letër/SSMS.** Skema e detyrave 1–16 është ajo e [ushtrimit real 9](../11%20-%20Ligjërata%209/Ushtrime%209%20-%20Zgjidhja/toBeExecutedByStudents-G3b-Zgjidhja.sql): `Spitali(Id,Emri,Vendi)`, `Doktori(Id,Emri,Mbiemri,Kualifikimi,Spitali,PagaMujore)`, `Pacienti(Id,Emri,Mbiemri,Datelindja,Vendbanimi,Doktori,Spitali)`, `Diagnoza(Diagnoza_ID,Pershkrimi,Semundja)`, `Diagnoza_Doktori(Diagnoza_id,Doktori_id)`, `Diagnoza_Pacienti(Diagnoza_id,Pacienti_Id)`. SQL i dataset-it origjinal ka INSERT, kështu që mund t'i provosh në SSMS. **Mos e ekzekuto UPDATE/DELETE në dataset pa kopje.**

## Niveli 1 — sa lexon, aq provon

1. Shfaq emrin/mbiemrin e pacientëve pa doktor; renditi alfabetikisht. 2. Shfaq emrat e doktorëve me pagë 1000–1500, përfshirë kufijtë. 3. Shfaq pagën e re hipotetike +10% dhe pastaj shkruaj UPDATE që e ndryshon vetëm doktorin me ID 3. 4. Çfarë ndryshimi ka `SELECT COUNT(*)` nga `SELECT COUNT(Doktori)` mbi Pacienti?

<details><summary>Niveli 1 — zgjidhjet</summary>

```sql
-- 1
SELECT Emri, Mbiemri FROM Pacienti
WHERE Doktori IS NULL ORDER BY Emri, Mbiemri;
-- 2
SELECT Emri, Mbiemri FROM Doktori
WHERE PagaMujore BETWEEN 1000 AND 1500;
-- 3a: vetëm shfaqje
SELECT Id, PagaMujore * 1.10 AS PagaRe FROM Doktori WHERE Id = 3;
-- 3b: ndryshim real
UPDATE Doktori SET PagaMujore = PagaMujore * 1.10 WHERE Id = 3;
```

4: COUNT(*) numëron të gjithë pacientët; COUNT(Doktori) vetëm ata me FK doktori jo NULL.
</details>

## Niveli 2 — JOIN, LEFT, grupimi

5. Shfaq emrin e doktorit dhe emrin e spitalit ku punon. 6. Gjej spitalet **pa pacientë**. 7. Numëro pacientët në secilin spital, përfshirë ata me zero. 8. Kthe vetëm spitalet me **saktësisht 2 doktorë**. 9. Gjej diagnozat që **asnjë doktor nuk i ka përshkruar**. 10. Sa rreshta dalin nga CROSS JOIN mes një tabele me 4 rreshta dhe një tabele me 6? 11. Për çdo spital, shfaq numrin e doktorëve me pagë > 1000, por ruaj edhe spitalet me zero.

<details><summary>Niveli 2 — zgjidhjet dhe arsyet</summary>

```sql
-- 5: FK Doktori.Spitali = PK Spitali.Id
SELECT d.Emri AS Doktori, s.Emri AS Spitali
FROM Doktori d JOIN Spitali s ON s.Id = d.Spitali;
-- 6: ruaj çdo spital; vetëm pa përputhje
SELECT s.Id, s.Emri FROM Spitali s
LEFT JOIN Pacienti p ON p.Spitali = s.Id
WHERE p.Id IS NULL;
-- 7: COUNT(p.Id) është zero për rreshtin NULL
SELECT s.Id, s.Emri, COUNT(p.Id) AS NrPacienteve
FROM Spitali s LEFT JOIN Pacienti p ON p.Spitali = s.Id
GROUP BY s.Id, s.Emri;
-- 8
SELECT s.Id, s.Emri FROM Spitali s
JOIN Doktori d ON d.Spitali = s.Id
GROUP BY s.Id, s.Emri HAVING COUNT(d.Id) = 2;
-- 9
SELECT di.Diagnoza_ID, di.Semundja FROM Diagnoza di
LEFT JOIN Diagnoza_Doktori dd ON dd.Diagnoza_id = di.Diagnoza_ID
WHERE dd.Diagnoza_id IS NULL;
-- 11: kushti te ON ruan spitalet me zero
SELECT s.Id, s.Emri, COUNT(d.Id) AS Nr
FROM Spitali s LEFT JOIN Doktori d
  ON d.Spitali = s.Id AND d.PagaMujore > 1000
GROUP BY s.Id, s.Emri;
```

10: `4 × 6 = 24`. Te 11, `WHERE d.PagaMujore > 1000` do t'i largonte spitalet pa doktorë të tillë.
</details>

## Niveli 3 — subquery dhe procedurë

12. Gjej doktorët me pagë **mbi mesataren** e doktorëve. 13. Gjej pacientët për të cilët **nuk ekziston** asnjë rekord në `Diagnoza_Pacienti`. 14. Me CTE gjej spitalin/spitalet me numrin maksimal të pacientëve (edhe rastet barazim). 15. Krijo view `v_PacientiSpitali` me pacientin dhe spitalin e tij; të përfshijë vetëm ata që kanë spital. 16. Krijo procedure `PacientetESpitalit @SpitaliId INT`.

<details><summary>Niveli 3 — zgjidhjet</summary>

```sql
-- 12
SELECT Id, Emri, PagaMujore FROM Doktori
WHERE PagaMujore > (SELECT AVG(PagaMujore) FROM Doktori);
-- 13
SELECT p.Id, p.Emri FROM Pacienti p
WHERE NOT EXISTS (
  SELECT 1 FROM Diagnoza_Pacienti dp WHERE dp.Pacienti_Id = p.Id
);
-- 14
;WITH Nr AS (
 SELECT s.Id, s.Emri, COUNT(p.Id) AS N
 FROM Spitali s LEFT JOIN Pacienti p ON p.Spitali = s.Id
 GROUP BY s.Id, s.Emri
)
SELECT Id, Emri, N FROM Nr WHERE N = (SELECT MAX(N) FROM Nr);
-- 15
CREATE VIEW dbo.v_PacientiSpitali AS
SELECT p.Id, p.Emri AS Pacienti, s.Emri AS Spitali
FROM Pacienti p JOIN Spitali s ON s.Id = p.Spitali;
GO
-- 16
CREATE PROCEDURE dbo.PacientetESpitalit @SpitaliId INT
AS BEGIN
 SELECT Id, Emri, Mbiemri FROM Pacienti WHERE Spitali = @SpitaliId;
END;
GO
EXEC dbo.PacientetESpitalit @SpitaliId = 1;
```
</details>

## Provë 100 pikë — vendos 75–90 minuta

**A (15 pikë, 12 min):** Një kompani ka departamente dhe punëtorë: çdo punëtor punon në saktësisht një departament, departamenti mund të mos ketë punëtorë. Punëtorët punojnë në disa projekte dhe projektet kanë shumë punëtorë. Marrëdhënia e punës mban Orët. Shkruaj ERD me kardinalitet/minimum dhe listën e tabelave/PK/FK.

**B (15 pikë, 12 min):** Shkruaj CREATE TABLE për `Departamenti`, `Punetori`, `Projekti`, `Angazhimi` të A. Emri i punëtorit është i detyrueshëm; Orët > 0; ndalo regjistrimin e dyfishtë të të njëjtit punëtor në të njëjtin projekt.

**C (10 pikë, 7 min):** Në skemën Spitali, shfaq spitalet pa doktorë dhe shpjego pse përdoret LEFT JOIN.

**D (10 pikë, 7 min):** Shfaq spitalet me të paktën 3 pacientë; `Id`, `Emri`, numrin, rendit nga numri më i madh.

**E (10 pikë, 7 min):** Gjej doktorët që marrin pagë më të madhe se mesatarja e doktorëve në **të njëjtin spital**.

**F (10 pikë, 7 min):** Shfaq çdo spital dhe numrin e doktorëve me pagë > 1200, përfshirë spitalet me zero. Shpjego ku duhet të vendoset kushti i pagës.

**G (10 pikë, 7 min):** `Regjistrimi(StudentId, LendaId, StudentEmri, LendaTitulli, Nota)` ka PK të përbërë. Trego varësitë, në cilën formë është nëse vlerat janë atomike, dhe ndaj në 2NF.

**H (10 pikë, 7 min):** Shkruaj një CTE që kthen pacientët për spital, pastaj zgjedh ata me maksimumin e pacientëve; përfshi barazimet.

**I (10 pikë, 7 min):** Shkruaj procedurë me parametër `@Vendi` që shfaq spitalet e atij vendi dhe thirre me `'Prishtine'`. Çfarë dallimi ka procedure nga VIEW?

<details><summary>Provë — përgjigjet (hap pas tentimit)</summary>

**A:** `Departamenti(Id PK)` 1:N `Punetori(Id PK, DepartamentId FK NOT NULL)`; departamenti 0..N punëtorë, punëtori 1 departament. `Punetori` M:N `Projekti(Id PK)` përmes `Angazhimi(PunetoriId FK, ProjektiId FK, Oret)`; PK e çiftit. Supozohet 0..N në të dy anët, sepse kërkesa nuk e detyron angazhimin.

**B:**
```sql
CREATE TABLE Departamenti (
 Id INT PRIMARY KEY, Emri VARCHAR(80) NOT NULL
);
CREATE TABLE Punetori (
 Id INT PRIMARY KEY, Emri VARCHAR(80) NOT NULL,
 DepartamentId INT NOT NULL REFERENCES Departamenti(Id)
);
CREATE TABLE Projekti (
 Id INT PRIMARY KEY, Titulli VARCHAR(100) NOT NULL
);
CREATE TABLE Angazhimi (
 PunetoriId INT NOT NULL REFERENCES Punetori(Id),
 ProjektiId INT NOT NULL REFERENCES Projekti(Id),
 Oret DECIMAL(6,2) NOT NULL CHECK (Oret > 0),
 PRIMARY KEY (PunetoriId, ProjektiId)
);
```

**C:**
```sql
SELECT s.Id, s.Emri FROM Spitali s
LEFT JOIN Doktori d ON d.Spitali = s.Id
WHERE d.Id IS NULL;
```
LEFT ruan spitalin edhe kur s'gjen doktor; d.Id NULL dallon mungesën.

**D:**
```sql
SELECT s.Id, s.Emri, COUNT(p.Id) AS Nr
FROM Spitali s JOIN Pacienti p ON p.Spitali = s.Id
GROUP BY s.Id, s.Emri HAVING COUNT(p.Id) >= 3
ORDER BY Nr DESC, s.Id;
```

**E (subquery e korreluar):**
```sql
SELECT d.Id, d.Emri, d.PagaMujore FROM Doktori d
WHERE d.PagaMujore > (
 SELECT AVG(d2.PagaMujore) FROM Doktori d2
 WHERE d2.Spitali = d.Spitali
);
```

**F:**
```sql
SELECT s.Id, s.Emri, COUNT(d.Id) AS Nr
FROM Spitali s LEFT JOIN Doktori d
 ON d.Spitali = s.Id AND d.PagaMujore > 1200
GROUP BY s.Id, s.Emri;
```
Kushti duhet në ON që spitali bosh të mos largohet në WHERE.

**G:** `StudentId → StudentEmri`, `LendaId → LendaTitulli`, `(StudentId,LendaId) → Nota`; 1NF por jo 2NF. `Studenti(StudentId,StudentEmri)`, `Lenda(LendaId,LendaTitulli)`, `Regjistrimi(StudentId,LendaId,Nota)`.

**H:**
```sql
;WITH Nr AS (
 SELECT s.Id, s.Emri, COUNT(p.Id) AS N
 FROM Spitali s LEFT JOIN Pacienti p ON p.Spitali = s.Id
 GROUP BY s.Id, s.Emri
)
SELECT * FROM Nr WHERE N = (SELECT MAX(N) FROM Nr);
```

**I:**
```sql
CREATE PROCEDURE dbo.SpitaletEVendit @Vendi VARCHAR(60)
AS BEGIN SELECT Id, Emri FROM Spitali WHERE Vendi = @Vendi; END;
GO
EXEC dbo.SpitaletEVendit @Vendi = 'Prishtine';
```
Procedure thirret me EXEC dhe mund të marrë parametra/ekzekutojë veprime; VIEW është SELECT i ruajtur që përdoret në FROM.
</details>

**Vlerësimi:** 80–100: provo ushtrimet 9–12 origjinale. 60–79: kthehu te pjesët ku humbe pikë. Nën 60: përsërit 01/02/04 me skemën e njëjtë dhe bëj provën edhe një herë pa zgjidhje.

