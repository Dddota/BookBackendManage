/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : bookbackendmanage

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2018-06-30 23:57:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info` (
  `bookId` int(10) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `bookCode` varchar(255) NOT NULL COMMENT '图书编号',
  `bookName` varchar(255) NOT NULL COMMENT '图书名称',
  `bookType` int(10) NOT NULL COMMENT '图书类型',
  `bookAuthor` varchar(255) NOT NULL COMMENT '图书作者',
  `publishPress` varchar(40) NOT NULL COMMENT '出版社',
  `publishDate` datetime NOT NULL COMMENT '出版日期',
  `borrowed` int(10) NOT NULL COMMENT '是否借阅',
  `createdBy` varchar(10) NOT NULL COMMENT '创建人',
  `creationTime` datetime NOT NULL COMMENT '创建时间',
  `lastUpdatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最新更新时间',
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES ('1', 'BK000025', '天龙八部', '1', '金庸', '中原出版社', '2018-03-18 15:50:44', '1', 'admin', '2018-03-18 15:50:48', '2018-03-18 15:50:50');
INSERT INTO `book_info` VALUES ('2', 'BK000024', '笑傲江湖', '1', '金庸', '中原出版社', '2018-03-11 15:50:44', '1', 'admin', '2018-03-11 15:50:48', '2018-03-11 15:50:50');
INSERT INTO `book_info` VALUES ('3', 'BK000023', '神雕侠侣', '1', '金庸', '中原出版社', '2018-03-10 00:00:00', '1', 'admin', '2018-03-10 15:50:00', '2018-05-14 22:54:52');
INSERT INTO `book_info` VALUES ('4', 'BK000023', '射雕英雄传', '1', '金庸', '中原出版社', '2018-03-19 00:00:00', '1', 'admin', '2018-03-19 15:50:00', '2018-05-14 22:54:55');
INSERT INTO `book_info` VALUES ('5', 'BK000021', '倚天屠龙记', '1', '金庸', '中原出版社', '2018-03-20 00:00:00', '1', 'admin', '2018-03-20 15:50:00', '2018-05-14 22:54:58');
INSERT INTO `book_info` VALUES ('6', '0393929914', 'The Complete Pelican Shakespeare', '4', 'William Shakespeare', 'Penguin Classics', '2002-10-01 00:00:00', '0', 'admin', '2018-05-02 20:25:00', '2018-05-09 15:18:40');
INSERT INTO `book_info` VALUES ('7', 'Test001', '测试图书1', '1', '测试', '测试出版社', '2018-05-15 00:00:00', '1', '测试入库人', '2018-05-15 01:54:00', '2018-05-15 01:55:15');

-- ----------------------------
-- Table structure for book_log
-- ----------------------------
DROP TABLE IF EXISTS `book_log`;
CREATE TABLE `book_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `bookid` int(10) NOT NULL COMMENT '书籍ID',
  `userid` int(10) NOT NULL COMMENT '借书人ID',
  `type` int(10) NOT NULL COMMENT '类型，1借出，0归还',
  `creationTime` datetime NOT NULL COMMENT '发生时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_log
-- ----------------------------

-- ----------------------------
-- Table structure for book_type
-- ----------------------------
DROP TABLE IF EXISTS `book_type`;
CREATE TABLE `book_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `typeName` varchar(10) NOT NULL COMMENT '图书类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_type
-- ----------------------------
INSERT INTO `book_type` VALUES ('1', '小说');
INSERT INTO `book_type` VALUES ('2', '文学');
INSERT INTO `book_type` VALUES ('3', '传记');
INSERT INTO `book_type` VALUES ('4', '艺术');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '名字',
  `phone` varchar(20) NOT NULL COMMENT '电话',
  `account` int(10) NOT NULL COMMENT '账户',
  `times` int(10) NOT NULL DEFAULT '0' COMMENT '次数',
  `creationTime` datetime NOT NULL,
  `lastUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_list
-- ----------------------------
DROP TABLE IF EXISTS `user_list`;
CREATE TABLE `user_list` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userid` int(10) NOT NULL COMMENT '用户ID',
  `state` int(10) NOT NULL COMMENT '状态，0离馆，1在馆',
  `loginTime` datetime DEFAULT NULL COMMENT '登录时间',
  `logoutTime` datetime DEFAULT NULL COMMENT '登出时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_list
-- ----------------------------

-- ----------------------------
-- View structure for view_book
-- ----------------------------
DROP VIEW IF EXISTS `view_book`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost`  VIEW `view_book` AS SELECT bookcode,bookname,typeName,bookAuthor,publishPress,borrowed,createdBy,creationTime
FROM `book_info` INNER JOIN book_type ON bookType= book_type.id ;

-- ----------------------------
-- Procedure structure for GetAllProducts
-- ----------------------------
DROP PROCEDURE IF EXISTS `GetAllProducts`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllProducts`()
BEGIN
   SELECT *  FROM `book_info`;
   END
;;
DELIMITER ;
