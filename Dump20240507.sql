CREATE DATABASE  IF NOT EXISTS `learning_mngmnt_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `learning_mngmnt_db`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: learning_mngmnt_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `assesment`
--

DROP TABLE IF EXISTS `assesment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assesment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `trainer_id` int DEFAULT NULL,
  `remarks` text,
  `overall_result` varchar(10) DEFAULT NULL,
  `pass_fail_status` enum('Pass','Fail') DEFAULT NULL,
  `assesment_type` int DEFAULT NULL,
  `program_id` int DEFAULT NULL,
  `trainee_id` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `trainer_id` (`trainer_id`),
  KEY `assesment_type` (`assesment_type`),
  KEY `program_id` (`program_id`),
  KEY `trainee_id` (`trainee_id`),
  KEY `updated_by` (`updated_by`),
  KEY `created_by` (`created_by`),
  CONSTRAINT `assesment_ibfk_2` FOREIGN KEY (`trainer_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `assesment_ibfk_3` FOREIGN KEY (`assesment_type`) REFERENCES `assesment_type` (`id`),
  CONSTRAINT `assesment_ibfk_4` FOREIGN KEY (`program_id`) REFERENCES `programs` (`id`),
  CONSTRAINT `assesment_ibfk_5` FOREIGN KEY (`trainee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `assesment_ibfk_6` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`id`),
  CONSTRAINT `assesment_ibfk_7` FOREIGN KEY (`created_by`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assesment`
--

LOCK TABLES `assesment` WRITE;
/*!40000 ALTER TABLE `assesment` DISABLE KEYS */;
INSERT INTO `assesment` VALUES (1,1,'Good','55','Fail',1,1,2,3,5),(2,9,'Need improvement','80','Pass',2,1,4,5,3),(3,1,'excellent','40','Fail',2,1,6,3,5),(4,10,'good','75','Pass',3,2,2,5,3),(5,9,'Need Improvement',NULL,NULL,3,2,4,3,5),(10,1,'good','64','Pass',1,1,8,5,3),(11,1,'need impeovement',NULL,NULL,1,2,8,5,3),(12,10,'good','65','Pass',2,3,6,5,3),(13,9,'Need improvement',NULL,NULL,1,3,2,3,4);
/*!40000 ALTER TABLE `assesment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assesment_type`
--

DROP TABLE IF EXISTS `assesment_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assesment_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `assesment_name` varchar(30) DEFAULT NULL,
  `assesment_date` date DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `assesment_type_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `employee` (`id`),
  CONSTRAINT `assesment_type_ibfk_2` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assesment_type`
--

LOCK TABLES `assesment_type` WRITE;
/*!40000 ALTER TABLE `assesment_type` DISABLE KEYS */;
INSERT INTO `assesment_type` VALUES (1,'Project Evaluation','2024-03-28',1,3),(2,'Class Test','2024-04-01',1,3),(3,'Presentation','2024-04-15',1,3);
/*!40000 ALTER TABLE `assesment_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_firstname` varchar(20) DEFAULT NULL,
  `employee_email` varchar(20) DEFAULT NULL,
  `employee_phno` bigint DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `employee_lastname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `updated_by` (`updated_by`),
  KEY `created_by` (`created_by`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`created_by`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Aiswarya','aiswarya@gmail.com',8907654320,'2022-04-23',3,5,'Jayadev'),(2,'Adwaith','adwaith@gmail.com',3278945205,'2020-12-12',3,5,'Rajeev'),(3,'Feba','feba@gmail.com',8743026543,'2021-11-23',3,5,'Maria'),(4,'Arun','arun@gmail.com',9352045671,'2024-01-01',3,5,'Sivadas'),(5,'Sibiya','sibiya@gmail.com',5437894320,'2019-04-01',3,5,'Stanely'),(6,'Tom','tom@gmail.com',8754295401,'2023-05-13',3,5,'Holland'),(8,'Priya','priya@gmail.com',3298430184,'2018-05-02',5,3,'Vinod'),(9,'Manoj','manoj@gmail.com',9832743018,'2020-11-01',3,5,'Kumar'),(10,'Zayan','zayan@gmail.com',9827361937,'2020-11-03',3,5,'Aslam');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programs`
--

DROP TABLE IF EXISTS `programs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `program_name` text NOT NULL,
  `duration` varchar(30) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `course_created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_course_created_by` (`course_created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `fk_course_created_by` FOREIGN KEY (`course_created_by`) REFERENCES `employee` (`id`),
  CONSTRAINT `programs_ibfk_1` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programs`
--

LOCK TABLES `programs` WRITE;
/*!40000 ALTER TABLE `programs` DISABLE KEYS */;
INSERT INTO `programs` VALUES (1,'OOPS','24 DAYS','2024-01-01','2024-01-24',1,3),(2,'Soft Skills','20 DAYS','2024-02-01','2024-02-20',1,3),(3,'DBMS','28 DAYS','2024-03-01','2024-03-28',1,3);
/*!40000 ALTER TABLE `programs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 11:35:35
