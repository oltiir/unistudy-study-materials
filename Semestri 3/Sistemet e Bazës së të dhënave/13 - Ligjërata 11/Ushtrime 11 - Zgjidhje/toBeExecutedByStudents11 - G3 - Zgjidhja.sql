CREATE DATABASE Ushtrimi11; --R.P

USE Ushtrimi11;

CREATE TABLE Skuadra (
    ID_Skuadres INT PRIMARY KEY,
    Emri VARCHAR(50) NOT NULL,
    Qyteti VARCHAR(30),
    Shteti VARCHAR(30) NOT NULL,
    Viti_Themelimit DATE DEFAULT '1880-01-01'
);

-- Tabela Stadiumi
CREATE TABLE Stadiumi (
    Stadium_ID INT PRIMARY KEY,
    Emri_S VARCHAR(50) NOT NULL,
    Kapaciteti_Ulseve INT,
    Qyteti VARCHAR(30),
    Shteti VARCHAR(30)
);

-- Tabela Finalja_LK
CREATE TABLE Finalja_LK (
    Sezona VARCHAR(10) PRIMARY KEY,
    Kampioni INT NOT NULL,
    NenKampioni INT NOT NULL,
    Golat_shenueraK INT,
    Golat_shenueraN INT,
    extra_time BIT,
    penalty BIT,
    Stadiumi INT,
    Lojtori_Finales VARCHAR(50),

    FOREIGN KEY (Kampioni) REFERENCES Skuadra(ID_Skuadres),
    FOREIGN KEY (NenKampioni) REFERENCES Skuadra(ID_Skuadres),
    FOREIGN KEY (Stadiumi) REFERENCES Stadiumi(Stadium_ID)
);

INSERT INTO Skuadra VALUES
(1,'Barcelona','Barcelon','Spain','1900-01-01'),
(2,'Juventues','Torino','Italy','1900-01-01'),
(3,'Bayern','Munchen','Germany','1900-01-01'),
(4,'Dortmund','Dortmund','Germany','1900-01-01'),
(5,'Chelsea','London','England','1900-01-01'),
(6,'Man.United','Manchester','England','1900-01-01'),
(7,'Internazionale','Milano','Italy','1900-01-01'),
(8,'Milan','Milano','Italy','1900-01-01'),
(9,'Liverpool','Liverpool','England','1900-01-01'),
(10,'Arsenal','London','England','1900-01-01'),
(11,'Atletico','Madrid','Spain','1900-01-01'),
(12,'Real Madrid','Madrid','Spain','1900-01-01'),
(13,'Porto','Porto','Portugal','1893-09-28'),
(15,'Leverkusen','Leverkusen','Germany','1900-01-01'),
(16,'Valencia','Valencia','Spain','1900-01-01'),
(17,'Ajax','Amsterdam','Holland','1900-03-18'),
(18,'Marseille','Marseille','France','1899-01-01'),
(19,'Sampdoria','Genoa','Italy','1900-01-01'),
(20,'Crvena zvezda','Belgrade','Serbia','1900-01-01'),
(21,'Benfica','Lisbon','Portugal','1904-02-28'),
(22,'Steaua','Bucharest','Romania','1947-06-07'),
(23,'PSV Eindhoven','Eindhoven','Holland','1900-01-01'),
(24,'Roma','Rome','Italy','1900-01-01'),
(25,'Hamburg','Bucharest','Germany','1887-09-29'),
(26,'Aston Villa','Birmingham','England','1900-01-01'),
(27,'Nottm Forest','Nottingham','England','1900-01-01'),
(28,'Malmo','Malmo','Sweden','1910-02-24'),
(29,'Club Brugge','Bruges','Belgium','1891-11-13'),
(30,'Monchengladbach','Monchengladbach','Germany','1900-01-01'),
(31,'St-Etienne','Saint-Etienne','France','1900-01-01'),
(32,'Leeds','Leeds','England','1900-01-01'),
(33,'Panathinaikos','Athens','Greece','1900-01-01'),
(34,'Feyenoord','Rotterdam','Holland','1900-01-01'),
(35,'Celtic','Glasgow','Scotland','1887-11-06'),
(36,'Partizan','Belgrade','Serbia','1900-01-01'),
(37,'Frankfurt','Frankfurt','Germany','1900-01-01'),
(38,'Reims','Reims','France','1900-01-01'),
(39,'Fiorentina','Florence','Italy','1900-01-01'),
(40,'Monoco','Monaco','France','1900-01-01');

