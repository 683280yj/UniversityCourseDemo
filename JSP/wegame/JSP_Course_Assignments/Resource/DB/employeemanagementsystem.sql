/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : employeemanagementsystem

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-11-01 17:02:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for depttbl
-- ----------------------------
DROP TABLE IF EXISTS `depttbl`;
CREATE TABLE `depttbl` (
  `Dptid` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `Dptname` varchar(20) DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`Dptid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depttbl
-- ----------------------------
INSERT INTO `depttbl` VALUES ('1', '研发部');
INSERT INTO `depttbl` VALUES ('2', '人事部');
INSERT INTO `depttbl` VALUES ('3', '实施部');

-- ----------------------------
-- Table structure for emptbl
-- ----------------------------
DROP TABLE IF EXISTS `emptbl`;
CREATE TABLE `emptbl` (
  `eid` int(255) unsigned NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `ename` varchar(20) NOT NULL COMMENT '员工姓名',
  `sex` char(2) DEFAULT NULL COMMENT '性别',
  `Salary` decimal(10,2) DEFAULT NULL COMMENT '工资',
  `dptid` int(11) DEFAULT NULL COMMENT '部门编号',
  PRIMARY KEY (`eid`,`ename`),
  KEY `dptid` (`dptid`),
  CONSTRAINT `dptid` FOREIGN KEY (`dptid`) REFERENCES `depttbl` (`Dptid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emptbl
-- ----------------------------
INSERT INTO `emptbl` VALUES ('10002', 'ds', '男', '1132.00', '2');
INSERT INTO `emptbl` VALUES ('10003', '1', '男', '123.00', '2');
INSERT INTO `emptbl` VALUES ('10014', '王俊凯', '男', '92100.00', '1');
INSERT INTO `emptbl` VALUES ('10015', '陈骁', '男', '12313.00', '1');
INSERT INTO `emptbl` VALUES ('10016', '刘轩', '男', '56.00', '1');
INSERT INTO `emptbl` VALUES ('10017', '王源', '男', '496.00', '1');
