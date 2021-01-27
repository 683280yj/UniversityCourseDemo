/*
Navicat MySQL Data Transfer

Source Server         : pxyMYSQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : superktv

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-07 11:48:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for drivers
-- ----------------------------
DROP TABLE IF EXISTS `drivers`;
CREATE TABLE `drivers` (
  `DriversID` int(11) NOT NULL,
  `DriversName` varchar(50) NOT NULL,
  `UnitPrice` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`DriversID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drivers
-- ----------------------------
INSERT INTO `drivers` VALUES ('1', '喜力', '18.00');
INSERT INTO `drivers` VALUES ('2', '嘉士伯', '20.00');
INSERT INTO `drivers` VALUES ('3', '百威', '15.00');
INSERT INTO `drivers` VALUES ('4', '长城干红', '88.00');
INSERT INTO `drivers` VALUES ('5', '话梅', '8.50');
INSERT INTO `drivers` VALUES ('6', '葡萄干', '12.50');
INSERT INTO `drivers` VALUES ('7', '薯片', '7.50');
INSERT INTO `drivers` VALUES ('8', '鸡爪', '14.00');
INSERT INTO `drivers` VALUES ('9', '开心果', '20.00');

-- ----------------------------
-- Table structure for expense
-- ----------------------------
DROP TABLE IF EXISTS `expense`;
CREATE TABLE `expense` (
  `ExpenseID` int(11) NOT NULL,
  `ExpenseDate` date DEFAULT NULL,
  `DrinksID` int(11) DEFAULT NULL,
  `Num` int(11) DEFAULT NULL,
  PRIMARY KEY (`ExpenseID`),
  KEY `DrinksID` (`DrinksID`),
  CONSTRAINT `expense_ibfk_1` FOREIGN KEY (`DrinksID`) REFERENCES `drivers` (`DriversID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expense
-- ----------------------------
INSERT INTO `expense` VALUES ('1', '2013-05-28', '2', '3');
INSERT INTO `expense` VALUES ('2', '2013-05-28', '3', '2');
INSERT INTO `expense` VALUES ('3', '2013-05-28', '5', '1');
INSERT INTO `expense` VALUES ('4', '2013-05-28', '8', '6');
INSERT INTO `expense` VALUES ('5', '2013-05-30', '1', '5');
INSERT INTO `expense` VALUES ('6', '2013-05-30', '4', '1');
INSERT INTO `expense` VALUES ('7', '2013-05-30', '6', '3');
INSERT INTO `expense` VALUES ('8', '2013-05-30', '9', '2');
INSERT INTO `expense` VALUES ('9', '2013-05-30', '8', '4');

-- ----------------------------
-- Table structure for singer
-- ----------------------------
DROP TABLE IF EXISTS `singer`;
CREATE TABLE `singer` (
  `SingerID` int(11) NOT NULL,
  `SingerName` varchar(50) NOT NULL,
  `SingerType` varchar(10) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Area` varchar(50) DEFAULT NULL,
  `PhotoPath` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`SingerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of singer
-- ----------------------------
INSERT INTO `singer` VALUES ('6', '薛之谦', '男', '1983-07-17', '大陆', '薛之谦.jpg');
INSERT INTO `singer` VALUES ('7', '后弦', '男', '1979-12-14', '大陆', '后弦.jpg');
INSERT INTO `singer` VALUES ('8', '李宇春', '女', '1984-03-10', '大陆', '李宇春.jpg');
INSERT INTO `singer` VALUES ('9', '方大同', '男', '1983-07-14', '香港', '方大同.jpg');
INSERT INTO `singer` VALUES ('10', '何韵诗', '女', '1977-05-10', '香港', '何韵诗.jpg');
INSERT INTO `singer` VALUES ('11', '侧田', '男', '1976-07-01', '香港', '侧田.jpg');
INSERT INTO `singer` VALUES ('12', '周杰伦', '男', '1979-01-18', '台湾', '周杰伦.jpg');
INSERT INTO `singer` VALUES ('13', '苏打绿', '男女组合', null, '台湾', '苏打禄.jpg');
INSERT INTO `singer` VALUES ('14', 'SHE', '女子组合', null, '台湾', 'SHE.jpg');
INSERT INTO `singer` VALUES ('15', '王若琳', '女', '1988-08-01', '台湾', '王若琳.jpg');
INSERT INTO `singer` VALUES ('16', '蔡依林', '女', '1980-09-15', '台湾', '蔡依林.jpg');
INSERT INTO `singer` VALUES ('17', '后街男孩', '组合', null, '欧美', '后街男孩.jpg');
INSERT INTO `singer` VALUES ('18', '林肯公园', '男子组合', '1996-01-01', '欧美', '林肯公园.jpg');
INSERT INTO `singer` VALUES ('19', 'Michael Jackson', '男', '1958-08-29', '欧美', 'Michael Jackson.jpg');
INSERT INTO `singer` VALUES ('20', 'Avril Ramona Lavigne', '女', '1984-09-27', '欧美', 'Avril Ramona Lavigne.jpg');
INSERT INTO `singer` VALUES ('21', 'super junior ', '男子组合', null, '日韩', 'super junior.jpg ');
INSERT INTO `singer` VALUES ('22', '东方神起', '男子组合', null, '日韩', '东方神起.jpg');
INSERT INTO `singer` VALUES ('23', '李孝利', '女', '1979-05-10', '日韩', '李孝利.jpg');
INSERT INTO `singer` VALUES ('24', 'Rain', '男', '1982-06-25', '日韩', 'Rain.jpg');
INSERT INTO `singer` VALUES ('25', '安室奈美惠', '女', '1977-09-20', '日韩', '安室奈美惠.jpg');
INSERT INTO `singer` VALUES ('28', '张学友', '男', '1961-07-10', '香港', '张学友.jpg');
INSERT INTO `singer` VALUES ('29', '李谷一', '女', '1944-11-10', '大陆', '李谷一.jpg');
INSERT INTO `singer` VALUES ('30', '蔡琴', '女', '1957-12-12', '台湾', '蔡琴.jpg');
INSERT INTO `singer` VALUES ('31', '张国荣', '男', '1956-09-12', '香港', '张国荣.jpg');
INSERT INTO `singer` VALUES ('32', '费玉清', '男', '1955-07-17', '台湾', '费玉清.jpg');
INSERT INTO `singer` VALUES ('33', '那英', '女', '1967-11-27', '大陆', '那英.jpg');
INSERT INTO `singer` VALUES ('34', '张信哲', '男', '1967-03-26', '台湾', '张信哲.jpg');
INSERT INTO `singer` VALUES ('35', '胡彦斌', '男', '1983-07-04', '大陆', '胡彦斌.jpg');
INSERT INTO `singer` VALUES ('36', '蔡国庆', '男', '1968-09-17', '大陆', '蔡国庆.jpg');

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `SongID` int(11) NOT NULL,
  `Title` varchar(50) NOT NULL,
  `PingTitle` varchar(20) DEFAULT NULL,
  `TypeID` int(11) DEFAULT NULL,
  `SingerID` int(11) DEFAULT NULL,
  `Hit` int(11) NOT NULL,
  `Url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`SongID`),
  KEY `SingerID` (`SingerID`),
  KEY `TypeID` (`TypeID`),
  CONSTRAINT `song_ibfk_1` FOREIGN KEY (`SingerID`) REFERENCES `singer` (`SingerID`),
  CONSTRAINT `song_ibfk_2` FOREIGN KEY (`TypeID`) REFERENCES `type` (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('1', '传说', 'cs', '1', '6', '12', '传说.mp3');
INSERT INTO `song` VALUES ('2', '伤城秘密', 'scmm', '1', '10', '34', '伤城秘密.mp3');
INSERT INTO `song` VALUES ('5', 'super star', null, '1', '14', '8', 'super star.mp3');
INSERT INTO `song` VALUES ('6', '菊花台', 'jht', '1', '12', '78', '菊花台.wma');
INSERT INTO `song` VALUES ('7', '千山万水', 'qsws', '1', '12', '29', '千山万水.mp3');
INSERT INTO `song` VALUES ('8', '够不够', 'gbg', '1', '9', '4', '够不够.mp3');
INSERT INTO `song` VALUES ('9', '黑白', 'hb', '1', '9', '26', '黑白.mp3');
INSERT INTO `song` VALUES ('10', 'I\'m So Blue', null, '7', '19', '7', 'I\'m So Blue.mp3');
INSERT INTO `song` VALUES ('11', 'Bad Girls', null, '1', '23', '2', 'Bad Girls.mp3');
INSERT INTO `song` VALUES ('12', '等你等到我心痛', 'dnddwx', '2', '28', '23', '等你等到我心痛.mp3');
INSERT INTO `song` VALUES ('13', '人间道', 'rjd', '3', '28', '13', '人间道.mp3');
INSERT INTO `song` VALUES ('14', '难忘今宵', 'nwjx', '2', '29', '34', '难忘今宵.mp3');
INSERT INTO `song` VALUES ('15', '明月几时有', 'myjsy', '2', '30', '11', '明月几时有.mp3');
INSERT INTO `song` VALUES ('16', '征服', 'zf', '2', '33', '56', '征服.mp3');
INSERT INTO `song` VALUES ('17', '倩女幽魂', 'qnyh', '3', '31', '15', '倩女幽魂.mp3');
INSERT INTO `song` VALUES ('18', '一剪梅', 'yjm', '3', '32', '6', '一剪梅.mp3');
INSERT INTO `song` VALUES ('19', '月光', 'yg', null, '35', '3', '月光.mp3');
INSERT INTO `song` VALUES ('20', '爱就一个字', 'ajygz', null, '34', '7', '爱就一个字.mp3');
INSERT INTO `song` VALUES ('21', '我心中的故事', 'wxzdgs', '2', '36', '11', '我心中的故事.mp3');

-- ----------------------------
-- Table structure for song_dm
-- ----------------------------
DROP TABLE IF EXISTS `song_dm`;
CREATE TABLE `song_dm` (
  `SongID` int(11) NOT NULL,
  `Title` varchar(50) NOT NULL,
  `PingTitle` varchar(20) DEFAULT NULL,
  `Type` int(11) DEFAULT NULL,
  `Singer` int(11) DEFAULT NULL,
  `Hit` int(11) NOT NULL,
  `Url` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song_dm
-- ----------------------------
INSERT INTO `song_dm` VALUES ('19', '月光', 'yg', '4', '35', '1', '月光.mp3');
INSERT INTO `song_dm` VALUES ('20', '爱就一个字', 'ajygz', '4', '34', '1', '爱就一个字.mp3');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `TypeID` int(11) NOT NULL,
  `TypeName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', '热门流行');
INSERT INTO `type` VALUES ('2', '经典老歌');
INSERT INTO `type` VALUES ('3', '影视金曲');
INSERT INTO `type` VALUES ('7', '摇滚');
