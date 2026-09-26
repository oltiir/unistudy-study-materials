# 05 — Subqueries, WITH, VIEW dhe stored procedures

Burimi: ligjëratat 10–11; [ushtrimi i bankës](../12%20-%20Ligjërata%2010/Ushtrime%2010%20-%20Zgjidhje/ToBeExecutedByStudents10%20-%20Zgjidhja.sql), [finalet](../13%20-%20Ligjërata%2011/Ushtrime%2011%20-%20Zgjidhje/toBeExecutedByStudents11%20-%20G3%20-%20Zgjidhja.sql) dhe [procedurat për personat](../14%20-%20Ligjërata%2012/Ushtrime%2012%20-%20Zgjidhje/ToBeExecutedByStudents12%20-%20G3-%20Zgjidhja.sql).

## 1. Subquery: pyetje brenda pyetjes

“Klientët me llogari nën mesataren” → fillimisht gjej **një numër**, mesataren; pastaj krahaso çdo llogari:

```sql
SELECT k.Emri, k.Mbiemri, l.Bilanci
FROM Klienti k
JOIN Depozitor d ON d.Klienti_Id = k.Klienti_Id
JOIN Llogaria l ON l.Llogaria_Id = d.Llogaria_Id
WHERE l.Bilanci < (SELECT AVG(Bilanci) FROM Llogaria);
```

Përmbajtja e kllapave kthen një vlerë (scalar), kështu që `<` ka kuptim. Nëse nënpyetja kthen **shumë rreshta**, `=` mund të japë gabim; përdor `IN`, `EXISTS` ose `ANY/ALL`.

| Pyetja | Modeli | Kujdes |
| --- | --- | --- |
| barazo me një vlerë | `= (SELECT MIN(...) ...)` | mund të dalin disa klientë me të njëjtën vlerë minimale |
| është në listë | `IN (SELECT ...)` | nënpyetja kthen një kolonë |
| të paktën një ndeshje | `EXISTS (SELECT 1 ... WHERE inner.FK = outer.Id)` | lidhja me rreshtin e jashtëm është thelbësore |
| më i madh se çdo vlerë | `> ALL (SELECT ...)` | një `MAX` i vetëm mund të jetë më i thjeshtë |
| më i madh se së paku një vlerë | `> ANY (SELECT ...)` | një `MIN` mund të jetë më i thjeshtë |

```sql
-- Klientë që kanë së paku një kredi:
SELECT k.Klienti_Id, k.Emri
FROM Klienti k
WHERE EXISTS (
  SELECT 1 FROM KrediMarresi km
  WHERE km.Klienti_Id = k.Klienti_Id
);
```

Kjo është **correlated subquery**: për secilin rresht të jashtëm `k` testohet `km.Klienti_Id = k.Klienti_Id`. `NOT EXISTS` jep ata **pa kredi**; është shpesh zgjedhje e sigurt kur në nënpyetje mund të ketë NULL, ndryshe nga `NOT IN`.

```sql
-- Për secilin qytet, numri i degëve, duke përfshirë zero:
SELECT q.Emri,
       (SELECT COUNT(*) FROM Dega d
        WHERE d.Qyteti_Id = q.Qyteti_Id) AS NrDegeve
FROM Qyteti q;
```

Këtu nënpyetja është në SELECT dhe kthen një vlerë për **secilin qytet**. Në FROM mund të kesh edhe tabelë të derivuar: `FROM (SELECT ... GROUP BY ...) AS x`; alias është i detyrueshëm në T-SQL.

## 2. WITH / CTE

`WITH` i jep emër rezultatit të përkohshëm për **deklaratën menjëherë pas tij**; nuk krijon tabelë të ruajtur.

```sql
;WITH PacientetPerSpital AS (
  SELECT s.Id, s.Emri, COUNT(p.Id) AS Nr
  FROM Spitali s LEFT JOIN Pacienti p ON p.Spitali = s.Id
  GROUP BY s.Id, s.Emri
)
SELECT Emri, Nr
FROM PacientetPerSpital
WHERE Nr = (SELECT MAX(Nr) FROM PacientetPerSpital);
```

