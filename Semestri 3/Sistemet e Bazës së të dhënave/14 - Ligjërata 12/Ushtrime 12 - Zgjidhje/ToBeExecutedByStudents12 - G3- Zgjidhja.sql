create database PersoniDB_G3

use PersoniDB_G3

create table Personi 
(
	PersoniID decimal(18,0) primary key,
	Emri varchar(50) not null,
	Mbiemri varchar(50) not null,
	Data_Lindjes date,
	vendi_lindjes varchar(50), 
	Ssn char(11),
	Pesha decimal(18,0) not null default 0
);

create table Hobi
(
	ID_hobi decimal(18,0) primary key,
	Emri_Hobit varchar(100) not null,
	Koment text
);

create table Kontakti 
(
	KontaktID decimal(18, 0) primary key,
	IDpersoni decimal(18, 0),
	Lloji_Kontaktit varchar(25),
	Vlera_Kontaktit varchar(50),
	foreign key (IDpersoni) references Personi (PersoniID)
);

create table Personi_Hobi 
(
	ID_personHobi decimal(18,0) primary key,
	ID_Personi decimal(18,0) foreign key references Personi(PersoniID),
	ID_Hobi decimal(18, 0) foreign key References Hobi (ID_hobi)
);

INSERT INTO Personi VALUES (1,'Burim','Gashi','1980-11-20','Lipjan','012-05-1120', 95);
INSERT INTO Personi VALUES (2,'Agon', 'Buja','1977-01-22', 'Ferizaj','012-05-1121', 75);
INSERT INTO Personi VALUES (3,'Albulena','Hamiti','1975-12-23','Rahovec','012-05-1122', 56);
INSERT INTO Personi VALUES (4,'Kim','Gashi','2011-06-01','Peje','012-05-1123', 11);
INSERT INTO Personi VALUES (5,'Flori','Kollari','1975-12-23', 'Prishtine', '012-05-1124', 75);
INSERT INTO Personi VALUES (6,'Enver','Berisha','1959-10-03', 'Prishtine', '012-05-1125', 55);
INSERT INTO Personi VALUES (7,'Yll','Sopa','1985-12-23', 'Gjakove','012-05-1126', 64);
INSERT INTO Personi VALUES (8,'Florent','Kollari', '1987-01-22', 'Prishtine','012-05-1127', 77);
INSERT INTO Personi VALUES (9,'Ron','Krasniqi','1985-12-23', 'Rahovec','012-05-1128', 90);
INSERT INTO Personi VALUES (10, 'Valdet','Kollari', '1989-02-28', 'Prishtine','012-05-1129', 78);

INSERT INTO Kontakti VALUES (1, 1, 'linja fikse', '038-224461');
INSERT INTO Kontakti VALUES (2, 1, 'email','burim.gashi@amce.ks');
INSERT INTO Kontakti VALUES (3, 1, 'email','bg@my_kompania.ks');
INSERT INTO Kontakti VALUES (4, 1, 'skype', '+37745890007');
INSERT INTO Kontakti VALUES (5, 4, 'linja fikse','033-562900');
INSERT INTO Kontakti VALUES (6, 4, 'celulari', '049390411');
INSERT INTO Kontakti VALUES (7, 5, 'email', 'flori.kollari@amce.ks');
INSERT INTO Kontakti VALUES (8, 7, 'linja fikse', '+38139299005');
INSERT INTO Kontakti VALUES (9, 7, 'celulari', '+37745111888');

INSERT INTO Hobi VALUES (1, 'Pikturim','Aplikimi boj�s, pigment, ngjyra ose mediume t� tjera n� nj� sip�rfaqe.');
INSERT INTO Hobi VALUES (2, 'Peshkim','Kapjen e peshqeve.');
INSERT INTO Hobi VALUES (3, 'Zhytje n�n uj�','Futja n�n uj� me ose pa aparatin e frym�marrjes (zhytje/frym�-mbajtja).');
INSERT INTO Hobi VALUES (4, 'Shah','Dy lojtar�t kan� 16 shifra secili. Ata l�vizin ato nga tet�-me-tet� rrjet sipas rregullave t� ve�anta.');
INSERT INTO Hobi VALUES (5, 'Let�rsi ',' Leximi i librave.');
INSERT INTO Hobi VALUES (6, 'Yoga','Nj� sport qe aplikon praktike fizike, mendore, dhe shpirt�rore q� filloi n� Indin� e lasht�.');
INSERT INTO Hobi VALUES (7, 'Mbledhjen e Pullave ','Mbledhja e pullave postare dhe objekteve t� ngjashme.');
INSERT INTO Hobi VALUES (8, 'Astronomi','V�zhgimin e objekteve astronomike t� tilla si h�nes, planetet, yjet, dhe galaksit�.');
INSERT INTO Hobi VALUES (9, 'Mikroskopia', 'V�zhgimin e objekteve shum� t� vogla duke p�rdorur nj� mikroskop.');

INSERT INTO personi_hobi VALUES (1, 1, 1);
INSERT INTO personi_hobi VALUES (2, 1, 4);
INSERT INTO personi_hobi VALUES (3, 1, 5);
INSERT INTO personi_hobi VALUES (4, 5, 2);
INSERT INTO personi_hobi VALUES (5, 5, 3);
INSERT INTO personi_hobi VALUES (6, 7, 8);
INSERT INTO personi_hobi VALUES (7, 4, 4);
INSERT INTO personi_hobi VALUES (8, 9, 8);
INSERT INTO personi_hobi VALUES (9, 9, 9);



