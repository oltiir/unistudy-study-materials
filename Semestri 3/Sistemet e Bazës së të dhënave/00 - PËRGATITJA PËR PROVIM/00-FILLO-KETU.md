# Sistemet e Bazës së të Dhënave — fillo këtu

Për provimin e së hënës, 28 shtator 2026. Materiali bazohet në [syllabus](../Syllabus.pdf), 12 ligjëratat dhe ushtrimet/zgjidhjet SQL të kësaj dosjeje. Dialekti në ushtrime është **Microsoft SQL Server / T-SQL**. Këto shënime janë udhërrëfyes për të mësuar, jo garanci për pyetjet ose notën e provimit.

## Rendi i mësimit

| Hapi | Lexo | Bëj menjëherë |
| --- | --- | --- |
| 1 | [01 — Konceptet, modelet dhe ER/EER](01-Konceptet-ER-EER.md) | Vizato dy ERD pa shikuar zgjidhjen. |
| 2 | [02 — Nga ERD te tabelat dhe DDL](02-Modeli-logjik-DDL.md) | Ktheji lidhjet 1:N, M:N dhe entitetin e dobët në tabela. |
| 3 | [03 — SQL bazë](03-SQL-baze-dhe-DML.md) | Shkruaj SELECT, INSERT, UPDATE, DELETE pa kopjim. |
| 4 | [04 — JOIN, grupim dhe agregim](04-JOIN-GROUP-BY.md) | Zgjidh “pa pacientë” dhe “saktësisht 2 doktorë”. |
| 5 | [05 — Subquery, WITH, VIEW, PROCEDURE](05-Subqueries-Views-Procedures.md) | Krahaso bilancin me mesataren; shkruaj procedurën me parametër. |
| 6 | [06 — Normalizimi dhe algjebra relacionale](06-Normalizimi-Algjebra.md) | Ndaje tabelën e porosive në 1NF dhe 2NF. |
| 7 | [07 — Ushtrime me zgjidhje të fshehura](07-Ushtrime-dhe-zgjidhje.md) | Bëje provimin provë me kohë. |
| 8 | [Laboratori interaktiv](laboratori.html) | Ndërto JOIN vizualisht, parashiko rezultatin, zgjidh quiz dhe SQL. |

**Metoda:** Për secilën temë lexo shembullin → mbulo zgjidhjen → shkruaje vetë në letër ose SSMS → krahaso → rikthehu te gabimet. Nëse nuk ke SQL Server, laboratori HTML punon në shfletues pa instalim; editori demonstron queries të caktuara, nuk ekzekuton SQL arbitrar.

## Prioritet sipas kohës

- **Të dielën:** Nise me 01 dhe 02 (ERD → tabela); kalo te 04 dhe 05 (JOIN, grupim, subqueries). Për 03 provo ushtrimet direkt, sepse SELECT bazë e ke ushtruar në SQL Island. Mbylle me 06 dhe pyetjet e provës 07. Shkruaji zgjidhjet para se t'i hapësh.
- **Të hënën para provimit:** [08 — fleta e shpejtë](08-Fleta-e-shpejte.md) dhe 3 ushtrime pa zgjidhje. Kujtohu që provimi është në 13:00; sipas planit tënd duhet të largohesh nga puna rreth 12:10.

Nëse ke vetëm 3 orë: 40 min ER→tabela, 70 min SELECT/JOIN/GROUP/HAVING, 45 min subquery/normalizim, 25 min provë gabimesh. Nëse e njeh ndonjë temë, kalo direkt te ushtrimet.

## Çfarë është vërtet në materialet e kursit

| Njësitë | Ligjërata | Praktika |
| --- | --- | --- |
| 1–3 | DBMS, nivelet e modelit, SQL/DDL/DML | ushtrimet 1–3, Klienti/Porosia |
| 4–6 | ERD, EERD, modeli logjik | ushtrimet 4–6, diagramet |
| 7–9 | DDL, agregime, produkt kartezian, JOIN | ushtrimet 7–9, Spitali/Doktori/Pacienti |
| 10–12 | subqueries, WITH/VIEW/procedures, 1NF/2NF | ushtrimet 10–12, Kredia/Finalja_LK/Personi |

Hap PDF-të dhe SQL-të origjinale për detyra të tjera: [indeksi i plotë i kursit](../README.md). Syllabusi përmend edhe algjebrën relacionale; në këtë repo nuk gjeta ligjëratë më vete për të. E kam përfshirë në nivel bazë te 06. **3NF është shtesë orientuese; ligjërata 12 shpjegon 1NF dhe 2NF.**

## Qëllimet e provës së fundit

Pa shënime duhet të dish: (1) ta modelosh një skenar me entitete, PK, FK dhe kardinalitet; (2) ta kthesh në tabela dhe CREATE TABLE; (3) ta dallosh INNER/LEFT JOIN dhe WHERE/HAVING; (4) të shkruash SELECT me JOIN + GROUP BY + subquery; (5) të zbërthesh 1NF/2NF; (6) të shpjegosh WITH/VIEW/procedure. Nëse njëra dështon, kthehu te kapitulli dhe provo detyrën tjetër, jo të njëjtën zgjidhje përmendësh.
