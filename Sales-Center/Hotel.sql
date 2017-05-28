CREATE DATABASE hotel;

USE hotel;

CREATE TABLE quarto (
	id int unique not null,
	numero varchar(10) unique not null,
	tipo varchar(30) not null,
	descricao varchar(255) not null,
	preco decimal(7,2) not null,
	area decimal(7,2) not null );