# 03 — SQL bazë: leximi dhe ndryshimi i të dhënave

Burimi: ligjëratat [3](../05%20-%20Ligjërata%203/L3%20-%20Hyrje%20në%20SQL.pdf), 7–8 dhe [ushtrimi 3](../05%20-%20Ligjërata%203/Ushtrime%203%20-%20Zgjidhja%20e%20detyrës%201/Ushtrime3_G3b.sql). Shembujt janë T-SQL.

## 1. Modeli mendor

`SELECT` zgjedh **kolona**, `FROM` zgjedh **tabelën**, `WHERE` zgjedh **rreshtat**:

```sql
SELECT Emri, PagaMujore
FROM Doktori
WHERE PagaMujore > 1000;
```

Mendo: (a) nis me gjithë doktorët; (b) mbaji vetëm ata mbi 1000; (c) shfaq vetëm Emri dhe PagaMujore. SQL shkruhet SELECT→FROM→WHERE, por konceptualisht përpunimi nis nga FROM/WHERE dhe zgjedhja SELECT bëhet më vonë.

| Shprehja | Domethënia | Shembull |
| --- | --- | --- |
| `SELECT *` | të gjitha kolonat | `SELECT * FROM Doktori` |
| `AS` | emër rezultati, nuk e ndryshon tabelën | `PagaMujore * 1.10 AS PagaRe` |
| `DISTINCT` | hiq rreshtat e përsëritur të rezultatit | `SELECT DISTINCT SpitaliId FROM Doktori` |
| `ORDER BY ... ASC/DESC` | rendit rezultatin | `ORDER BY PagaMujore DESC, Emri ASC` |
| `TOP (3)` | 3 rreshtat e parë në SQL Server | bashkë me ORDER BY për top 3 të kuptimshëm |
| `IN ('A','B')` | anëtarësi në listë | `Vendi IN ('Prishtine','Ferizaj')` |
| `BETWEEN 800 AND 1200` | kufijtë përfshihen | paga 800...1200 |
| `LIKE 'A%'` | fillon me A; % = 0+ karaktere | `Emri LIKE 'A%'` |
| `LIKE '_a%'` | karakteri i dytë është a; _ = 1 karakter | emër “Dardan” |
| `IS NULL` | mungesë vlere | `DoktoriId IS NULL` |

```sql
SELECT TOP (3) Emri, Mbiemri, PagaMujore * 1.10 AS PagaHipotetike
FROM Doktori
WHERE PagaMujore BETWEEN 800 AND 1500
  AND (Emri LIKE 'A%' OR Emri LIKE 'D%')
ORDER BY PagaMujore DESC, Id ASC;
```

Kllapat te `AND/OR` janë jetike. `A AND (B OR C)` nuk është e njëjtë me `(A AND B) OR C`. Pa `ORDER BY`, SQL nuk premton renditje. `NULL` nuk është zero as tekst bosh: `= NULL` nuk funksionon si test; përdor `IS NULL` ose `IS NOT NULL`. Shprehjet `NULL = NULL` dhe `NULL <> 5` janë **UNKNOWN**; WHERE mban vetëm TRUE.

## 2. DDL, DML, DQL

- **DDL**: CREATE/ALTER/DROP/TRUNCATE ndërrojnë strukturën ose pastrojnë tabelën.
- **DML**: INSERT/UPDATE/DELETE ndërrojnë të dhënat.
- **DQL**: SELECT i lexon. Disa burime e trajtojnë SELECT si pjesë të DML; në ligjëratën 3 është i ndarë si DQL.
- **DCL/TCL**: GRANT/REVOKE dhe kontroll transaksionesh COMMIT/ROLLBACK; këto paraqiten në hyrje, jo si bërthama e ushtrimeve të kursit.

