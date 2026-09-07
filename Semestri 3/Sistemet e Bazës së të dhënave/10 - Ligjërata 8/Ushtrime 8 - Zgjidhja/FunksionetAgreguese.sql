
-- Funksionet agreguese
-- min
SELECT min(CmimiPerNjesi) as MinimumiCmimit
FROM Produkti

-- max
SELECT max(CmimiPerNjesi) as MaksimumiCmimit
FROM Produkti

-- avg
SELECT avg(Sasia) as MesatarjaSasise
FROM Produkti

-- count(*)
SELECT count(*) as NrRreshtave
FROM Produkti

-- count(kolona)
SELECT count(prodhuesi)
FROM Produkti

Select sum(Sasia)
From Produkti
-- sum
Select EmriProduktit, CmimiPerNjesi, sum(Sasia) as ShumaSasise
From Produkti
Where CmimiPerNjesi > 100 
GROUP BY EmriProduktit, CmimiPerNjesi
HAVING sum(Sasia) > 2
ORDER BY ShumaSasise DESC


Select *
From Porosia p, Klienti k, Produkti pr
where k.Id = p.Klienti AND pr.ID = p.Produkti
	AND k.Emri = 'Gresa' AND k.Mbiemri = 'Gashi'

Select distinct Vendbanimi
From Klienti



