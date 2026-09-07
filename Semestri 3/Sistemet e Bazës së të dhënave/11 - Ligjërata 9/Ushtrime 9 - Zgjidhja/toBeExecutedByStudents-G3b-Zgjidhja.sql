CREATE DATABASE Spitali_G3b;

USE Spitali_G3b;

CREATE TABLE Spitali (
    Id INT PRIMARY KEY,
    Emri VARCHAR(50),
    Vendi VARCHAR(20)
);

CREATE TABLE Doktori (
    Id INT PRIMARY KEY,
    Emri VARCHAR(50),
    Mbiemri VARCHAR(50),
    Kualifikimi VARCHAR(20),
    Spitali INT,
    PagaMujore DECIMAL(7,2),
    FOREIGN KEY (Spitali) REFERENCES Spitali(Id)
);

CREATE TABLE Pacienti (
    Id VARCHAR(10) PRIMARY KEY,
    Emri VARCHAR(50),
    Mbiemri VARCHAR(50),
    Datelindja DATE,
    Vendbanimi VARCHAR(50),
    Doktori INT,
    Spitali INT,
    FOREIGN KEY (Doktori) REFERENCES Doktori(Id),
    FOREIGN KEY (Spitali) REFERENCES Spitali(Id)
);

CREATE TABLE Diagnoza (
    Diagnoza_ID CHAR(5) PRIMARY KEY,
    Pershkrimi VARCHAR(255),
    Semundja VARCHAR(255)
);

CREATE TABLE Diagnoza_Doktori (
    Diagnoza_id CHAR(5),
    Doktori_id INT,
    PRIMARY KEY (Diagnoza_id, Doktori_id),
    FOREIGN KEY (Diagnoza_id) REFERENCES Diagnoza(Diagnoza_ID),
    FOREIGN KEY (Doktori_id) REFERENCES Doktori(Id)
);

CREATE TABLE Diagnoza_Pacienti (
    Diagnoza_id CHAR(5),
    Pacienti_Id VARCHAR(10),
    PRIMARY KEY (Diagnoza_id, Pacienti_Id),
    FOREIGN KEY (Diagnoza_id) REFERENCES Diagnoza(Diagnoza_ID),
    FOREIGN KEY (Pacienti_Id) REFERENCES Pacienti(Id)
);

INSERT INTO Diagnoza VALUES
('D0001','Semundje kronike e frymemarrjes','Astme'),
('D0002','Semundje e rende kardiovaskulare','Semundje te zemres'),
('D0003','Semundje e rende kardiovaskulare','Tromboze'),
('D0004','Semundje kronike','Diabeti'),
('D0005','Semundje obstruktive e mushkerive','SPOK'),
('D0006','Semunde e rende kardiovaskulare','Infarkt akut'),
('D0007','Semundje kronike e frymemarrjes','Fibroze'),
('D0008','Semundje e rende kardiovaskulare','Semundje inflamatore e zemres'),
('D0009','Semundje kronike e frymemarrjes','Bronkiti kronik'),
('D0010','Semundje infektive','Covid19'),
('D0011','Semundje e rende kardiovaskulare','Infarkt miokardial'),
('D0012','Semundje kronike e frymemarrjes','Pneumonia');

INSERT INTO Spitali VALUES
(1,'QKUK','Prishtine'),
(2,'Rezonanca','Prishtine'),
(3,'Aloka','Prishtine'),
(4,'Spitali Amerikan','Prishtine'),
(5,'Kubati','Prishtine'),
(6,'Vita Hospital','Prishtine'),
(7,'Spitali i Vushtrrise','Vushtrri'),
(8,'Spitali i Ferizajt','Ferizaj'),
(9,'Spitali i Pejes','Peje'),
(10,'Spitali i Gjilanit','Gjilan'),
(11,'Spitali i Prizrenit','Prizren'),
(12,'Spitali i Mitrovices','Mitrovice');

