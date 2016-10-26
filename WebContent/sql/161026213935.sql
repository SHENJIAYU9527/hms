/*
MySQL Backup
Source Server Version: 5.7.11
Source Database: javaiseasy
Date: 2016/10/26 21:39:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `seq` int(5) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(50) NOT NULL,
  `NickName` varchar(100) DEFAULT NULL,
  `Password` varchar(20) NOT NULL,
  `Auth` int(10) NOT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `Status` tinyint(10) NOT NULL,
  PRIMARY KEY (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1','ming','碳氢氧','123456','0','15527180332','1689687404@qq.com','杭州市西湖区浙江大学玉泉校区周亦卿科技大楼512','0'), ('4','ningkai',NULL,'123456','0',NULL,NULL,NULL,'0');
