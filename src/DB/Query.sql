use Sales;

Create Table Category(
	idCategory int Not Null Auto_increment,
    categoryNate Varchar(15) Not Null,
	PRIMARY KEY (idCategory)
);

Create Table Iten(
	idItem int Not Null Auto_increment,
	itenDescription Varchar(30) Not Null,
	itenCostValue double Not Null,
	itenUnits int Not Null,
	idCategory int Not Null,
	PRIMARY KEY (idItem),
    FOREIGN KEY (idCategory) REFERENCES Category(idCategory)
);

Create Table UserPermission(
	idPermission int Not Null Auto_increment,
    cadastroUser bool Not Null,
	excluirUser bool Not Null,
    cadastroCliente bool Not Null,
    excluirCliente bool Not Null,
    cadastrarIten bool Not Null,
    excluirIten bool Not Null,
    verEstoque bool Not Null,
    cadastrarVenda bool Not Null,
    excluirVenda bool Not Null,
	PRIMARY KEY (idPermission)
);

Create Table Users (
	idUser int Not Null Auto_increment, 
	userName Varchar(15) Not Null,
	userLastName Varchar(15),
	userLogin int Not Null,
	userPassword int Not Null,
	idPermission int Not Null,
    PRIMARY KEY (idUser),
    FOREIGN KEY (idPermission) REFERENCES UserPermission(idPermission)
);

Create Table Sales(
	idSales int Not Null Auto_increment,
	saleDate DateTime Not Null,
	idUser int Not Null,
	idIten int Not Null,
	PRIMARY KEY (idSales),
    FOREIGN KEY (idUser) REFERENCES Users(idUser),
    FOREIGN KEY (idIten) REFERENCES Iten(idIten)
);