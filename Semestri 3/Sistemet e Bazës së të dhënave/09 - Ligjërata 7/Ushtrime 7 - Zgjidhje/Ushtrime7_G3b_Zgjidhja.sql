Create database Ushtrime7_G3b

use Ushtrime7_G3b

Create table Stafi(
	StafiID INT PRIMARY KEY IDENTITY(1,1),
	Emri VARCHAR(30),
	VitiLindjes DATE,
	Numri INT,
	EmriRruges VARCHAR(30),
	Qyteti VARCHAR(30)
)

Create table Menaxheri(
	MenaxherID INT Primary Key,
	Departamenti VARCHAR(30),
	FOREIGN KEY(MenaxherID) references Stafi(StafiID) on delete cascade on update cascade
)

Create table Developeri(
	DeveloperiID INT PRIMARY KEY,
	FOREIGN KEY(DeveloperiID) references Stafi(StafiID),
	NdihmesiID INT,
	FOREIGN KEY(NdihmesiID) references Developeri(DeveloperiID)
)

Create table Projekti(
	ProjektiID INT PRIMARY KEY,
	DataFillimit DATE DEFAULT GETDATE(),
	MenaxherID INT,
	FOREIGN KEY(MenaxherID) references Menaxheri(MenaxherID)
)

Create table Tech(
	Tech INT,
	ProjektiID INT,
	PRIMARY KEY(Tech, ProjektiID),
	FOREIGN KEY(ProjektiID) references Projekti(ProjektiID)
)

Create table Detyra(
	DetyraID INT,
	ProjektiID INT,
	PRIMARY KEY(DetyraID, ProjektiID),
	Emri VARCHAR(30),
	Kohezgjatja INT,
	FOREIGN KEY(ProjektiID) references Projekti(ProjektiID)
)

Create table Paga(
	PagaID INT PRIMARY KEY,
	Shuma INT CHECK(Shuma>0)
)

Create table Puna(
	ProjektiID INT,
	DeveloperiID INT,
	PRIMARY KEY(ProjektiID, DeveloperiID),
	Orari DATETIME,
	PagaID INT,
	FOREIGN KEY(ProjektiID) references Projekti(ProjektiID),
	FOREIGN KEY(DeveloperiID) references Developeri(DeveloperiID),
	FOREIGN KEY(PagaID) references Paga(PagaID)
)
