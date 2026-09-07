CREATE DATABASE Kredia;

USE Kredia;

CREATE TABLE Qyteti (
    Qyteti_Id INT IDENTITY(1,1) PRIMARY KEY,
    Emri VARCHAR(50) NOT NULL
);

CREATE TABLE Dega (
    Emri VARCHAR(50) PRIMARY KEY,
    Qyteti_Id INT NOT NULL,
    Assetet MONEY NOT NULL,
    FOREIGN KEY (Qyteti_Id) REFERENCES Qyteti(Qyteti_Id)
);

CREATE TABLE Klienti (
    Klienti_Id INT IDENTITY(1,1) PRIMARY KEY,
    Emri VARCHAR(50) NOT NULL,
    Mbiemri VARCHAR(50) NOT NULL,
    Qyteti_Id INT,
    FOREIGN KEY (Qyteti_Id) REFERENCES Qyteti(Qyteti_Id)
);

CREATE TABLE Llogaria (
    Llogaria_Id INT IDENTITY(1,1) PRIMARY KEY,
    Emri_Deges VARCHAR(50) NOT NULL,
    Bilanci MONEY NOT NULL,
    FOREIGN KEY (Emri_Deges) REFERENCES Dega(Emri)
);

CREATE TABLE Depozitor (
    Llogaria_Id INT,
    Klienti_Id INT,
    PRIMARY KEY (Llogaria_Id, Klienti_Id),
    FOREIGN KEY (Llogaria_Id) REFERENCES Llogaria(Llogaria_Id),
    FOREIGN KEY (Klienti_Id) REFERENCES Klienti(Klienti_Id)
);

CREATE TABLE Kredia (
    Kredia_Id INT IDENTITY(1,1) PRIMARY KEY,
    Emri_Deges VARCHAR(50) NOT NULL,
    Bilanci MONEY NOT NULL,
    FOREIGN KEY (Emri_Deges) REFERENCES Dega(Emri)
);

CREATE TABLE KrediMarresi (
    Kredia_Id INT,
    Klienti_Id INT,
    PRIMARY KEY (Kredia_Id, Klienti_Id),
    FOREIGN KEY (Kredia_Id) REFERENCES Kredia(Kredia_Id),
    FOREIGN KEY (Klienti_Id) REFERENCES Klienti(Klienti_Id)
);

INSERT INTO Qyteti (Emri) VALUES
('Prishtine'), ('Lipjan'), ('Gjakove'), ('Ferizaj'),
('Peje'), ('Prizren'), ('Drenas'), ('Skenderaj'),
('Mitrovice'), ('Istog'), ('Gjilan'),
('Fushe Kosove'), ('Kline'), ('Viti');


INSERT INTO Dega VALUES
('Banka Ekonomike',1,8700),
('BKT Banka',5,10200),
('BPB Prishtine',1,11500),
('NLB Banka Gjakove',3,12300),
('NLB Banka Istog',10,19000),
('NLB Banka Lipjan',2,20500),
('NLB Banka Prishtine',1,1700),
('Pro Credit Banka',8,14000),
('Raiffeisen Banka Prishtine',1,15000),
('TEB Banka Gjakove',3,11000),
('TEB Banka Prishtine',1,23000);


INSERT INTO Klienti (Emri, Mbiemri, Qyteti_Id) VALUES
('Burim','Gashi',1),
('Agon','Buja',2),
('Albulena','Hamiti',2),
('Kim','Gashi',6),
('Flori','Kollari',4),
('Enver','Berisha',5),
('Yll','Sopa',8),
('Florent','Kollari',3),
('Ron','Krasniqi',3),
('Valdet','Kollari',3),
('Edonisa','Sinani',3),
('Jehona','Murseli',3),
('Diellza','Ahmeti',9);


INSERT INTO Llogaria (Emri_Deges, Bilanci) VALUES
('Banka Ekonomike',2500),
('BKT Banka',6000),
('NLB Banka Gjakove',7400),
('NLB Banka Prishtine',8550),
('TEB Banka Prishtine',3600),
('BPB Prishtine',7000),
('Raiffeisen Banka Prishtine',1100),
('Pro Credit Banka',2300),
('Raiffeisen Banka Prishtine',17200);


INSERT INTO Depozitor VALUES
(1,1),(2,3),(3,6),(4,5),(5,2),
(6,1),(7,5),(9,3);


INSERT INTO Kredia (Emri_Deges, Bilanci) VALUES
('Banka Ekonomike',5600),
('BPB Prishtine',4000),
('NLB Banka Prishtine',2650),
('Raiffeisen Banka Prishtine',20000),
('TEB Banka Prishtine',21500),
('BKT Banka',2700),
('NLB Banka Gjakove',3500),
('NLB Banka Istog',1200),
('NLB Banka Lipjan',1900),
('Pro Credit Banka',8000),
('TEB Banka Gjakove',3400);


