Create database U3_G3b

use U3_G3b

Create table Klienti(
	KlientiID INT PRIMARY KEY,
	Emri VARCHAR(20),
	Email VARCHAR(50)
)

Create table Porosia(
	PorosiaID INT PRIMARY KEY,
	Cmimi INT,
	SasiaProdukteve INT,
	KlientiID INT,
	FOREIGN KEY(KlientiID) REFERENCES Klienti(KlientiID)
)

--Insertimi i te dhenave ne tabelen Klienti
--Menyra e pare
INSERT INTO Klienti VALUES (1, 'Arber', 'arber.gashi@ubt-uni.net')

--Menyra e dyte
INSERT INTO Klienti(KlientiID, Emri, Email) VALUES (2, 'Blerta', 'blerta.krasniqi@ubt-uni.net')

--Menyra e trete (më shumë rreshta)
INSERT INTO Klienti VALUES (3, 'Dardan',  'dardan.mehmeti@ubt-uni.net'),
						   (4, 'Said', 'said@ubt-uni.net')

--Insertimi i te dhenave ne tabelen Porosia
INSERT INTO Porosia VALUES (101, 250, 3, 1),
						   (102, 50, 5, 1),
						   (103, 10, 1, 2),
						   (104, 500, 2, 3)

--Shfaqni të gjithë klientët nga tabela Klienti
Select *
From Klienti

--Shfaqni të gjithë porositë e klientit me KlientiID = 1
Select *
From Porosia
Where KlientiID = 1

--Shfaqni vetëm emrat e të gjithë klientëve
Select Emri
From Klienti

--Shfaqni cmimin dhe sasine e produkteve te Klientit me Id = 2
Select Cmimi, SasiaProdukteve
From Porosia
Where KlientiID = 2