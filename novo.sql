drop database Iniciacaojava;
create database IniciacaoJava;
use IniciacaoJava;


create table Cliente(
  idCliente int auto_increment,
  nomeCliente varchar(255),
  constraint pkCliente primary key (idCliente)
);

/*
  Um cliente pode ter várias notas.
  HACK: 1 x n
*/
create table Notas(
  contador int auto_increment,
  nota float,
  idCliente int,
  constraint pkNota primary key (contador),
  constraint fkCLiente foreign key (idCliente) references Cliente(idCliente)
);

/* criando um cliente */
insert into Cliente(nomeCliente) values ("daniel");
insert into Cliente(nomeCliente) values ("Usuário2");
insert into Cliente(nomeCliente) values ("Usuário3");

/* dando uma nota para o cliente */
insert into Notas(nota, idCliente) values(2.0, 1);


/* retornando a nota do cliente em especifico*/
select * from Cliente as cliente, Notas as notas where cliente.idCliente = notas.idCliente;
