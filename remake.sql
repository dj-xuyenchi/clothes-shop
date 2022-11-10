insert into color values
(1,'RED','Màu Đỏ'),
(2,'BLUE','Màu Xanh Da Trời'),
(3,'GREEN','Màu Xanh Lá Cây'),
(4,'BLACK','Màu Đen'),
(5,'WHITE','Màu Trắng'),
(6,'Pink','Màu Hồng');

insert into categorytype values 
(1,'DRESS','Váy'),
(2,'PAN','Quần'),
(3,'SHIRT','Áo');

insert into size values 
(1,'S','Size S'),
(2,'L','Size L'),
(3,'XL','Size XL');

insert into brand values
(1,'LV','Luis Vuitton'),
(2,'Dior','Dior'),
(3,'Hermes','Hermes'),
(4,'Tiffany','Tiffany'),
(5,'VS','Victory Secret'),
(6,'Channel','Channel');

insert into producer values
(1,'US','Mỹ'),
(2,'France','Pháp'),
(3,'EngLand','Vương Quốc Anh'),
(4,'Italia','Ý'),
(5,'Japan','Nhật'),
(6,'VN','Việt Nam');

insert into productstatus values
(1,'SHELLING','Đang Bán'),
(2,'OUTQUANTITY','Hết Hàng'),
(3,'CLOSE','Ngừng Kinh Doanh');



insert into product values
(1,1,1,5,'2022-9-9',2310000,1,'Váy trắng dạ hội White Sheer Sleeves Raw Top Size S Luis Vuiiton','White Sheer Sleeves Raw Top',1,22,2500000,1,'2022-9-9'),
(2,2,1,1,'2022-9-9',4400000,2,'Váy xanh dạ hội Blue Midi Raw Coat Dress Size L','Blue Midi Raw Coat Dress',1,33,6270000,2,'2022-9-9'),
(3,3,1,6,'2022-9-9',1100000,3,'Váy hồng dạ hội Cap Sleeves Midi Taffeta Dress Size L','Cap Sleeves Midi Taffeta Dress',1,14,1900000,2,'2022-9-9'),
(4,4,1,4,'2022-9-9',4400000,4,'Váy đen dạ hội Black Sleeveless Midi Lace Dress Size XL','Black Sleeveless Midi Lace Dress',1,9,3390000,3,'2022-9-9');

select * from productimg;

insert into accountbag values
(1,3,1,10),
(2,3,3,2),
(3,3,4,6),
(4,3,2,1);

select * from bill;

insert into billdetail values 
(1,2,2500000,1,2),
(2,2,6270000,2,4),
(3,2,1900000,3,6);

insert into salesstatus values
(1,'ON','Đang Áp Dụng'),
(2,'OFF','Ngừng Áp Dụng');

insert into billsales values 
(1,1,1),
(2,1,2);




select * from color
select * from product
select * from size