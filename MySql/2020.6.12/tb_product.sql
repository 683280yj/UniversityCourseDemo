/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-12 09:08:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_product`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `PRODUCT_ID` int(11) NOT NULL,
  `PRODUCT_NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '产品名称',
  `PRODUCT_PRICE` int(11) DEFAULT NULL COMMENT '产品的单价',
  `PRODUCT_TOTAL` int(11) DEFAULT NULL COMMENT '产品的库存',
  `PRODUCT_WAREHOUSING_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '入库时间',
  `PRODUCT_PARENT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES ('1', '电器类', null, null, null, '-100');
INSERT INTO `tb_product` VALUES ('2', '格力电风扇', '155', '30', '2017-12-12 03:04:05', '1');
INSERT INTO `tb_product` VALUES ('3', '美的空凋', '2000', '15', '2018-11-11 03:04:05', '1');
INSERT INTO `tb_product` VALUES ('4', '食品类', null, null, null, '-100');
INSERT INTO `tb_product` VALUES ('5', '方便面', '8', '490', '2019-12-11 05:04:05', '4');
INSERT INTO `tb_product` VALUES ('6', '火腿肠', '5', '290', '2020-05-11 06:04:05', '4');
INSERT INTO `tb_product` VALUES ('7', '食用调和油', '85', '190', '2018-04-11 06:04:05', '4');
INSERT INTO `tb_product` VALUES ('8', '法国面包', '12', '90', '2020-06-11 06:04:05', '4');
INSERT INTO `tb_product` VALUES ('9', '加湿器', '18', '450', '2016-11-11 02:04:05', '1');
