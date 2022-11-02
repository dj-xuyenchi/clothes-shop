create database clothesshop;


insert into accountstatus values
(default,'ROOT','Quản Trị'),
(default,'OPEN','Truy Cập'),
(default,'LOCK','KHÓA');

insert into buymethod values
(default,'CARD','Thanh Toán Bằng Thẻ'),
(default,'HAND2MONEY','Thanh Toán Khi Nhận Hàng');

insert into shipmethod values
(default,15000,'QUICKSHIP','Giao Hàng Nhanh'),
(default,11000,'Normal','Giao Hàng Tiết Kiệm');

insert into categorytype values 
(default,'DRESS','Váy'),
(default,'PAN','Quần'),
(default,'SHIRT','Áo');

insert into sales values
(default,'SALE70%',0,'Giảm giá 70%',70),
(default,'SALE10000',10000,'Giảm 10000',0);

