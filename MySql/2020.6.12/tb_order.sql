/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-12 09:26:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `ORDER_ID` int(11) NOT NULL,
  `ORDER_NUMBER` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `USER_ID` int(11) NOT NULL,
  `PRODUCT_ID` int(11) DEFAULT NULL,
  `PRODUCT_COUNT` int(11) DEFAULT NULL,
  `ORDER_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1', '201787678ESD', '1', '2', '2', '2020-04-03 12:12:10');
INSERT INTO `tb_order` VALUES ('2', '20134587ESDA', '2', '3', '3', '2020-03-03 11:12:10');
INSERT INTO `tb_order` VALUES ('3', '20134587ESDA', '2', '4', '1', '2020-03-03 11:12:10');
INSERT INTO `tb_order` VALUES ('4', '202045875AHAJ', '4', '7', '2', '2019-02-03 11:12:10');
INSERT INTO `tb_order` VALUES ('5', '202045875AHAJ', '4', '6', '1', '2019-02-03 11:12:10');
INSERT INTO `tb_order` VALUES ('6', '201046865AGAK', '6', '3', '2', '2015-04-03 12:12:10');
INSERT INTO `tb_order` VALUES ('7', '202047825APAN', '6', '4', '4', '2017-03-03 14:12:10');
