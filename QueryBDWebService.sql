CREATE TABLE Clientes
(
idCliente int primary key,
NombreCliente Varchar(100),
ApellidosCliente Varchar(100),
idTipoCliente int,
idEstadoCivil int,
idTipoDocumento int,
NroDocumento Varchar(30),
Estado int
)

CREATE TABLE TipoCliente
(
idTipoCliente int Primary Key,
TipoCliente Varchar(30),
Estado int
)

CREATE TABLE EstadoCivil
(
idEstadoCivil int Primary Key,
EstadoCivil Varchar(20),
Estado int
)

CREATE TABLE TipoDocumento
(
idTipoDocumento int primary key,
TipoDocumento Varchar(20),
Estado int
)

Alter table Clientes add constraint fk_Cliente_TipoCliente FOREIGN KEY (idTipoCliente) REFERENCES TipoCliente(idTipoCliente)
Alter table Clientes add constraint fk_Cliente_EstadoCivil FOREIGN KEY (idEstadoCivil) REFERENCES EstadoCivil(idEstadoCivil)
Alter table Clientes add constraint fk_Cliente_TipoDocumento FOREIGN KEY (idTipoDocumento) REFERENCES TipoDocumento(idTipoDocumento)