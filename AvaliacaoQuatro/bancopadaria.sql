CREATE SCHEMA IF NOT EXISTS bancopadaria DEFAULT CHARACTER SET utf8 ;
USE bancopadaria;

CREATE TABLE IF NOT EXISTS chefs(
	idPessoa INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nomePessoa VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    dataNascimento DATE NOT NULL,
    especialidade VARCHAR(20) NOT NULL,
    salario VARCHAR(20) NOT NULL,
    PRIMARY KEY (idPessoa)
    );
    
CREATE TABLE IF NOT EXISTS clientes(
	idPessoa INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nomePessoa VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    dataNascimento DATE NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    PRIMARY KEY (idPessoa)
    );

SELECT * FROM clientes;

SELECT * FROM chefs;





