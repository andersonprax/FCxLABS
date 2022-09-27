CREATE DATABASE db_FCxLabs;

SHOW DATABASES;

USE db_FCxLabs;

CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cpf` varchar(15) NOT NULL,
  `data_da_alteracao` date NOT NULL,
  `data_da_inclusao` date NOT NULL,
  `data_de_nascimento` date NOT NULL,
  `e_mail` varchar(100) NOT NULL,
  `login` varchar(20) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `nome_da_mae` varchar(100) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `status` varchar(15) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_2et2smpfrtsohr7w9fe1v8a5e` (`cpf`),
  UNIQUE KEY `UK_mkrneorqgey8fvgkp65qw4yk5` (`e_mail`),
  UNIQUE KEY `UK_r8oo98o39ykr4hi57md9nibmw` (`login`),
  UNIQUE KEY `UK_fxjwde537oroaygx8s5hehche` (`telefone`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

SHOW TABLES;

SELECT * FROM USUARIOS;

SELECT * FROM db_fcxlabs.usuarios;