I gjen edhe barazimet për vend të parë. `;` para WITH e ndan nga deklarata e mëparshme në SQL Server. CTE ekziston vetëm gjatë këtij query.

## 3. VIEW

View është një **query i ruajtur me emër** që mund ta lexosh si tabelë:

```sql
CREATE VIEW dbo.v_DoktoretSpitali AS
SELECT d.Id, d.Emri, s.Emri AS EmriSpitalit
FROM Doktori d JOIN Spitali s ON s.Id = d.Spitali;
GO
SELECT * FROM dbo.v_DoktoretSpitali;
```

View i zakonshëm ruan përkufizimin, jo domosdoshmërisht kopje të rreshtave. Ndryshimet në tabelat bazë reflektohen kur e lexon. **CTE** për një deklaratë; **VIEW** objekt i ripërdorshëm i skemës. Në SSMS `GO` është ndarës batch-esh i klientit, jo komandë SQL e motorit.

## 4. Stored procedure

Procedura është program SQL i ruajtur që thirret me `EXEC`. Inputi `@Qyteti` i jep vlerë në thirrje.

```sql
CREATE PROCEDURE dbo.PacientetNeQytet @Qyteti VARCHAR(50)
AS
BEGIN
  SET NOCOUNT ON;
  SELECT Id, Emri, Vendbanimi
  FROM Pacienti
  WHERE Vendbanimi = @Qyteti;
END;
GO
EXEC dbo.PacientetNeQytet @Qyteti = 'Ferizaj';
```

Në procedurë mund të përdorësh `DECLARE @Nr INT`, `SET @Nr = ...`, `IF ... ELSE`, dhe parametra `OUTPUT`. Për “sa hobi ka personi”, kthe numrin edhe kur është zero:

```sql
CREATE PROCEDURE dbo.NrHobive @PersonId INT, @Nr INT OUTPUT
AS
BEGIN
  SELECT @Nr = COUNT(*)
  FROM Personi_Hobi
  WHERE ID_Personi = @PersonId;
END;
GO
DECLARE @Rezultat INT;
EXEC dbo.NrHobive @PersonId = 4, @Nr = @Rezultat OUTPUT;
SELECT @Rezultat AS NrHobive;
```

Në zgjidhjen origjinale të ushtrimit 12, procedura 3 vetëm printon “një hobi” për çdo rezultat jo mbi 1; edhe **zero** do të cilësohej gabimisht “një”. Ne kthejmë COUNT-in. Përdor `=` për ID numerike në vend të `LIKE`. Për përqindje, përdor `100.0 * numeruesi / NULLIF(emeruesi,0)` për të shmangur pjesëtimin e plotë dhe emëruesin zero.

## Provo tani

1. Klientët e bankës që s'kanë kredi: shkruaj `NOT EXISTS`.
2. Spitalet me më shumë doktorë se mesatarja e numrit të doktorëve për spital: krijo CTE me COUNT, pastaj krahaso me AVG.
3. Bëj procedurë që merr pagën minimale dhe kthen doktorët me pagë >= minimumit.

<details><summary>Zgjidhjet udhëzuese</summary>

```sql
SELECT k.Klienti_Id, k.Emri FROM Klienti k
WHERE NOT EXISTS (SELECT 1 FROM KrediMarresi km
                  WHERE km.Klienti_Id = k.Klienti_Id);

;WITH Nr AS (
 SELECT s.Id, s.Emri, COUNT(d.Id) AS N
 FROM Spitali s LEFT JOIN Doktori d ON d.Spitali = s.Id
 GROUP BY s.Id, s.Emri
)
SELECT Emri, N FROM Nr
WHERE N > (SELECT AVG(1.0 * N) FROM Nr);

CREATE PROCEDURE dbo.DoktoretMbiPagen @Min DECIMAL(9,2)
AS BEGIN
 SELECT Id, Emri, PagaMujore FROM Doktori WHERE PagaMujore >= @Min;
END;
GO
EXEC dbo.DoktoretMbiPagen @Min = 1000;
```
</details>

