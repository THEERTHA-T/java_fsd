show tables;
use ecommerce;
CREATE TABLE `colors` (
`ID` bigint(20) NOT NULL AUTO_INCREMENT,
`color_name` varchar(40) DEFAULT NULL,
`idx` int(11) DEFAULT NULL,
`product_id` bigint(20) DEFAULT NULL,
PRIMARY KEY (`ID`)
);

INSERT INTO `colors` VALUES (1,'Red',0,1),(2,'Silver',1,1),(3,'Gray',0,2),(4,'White',1,2),(5,'Maroon',0,3);

select *from colors;



CREATE TABLE `screensizes` (
`ID` bigint(20) NOT NULL AUTO_INCREMENT,
`size` varchar(10) DEFAULT NULL,
`product_id` bigint(20) DEFAULT NULL,
PRIMARY KEY (`ID`)
) ;

INSERT INTO `screensizes` VALUES (1,'12 in',1),(2,'14.5 in',2),(3,'14.9 in',2),(4,'15.5 in',3);

CREATE TABLE `os` (
`ID` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(30) DEFAULT NULL,
`product_id` bigint(20) DEFAULT NULL,
PRIMARY KEY (`ID`)
);

INSERT INTO `os` VALUES (1,'Windows 10',1),(2,'Windows 10',2), (3,'FreeDOS',2),(4,'RedHat Linux',2),(5,'Windows 10',3);

CREATE TABLE `finance` (
`ID` bigint(20) NOT NULL AUTO_INCREMENT,
`ftype` varchar(10) DEFAULT NULL,
`name` varchar(30) DEFAULT NULL,
`product_id` bigint(20) DEFAULT NULL,
PRIMARY KEY (`ID`)
) ;

INSERT INTO `finance` VALUES (1,'CREDITCARD','EMI on Citibank Card',1),(3,'BANK','40% finance from SBI',2), (4,'BANK','60% finance from ICICI',3), (5,'BANK','20% finance from ICICI',1);

show tables;