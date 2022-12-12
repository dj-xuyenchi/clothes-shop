create database clothesshop;

insert into role values
(1,'ADMIN','Quản Trị Viên'),
(2,'EMPLOYEE','Nhân Viên'),
(3,'Guest','Khách Hàng');

insert into accountstatus values
(1,'OPEN','Truy Cập'),
(2,'LOCK','KHÓA');

insert into buymethod values
(1,'CARD','Thanh Toán Bằng Thẻ'),
(2,'HAND2MONEY','Thanh Toán Khi Nhận Hàng');

insert into shipmethod values
(1,15000,'QUICKSHIP','Giao Hàng Nhanh'),
(2,11000,'Normal','Giao Hàng Tiết Kiệm');


insert into sales values
(1,'2022-11-1','2022-11-4','SALE70%',0,'Giảm giá 70%',70,1,2),
(2,'2022-11-1','2022-11-4','SALE10000',10000,'Giảm 10.000đ',0,1,2),
(3,'2022-11-1','2022-11-4','FREESHIP20K',20000,'Giảm 20000 Phí Vận Chuyển',0,1,1),
(4,'2022-11-1','2022-11-4','FREESHIP10K',10000,'Giảm 10000 Phí Vận Chuyển',0,1,1),
(5,'2022-11-1','2022-11-4','SALE50000',50000,'Giảm 50.000đ',0,1,2);

insert into accounts values
(1,'2000-01-01','2000-01-01','admin','1231234',1,'cauvongsociu','2021-9-9',1,null),
(2,'2000-01-01','2000-01-01','employee','1231234',1,'cauvongsociu1','2021-9-9',2,null),
(3,'2000-01-01','2000-01-01','guest','1231234',1,'cauvongsociu2','2021-9-9',3,null);

insert into accountshipcontactstatus VALUES
(1,'ON','Sử Dụng'),
(2,'OFF','Ngừng Sử Dụng');

insert into accountshipcontact values 
(1,'19 Thanh Niên - Tây Hồ - Hà Nội',3,'0968491797','DJ Bé Xinh',1),
(2,'1 Thống Nhất - Ba Đình - Hà Nội',3,'0968491877','DJ Gấu Mập',1);


insert into billstatus values 
(1,'WAITTING','Chờ Xác Nhận'),
(2,'SHIPPING','Đang Giao'),
(3,'SHIPPED','Đã Giao'),
(4,'CANCEL','Đã Hủy');

insert into bill values
(1,1,1,1,'Đóng gói cẩn thận nha.',null,'2022-11-2',null,1,null),
(2,1,2,1,'Đóng gói cẩn thận nha.',null,'2022-11-2',null,1,'2022-11-5'),
(3,1,3,1,'Đóng gói cẩn thận nha.','2022-11-6','2022-11-2','2022-11-6',1,'2022-11-5'),
(4,1,4,1,'Đóng gói cẩn thận nha.','2022-11-4','2022-11-2','2022-11-6',1,'2022-11-5');


