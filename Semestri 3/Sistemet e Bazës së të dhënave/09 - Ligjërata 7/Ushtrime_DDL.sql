-- komanda CREATE: per te krijuar databaze/tabele
CREATE DATABASE Ushtrime_DDL_G3b
USE Ushtrime_DDL_G3b

-- krijimi i kolonave te tabelave: emriKolones dataType constraint
CREATE TABLE Studenti(
	ID int primary key,
	Emri varchar(20) not null,
	Mosha int,
	Gjinia char(1)
);
-- Insertimi i te dhenave
INSERT INTO Studenti (ID, Emri, Mosha, Gjinia)
VALUES (1,'Filan',21,'M')

INSERT INTO Studenti
VALUES (2,'Filan2',20,'M')

SELECT * from Studenti

-- komanda DROP: per te fshire komplet databazen/tabelen bashke me te gjitha te dhenat ne te. Nuk pranon kushte.
-- nuk mund te fshihet nje databaze nese eshte ne perdorim

DROP DATABASE Ushtrime_DDL_G3b
DROP TABLE Studenti

-- komanda ALTER: perditeson strukturen e nje tabele. Perdoret per te shtuar/modifikuar/fshire nje kolone.
-- shto kolone te re
ALTER TABLE Studenti
ADD Mbiemri varchar(20)

--fshirja e nje kolone
ALTER TABLE Studenti
DROP COLUMN Mbiemri

-- modifikimi i tipit te dhenave te nje kolone
ALTER TABLE Studenti
ALTER COLUMN Emri varchar(30)

-- Komanda TRUNCATE: fshin te gjitha rreshtat e tabeles. Nuk pranon kusht
TRUNCATE TABLE Studenti

-- Komanda DELETE: i takon DML. Fshin te dhenat e nje tabele bazuar ne nje kusht. Nuk e fshin tabelen nga databaza.
DELETE FROM Studenti
WHERE ID = 1

select * from Studenti

-- DELETE: fshin te gjitha rreshtat e tabeles nese nuk specifikojme ndonje kusht
DELETE Studenti

-- Komanda UPDATE: i takon DML. Nuk ndryshon strukturen e tabeles por vetem perditeson te dhenat ekzistuese ne tabele.
UPDATE Studenti
Set Mosha = 22
WHERE ID = 1

drop table Studenti

-- Primary Key: (ex: multivalue attributes)
CREATE TABLE Studenti(
	ID int,
	Emri varchar(20),
	Mosha int,
	Gjinia char(1),
	Primary key (ID,Emri)
);

INSERT INTO Studenti Values (2,'Filan1',18,'M')
select * from Studenti

-- Auto increment: IDENTITY(1,2) => Fillo nga 1, rrite cdohere per 2
CREATE TABLE Studenti(
	ID int IDENTITY(1,1) primary key,
	Emri varchar(20) not null,
	Mosha int,
	Gjinia char(1)
);

INSERT INTO Studenti VALUES ('Filan',19,'M')

Delete from Studenti
Where ID = 2

-- Foreign key: metoda 1
CREATE TABLE Nota(
	NotaID int primary key,
	Lenda varchar(20),
	StudentiID int foreign key references Studenti(ID) on delete cascade on update cascade
);
drop table Nota

-- Foreign key: metoda 2 
CREATE TABLE Nota(
	NotaID int primary key,
	Lenda varchar(20),
	StudentiID int,
	Foreign key (StudentiID) references Studenti(ID)
);

-- On delete cascade, on update cascade => zakonisht i perdorim kur kemi lidhje entitet i forte - entitet i dobet
-- Pra, nese fshihet/perditesohet tabela prind, te fshihet/perditesohet edhe tabela child.


-- CHECK: kusht gjate krijimit te kolones
create table Personi(
	NrPersonal int primary key,
	Emri varchar(20),
	Mosha int,
	Gjinia char(1),
	CHECK (Mosha >= 18),
	CHECK (Gjinia IN ('M','F'))
);