INSERT INTO Stadiumi VALUES
(100,'Olympiastadion',74475,'Berlin',''),
(101,'Estádio da Luz',64775,'Lisbon','Portugal'),
(102,'Wembley Stadium',90000,'London','England'),
(103,'Allianz Arena',75024,'Munich','Germany'),
(104,'Santiago Bernabéu Stadium',81044,'Madrid','Spain'),
(105,'Stadio Olimpico',72698,'Rome','Italy'),
(106,'Luzhniki Stadium',78360,'Moskva','Russia'),
(107,'Athens Olympic Stadium',69618,'Athens','Greece'),
(108,'Old Trafford',75653,'Manchester','England'),
(109,'Hampden Park',74475,'Glasgow','Scotland'),
(110,'Stadio Giuseppe Meazza',80018,'Milano','Italy'),
(111,'Stade de France',81338,'Paris','France'),
(112,'Ataturk Olympic Stadium',80500,'Istanbul','Turkey'),
(113,'Veltins-Arena',78996,'Gelsenkirchen','Germany');

INSERT INTO Finalja_LK VALUES
('2000/01',3,16,5,4,0,1,110,''),
('2001/02',12,15,2,1,0,0,109,''),
('2002/03',8,2,3,2,0,1,108,''),
('2003/04',13,40,3,0,0,0,113,''),
('2004/05',9,8,3,2,0,1,112,'Steven Gerrard (Liverpool FC)'),
('2005/06',1,10,2,1,0,0,111,'Samuel Etoo (FC Barcelona)'),
('2006/07',8,9,2,1,0,0,107,'Filippo Inzaghi (AC Milan)'),
('2007/08',6,5,6,5,0,1,106,'Edwin van der Sar (Manchester United FC)'),
('2008/09',1,6,2,0,0,0,105,'Xavi Hernandez (FC Barcelona)'),
('2009/10',7,3,2,0,0,0,104,'Diego Milito (FC Internazionale Milano)'),
('2010/11',1,6,3,1,0,0,102,'Lionel Messi (FC Barcelona)'),
('2011/12',5,3,4,3,0,1,103,'Didier Drogba (Chelsea FC)'),
('2012/13',3,4,2,1,0,0,102,'Arjen Robben (FC Bayern München)'),
('2013/14',12,11,4,1,1,0,101,'Angel Di Maria (Real Madrid CF)'),
('2014/15',1,2,3,1,0,0,100,'Lionel Messi (FC Barcelona)');


--1. Selekto të gjitha skuadrat të cilat kanë shënuar më pak gola si nënkampion se sa shuma e golave të cilat janë shënuar
--nga skuadrat kampione (ALL)
Select s.Emri, SUM(f.Golat_shenueraN)
From Skuadra s inner join Finalja_LK f
on s.ID_Skuadres = f.NenKampioni
Group by s.Emri
Having (SUM(f.Golat_shenueraN)) < ALL (
								Select SUM(f.Golat_shenueraK)
								From Skuadra s INNER JOIN Finalja_LK f
								on s.ID_Skuadres = f.Kampioni
								Group by s.Emri)

--2.Selekto skuadrat të cilat kanë pasur shumën e shikuesve më të ulët se sa mesatarja e shikueshmërisë e të gjitha
--skuadrave nënkampione (ANY)
Select s.Emri, SUM(st.Kapaciteti_Ulseve) as Shuma_Shikueshmerise
From Skuadra s inner join Finalja_LK f
on s.ID_Skuadres = f.Kampioni or s.ID_Skuadres = f.NenKampioni
INNER JOIN Stadiumi st
on st.Stadium_ID = f.Stadiumi
Group by s.Emri
Having SUM(st.Kapaciteti_Ulseve) < ANY (Select AVG(st.Kapaciteti_Ulseve)
										From Skuadra s inner join Finalja_LK f
										on s.ID_Skuadres = f.NenKampioni INNER JOIN Stadiumi st
										on st.Stadium_ID = f.Stadiumi
										Group by s.Emri)
order by Shuma_Shikueshmerise


