-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: bookmyshow
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `screen`
--

DROP TABLE IF EXISTS `screen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screen` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `number_of_columns` int DEFAULT NULL,
  `number_of_rows` int DEFAULT NULL,
  `total_seats` int DEFAULT NULL,
  `cinema_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK16w2ynnmhtmj3ayvnwg8rwa3e` (`cinema_id`),
  CONSTRAINT `FK16w2ynnmhtmj3ayvnwg8rwa3e` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screen`
--

LOCK TABLES `screen` WRITE;
/*!40000 ALTER TABLE `screen` DISABLE KEYS */;
INSERT INTO `screen` VALUES ('0609d71c-0b01-4dcd-a862-a46b9e2d4369','PS-2',6,5,30,'68cd8886-ac6f-4bd9-b289-d53e0d456706'),('0e400e4a-84b7-43f7-9703-616fe12509c9','PS-1',6,5,30,'68cd8886-ac6f-4bd9-b289-d53e0d456706'),('17daad48-0599-4188-8d3c-ccb575de594f','AUDI-1',8,12,96,'7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c'),('299ff354-fc96-4d92-b15f-11556930670d','AUDI-3',8,12,96,'7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c'),('57af6bd1-03b4-4f24-9238-6b0be9b7db0d','PS-3',6,5,30,'68cd8886-ac6f-4bd9-b289-d53e0d456706'),('f847a773-dd2f-41f4-88ae-948c18462b72','AUDI-2',8,12,96,'7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c');
/*!40000 ALTER TABLE `screen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-24 21:08:57
