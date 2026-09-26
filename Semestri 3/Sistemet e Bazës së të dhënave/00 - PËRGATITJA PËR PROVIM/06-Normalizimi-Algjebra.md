# 06 — Normalizimi 1NF/2NF dhe algjebra relacionale

Burimi: [ligjërata 12](../14%20-%20Ligjërata%2012/L12%20-%20Normalizimi%281NF,%202NF%29.pdf) dhe syllabus. Ligjërata e fokuson normalizimin në **1NF/2NF**; 3NF këtu është vetëm orientim. Syllabusi përmend algjebrën relacionale pa PDF të veçantë të titulluar ashtu në dosje.

## 1. Pse normalizojmë?

Imagjino një tabelë `Shitje(PorosiaId, Data, KlientId, KlientEmri, ProduktId, ProduktEmri, Sasia)` ku një porosi ka shumë produkte. Nëse emri i produktit përsëritet në 200 rreshta, ndryshimi i emrit kërkon 200 UPDATE. Ky është **anomali përditësimi**. Mund të mos shtosh produkt pa porosi (**anomali insertimi**), dhe fshirja e porosisë së vetme mund të zhdukë informacionin për produktin (**anomali fshirjeje**).

**Varësia funksionale** `X → Y` do të thotë: për çdo dy rreshta me të njëjtin X, vlera Y është e njëjtë. `ProduktId → ProduktEmri`, por zakonisht `ProduktEmri → ProduktId` nuk është i sigurt. `PorosiaId → Data, KlientId`. Nëse një produkt paraqitet vetëm një herë në një porosi: `(PorosiaId, ProduktId) → Sasia`.

## 2. 1NF: një vlerë për qelizë

Ke `Studenti(Id, Emri, Telefonat)` dhe te Telefonat ruan `"049..., 044..."`. Kjo është listë në një qelizë. Ndaje:

```text
Studenti(Id PK, Emri)
Telefoni(StudentiId FK, Numri, PK(StudentiId, Numri))
```

1NF kërkon vlera atomike sipas modelit të zgjedhur, pa lista/grupe të përsëritura në kolonë. Dy rreshta për dy telefona. Nëse numri mund të përsëritet për të njëjtin student për arsye historike, shto identifikues/data në çelës sipas kërkesës.

## 3. 2NF: hiq varësinë nga një PJESË e çelësit të përbërë

Pas 1NF, merr:

```text
RreshtPorosie(PorosiaId, ProduktId, DataPorosise, EmriProduktit, Sasia)
PK = (PorosiaId, ProduktId)
```

- `PorosiaId → DataPorosise`: vetëm pjesa e parë e PK.
- `ProduktId → EmriProduktit`: vetëm pjesa e dytë e PK.
- `(PorosiaId, ProduktId) → Sasia`: varet nga **i gjithë** PK.

Tabela është në 1NF, por **jo 2NF**. Ndaje në:

```text
Porosia(PorosiaId PK, DataPorosise)
Produkti(ProduktId PK, EmriProduktit)
RreshtPorosie(PorosiaId FK, ProduktId FK, Sasia,
              PK(PorosiaId, ProduktId))
```

2NF = 1NF + çdo atribut jo kyç varet nga **gjithë çelësi kandidat**, jo vetëm një pjesë e një çelësi të përbërë. Në një tabelë me PK njëkolonësh, s'ka “pjesë” të atij PK; kontrollo edhe çelësat e tjerë kandidatë dhe varësitë nëse detyra i jep.

## 4. 3NF si orientim

`Porosia(PorosiaId, KlientId, KlientEmri)`: `PorosiaId → KlientId → KlientEmri`. Emri varet tranzitivisht nga porosia; nda `Klienti(KlientId, KlientEmri)` dhe `Porosia(PorosiaId, KlientId)`. Është koncept i dobishëm për projektim, por ligjërata 12 e kursit ndalet te 1NF/2NF. Mos shpenzo kohën e fundit duke mësuar teorema BCNF/4NF pa provë që kërkohen.

## 5. Algjebra relacionale: notacion bazë

| Operacioni | Ideja | Ngjashëm në SQL |
| --- | --- | --- |
| `σ_{Paga>1000}(Doktori)` seleksion | filtro **rreshta** | `WHERE Paga > 1000` |
| `π_{Emri,Paga}(Doktori)` projekcion | zgjidh **kolona** | `SELECT DISTINCT Emri, Paga` në semantikë me bashkësi |
| `R ⋈_{R.id=S.fk} S` bashkim | përputh lidhjet | `JOIN ... ON` |
| `R × S` produkt | çdo çift | `CROSS JOIN` |
| `R ∪ S` union | kombino rreshta të përputhshëm | `UNION` |
| `R − S` diferencë | vetëm në R | `EXCEPT` në SQL Server |

Shembull: emrat e doktorëve me pagë mbi 1000 dhe spitalin:

```text
π_{Doktori.Emri, Spitali.Emri} (
  σ_{Doktori.PagaMujore > 1000} (
    Doktori ⋈_{Doktori.Spitali = Spitali.Id} Spitali
  )
)
```

SQL:

```sql
SELECT DISTINCT d.Emri, s.Emri
FROM Doktori d JOIN Spitali s ON d.Spitali = s.Id
WHERE d.PagaMujore > 1000;
```

Në algjebrën klasike relacionale rezultati është **bashkësi** (duplikatet zhduken); SQL zakonisht ruan duplikatet pa DISTINCT. Mos e ngatërro `π` (kolona) me `σ` (rreshta).

## Provo para zgjidhjes

Tabela `Regjistrimi(StudentId, LendaId, StudentEmri, LendaEmri, Nota)`, PK `(StudentId, LendaId)`. Supozo një notë për student/lëndë. A është 1NF? A është 2NF? Shkruaj dekompozimin.

<details><summary>Zgjidhja</summary>

Është 1NF nëse çdo qelizë ka vlerë atomike. Nuk është 2NF: `StudentId → StudentEmri` dhe `LendaId → LendaEmri` janë varësi të pjesshme. Nda `Studenti(StudentId PK, StudentEmri)`, `Lenda(LendaId PK, LendaEmri)`, `Regjistrimi(StudentId FK, LendaId FK, Nota, PK(StudentId,LendaId))`. Nota varet nga çifti.
</details>