--3.Selekto skuadrat te cilat kan shenuar me pak gola si nenkampion se sa 
--shuma  e golave te cilat jan shenuara kur kampion ka qene Bayern. (ANY)
Select s.Emri, SUM(f.Golat_shenueraN)
From Skuadra s inner join Finalja_LK f
on s.ID_Skuadres = f.NenKampioni
Group by s.Emri
Having SUM(f.Golat_shenueraN) < ANY(Select SUM(f.Golat_shenueraK) + SUM(f.Golat_shenueraN)
									From Skuadra s inner join Finalja_LK f
									on s.ID_Skuadres = f.Kampioni
									Where s.Emri = 'Bayern'
									Group by f.Sezona)

--4.Gjeni se cili skuadër kampion ka pasur shikueshmëri 
--më të vogël prej të gjithë skuadrave tjera (ALL)
Select s.Emri, SUM(st.Kapaciteti_Ulseve) as Kapaciteti
From Skuadra s inner join Finalja_LK f
on s.ID_Skuadres = f.Kampioni inner join Stadiumi st
on f.Stadiumi = st.Stadium_ID
Group by s.Emri
Having SUM(st.Kapaciteti_Ulseve) <= ALL(Select sum(st.Kapaciteti_Ulseve)
									   From Skuadra s inner join Finalja_LK f
									   on s.ID_Skuadres = f.Kampioni INNER JOIN Stadiumi st
									   on f.Stadiumi = st.Stadium_ID
									   Group by s.Emri)

--5.Shfaqeni numrin e shikueshmërisë për secilin fitues të ligës së kampionëve (IN)
Select s.Emri, SUM(st.Kapaciteti_Ulseve) as Shikueshmeria
From Skuadra s inner join Finalja_LK f
on s.ID_Skuadres = f.Kampioni inner join Stadiumi st
on st.Stadium_ID = f.Stadiumi
Where s.ID_Skuadres IN (Select Kampioni
						From Finalja_LK)
Group by s.Emri
Order by Shikueshmeria desc

--6. Selekto Lojtarin e Finales per ekipet kampione. (EXISTS) 
Select f.Lojtori_Finales, s.Emri
From Finalja_LK f INNER JOIN Skuadra s
on f.Kampioni = s.ID_Skuadres
Where exists (Select 1
			  From Skuadra s 
			  Where s.ID_Skuadres = f.Kampioni)


--7. Duke perdorur View/With te shfaqet skuadra me me se shumti finale te fituara. 
Create view NumriFitoreve AS 
	Select s.Emri, COUNT(*) as FinaletEFituara
	From Skuadra s inner join Finalja_LK f
	on s.ID_Skuadres = f.Kampioni
	Group by s.Emri

Select TOP 1*
From NumriFitoreve
order by FinaletEFituara desc

--Me With
With numriIFinaleve as 
	(Select s.Emri, count(*) as FinaletEFituara
	from Skuadra s inner join Finalja_LK f
	on s.ID_Skuadres = f.Kampioni
	group by s.Emri)

select top 1* 
from numriIFinaleve


--8. Duke perdorur View/With te shfaqet skuadra nenkampione me me se shumti gola te 
--shenuara ne nje finale
with Gola as 
	(Select s.Emri, f.Golat_shenueraN
	From Skuadra s inner join Finalja_LK f
	on s.ID_Skuadres = f.NenKampioni)

Select *
From Gola
Where Golat_shenueraN  >= ALL (Select f.Golat_shenueraN as Golat
								From Finalja_LK f)

--9. Duke perdorur View te shfaqet stadiumi ku jane luajtur me se shumti finale.
Create view StadiumiFinalet as
Select s.Emri_S, count(*) as numri
From Finalja_LK f inner join Stadiumi s
on f.Stadiumi = s.Stadium_ID
Group by s.Emri_S

Select top 1 *
From StadiumiFinalet
order by numri desc

--10. Duke perdorur View/With te shfaqet shteti ku eshte luajtur finalja me me se 
--shumti gola te shenuar.
With Shteti as
	(Select s.Shteti, (f.Golat_shenueraK + f.Golat_shenueraN) as Golat
	From Finalja_LK f inner join Stadiumi s
	on f.Stadiumi = s.Stadium_ID)

Select *
From Shteti 
Where Golat >= ALL (Select (f.Golat_shenueraK + f.Golat_shenueraN) as Golat
					 From Finalja_LK f inner join Stadiumi s
					on f.Stadiumi = s.Stadium_ID)

