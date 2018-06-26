/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.0.67-community-nt : Database - hbdb
*********************************************************************
Server version : 5.0.67-community-nt
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `hbdb`;

USE `hbdb`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `student1` */

DROP TABLE IF EXISTS `student1`;

CREATE TABLE `student1` (
  `sid1` int(5) NOT NULL,
  `sname1` varchar(20) default NULL,
  `tot_m1` float(5,2) default NULL,
  PRIMARY KEY  (`sid1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student1` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
