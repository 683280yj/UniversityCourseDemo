/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-02 11:35:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `car1`
-- ----------------------------
DROP TABLE IF EXISTS `car1`;
CREATE TABLE `car1` (
  `CAR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAR_NAME` varchar(4) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_DATE` date DEFAULT NULL,
  PRIMARY KEY (`CAR_ID`),
  UNIQUE KEY `CAR_NAME` (`CAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of car1
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_car`
-- ----------------------------
DROP TABLE IF EXISTS `tb_car`;
CREATE TABLE `tb_car` (
  `CAR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认汽车的主键int类型',
  `CAR_NAME` varchar(4) COLLATE utf8_icelandic_ci DEFAULT NULL COMMENT '汽车名字',
  `CAR_DATE` date DEFAULT NULL COMMENT '汽车生产日期',
  `CAR_PRICE` int(11) DEFAULT NULL,
  `CAR_SERVICE` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  PRIMARY KEY (`CAR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_car
-- ----------------------------
INSERT INTO `tb_car` VALUES ('1', '奔驰', '2020-06-01', '200', '维修');
INSERT INTO `tb_car` VALUES ('2', '奥迪', '2020-06-02', '300', '保养');
INSERT INTO `tb_car` VALUES ('3', '大众', '2020-06-02', '320', '维修');
INSERT INTO `tb_car` VALUES ('4', '宝马', '2020-06-02', '500', '保养');
INSERT INTO `tb_car` VALUES ('5', '宝马', '2020-06-02', '400', '维修');
INSERT INTO `tb_car` VALUES ('6', '比亚迪', '2020-06-02', '400', '清洗');

-- ----------------------------
-- Table structure for `tb_car_info`
-- ----------------------------
DROP TABLE IF EXISTS `tb_car_info`;
CREATE TABLE `tb_car_info` (
  `CAR_INFO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAR_INFO_CARD` varchar(20) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_INFO_TYPE` varchar(6) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CAR_INFO_ID`),
  UNIQUE KEY `CAR_INFO_CARD` (`CAR_INFO_CARD`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_car_info
-- ----------------------------
INSERT INTO `tb_car_info` VALUES ('1', 'ESDF345', '进口', '1');
INSERT INTO `tb_car_info` VALUES ('2', 'ADF3145', '进口', '2');
INSERT INTO `tb_car_info` VALUES ('3', 'BHUF347', '进口', '3');