/// Dress select * from product
insert into product values
(1,1,'Luis Vuiton','Váy Thời Trang','Sheer Sleeves Raw Top'),
(2,1,'Gucci','Váy Thời Trang','Check Tweed Dress And Vest Set'),
(3,1,'Luis Vuiton','Váy Thời Trang','Multi-coloured Stripe Midi Tweed Dress'),
(4,1,'Luis Vuiton','Váy Thời Trang','Sarong Midi Silk Dress'),
(5,1,'Tifany','Váy Thời Trang','Mini Brocade Skirt'),
(6,1,'Victoria Secret','Váy Thời Trang','A-line Mini Raw Skirt'),
(7,1,'Victoria Secret','Váy Thời Trang','Pleated Midi Lace Skirt'),
(8,1,'Luis Vuiton','Váy Thời Trang','A-line Midi Brocade Skirt'),
(9,1,'Babei','Váy Thời Trang','Midi Brocade Skirt');
/// Pan 
insert into product values
(10,2,'Chanel','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(11,2,'Versace','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(12,2,'Versace','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(13,2,'Chanel','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(14,2,'Hermes','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(15,2,'Yves Saint Laurent
','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(16,2,'Yves Saint Laurent
','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(17,2,'Yves Saint Laurent
','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(18,2,'Fendi','Quần Unsex sặc sỡ','Blend Coat With Belt'),
(19,2,'Fendi','Quần Unsex sặc sỡ','Blend Coat With Belt');

/// Shirt
insert into product values
(20,3,'Burberry','Áo Choàng Cá Tính','Blend Coat With Belt'),
(21,3,'Burberry','Áo Choàng Cá Tính','Sleeveless Midi Raw'),
(22,3,'Hermes','Áo Choàng Cá Tính','V-neck Midi Brocade'),
(23,3,'Hermes','Đầm xòe Cá Tính','Đầm xòe CT kẻ cổ thuyền lật'),
(24,3,'Hermes','Áo Choàng Cá Tính','Floral Cropped Brocade Vest'),
(25,3,'Prada','Áo Choàng Cá Tính','Xenia'),
(26,3,'Prada','Áo Choàng Cá Tính','Jena Shirt'),
(27,3,'Prada','Áo Choàng Cá Tính','Blue Silk Shirt'),
(28,3,'Bottega Veneta','Áo Vest Cá Tính','Check Woven Waistcoat Vest'),
(29,3,'Bottega Veneta','Áo Vest Cá Tính','Suit Jacket (Áo vest lông cừu)');

// Property select * from property
insert into property values
(1,1,'Size',1),
(2,1,'Màu Sắc',2),
(3,2,'Size',1),
(4,2,'Màu Sắc',2),
(5,3,'Size',1),
(6,3,'Màu Sắc',2),
(7,4,'Size',1),
(8,4,'Màu Sắc',2),
(9,5,'Size',1),
(10,5,'Màu Sắc',2),
(11,6,'Size',1),
(12,6,'Màu Sắc',2),
(13,7,'Size',1),
(14,7,'Màu Sắc',2),
(15,8,'Size',1),
(16,8,'Màu Sắc',2),
(17,9,'Size',1),
(18,9,'Màu Sắc',2),
(19,10,'Size',1),
(20,10,'Màu Sắc',2),
(21,11,'Size',1),
(22,11,'Màu Sắc',2),
(23,12,'Size',1),
(24,12,'Màu Sắc',2),
(25,13,'Size',1),
(26,13,'Màu Sắc',2),
(27,14,'Size',1),
(28,14,'Màu Sắc',2),
(29,15,'Size',1),
(30,15,'Màu Sắc',2),
(31,16,'Size',1),
(32,16,'Màu Sắc',2),
(33,17,'Size',1),
(34,17,'Màu Sắc',2),
(35,18,'Size',1),
(36,18,'Màu Sắc',2),
(37,19,'Size',1),
(38,19,'Màu Sắc',2),
(39,20,'Size',1),
(40,20,'Màu Sắc',2),
(41,21,'Size',1),
(42,21,'Màu Sắc',2),
(43,22,'Size',1),
(44,22,'Màu Sắc',2),
(45,23,'Size',1),
(46,23,'Màu Sắc',2),
(47,24,'Size',1),
(48,24,'Màu Sắc',2),
(49,25,'Size',1),
(50,25,'Màu Sắc',2),
(51,26,'Size',1),
(52,26,'Màu Sắc',2),
(53,27,'Size',1),
(54,27,'Màu Sắc',2),
(55,28,'Size',1),
(56,28,'Màu Sắc',2),
(57,29,'Size',1),
(58,29,'Màu Sắc',2);

//propertyDetail select * from propertydetail

insert into propertydetail values
(1,2450000,null,'Size S',1,10,3200000),
(2,2450000,null,'Size L',1,12,3400000),
(3,2450000,null,'Size Xl',1,6,3400000),
(4,2450000,1,'Size S Màu Hồng',2,6,3200000),
(5,2450000,2,'Size L Màu Hồng',2,7,3400000),
(6,2450000,3,'Size Xl Màu Hồng',2,3,3400000),
(7,2450000,1,'Size S Màu Đen',2,4,3200000),
(8,2450000,2,'Size L Màu Đen',2,5,3400000),
(9,2450000,3,'Size Xl Màu Đen',2,3,3400000),

(10,3340000,null,'Size S',3,13,4430000),
(11,3340000,null,'Size L',3,22,4580000),
(12,3340000,null,'Size Xl',3,11,4590000),
(13,3340000,10,'Size S Màu Xanh',4,10,4430000),
(14,3340000,11,'Size L Màu Xanh',4,14,4580000),
(15,3340000,12,'Size Xl Màu Xanh',4,10,4590000),
(16,3340000,10,'Size S Màu Đỏ',4,3,4430000),
(17,3340000,11,'Size L Màu Đỏ',4,8,4580000),
(18,3340000,12,'Size Xl Màu Đỏ',4,1,4590000),

(19,2230000,null,'Size S',5,34,4430000),
(20,2230000,null,'Size L',5,12,4580000),
(21,2230000,null,'Size Xl',5,6,4590000),
(22,2230000,19,'Size S Màu Trắng',6,27,4430000),
(23,2230000,20,'Size L Màu Trắng',6,9,4580000),
(24,2230000,21,'Size Xl Màu Trắng',6,2,4590000),
(25,2230000,19,'Size S Màu Hồng',6,7,4430000),
(26,2230000,20,'Size L Màu Hồng',6,3,4580000),
(27,2230000,21,'Size Xl Màu Hồng',6,4,4590000),

(28,6500000,null,'Size S',7,6,7700000),
(29,6500000,null,'Size L',7,22,7789000),
(30,6500000,null,'Size Xl',7,9,8000000),
(31,6500000,28,'Size S Màu Cam',8,3,7700000),
(32,6500000,29,'Size L Màu Cam',8,18,7789000),
(33,6500000,30,'Size Xl Màu Cam',8,1,8000000),
(34,6500000,28,'Size S Màu Trắng',8,3,7700000),
(35,6500000,29,'Size L Màu Trắng',8,4,7789000),
(36,6500000,30,'Size Xl Màu Trắng',8,8,8000000),

(37,5500000,null,'Size S',9,14,5730000),
(38,5500000,null,'Size L',9,18,5800000),
(39,5500000,null,'Size Xl',9,23,5800000),
(40,5500000,37,'Size S Màu Đỏ',10,10,5730000),
(41,5500000,38,'Size L Màu Đỏ',10,5,5800000),
(42,5500000,39,'Size Xl Màu Đỏ',10,20,5800000),
(43,5500000,37,'Size S Màu Tím',10,4,5730000),
(44,5500000,38,'Size L Màu Tím',10,13,5800000),
(45,5500000,39,'Size Xl Màu Tím',10,3,5800000),

(46,1210000,null,'Size S',11,6,2240000),
(47,1210000,null,'Size L',11,13,2250000),
(48,1210000,null,'Size Xl',11,2,225000),
(49,1210000,46,'Size S Màu Đen',12,3,2240000),
(50,1210000,47,'Size L Màu Đen',12,11,2250000),
(51,1210000,48,'Size Xl Màu Đen',12,3,225000),
(52,1210000,46,'Size S Màu Vàng',12,3,2240000),
(53,1210000,47,'Size L Màu Vàng',12,2,2250000),
(54,1210000,48,'Size Xl Màu Vàng',12,1,225000),

(55,4200000,null,'Size S',13,7,4550000),
(56,4200000,null,'Size L',13,9,4620000),
(57,4200000,null,'Size Xl',13,3,4640000),
(55,4200000,55,'Size S',14,4,4550000),
(56,4200000,56,'Size L',14,3,4620000),
(57,4200000,57,'Size Xl',14,1,4640000),
(55,4200000,55,'Size S',14,3,4550000),
(56,4200000,56,'Size L',14,6,4620000),
(57,4200000,57,'Size Xl',14,2,4640000),

(58,3500000,null,'Size S',15,54,4550000),
(59,3500000,null,'Size L',15,23,4620000),
(60,3500000,null,'Size Xl',15,66,4640000),
(61,3500000,58,'Size S Màu Cam',16,37,4550000),
(62,3500000,59,'Size L Màu Cam',16,3,4620000),
(63,3500000,60,'Size Xl Màu Cam',16,12,4640000),
(64,3500000,58,'Size S Màu Trắng',16,17,4550000),
(65,3500000,59,'Size L Màu Trắng',16,20,4620000),
(66,3500000,60,'Size Xl Màu Trắng',16,54,4640000),

(67,955000,null,'Size S',17,73,2100000),
(68,955000,null,'Size L',17,42,2100000),
(69,955000,null,'Size Xl',17,46,2100000),
(70,955000,67,'Size S Màu Đỏ',18,58,2100000),
(71,955000,68,'Size L Màu Đỏ',18,30,2100000),
(72,955000,69,'Size Xl Màu Đỏ',18,13,2100000),
(73,955000,67,'Size S Màu Tím',18,15,2100000),
(74,955000,68,'Size L Màu Tím',18,12,2100000),
(75,955000,69,'Size Xl Màu Tím',18,33,2100000),

(76,1320000,null,'Size S',19,11,1559000),
(77,1320000,null,'Size L',19,13,1559000),
(78,1320000,null,'Size Xl',19,6,1559000),
(79,1320000,76,'Size S Màu Xanh',20,2,1559000),
(80,1320000,77,'Size L Màu Xanh',20,11,1559000),
(81,1320000,78,'Size Xl Màu Xanh',20,3,1559000),
(82,1320000,76,'Size S Màu Đen',20,9,1559000),
(83,1320000,77,'Size L Màu Đen',20,2,1559000),
(84,1320000,78,'Size Xl Màu Đen',20,3,1559000),

(85,1900000,null,'Size S',21,5,2200000),
(86,1900000,null,'Size L',21,6,2200000),
(87,1900000,null,'Size Xl',21,7,2200000),
(85,1900000,null,'Size S',21,5,2200000),
(86,1900000,null,'Size L',21,6,2200000),
(87,1900000,null,'Size Xl',21,7,2200000),
(85,1900000,null,'Size S',21,5,2200000),
(86,1900000,null,'Size L',21,6,2200000),
(87,1900000,null,'Size Xl',21,7,2200000),
select * fr
select * from product



