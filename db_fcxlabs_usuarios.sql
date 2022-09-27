-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: db_fcxlabs
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'013.008.234-10','2022-09-23','2022-09-22','1986-05-06','aps8@cin.ufpe.br','andersonprax','Anderson Praxedes','Leidjane Soares','aps12345','ativado','81 9 86675669'),(2,'001.009.235-11','2022-09-24','2022-09-23','1984-05-15','tatili@gmail.com','tatili','Tatiana de Lima','Ana de Lima','tatili16','ativado','81 9 85575559'),(3,'213.899.235-30','2022-09-24','2022-09-24','1983-11-03','allynson@gmail.com','all','Allynson','Jane Soares','all123','ativado','81 9 85575779'),(4,'213.000.000-30','2022-09-23','2022-09-22','1959-07-05','jane@gmail.com','jane','Jane','Berenice Soares','jane123','ativado','81 9 86285779');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-27  0:21:54
