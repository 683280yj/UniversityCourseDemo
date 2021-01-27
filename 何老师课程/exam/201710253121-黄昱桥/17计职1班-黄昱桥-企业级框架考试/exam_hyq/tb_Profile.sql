/*
 Navicat Premium Data Transfer

 Source Server         : bj.kevinkda.cn
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : bj.kevinkda.cn:3306
 Source Schema         : HuangSir

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 23/09/2020 16:39:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_Profile
-- ----------------------------
DROP TABLE IF EXISTS `tb_Profile`;
CREATE TABLE `tb_Profile`  (
  `Profile_Id` int(0) NOT NULL AUTO_INCREMENT COMMENT '人员ID',
  `Profile_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员姓名',
  `Profile_Birthday` datetime(0) NOT NULL COMMENT '人员年龄',
  `Profile_Gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员性别',
  `Profile_Career` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员职业',
  `Profile_Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员住所',
  `Profile_Mobile` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  PRIMARY KEY (`Profile_Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_Profile
-- ----------------------------
INSERT INTO `tb_Profile` VALUES (1, '黄昱桥', '2020-09-23 14:18:58', '男', '学生', '湖北恩施', '18164038469');
INSERT INTO `tb_Profile` VALUES (2, '111', '2020-09-23 15:58:31', '男', '人', '呜啊还能', '16666666666');

SET FOREIGN_KEY_CHECKS = 1;