--1.Krijoni një stored procedure për të gjetur personat që kanë peshë më të madhe se pesha mesatare e të gjithë
--personave
CREATE PROCEDURE gjejPersonatPesha
AS
BEGIN 
	SELECT p.Emri, p.Mbiemri, p.Pesha
	FROM Personi p
	WHERE p.Pesha > (SELECT AVG(p.Pesha)
					 FROM Personi p)
END

EXEC gjejPersonatPesha


--2.Krijoni një stored procedure që shfaqë personat në bazë të inputit 'qyteti'
CREATE PROCEDURE gjejPersonatQyteti(@Qyteti VARCHAR(50))
AS
BEGIN
	SELECT *
	FROM Personi p
	WHERE p.vendi_lindjes LIKE @Qyteti
END

EXEC gjejPersonatQyteti 'Prishtine'

--3.Krijoni një stored procedure e cila shfaqë numrin e hobi-ve të personit në bazë të id-së
CREATE PROCEDURE shfaqPersonatHobi(@PersonID decimal(18,0))
AS
BEGIN
	DECLARE @NrHobi INT

	SELECT @NrHobi = COUNT(*)
	FROM Personi_Hobi ph
	WHERE ph.ID_Personi LIKE @PersonID

	if(@NrHobi > 1)
		print 'Personi ka me shume se 1 hobi'
	else
		print 'Personi ka vetem nje hobi'
END

exec shfaqPersonatHobi 1


--4. Krijoni një stored procedure e cila tregon përqindjen e personave nga një qytet, në bazë të inputit 'qyteti'
CREATE PROCEDURE getPerqindjaByQyteti(@Qyteti VARCHAR(50))
AS
BEGIN
	DECLARE @Perqindja decimal(5,2)

	SELECT @Perqindja = ((COUNT(*) * 100) / (SELECT COUNT(*) FROM PERSONI))
	FROM Personi p 
	WHERE p.vendi_lindjes like @Qyteti

	print 'Perqindja e personave nga qyteti ' + @Qyteti + ' eshte ' + cast(@Perqindja as varchar(40))
END

EXEC getPerqindjaByQyteti 'Prishtine'

--5. Krijoni stored procedure e cila tregon përqindjen e personave që kanë hobi dhe përqindjen e hobive që nuk e ka asnjë person.
CREATE PROCEDURE getPerqindja(@PersonatP decimal(5,2) out, @HobitP decimal(5,2) out)
AS 
BEGIN	
	DECLARE @NrPersonave int = (SELECT COUNT(*) FROM Personi)
	DECLARE @NrPersonaveH int = (SELECT COUNT(*)
							     FROM (Select ph.ID_Personi
									   FROM Personi p INNER JOIN Personi_Hobi ph
									   on p.PersoniID = ph.ID_Personi
									   GROUP BY ph.ID_Personi) as result)

	DECLARE @NrHobi int = (SELECT COUNT(*) FROM Hobi)
	DECLARE @NrHobiP int = (SELECT COUNT(*)
						    FROM (Select h.ID_hobi
							      FROM Hobi h LEFT JOIN Personi_Hobi ph
								  on h.ID_hobi = ph.ID_Hobi
								  WHERE ph.ID_Personi is null
								  GROUP BY h.ID_hobi) as result)
	
	SET @PersonatP = @NrPersonaveH * 100/@NrPersonave
	SET @HobitP = @NrHobiP * 100/@NrHobi
END

DECLARE @Personat decimal(5,2), @Hobit decimal(5,2)
EXECUTE getPerqindja @Personat out, @Hobit out
print 'Perqindja e personave te cilet kane hobi eshte:' + cast(@Personat as varchar(5)) + '%'
print 'Perqindja e hobi-ve qe nuk e ka asnje person eshte:' + cast(@Hobit as varchar(5)) + '%'

--6.  Krijoni një stored procedure e cila shton një person dhe këtë person që sapo krijoi e lidhë me hobin "Peshkim"
create procedure addPerson
(@PersoniID decimal(18,0),
 @Emri varchar(50),
 @Mbiemri varchar(50),
 @Data_Lindjes date,
 @vendi_lindjes varchar(50), 
 @Ssn char(11),
 @Pesha decimal(18,0))
 as

 begin
      insert into Personi (PersoniID,Emri,Mbiemri,Data_Lindjes,vendi_lindjes,Ssn,Pesha) values 
	  (@PersoniID,@Emri,@Mbiemri,@Data_Lindjes,@vendi_lindjes,@Ssn,@Pesha);

	  declare @HobiId decimal(18,0) = (select h.ID_hobi 
	                                   from Hobi h
									   where h.Emri_Hobit like 'Peshkim')
	  declare @PersonHobiID int = (select max(ph.ID_personHobi) from Personi_Hobi ph)+1

      insert into Personi_Hobi (ID_personHobi,ID_Personi,ID_Hobi) values (@PersonHobiID,@PersoniID,@HobiId)

 end

exec addPerson 11, 'Lamine', 'Yamal', '08-23-2002','Spain','11223311221',78













