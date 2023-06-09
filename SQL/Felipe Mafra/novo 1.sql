CREATE TABLE CLIENTE(
	NOME VARCHAR(30),
	SEXO CHAR(1),
	EMAIL VARCHAR(30),
	CPF INT(11),
	TELEFONE VARCHAR(30),
	ENDERECO VARCHAR(100)
);

/* sintaxe basica de inserção - INSERT INTO TABELA... */

/* FORMA 01 - OMITINDO AS COLUNAS */

INSERT INTO CLIENTE VALUES('JOAO','M','JOAO@GMAIL.COM',988638273,'22923110','MAIA LACERDA - ESTACIO - RIO DE JANEIRO - RJ');

INSERT INTO CLIENTE VALUES('CELIA','F','CELIA@GMAIL.COM',541521456,'25078869','RIACHUELO - CENTRO - RIO DE JANEIRO - RJ');

INSERT INTO CLIENTE VALUES('JORGE','M',NULL,885755896,'58748895','OSCAR CURY - BOM RETIRO - PATOS DE MINAS - MG');

/* FORMA 02 - COLOCANDO AS COLUNAS */

INSERT INTO CLIENTE(NOME,SEXO,ENDERECO,TELEFONE,CPF) VALUES('LILIAN','F','SENADOR SOARES - TIJUCA - RIO DE JANEIRO - RJ','947785696',887774856);

/* FORMA 03 - INSERT COMPACTO - SOMENTE MYSQL */

INSERT INTO CLIENTE VALUES('ANA','F','ANA@GLOBO.COM',85548962,'548556985','PRES ANTONIO CARLOS - CENTRO - SAO PAULO - SP'),
                          ('CARLA','F','CARLA@TERATI.COM.BR',7745828,'66587458','SAMUEL SILVA - CENTRO - BELO HORIZONTE - MG');
						  
INSERT INTO CLIENTE(NOME,SEXO,ENDERECO,TELEFONE,CPF) VALUES('CLARA','F','SENADOR SOARES - TIJUCA - RIO DE JANEIRO - RJ','883665843',99999999999);

INSERT INTO CLIENTE(NOME,SEXO,ENDERECO,TELEFONE,CPF) VALUES('CLARA','F','SENADOR SOARES - TIJUCA - RIO DE JANEIRO - RJ','883665843',22222222222);
						  
/* O COMANDO SELECT 
selecao projecao e juncao
*/

SELECT NOW() as DATA_HORA, 'FELIPE MAFRA' AS PROFESSOR;

SELECT 'FELIPE MAFRA';

SELECT 'BANCO DE DADOS';

/* ALIAS DE COLUNAS */


SELECT NOME AS CLIENTE, SEXO, EMAIL FROM CLIENTE;

SELECT NOME, SEXO, EMAIL, ENDERECO FROM CLIENTE;

SELECT   EMAIL, SEXO, ENDERECO, NOME FROM CLIENTE;

SELECT   EMAIL, SEXO, ENDERECO, NOME, NOW() AS DATA_HORA FROM CLIENTE;

/* APENAS PARA FINS ACADEMICOS */

SELECT * FROM CLIENTE;

CREATE DATABASE LIVRARIA;

CREATE TABLE LIVROS(
	LIVRO VARCHAR(100),
	AUTOR VARCHAR(100),
	SEXO CHAR(1),
	PAGINAS INT(5),
	EDITORA VARCHAR(30),
	VALOR FLOAT(10,2),
	UF CHAR(2),
	ANO INT(4)
);

INSERT INTO LIVROS VALUES('Cavaleiro Real', 'Ana Claudia', 'F', 465, 'Atlas', 49.9, 'RJ', 2009);
INSERT INTO LIVROS VALUES('SQL para leigos', 'João Nunes', 'M', 450, 'Addison', 98, 'SP', 2018);
INSERT INTO LIVROS VALUES('Receitas Caseiras', 'Celia Tavares', 'F', 210, 'Atlas', 45, 'RJ', 2008);
INSERT INTO LIVROS VALUES('Pessoas Efetivas', 'Eduardo Santos',	'M', 390, 'Beta', 78.99, 'RJ', 2018);
INSERT INTO LIVROS VALUES('Habitos Saudáveis', 'Eduardo Santos', 'M', 630, 'Beta', 150.98, 'RJ', 2019);
INSERT INTO LIVROS VALUES('A Casa Marrom', 'Hermes Macedo',	'M', 250, 'Bubba', 60, 'MG', 2016);
INSERT INTO LIVROS VALUES('Estacio Querido', 'Geraldo Francisco', 'M', 310, 'Insignia', 100, 'ES', 2015);
INSERT INTO LIVROS VALUES('Pra sempre amigas', 'Leda Silva', 'F', 510, 'Insignia', 78.98, 'ES', 2011);
INSERT INTO LIVROS VALUES('Copas Inesqueciveis', 'Marco Alcantara', 'M', 200, 'Larson', 130.98, 'RS', 2018);
INSERT INTO LIVROS VALUES('O poder da mente', 'Clara Mafra', 'F', 120, 'Continental', 56.58, 'SP', 2017);