```sql
INSERT INTO Spitali (Id, Emri, Vendi)
VALUES (13, 'Spitali i Ri', 'Prishtine');

UPDATE Doktori
SET PagaMujore = PagaMujore * 1.10
WHERE SpitaliId = 13;

DELETE FROM Spitali
WHERE Id = 13;
```

Para UPDATE/DELETE bëj të njëjtin WHERE me SELECT. Nëse spitali ka doktorë që e referojnë, DELETE mund të dështojë nga FK, përveç rastit kur ke projektuar cascade. `SELECT PagaMujore * 1.10` e **shfaq** pagën e re hipotetike, por `UPDATE` e **ndryshon** të dhënën. Shiko [ushtrimi 9](../11%20-%20Ligjërata%209/Ushtrime%209%20-%20Zgjidhja/toBeExecutedByStudents-G3b-Zgjidhja.sql) ku të dy variantet shfaqen në detyrat 2 dhe 3.

## 3. Funksione të zakonshme në SQL Server

```sql
SELECT CONCAT(Emri, ' ', Mbiemri) AS EmriPlote,
       LEN(Emri) AS Gjatesia,
       YEAR(Datelindja) AS Viti
FROM Pacienti;
```

`COUNT(*)` numëron rreshtat, `COUNT(Kolona)` vetëm vlerat jo NULL. `COALESCE(x, 0)` kthen 0 kur x është NULL. Për moshën e plotë sot:

```sql
SELECT Emri,
       DATEDIFF(YEAR, Datelindja, CAST(GETDATE() AS date))
       - CASE WHEN DATEADD(YEAR,
                          DATEDIFF(YEAR, Datelindja, CAST(GETDATE() AS date)),
                          Datelindja) > CAST(GETDATE() AS date)
              THEN 1 ELSE 0 END AS Mosha
FROM Pacienti;
```

`DATEDIFF(YEAR, ...)` vetëm numëron kalimet e viteve; formula e plotë heq 1 nëse ditëlindja s'ka ardhur ende këtë vit. Në provim ndiq kërkesën: nëse ushtrimi jep thjesht `DATEDIFF`, mund të kërkohet forma e shkurtër.

## 4. Një transaksion i vogël

```sql
BEGIN TRANSACTION;
UPDATE Llogaria SET Bilanci = Bilanci - 50 WHERE Llogaria_Id = 1;
UPDATE Llogaria SET Bilanci = Bilanci + 50 WHERE Llogaria_Id = 2;
-- Nëse të dyja janë në rregull:
COMMIT TRANSACTION;
-- Në rast problemi, para COMMIT: ROLLBACK TRANSACTION;
```

Ideja është “ose të dy ndryshimet, ose asnjëri”. Praktikisht duhet të kontrollosh që llogaritë ekzistojnë dhe bilanci lejon transferin; ky është ilustrim i transaksionit, jo implementim bankar.

## Provo pa shikuar

1. Shfaq 5 doktorët me pagën më të lartë; për paga të barabarta rendit sipas Id.
2. Shfaq pacientët pa doktor, ku emri fillon me “A”.
3. Rrite pagën 10% vetëm për doktorët e spitalit 2. Cila komandë e shfaq hipotezën e cila e ruan?

<details><summary>Zgjidhjet</summary>

```sql
SELECT TOP (5) * FROM Doktori ORDER BY PagaMujore DESC, Id ASC;
SELECT * FROM Pacienti WHERE DoktoriId IS NULL AND Emri LIKE 'A%';
SELECT PagaMujore * 1.10 AS PagaRe FROM Doktori WHERE SpitaliId = 2;
UPDATE Doktori SET PagaMujore = PagaMujore * 1.10 WHERE SpitaliId = 2;
```

Në dataset-in origjinal të ushtrimit 9 kolona e FK quhet `Spitali` dhe `Doktori`; `SpitaliId`/`DoktoriId` përdoren në skemën didaktike të kësaj pakete. Përshtati emrat sipas tabelës që po ekzekuton.
</details>

