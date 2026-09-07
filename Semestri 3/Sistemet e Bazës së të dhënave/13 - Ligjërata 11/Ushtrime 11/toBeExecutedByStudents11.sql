CREATE DATABASE Ushtrimi11;

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