INSERT INTO Doktori VALUES
(1,'Blerton','Gashi','Dr',1,1500),
(2,'Dardan','Krasniqi','Dr',2,1000),
(3,'Adelina','Sefa','Dr',8,890),
(4,'Jon','Hoxha','Dr',5,1000),
(5,'Marigona','Kryeziu','Dr',1,1500),
(6,'Lorik','Gashi','Dr',2,900),
(7,'Erzen','Mehmeti','Dr',8,1200),
(8,'Flutura','Krasniqi','Dr',1,1250),
(9,'Jetlira','Hoxha','Dr',12,1000),
(10,'Samir','Shala','Dr',1,1400),
(11,'Fjolla','Ahmeti','Dr',12,800),
(12,'Mirjeta','Abazi','Dr',3,950),
(13,'Eda','Shala','Dr',3,1500),
(14,'Arta','Krasniqi','Dr',7,1350),
(15,'Shend','Kryeziu','Dr',8,1400);

INSERT INTO Pacienti VALUES
('P001','Blend','Gashi','1999-12-17','Lipjan',10,NULL),
('P002','Altin','Shala','2000-02-15','Prishtine',6,2),
('P003','Visar','Krasniqi','2001-08-14','Ferizaj',NULL,NULL),
('P004','Anila','Mehmeti','1999-06-19','Gjilan',14,7),
('P005','Gresa','Gashi','2001-08-25','Lipjan',14,7),
('P006','Enis','Zeka','2000-04-30','Ferizaj',NULL,2),
('P007','Valentina','Azemi','2000-01-09','Prishtine',10,1),
('P008','Albin','Krasniqi','2001-10-07','Ferizaj',NULL,NULL),
('P009','Taulant','Shala','2000-10-12','Lipjan',9,12),
('P010','Besa','Mehmeti','2001-05-27','Prishtine',9,12),
('P011','Adelina','Zeka','2000-07-13','Gjilan',8,NULL),
('P012','Gresa','Krasniqi','1962-02-15','Vushtrri',NULL,NULL),
('P013','Muhamet','Shala','1983-11-07','Peje',10,1),
('P014','Agim','Kryeziu','1972-08-20','Prishtine',NULL,3),
('P015','Naim','Berisha','1976-04-30','Lipjan',9,12),
('P016','Arian','Krasniqi','1961-12-07','Lipjan',NULL,NULL);

INSERT INTO Diagnoza_Doktori VALUES
('D0001',5),
('D0002',6),
('D0002',14),
('D0003',7),
('D0003',15),
('D0004',5),
('D0004',13),
('D0005',7),
('D0005',9),
('D0006',9),
('D0006',13),
('D0007',12),
('D0008',15),
('D0009',14),
('D0010',10);

INSERT INTO Diagnoza_Pacienti VALUES
('D0001','P001'),
('D0002','P002'),
('D0002','P005'),
('D0003','P003'),
('D0003','P006'),
('D0004','P006'),
('D0004','P007'),
('D0005','P011'),
('D0005','P013'),
('D0006','P004'),
('D0006','P014'),
('D0007','P015'),
('D0008','P012'),
('D0009','P009'),
('D0010','P010');


--1. Selektoni Emrin, Mbiemrin dhe Moshën e secilit pacient
Select Emri, Mbiemri, DATEDIFF(YEAR, Datelindja, GETDATE()) AS Mosha
From Pacienti

--2.Listoni të dhënat për secilin Doktor, me pagën e shtuar për 10%
Select Id, Emri, Mbiemri, PagaMujore, PagaMujore + (PagaMujore * 0.1) AS PagaMujoreEShtuar
From Doktori


--3.Ndryshoni pagën e secilit doktor duke e shtuar për 10% pagën ekzistuese të tyre
UPDATE Doktori
SET PagaMujore = PagaMujore + (PagaMujore * 0.1)

--4.Selekto diagnozat e dhëna nga doktori me id 7 dhe 12
--Hint: Të përdoret Inner Join
--Zgjidhja me Produkt Kartezian
Select *
From Doktori d, Diagnoza_Doktori dd, Diagnoza di
Where d.Id = dd.Doktori_id and dd.Diagnoza_id = di.Diagnoza_ID
and dd.Doktori_id IN (7, 12)

--Zgjidhja me JOINs
Select *
From Doktori d INNER JOIN Diagnoza_Doktori dd
on d.Id = dd.Doktori_id INNER JOIN Diagnoza di
on di.Diagnoza_ID = dd.Diagnoza_id
Where dd.Doktori_id IN (7, 12)

--5. Selekto spitalet të cilët nuk kanë pacientë të shtrirë
--Hint: Të përdoret Left ose Right Join
Select s.Id, s.Emri, s.Vendi, p.Emri
From Spitali s LEFT JOIN Pacienti p
on s.Id = p.Spitali
Where p.Spitali is null

