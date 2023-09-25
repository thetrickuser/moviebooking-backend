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
-- Table structure for table `show_time`
--

DROP TABLE IF EXISTS `show_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `show_time` (
  `id` varchar(255) NOT NULL,
  `available_seat_count` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `showtime` datetime(6) DEFAULT NULL,
  `cinema_id` varchar(255) DEFAULT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  `screen_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnoeed8a588r214039fb9btfmf` (`cinema_id`),
  KEY `FK8e72rkmjwjag9nshwu5hvh6b4` (`movie_id`),
  KEY `FKri3dsp0r62rfe9oiimq89ajip` (`screen_id`),
  CONSTRAINT `FK8e72rkmjwjag9nshwu5hvh6b4` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `FKnoeed8a588r214039fb9btfmf` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`),
  CONSTRAINT `FKri3dsp0r62rfe9oiimq89ajip` FOREIGN KEY (`screen_id`) REFERENCES `screen` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show_time`
--

LOCK TABLES `show_time` WRITE;
/*!40000 ALTER TABLE `show_time` DISABLE KEYS */;
INSERT INTO `show_time` VALUES ('33ec1e01-ba68-4aa0-ac58-90b221e2fa62',96,300,'2023-09-25 10:30:00.000000','7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c','4bfa288c-e773-42bb-a21d-14d8f67b617b','f847a773-dd2f-41f4-88ae-948c18462b72'),('36a28991-9404-4cd7-b160-30a63a5c7e58',96,300,'2023-09-25 14:30:00.000000','7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c','9a1552eb-1fd9-4363-b847-f0ceeae27303','17daad48-0599-4188-8d3c-ccb575de594f'),('6000d4df-b450-4b62-a7b2-ef7d507ed09f',96,300,'2023-09-25 20:30:00.000000','7fd3b52f-45cf-4cd4-b0a3-9527e0640b9c','4bfa288c-e773-42bb-a21d-14d8f67b617b','299ff354-fc96-4d92-b15f-11556930670d'),('8b7bf6a6-21fc-40d6-93b3-be72aacc82b0',30,250,'2023-09-25 22:40:00.000000','68cd8886-ac6f-4bd9-b289-d53e0d456706','9a1552eb-1fd9-4363-b847-f0ceeae27303','0e400e4a-84b7-43f7-9703-616fe12509c9'),('8bf9d454-d5c3-4dcb-aa38-ff8f2872f207',30,250,'2023-09-25 17:30:00.000000','68cd8886-ac6f-4bd9-b289-d53e0d456706','9a1552eb-1fd9-4363-b847-f0ceeae27303','57af6bd1-03b4-4f24-9238-6b0be9b7db0d'),('b39466eb-48de-4ea1-9a56-274b3aaad348',30,250,'2023-09-25 22:40:00.000000','68cd8886-ac6f-4bd9-b289-d53e0d456706','4bfa288c-e773-42bb-a21d-14d8f67b617b','0609d71c-0b01-4dcd-a862-a46b9e2d4369');
/*!40000 ALTER TABLE `show_time` ENABLE KEYS */;
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
