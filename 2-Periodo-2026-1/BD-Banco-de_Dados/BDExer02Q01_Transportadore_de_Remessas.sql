CREATE DATABASE bdex02102_transportadora_de_mercadorias;

USE bdex02102_transportadora_de_mercadorias;

CREATE TABLE cliente(
	id_cliente BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50)NOT NULL
);

CREATE TABLE endereco_cliente(
	numero_casa VARCHAR(6) NOT NULL,
    rua VARCHAR(50) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    cidade VARCHAR(30) NOT NULL,
    cliente_id BIGINT,
    
    FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente)
);

CREATE TABLE contato_cliente(
	numero VARCHAR(18) NOT NULL,
    cliente_id BIGINT,
    
    FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente)
);

CREATE TABLE produto(
	id_produto BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    categoria VARCHAR(25),
    peso DOUBLE,
    valor DOUBLE
);

CREATE TABLE remessa(
	id_remessa BIGINT PRIMARY KEY,
    numero_remessa BIGINT AUTO_INCREMENT,
    data_criacao DATETIME NOT NULL,
    item_remessa BIGINT,
    cliente_id BIGINT,
    
    FOREIGN KEY(item_remessa) REFERENCES produto(id_produto),
    FOREIGN KEY(cliente_id) REFERENCES cliente(id_cliente)
);
