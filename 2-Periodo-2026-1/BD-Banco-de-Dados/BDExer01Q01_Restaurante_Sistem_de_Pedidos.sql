CREATE DATABASE BDEx01Q01_Restaurante_Sistema_de_Pedidos;
USE BDEx01Q01_Restaurante_Sistema_de_Pedidos;

CREATE TABLE cliente(
	id_cliente BIGINT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE garcom(
	id_garcom BIGINT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);


CREATE TABLE prato(
	id_prato BIGINT PRIMARY KEY,
    nome_prato VARCHAR(50) NOT NULL,
    valor_prato DOUBLE NOT NULL
);

CREATE TABLE pedido(
	id_pedido BIGINT PRIMARY KEY,
    numero_pedido BIGINT NOT NULL,
    mesa VARCHAR(10),
    valor_total DOUBLE,
    cliente_id BIGINT,
    garcom_id BIGINT,
    
    FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente),
    FOREIGN KEY (garcom_id) REFERENCES garcom(id_garcom)
);


SELECT * FROM cliente;
SELECT * FROM garcom;
SELECT * FROM prato;
SELECT * FROM pedido;



DROP TABLE cliente;
