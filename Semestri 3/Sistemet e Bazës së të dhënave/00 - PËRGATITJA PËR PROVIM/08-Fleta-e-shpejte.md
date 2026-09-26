# Fletë e shpejtë — leximi i fundit

| Nëse pyetja thotë... | Shkruaj / kontrollo |
| --- | --- |
| “çdo A ka shumë B” | FK e A-së vendoset te B; kontrollo a është NOT NULL |
| “shumë me shumë” | tabelë lidhëse me 2 FK dhe PK të përbërë |
| “pa asnjë B” | A LEFT JOIN B ... WHERE B.PK IS NULL; ose NOT EXISTS |
| “përfshi edhe zero” | LEFT JOIN + COUNT(B.PK), **jo** COUNT(*) |
| “nga dy / më shumë se N” | GROUP BY ... HAVING COUNT(...) = 2 / > N |
| “vetëm të qytetit X” | WHERE në rreshta; kusht në ON nëse LEFT duhet të ruajë A pa B |
| “më lart se mesatarja” | WHERE vlera > (SELECT AVG(vlera) FROM ...) |
| “mesatarja e grupit të vet” | subquery e korreluar me `inner.grup = outer.grup` |
| “më i larti, përfshi barazimet” | `= (SELECT MAX(...))` |
| “një vlerë në qelizë” | 1NF |
| “varet nga pjesë e PK të përbërë” | shkel 2NF; ndaj tabelat |

```sql
SELECT s.Id, s.Emri, COUNT(p.Id) AS Nr
FROM Spitali s
LEFT JOIN Pacienti p ON p.Spitali = s.Id
WHERE s.Vendi = 'Prishtine'
GROUP BY s.Id, s.Emri
HAVING COUNT(p.Id) < 3
ORDER BY Nr DESC;
```

**Leximi:** FROM + LEFT → gjithë spitalet; WHERE → vetëm të Prishtinës; GROUP BY → një grup për spital; COUNT(p.Id) → zero kur s'ka pacientë; HAVING → më pak se 3; ORDER BY → rendit. Nëse kërkesa është “vetëm pacientët nga Lipjani, por të gjitha spitalet”, kushtin e pacientit vendose në `ON`, jo WHERE.

**Kujtesë:** `SELECT` nuk ndryshon tabelë; `UPDATE` po. `IS NULL`, jo `= NULL`. `JOIN` pa `ON` mund të bëjë produkt kartezian. `WHERE` filtron rreshta, `HAVING` grupe. `COUNT(*)` numëron edhe rreshtin e pambuluar të LEFT JOIN. `GO` është ndarës batch në SSMS. `DATEDIFF(YEAR,...)` mund të mbivlerësojë moshën para ditëlindjes.

**Vetëtest 90 sekonda:** Shkruaj nga kujtesa JOIN për pacientë + spital, anti-join për spital pa pacientë, GROUP BY për spital me 2 doktorë, skemën M:N dhe shembullin 1NF→2NF. Nëse ngec, kthehu te kapitulli përkatës.
