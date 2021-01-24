/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-12 08:49:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `USER_ID` int(11) NOT NULL COMMENT '用户ID自增',
  `USER_ACCOUNT` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '账号',
  `USER_PASSWORD` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `USER_REG_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '用户注册时间',
  `USER_CARD` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证号',
  `USER_NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户的名字',
  `USER_SEX` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin', '123', '1999-12-12 11:32:22', '420104198803210872', '林志玲', '女');
INSERT INTO `tb_user` VALUES ('2', 'userKk', '123', '2005-10-11 12:32:22', '420104198703210872', '蔡依林', '女');
INSERT INTO `tb_user` VALUES ('3', 'khj', '123', '2006-10-12 13:32:22', '420104198603210872', '林志颖', '男');
INSERT INTO `tb_user` VALUES ('4', 'adm12', '123', '2000-09-12 14:32:22', '420104199903210872', '周杰伦', '男');
INSERT INTO `tb_user` VALUES ('5', 'evo123', '123', '2007-08-12 16:32:22', '420104199303210872', '迪丽热巴', '女');
INSERT INTO `tb_user` VALUES ('6', 'fufu123', '123', '2001-06-12 09:32:22', '420104199203210872', '小刚', '男');
INSERT INTO `tb_user` VALUES ('7', 'mumu89', '123', '2008-05-12 07:32:22', '420104199503210872', '乌龙', '男');
