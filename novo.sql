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
  nomeProduto varchar(20),
  nota float,
  idCliente int,
  constraint pkNota primary key (contador),
  constraint fkCLiente foreign key (idCliente) references Cliente(idCliente)
);

/* criando um cliente */
insert into Cliente(nomeCliente) values ("daniel");
/* dando uma nota para o cliente */
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel1', 1);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel2', 1);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel3', 1);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel4', 1);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel5', 1);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel6', 1);
insert into Notas(nota,nomeProduto, idCliente) values(4.0, 'movel7', 1);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel8', 1);

insert into Cliente(nomeCliente) values ("Rafael");
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel1', 2);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel2', 2);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel3', 2);
insert into Notas(nota,nomeProduto, idCliente) values(1.0, 'movel4', 2);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel5', 2);
insert into Notas(nota,nomeProduto, idCliente) values(3.0, 'movel6', 2);
insert into Notas(nota,nomeProduto, idCliente) values(5.0, 'movel7', 2);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel8', 2);


insert into Cliente(nomeCliente) values ("William");
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel1', 3);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel2', 3);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel3', 3);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel4', 3);
insert into Notas(nota,nomeProduto, idCliente) values(3.0, 'movel5', 3);
insert into Notas(nota,nomeProduto, idCliente) values(4.0, 'movel6', 3);
insert into Notas(nota,nomeProduto, idCliente) values(4.0, 'movel7', 3);
insert into Notas(nota,nomeProduto, idCliente) values(2.0, 'movel8', 3);

/* retornando a nota do cliente em especifico*/
select * from Cliente as cliente, Notas as notas where cliente.idCliente = notas.idCliente and cliente.nomeCliente="daniel";


select * from cliente;
