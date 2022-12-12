CREATE TABLE `accountbag` (
  `accountbagid` int NOT NULL AUTO_INCREMENT,
  `accountid` int DEFAULT NULL,
  `productid` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`accountbagid`),
  KEY `FK8dyw4gfipw7f1cv5vtwlhk29s` (`accountid`),
  KEY `FKf5j57w3esdeijcqbqdv7udr9o` (`productid`),
  CONSTRAINT `FK8dyw4gfipw7f1cv5vtwlhk29s` FOREIGN KEY (`accountid`) REFERENCES `accounts` (`accountid`),
  CONSTRAINT `FKf5j57w3esdeijcqbqdv7udr9o` FOREIGN KEY (`productid`) REFERENCES `product` (`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=206 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `accounts` (
  `accountid` int NOT NULL AUTO_INCREMENT,
  `accountborn` date DEFAULT NULL,
  `accountcreatedate` date DEFAULT NULL,
  `accountdetailaddress` varchar(255) DEFAULT NULL,
  `accountpassword` varchar(255) DEFAULT NULL,
  `accountstatusid` int DEFAULT NULL,
  `accountusername` varchar(255) DEFAULT NULL,
  `createdate` date DEFAULT NULL,
  `roleid` int DEFAULT NULL,
  `updatedate` date DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sdt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`accountid`),
  KEY `FKaxknm7ti2qak7varjtikvl4an` (`accountstatusid`),
  KEY `FKpgu2u06uwg29khnly67vycee9` (`roleid`),
  CONSTRAINT `FKaxknm7ti2qak7varjtikvl4an` FOREIGN KEY (`accountstatusid`) REFERENCES `accountstatus` (`accountstatusid`),
  CONSTRAINT `FKpgu2u06uwg29khnly67vycee9` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `accountshipcontact` (
  `accountshipcontactid` int NOT NULL AUTO_INCREMENT,
  `accountdetailaddress` varchar(255) DEFAULT NULL,
  `accountid` int DEFAULT NULL,
  `accountphonenumber` varchar(255) DEFAULT NULL,
  `receivername` varchar(255) DEFAULT NULL,
  `districtid` varchar(255) DEFAULT NULL,
  `provinceid` varchar(255) DEFAULT NULL,
  `wardcode` varchar(255) DEFAULT NULL,
  `accountshipcontactstatusid` int DEFAULT NULL,
  PRIMARY KEY (`accountshipcontactid`),
  KEY `FKr8kve0lhg5rtlthonbnj3d75i` (`accountid`),
  KEY `FKrjwhoeyoqyj9s4hpl9fsdvctc` (`accountshipcontactstatusid`),
  CONSTRAINT `FKr8kve0lhg5rtlthonbnj3d75i` FOREIGN KEY (`accountid`) REFERENCES `accounts` (`accountid`),
  CONSTRAINT `FKrjwhoeyoqyj9s4hpl9fsdvctc` FOREIGN KEY (`accountshipcontactstatusid`) REFERENCES `accountshipcontactstatus` (`accountshipcontactstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `accountshipcontactstatus` (
  `accountshipcontactstatusid` int NOT NULL AUTO_INCREMENT,
  `accountshipcontactstatuscode` varchar(255) DEFAULT NULL,
  `accountshipcontactstatuscodedetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`accountshipcontactstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `accountstatus` (
  `accountstatusid` int NOT NULL AUTO_INCREMENT,
  `accountstatuscode` varchar(255) DEFAULT NULL,
  `accountstatusdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`accountstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `bill` (
  `billid` int NOT NULL AUTO_INCREMENT,
  `accountshipcontactid` int DEFAULT NULL,
  `billstatusid` int DEFAULT NULL,
  `buymethodid` int DEFAULT NULL,
  `buyernotification` varchar(255) DEFAULT NULL,
  `closedatetime` date DEFAULT NULL,
  `createdate` date DEFAULT NULL,
  `receiveddate` date DEFAULT NULL,
  `shipmethodid` int DEFAULT NULL,
  `shiptobuyerdate` date DEFAULT NULL,
  `totalbill` double DEFAULT NULL,
  `shipprice` double DEFAULT NULL,
  `billcode` varchar(255) DEFAULT NULL,
  `idemployee` int DEFAULT NULL,
  PRIMARY KEY (`billid`),
  KEY `FKl7n9vkr7otdw6yx86d2yvyt3t` (`accountshipcontactid`),
  KEY `FKkmyo13v5bqkvsp8soa3d7ceuf` (`billstatusid`),
  KEY `FK2boflfhmkpgql0b57v22rg7xv` (`buymethodid`),
  KEY `FKe5f12pcd7a351aydn894ms4jt` (`shipmethodid`),
  KEY `FKff4to2pth05rndittsmu0cec5` (`idemployee`),
  CONSTRAINT `FK2boflfhmkpgql0b57v22rg7xv` FOREIGN KEY (`buymethodid`) REFERENCES `buymethod` (`buymethodid`),
  CONSTRAINT `FKe5f12pcd7a351aydn894ms4jt` FOREIGN KEY (`shipmethodid`) REFERENCES `shipmethod` (`shipmethodid`),
  CONSTRAINT `FKff4to2pth05rndittsmu0cec5` FOREIGN KEY (`idemployee`) REFERENCES `accounts` (`accountid`),
  CONSTRAINT `FKkmyo13v5bqkvsp8soa3d7ceuf` FOREIGN KEY (`billstatusid`) REFERENCES `billstatus` (`billstatusid`),
  CONSTRAINT `FKl7n9vkr7otdw6yx86d2yvyt3t` FOREIGN KEY (`accountshipcontactid`) REFERENCES `accountshipcontact` (`accountshipcontactid`)
) ENGINE=InnoDB AUTO_INCREMENT=503 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `billdetail` (
  `billdetailid` int NOT NULL AUTO_INCREMENT,
  `billid` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `productid` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`billdetailid`),
  KEY `FKoa0s98l8h6kpd1m0joc7bybby` (`billid`),
  KEY `FKao4dqfbyauesyjlrlxob31ko0` (`productid`),
  CONSTRAINT `FKao4dqfbyauesyjlrlxob31ko0` FOREIGN KEY (`productid`) REFERENCES `product` (`productid`),
  CONSTRAINT `FKoa0s98l8h6kpd1m0joc7bybby` FOREIGN KEY (`billid`) REFERENCES `bill` (`billid`)
) ENGINE=InnoDB AUTO_INCREMENT=354 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `billsales` (
  `billsalesid` int NOT NULL AUTO_INCREMENT,
  `billid` int DEFAULT NULL,
  `salesid` int DEFAULT NULL,
  PRIMARY KEY (`billsalesid`),
  KEY `FKmvkkbuuofjblrnklp680yxjue` (`billid`),
  KEY `FKqkileq49p7ae9657jvvxid3i8` (`salesid`),
  CONSTRAINT `FKmvkkbuuofjblrnklp680yxjue` FOREIGN KEY (`billid`) REFERENCES `bill` (`billid`),
  CONSTRAINT `FKqkileq49p7ae9657jvvxid3i8` FOREIGN KEY (`salesid`) REFERENCES `sales` (`salesid`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `billstatus` (
  `billstatusid` int NOT NULL AUTO_INCREMENT,
  `billstatuscode` varchar(255) DEFAULT NULL,
  `billstatusdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`billstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `brand` (
  `brandid` int NOT NULL AUTO_INCREMENT,
  `brandcode` varchar(255) DEFAULT NULL,
  `branddetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`brandid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `buymethod` (
  `buymethodid` int NOT NULL AUTO_INCREMENT,
  `buymethodcode` varchar(255) DEFAULT NULL,
  `buymethodname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`buymethodid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `categorytype` (
  `categorytypeid` int NOT NULL AUTO_INCREMENT,
  `categerytypecode` varchar(255) DEFAULT NULL,
  `categerytypedetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`categorytypeid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `color` (
  `colorid` int NOT NULL AUTO_INCREMENT,
  `colorcode` varchar(255) DEFAULT NULL,
  `colordetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`colorid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `producer` (
  `producerid` int NOT NULL AUTO_INCREMENT,
  `producercode` varchar(255) DEFAULT NULL,
  `producerdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`producerid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `product` (
  `productid` int NOT NULL AUTO_INCREMENT,
  `brandid` int DEFAULT NULL,
  `categorytypeid` int DEFAULT NULL,
  `colorid` int DEFAULT NULL,
  `createdate` date DEFAULT NULL,
  `price` int DEFAULT NULL,
  `producerid` int DEFAULT NULL,
  `productdetail` varchar(255) DEFAULT NULL,
  `productname` varchar(255) DEFAULT NULL,
  `productstatusid` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `shellprice` int DEFAULT NULL,
  `sizeid` int DEFAULT NULL,
  `updatedate` date DEFAULT NULL,
  PRIMARY KEY (`productid`),
  KEY `FKbjg13m30ju2y2g5icqbuycglv` (`brandid`),
  KEY `FKg1e3oxg5bfkrlei4ur3kn6o7n` (`categorytypeid`),
  KEY `FKgrjud0j6mi86k7wlglxryet6h` (`colorid`),
  KEY `FKq8trly3a0kachm04qkjlip1r8` (`producerid`),
  KEY `FKj0ta2h4bu9h0vy28ck407e3ib` (`productstatusid`),
  KEY `FKcmrc92mccr4w0739c7g76bi77` (`sizeid`),
  CONSTRAINT `FKbjg13m30ju2y2g5icqbuycglv` FOREIGN KEY (`brandid`) REFERENCES `brand` (`brandid`),
  CONSTRAINT `FKcmrc92mccr4w0739c7g76bi77` FOREIGN KEY (`sizeid`) REFERENCES `size` (`sizeid`),
  CONSTRAINT `FKg1e3oxg5bfkrlei4ur3kn6o7n` FOREIGN KEY (`categorytypeid`) REFERENCES `categorytype` (`categorytypeid`),
  CONSTRAINT `FKgrjud0j6mi86k7wlglxryet6h` FOREIGN KEY (`colorid`) REFERENCES `color` (`colorid`),
  CONSTRAINT `FKj0ta2h4bu9h0vy28ck407e3ib` FOREIGN KEY (`productstatusid`) REFERENCES `productstatus` (`productstatusid`),
  CONSTRAINT `FKq8trly3a0kachm04qkjlip1r8` FOREIGN KEY (`producerid`) REFERENCES `producer` (`producerid`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `productstatus` (
  `productstatusid` int NOT NULL AUTO_INCREMENT,
  `productstatuscode` varchar(255) DEFAULT NULL,
  `productstatusdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`productstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `role` (
  `roleid` int NOT NULL AUTO_INCREMENT,
  `rolecode` varchar(255) DEFAULT NULL,
  `roledetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sales` (
  `salesid` int NOT NULL AUTO_INCREMENT,
  `enddate` date DEFAULT NULL,
  `opendate` date DEFAULT NULL,
  `salescode` varchar(255) DEFAULT NULL,
  `salesint` int DEFAULT NULL,
  `salesname` varchar(255) DEFAULT NULL,
  `salespercent` int DEFAULT NULL,
  `salesstatusid` int DEFAULT NULL,
  `saletypeid` int DEFAULT NULL,
  PRIMARY KEY (`salesid`),
  KEY `FKmemlhr30ur2yr1xvsr6gcasi5` (`salesstatusid`),
  KEY `FKm7gedjtr405oj5vg7nh0egm5q` (`saletypeid`),
  CONSTRAINT `FKm7gedjtr405oj5vg7nh0egm5q` FOREIGN KEY (`saletypeid`) REFERENCES `saletype` (`saletypeid`),
  CONSTRAINT `FKmemlhr30ur2yr1xvsr6gcasi5` FOREIGN KEY (`salesstatusid`) REFERENCES `salesstatus` (`salesstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `salesstatus` (
  `salesstatusid` int NOT NULL AUTO_INCREMENT,
  `salesstatuscode` varchar(255) DEFAULT NULL,
  `salesstatusdetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`salesstatusid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `saletype` (
  `saletypeid` int NOT NULL AUTO_INCREMENT,
  `saletypecode` varchar(255) DEFAULT NULL,
  `saletypedetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`saletypeid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `shipmethod` (
  `shipmethodid` int NOT NULL AUTO_INCREMENT,
  `price` int DEFAULT NULL,
  `shipmethodcode` varchar(255) DEFAULT NULL,
  `shipmethodname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`shipmethodid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `size` (
  `sizeid` int NOT NULL AUTO_INCREMENT,
  `sizecode` varchar(255) DEFAULT NULL,
  `sizedetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sizeid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `votestar` (
  `votestarid` int NOT NULL AUTO_INCREMENT,
  `accountid` int DEFAULT NULL,
  `productid` int DEFAULT NULL,
  `starvoted` int DEFAULT NULL,
  PRIMARY KEY (`votestarid`),
  KEY `FK7qidg5j6hjxm530d6js8cukye` (`accountid`),
  KEY `FKbq3f8068rh8c2qu33kga7j8xm` (`productid`),
  CONSTRAINT `FK7qidg5j6hjxm530d6js8cukye` FOREIGN KEY (`accountid`) REFERENCES `accounts` (`accountid`),
  CONSTRAINT `FKbq3f8068rh8c2qu33kga7j8xm` FOREIGN KEY (`productid`) REFERENCES `product` (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
