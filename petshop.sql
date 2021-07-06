Create database PET_caopanheiro;
use PET_caopanheiro;

create table Pet(
Id int(3) primary key auto_increment,
Nome varchar(50) not null,
Raca varchar(50) not null
);
create table Dono(
Cod int(3) primary key auto_increment,
Nome varchar(50) not null,
Pet_Id int(3) not null,
foreign key (Pet_Id) references Pet(Id)
);
create table Cuidador(
Codigo int(3) primary key auto_increment,
Nome varchar(50) not null,
Telefone int(10) not null
);
create table Hospedagem(
Num int(3) primary key auto_increment,
Pet_Id int(3) not null,
Cuidador_Codigo int(3) not null,
foreign key (Pet_Id) references Pet(Id),
foreign key (Cuidador_Codigo) references Cuidador(Codigo)
);

INSERT INTO Pet (Nome, Raca) VALUES ('Corote', 'YorkShire'),('Pitu', 'Lhasa'),('Salinas',' Pinscher'),('Campari','Poodle');
INSERT INTO Dono (Nome, Pet_id) VALUES ('Alex', '1'),('Gabriela', '2'),('Fabia', '3'),('Henrique', '4');
INSERT INTO Cuidador (Nome, Telefone) VALUES ('Rafael', '53355846'),('Beatriz', '957521563'),('Alfredo', '45456369'),('Joaquim', '47526325');
INSERT INTO Hospedagem (pet_Id, Cuidador_Codigo) VALUES ('1', '1'),('2', '2'),('3', '3'),('4', '4');

Select hospedagem.num as "Registro", Pet.Nome as
"Pet", Dono.Nome
as "Proprietário", Cuidador.Nome as "Cuidador"
from Hospedagem inner join Pet
on Hospedagem.Pet_Id = Pet.Id
inner join Dono
on Dono.Pet_id = pet.id
inner join cuidador
on Hospedagem.Cuidador_codigo = Cuidador.Codigo
order by Pet.Nome;