--6.Selekto spitalet të cilët kanë nga 2 doktorë
--Hint: Të përdoret Inner Join
Select s.Id, s.Emri, COUNT(*) as NrDoktoreve
From Spitali s inner join Doktori d
on s.Id = d.Spitali
Group by s.Id, s.Emri
Having COUNT(*) = 2

--7. Selekto të gjitha diagnozat të cilat nuk janë përshkruar nga ndonjë doktor
--Hint: Të përdoret Left/Right Join
Select *
From Diagnoza d LEFT JOIN Diagnoza_Doktori dd
on d.Diagnoza_ID = dd.Diagnoza_id 
Where dd.Doktori_id is null


--8. Selekto te gjithe doktoret te cilet nuk kane pershkruar ndonje diagnoze. 
--(Hint: të përdoret Left ose Right Join)
Select d.Emri, d.Mbiemri, dd.Diagnoza_id
From Doktori d LEFT JOIN Diagnoza_Doktori dd
on d.Id = dd.Doktori_id
Where dd.Diagnoza_id is null


--9. Te fshihen doktoret emri i te cileve fillon me shkronjen ‘S’ dhe paga e te cileve eshte me
--e madhe se 1500.00.
Delete from Doktori 
Where Emri like 'S%' and PagaMujore > 1500

--10. Selekto te gjithe pacientet sipas diagnozes se pershkruar nga doktoresha Eda Shala.. 
--Selektimi te behet ne baze te Emrit dhe mbiemrit te pacientit, emrit dhe mbiemrit te 
--doktorit si dhe Id-se se diagnozes dhe Semundjes. (Hint: të përdoret Inner Join
Select p.Emri, p.Mbiemri, dok.Emri, dok.Mbiemri, d.Diagnoza_ID, d.Semundja
From Pacienti p inner join Diagnoza_Pacienti dp
on p.Id = dp.Pacienti_Id inner join Diagnoza d
on dp.Diagnoza_id = d.Diagnoza_ID inner join Diagnoza_Doktori dd
on d.Diagnoza_ID = dd.Diagnoza_id inner join Doktori dok
on dd.Doktori_id = dok.Id
Where dok.Emri = 'Eda' and dok.Mbiemri = 'Shala'

--11. Listo të gjithë pacientët të cilët janë trajtuar në spitalin ‘Spitali i Mitrovices’, 'Rezonanca’ 
--dhe 'Aloka'. Selektimi të bëhet në bazë të ID-së, emrit dhe mbiemrit të pacientit, ID-së 
--dhe emrit të spitalit si dhe të shfqet emri dhe mbiemri i doktorit. Gjithashtu rezultati të 
--renditet në atë mënyrë që pacientët e spitalit Aloka të renditën të parët. (Hint: të përdoret 
--Inner Join)
select p.Id, concat(p.Emri,' ',p.Mbiemri) as Pacienti, s.Id, s.Emri, concat(doktori.Emri,' ',doktori.Mbiemri) as Doktori
from Pacienti p inner join Diagnoza_Pacienti dp
on p.Id = dp.Pacienti_Id inner join Diagnoza d
on d.Diagnoza_ID = dp.Diagnoza_id inner join Diagnoza_Doktori dk
on d.Diagnoza_ID = dk.Diagnoza_id inner join Doktori doktori
on doktori.Id = dk.Doktori_id inner join Spitali s
on doktori.Spitali = s.Id
where s.Emri in ('Aloka','Rezonanca','Spitali i Mitrovices')
order by s.Emri

--12. Selekto pacientët sipas emrit dhe mbiemrit, emri i të cilëve 
--permban shkronjen N ose R dhe shkronja e dyte e emrit eshte 'A'
Select Emri, Mbiemri
From Pacienti 
Where Emri like '_a%' and (LOWER(Emri) like '%r%' or Lower(Emri) like '%n%')

--13. Selekto te gjithe spitalet te cilet kane me pak se 3 pacient. Selektimi te behet sipas emrit 
--dhe vendit te spitalit, si dhe te shfaqet numri i pacienteve per secilin spital.
select s.Emri, s.Vendi, count(*) as NumriIPacienteve
from Spitali s inner join Pacienti p
on s.Id = p.Spitali
group by s.Emri, s.Vendi
having count(*) < 3
order by NumriIPacienteve



