CREATE DATABASE  IF NOT EXISTS `blw` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `blw`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: blw
-- ------------------------------------------------------
-- Server version	5.5.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_supply_product`
--

DROP TABLE IF EXISTS `t_supply_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_supply_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `supply_company` varchar(60) NOT NULL COMMENT '供应商公司code',
  `lng_factory_id` varchar(4) NOT NULL COMMENT '液厂id',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flg` char(1) DEFAULT NULL,
  `product_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `company_code` varchar(60) NOT NULL COMMENT '采购商公司',
  `handle_user_code` varchar(60) NOT NULL COMMENT '操作人',
  `supply_product_code` varchar(15) NOT NULL COMMENT '商品code',
  `type` varchar(45) NOT NULL DEFAULT '0' COMMENT '是否提供运输服务 0：否， 1：是',
  `carrier_id` varchar(45) DEFAULT NULL COMMENT '物流单价模板',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=152 DEFAULT CHARSET=utf8 COMMENT='供应商商品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_supply_product`
--

LOCK TABLES `t_supply_product` WRITE;
/*!40000 ALTER TABLE `t_supply_product` DISABLE KEYS */;
INSERT INTO `t_supply_product` VALUES (55,'dddd','ddd','2017-05-05 05:05:05','2017-05-05 05:05:05','0','1','1','1','1','1','1');
/*!40000 ALTER TABLE `t_supply_product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-01 21:07:25
