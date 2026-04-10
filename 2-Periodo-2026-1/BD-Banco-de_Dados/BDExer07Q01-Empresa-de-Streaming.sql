CREATE database EmpresaStreaming;
USE EmpresaStreaming;

-- UM artista lança um ou varios albuns,
-- UM album é lançado por UM e somente um artista

-- UMA musica pertence a UM e somente UM artista
-- UMA musica pertence a UM e somente UM album
-- UM album contem UMA ou VARIAS musicas


CREATE TABLE usuario(
		id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
        nome_usuario VARCHAR(35) UNIQUE NOT NULL,
        email VARCHAR(100) NOT NULL,
        senha VARCHAR(6) NOT NULL
);


CREATE TABLE artista(
	id_artista BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_artista VARCHAR(35) UNIQUE NOT NULL,
    genero_musical VARCHAR(50) NOT NULL,
    pais VARCHAR(30) 
);


CREATE TABLE album(
	id_album BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(40) NOT NULL,
    data_lancamento VARCHAR(14) NOT NULL,
    numero_de_faixas INT NOT NULL
);


CREATE TABLE musica(
	id_musica BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    duracao VARCHAR(8) NOT NULL,
    artista_id BIGINT,
    algum_id BIGINT,
    
    FOREIGN KEY (artista_id) REFERENCES artista(id_artista),
    FOREIGN KEY(algum_id)REFERENCES album(id_album)
);


INSERT INTO usuario(id_usuario, nome_usuario, email, senha) VALUES(1,"Flavio.vk", "flavio@leao.com.br","123456");
INSERT INTO usuario(id_usuario, nome_usuario, email, senha) VALUES(2,"Flavio.v", "flavio@leao.com.br","12345");
INSERT INTO usuario(id_usuario, nome_usuario, email, senha) VALUES(3,"Flavio.", "flavio@leao.com.br","1234");
INSERT INTO usuario(id_usuario, nome_usuario, email, senha) VALUES(4,"Flavio", "flavio@leao.com.br","123");
INSERT INTO usuario(id_usuario, nome_usuario, email, senha) VALUES(5,"Flavi", "flavio@leao.com.br","12");


INSERT INTO artista(id_artista,nome_artista,genero_musical,pais) VALUES(1,"LEÃO", "ROCK","Brasil");
INSERT INTO artista(id_artista,nome_artista,genero_musical,pais) VALUES(2,"VK", "METAL","Colombia");
INSERT INTO artista(id_artista,nome_artista,genero_musical,pais) VALUES(3,"tomodashi", "J-ROCK","JAPAN");
INSERT INTO artista(id_artista,nome_artista,genero_musical,pais) VALUES(4,"quebeks", "INDIE-METAL","CANADÁ");
INSERT INTO artista(id_artista,nome_artista,genero_musical,pais) VALUES(5,"JsSONS", "TRAP","USA");


INSERT INTO album(id_album, titulo,data_lancamento,numero_de_faixas) VALUES (1, "MY20AGE", "10/04/2026",1);
INSERT INTO album(id_album, titulo,data_lancamento,numero_de_faixas) VALUES (2, "TIMONZIN", "10/04/2026",1);
INSERT INTO album(id_album, titulo,data_lancamento,numero_de_faixas) VALUES (3, "Tnice", "10/04/2026",1);
INSERT INTO album(id_album, titulo,data_lancamento,numero_de_faixas) VALUES (4, "THEREZILA", "10/04/2026",1);
INSERT INTO album(id_album, titulo,data_lancamento,numero_de_faixas) VALUES (5, "UNIPIZ", "10/04/2026",1);


INSERT INTO musica (id_musica, titulo, duracao, artista_id, algum_id) VALUES(1, "2Y21", "04:15", 1,1);
INSERT INTO musica (id_musica, titulo, duracao, artista_id, algum_id) VALUES(2, "503", "04:30", 2,1);
INSERT INTO musica (id_musica, titulo, duracao, artista_id, algum_id) VALUES(3, "inidca", "03:17", 3,1);
INSERT INTO musica (id_musica, titulo, duracao, artista_id, algum_id) VALUES(4, "CC-UNIP", "02:18", 4,1);
INSERT INTO musica (id_musica, titulo, duracao, artista_id, algum_id) VALUES(5, "22-OS", "06:15", 5,1);


UPDATE usuario
SET nome_usuario = "Leaozin"
WHERE id_usuario = 2
LIMIT 1;

UPDATE usuario
SET nome_usuario = "Viktoriun"
WHERE id_usuario = 1
LIMIT 1;

UPDATE artista
SET nome_artista = "Historiun"
WHERE id_artista = 1
LIMIT 1;

UPDATE artista
SET nome_artista = "DEV-Loz"
WHERE id_artista = 2
LIMIT 1;

UPDATE album
SET titulo = "DEV-loosser"
WHERE id_album = 1
LIMIT 1;

UPDATE album
SET titulo = "Distro-ZZ"
WHERE id_album = 2
LIMIT 1;

UPDATE musica
SET titulo = "TOrz"
WHERE id_musica = 1
LIMIT 1;

UPDATE musica
SET titulo = "ABACATE"
WHERE id_musica = 3
LIMIT 1;


DELETE FROM usuario WHERE id_usuario = 5 LIMIT 1;
DELETE FROM musica WHERE artista_id = 4 LIMIT 1;
DELETE FROM artista WHERE nome_artista = "quebeks" LIMIT 1;
DELETE FROM album WHERE titulo ="THEREZILA" LIMIT 1;


SELECT * FROM usuario;
SELECT * FROM artista;
SELECT * FROM album;
SELECT * FROM musica;