INSERT INTO KrediMarresi VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(1,10),
(2,6),
(3,1),
(4,2),
(4,4),
(4,8),
(5,3),
(5,10),
(6,5),
(7,7),
(8,9);


--1. Listoni kreditë e marra nga klienti Burim Gashi
--Hint: Të përdoren single row subqueries
Select kl.Emri, kl.Mbiemri, kr.Bilanci
From Kredia kr INNER JOIN KrediMarresi km 
on kr.Kredia_Id = km.Kredia_Id INNER JOIN Klienti kl
on km.Klienti_Id = kl.Klienti_Id
Where km.Klienti_Id = (Select k.Klienti_Id
					   From Klienti k
					   Where k.Emri = 'Burim' and k.Mbiemri = 'Gashi')


--2.Selekto të gjithë klientët të cilët bilancin e llogarisë e kanë më të ulët se mesatarja e bilancit të llogarive të të gjithë klientëve
--Hint: Të përdoren single row subqueries. Përdorni funksionin AVG() në subquery
Select k.Emri, k.Mbiemri, l.Emri_Deges, l.Bilanci
From Klienti k INNER JOIN Depozitor d
on k.Klienti_Id = d.Klienti_Id INNER JOIN Llogaria l
on d.Llogaria_Id = l.Llogaria_Id
Where l.Bilanci < (Select AVG(l.Bilanci)
			      From Llogaria l)

--3.Listo të gjithë klientët të cilët kanë llogari në bankë dhe vijn nga qyteti i Lipjanit. 
--(Të përdoren single row subqueries) 
Select *
From Klienti k inner join Depozitor d
on k.Klienti_Id = d.Klienti_Id
Where k.Qyteti_Id = (Select q.Qyteti_Id
					 From Qyteti q
					 Where q.Emri = 'Lipjan')

--4.Selekto klientin i cili ka marrë kredinë më të vogël. (Të përdoren single row subqueries)
Select k.Emri, k.Mbiemri, kr.Kredia_Id, kr.Bilanci
From Klienti k INNER JOIN KrediMarresi km
on k.Klienti_Id = km.Klienti_Id INNER JOIN Kredia kr
on km.Kredia_Id = kr.Kredia_Id
Where kr.Bilanci = (Select MIN(k.Bilanci)
					From Kredia k)


--5. Shfleto të numrin e degëve sipas qytetit 
--(Të shfaqen gjithashtu qytetet të cilat nuk kanë ndonjë degë)
Select *, (Select COUNT(*)
		   From Dega d
		   Where d.Qyteti_Id = q.Qyteti_Id) as NumriDegeve
From Qyteti q


--6. Në tabelën Dega insertoni të dhënat si më poshtë:
INSERT INTO Dega VALUES ('BKT Banka Ferizaj', 4, 17000),
						('BPB Peje', 5, 12500)

--7. Në tabelën Kredia insertoni të dhënat si më poshtë:
INSERT INTO Kredia VALUES ('BKT Banka Ferizaj',5000), ('BPB Peje',9500)

--9. Fshini klientët të cilët vijnë nga qyteti i Mitrovicës
Delete from Klienti
Where Klienti.Qyteti_Id = (Select q.Qyteti_Id
						   From Qyteti q     
						   Where q.Emri = 'Mitrovice');


--10. Shfletoni klientin me emër dhe mbiemër (së bashku) më të gjatë.
Select *
From Klienti
Where (len(Emri + Mbiemri)) = (Select MAX(LEN(Emri + Mbiemri))
						       From Klienti)


--11. Shfletoni klientët që kanë më shumë 
--mjete se te gjithe konsumatort e qytetit ‘Prishtine’.
Select *
From Klienti k INNER JOIN Depozitor d
on k.Klienti_Id = d.Klienti_Id INNER JOIN Llogaria l
on d.Llogaria_Id = l.Llogaria_Id
Where l.Bilanci > (Select SUM(l.Bilanci)
				   From Llogaria l inner join Depozitor d
				   on l.Llogaria_Id = d.Llogaria_Id inner join Klienti k
				   on d.Klienti_Id = k.Klienti_Id inner join Qyteti q
				   on q.Qyteti_Id = k.Qyteti_Id
				   Where q.Emri = 'Prishtine')


--12. Shfleto Emrin e deges qe ka mesatarisht me se shumti asete.
Select *
From Dega d
Where d.Assetet >(Select AVG(d.Assetet)
				  From Dega d)











