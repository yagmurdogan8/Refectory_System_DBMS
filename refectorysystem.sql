select * from client;
select * from company;
select * from meal;
select * from reservatesfor; 
select * from paysfor; 
select * from employee; 

set sql_safe_updates = 0;

update paysfor set meal_type = 'normal' where Pdate = '08.03.2021';
update paysfor set meal_type = 'vegeterian' where Pdate = '08.05.2021';
update paysfor set meal_type = 'normal' where Pdate = '17.11.2021';
update paysfor set meal_type = 'vegeterian' where Pdate = '01.01.2021';
update paysfor set meal_type = 'normal' where Pdate = '01.03.2021';
update paysfor set meal_type = 'vegeterian' where Pdate = '01.04.2021';
update paysfor set meal_type = 'normal' where Pdate = '10.06.2021';
update paysfor set meal_type = 'vegeterian' where Pdate = '22.01.2021';


update reservatesfor set meal_type = 'normal' where Rdate = '07.03.2021';
update reservatesfor set meal_type = 'vegeterian' where Rdate = '06.05.2021';
update reservatesfor set meal_type = 'normal' where Rdate = '15.11.2021';
update reservatesfor set meal_type = 'vegeterian' where Rdate = '31.12.2021';
update reservatesfor set meal_type = 'normal' where Rdate = '28.02.2021';
update reservatesfor set meal_type = 'vegeterian' where Rdate = '01.04.2021';
update reservatesfor set meal_type = 'normal' where Rdate = '08.06.2021';
update reservatesfor set meal_type = 'vegeterian' where Rdate = '20.01.2021';



update client set Edate = '21.03.2020' where client_fac = 'Engineering';
update client set Edate = '23.03.2020' where client_fac = 'Architecture';
update client set Edate = '25.03.2020' where client_fac = 'Aviation & Space Sciences';
update client set Edate = '28.04.2020' where client_gender = 'F';
update client set Edate = '12.04.2020' where client_address = 'Istanbul';
update client set Edate = '06.03.2020' where client_address = 'Eskisehir';
update client set Edate = '17.03.2020' where client_address = 'Kutahya';
update client set Edate = '09.04.2020' where client_address = 'Kirikkale';
update client set Edate = '30.03.2020' where client_address = 'Adana';
update client set Edate = '10.04.2020' where client_address = 'Ankara';

set sql_safe_updates = 0;

**update client set pid = 1 where client_fac = 'Engineering';
update client set pid = 2 where client_fac = 'Architecture';
update client set pid = 3 where client_fac = 'Aviation & Space Sciences';
update client set pid = 4 where client_gender = 'F';
update client set pid = 5 where client_address = 'Istanbul';
update client set pid = 6 where client_address = 'Eskisehir';
update client set pid = 7 where client_address = 'Kutahya';
update client set pid = 8 where client_address = 'Kirikkale';
update client set pid = 9 where client_address = 'Adana';
update client set pid = 10 where client_address = 'Ankara';**

ALTER TABLE client 
ADD CONSTRAINT `fk_client_cid` 
FOREIGN KEY (`cid`)
REFERENCES `company` (`cid`)
ON DELETE set null
ON UPDATE set null;

ALTER TABLE client
ADD CONSTRAINT client_ibfk_1 FOREIGN KEY (cid) REFERENCES company (cid) ;

ALTER TABLE `rsys`.`client` 
ADD FOREIGN KEY (pid) REFERENCES `rsys`.`paysfor` (pid);

ALTER TABLE `rsys`.`client` 
ADD CONSTRAINT FK_client
FOREIGN KEY (pid) REFERENCES `rsys`.`paysfor` (pid);

ALTER TABLE `rsys`.`client` 
ADD CONSTRAINT FK_client
FOREIGN KEY (rid) REFERENCES `rsys`.`reservatesfor` (rid);

drop table staff;

insert into employee values (1, 'Firat Gok', 'Eskisehir', 'M', '21.07.2009', 1);
insert into employee values (2, 'Gokhan Gurses', 'Eskisehir', 'M', '31.12.2011', 1);
insert into employee values (3, 'Ferhat Yildirim', 'Eskisehir', 'M', '10.04.2013', 1);
insert into employee values (4, 'Ali Yagiz', 'Eskisehir', 'M', '08.06.2010', 1);
insert into employee values (5, 'Serhat Kopuz', 'Eskisehir', 'M', '06.05.2007', 1);
insert into employee values (6, 'Kenan Hikmet', 'Eskisehir', 'M', '23.08.2005', 1);
insert into employee values (7, 'Dogan Polat', 'Eskisehir', 'M', '17.03.2015', 1);
insert into employee values (8, 'Cetin Ceviz', 'Eskisehir', 'M', '12.11.2010', 1);
insert into employee values (9, 'Cengiz Koc', 'Eskisehir', 'M', '27.09.2017', 1);
insert into employee values (10, 'Ali Genc', 'Eskisehir', 'M', '30.06.2012', 1);
insert into employee values (11, 'Gurkan Guroglu', 'Eskisehir', 'M', '29.09.2013', 1);
insert into employee values (12, 'Koray Dut', 'Eskisehir', 'M', '15.03.2009', 1);
insert into employee values (13, 'Ismail Ozel', 'Eskisehir', 'M', '16.09.2011', 2);
insert into employee values (14, 'Ismail Ozer', 'Eskisehir', 'M', '27.04.2009', 2);
insert into employee values (15, 'Eser Kalmaz', 'Eskisehir', 'M', '09.06.2009', 2);
insert into employee values (16, 'Engin Kurt', 'Eskisehir', 'M', '03.05.2009', 2);
insert into employee values (17, 'Ergin Kolcu', 'Eskisehir', 'M', '09.08.2009', 2);
insert into employee values (18, 'Kemal Kirat', 'Eskisehir', 'M', '19.05.2009', 2);
insert into employee values (19, 'Mustafa Bebek', 'Eskisehir', 'M', '20.04.2008', 2);
insert into employee values (20, 'Mehmet Fikret', 'Eskisehir', 'M', '30.07.2009', 2);
insert into employee values (21, 'Uygar Fikri', 'Eskisehir', 'M', '28.08.2010', 2);
insert into employee values (22, 'Korhan Gemlik', 'Eskisehir', 'M', '28.02.2011', 2);
insert into employee values (23, 'Lokman Tok', 'Eskisehir', 'M', '29.06.2012', 2);
insert into employee values (24, 'Leman Horasan', 'Eskisehir', 'F', '29.06.2010', 1);
insert into employee values (25, 'Suheyla Server', 'Eskisehir', 'F', '28.02.2010', 1);
insert into employee values (26, 'Ayse Ak', 'Eskisehir', 'F', '29.04.2010', 1);
insert into employee values (27, 'Aysen Mert', 'Eskisehir', 'F', '29.05.2010', 1);
insert into employee values (28, 'Nuray Nurlu', 'Eskisehir', 'F', '29.06.2010', 1);
insert into employee values (29, 'Nurcan Er', 'Eskisehir', 'F', '29.03.2010', 1);
insert into employee values (30, 'Umran Koc', 'Eskisehir', 'F', '29.08.2011', 1);
insert into employee values (31, 'Sehriye Sadi', 'Eskisehir', 'F', '29.09.2011', 1);
insert into employee values (32, 'Sadiye Nur', 'Eskisehir', 'F', '29.01.2015', 1);
insert into employee values (33, 'Zerrin Ok', 'Eskisehir', 'F', '29.07.2015', 1);
insert into employee values (34, 'Rezzan Polat', 'Eskisehir', 'F', '29.08.2015', 1);
insert into employee values (35, 'Ferzan Can', 'Eskisehir', 'F', '29.09.2016', 1);
insert into employee values (36, 'Meral Murat', 'Eskisehir', 'F', '29.04.2016', 1);
insert into employee values (37, 'Gul Gorkem', 'Eskisehir', 'F', '29.03.2016', 1);
insert into employee values (38, 'Gulay Derman', 'Eskisehir', 'F', '29.01.2016', 1);
insert into employee values (39, 'Gulseren Gul', 'Eskisehir', 'F', '29.04.2016', 1);
insert into employee values (40, 'Sariye Sari', 'Eskisehir', 'F', '29.12.2016', 1);
insert into employee values (41, 'Ayse Ar', 'Eskisehir', 'F', '29.11.2011', 1);
insert into employee values (42, 'Remziye Tarif', 'Eskisehir', 'F', '29.10.2011', 1);
insert into employee values (43, 'Methiye Caner', 'Eskisehir', 'F', '29.09.2011', 1);
insert into employee values (44, 'Sinem Eroglu', 'Eskisehir', 'F', '29.03.2011', 1);
insert into employee values (45, 'Fevziye Fer', 'Eskisehir', 'F', '29.02.2011', 1);
insert into employee values (46, 'Nezaket Aroglu', 'Eskisehir', 'F', '29.05.2013', 2);
insert into employee values (47, 'Cevriye Cemil', 'Eskisehir', 'F', '29.04.2013', 2);
insert into employee values (48, 'Fikriye Tutum', 'Eskisehir', 'F', '29.08.2013', 2);
insert into employee values (49, 'Turkan Gercek', 'Eskisehir', 'F', '29.09.2014', 2);
insert into employee values (50, 'Hulya Erdem', 'Eskisehir', 'F', '29.10.2013', 2);
insert into employee values (51, 'Ferya Toraman', 'Eskisehir', 'F', '29.11.2014', 2);
insert into employee values (52, 'Derya Yildirim', 'Eskisehir', 'F', '29.12.2015', 2);
insert into employee values (53, 'Zerrin Kolat', 'Eskisehir', 'F', '29.01.2015', 2);
insert into employee values (54, 'Ilknur Ilkveren', 'Eskisehir', 'F', '29.04.2015', 2);
insert into employee values (55, 'Ulku Gunduz', 'Eskisehir', 'F', '29.07.2010', 2);
insert into employee values (56, 'Derya Yagiz', 'Eskisehir', 'F', '29.06.2008', 2);
insert into employee values (57, 'Ayse Sen', 'Eskisehir', 'F', '29.06.2007', 2);
insert into employee values (58, 'Aysen Deniz', 'Eskisehir', 'F', '29.06.2009', 2);
insert into employee values (59, 'Asli Han', 'Eskisehir', 'F', '29.06.2018', 2);
insert into employee values (60, 'Nuray Yucel', 'Eskisehir', 'F', '29.06.2011', 2);





insert into client values (301, 'Burcu Yilmazel', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (302, 'Serkan Gunal', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (303, 'Yasar Hoscan', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (304, 'Atakan Dogan', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (305, 'Ozgur Ozsen', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (306, 'Ahmet Murat Turk', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (307, 'Gokhan Goksel', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (308, 'Ahmet Arslan', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (309, 'Ahmet Aydin', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (310, 'Mehmet Ozcan', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (311, 'Emin Talip Demirkiran', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (312, 'Zeynep Batmaz', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (313, 'Sevcan Yilmaz Gunduz', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (314, 'Cahit Perkgoz', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (315, 'Cihan Kaleli', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (316, 'Selcan Kaplan Berkaya', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (317, 'Mehmet Koc', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (318, 'Mehmet Kilicarslan', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (319, 'Emre Kacmaz', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (320, 'Muhammet Yasin Pak', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (321, 'Ali Yurekli', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (322, 'Emrah Demir', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (323, 'Tansu Temel', 'Eskisehir', 'M', 'Engineering', 'staff');
insert into client values (324, 'Tugba Turkoglu Kaya', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (325, 'Asli Altiparmak', 'Eskisehir', 'F', 'Engineering', 'staff');
insert into client values (326, 'Ayse Senel', 'Eskisehir', 'F', 'Engineering', 'staff');


update client set client_fac = 'Architecture' where client_id = 1;
update client set client_fac = 'Architecture' where client_id = 2;
update client set client_fac = 'Architecture' where client_id = 3;
update client set client_fac = 'Architecture' where client_id = 4;
update client set client_fac = 'Architecture' where client_id = 5;
update client set client_fac = 'Engineering' where client_id = 6;
update client set client_fac = 'Engineering' where client_id = 7;
update client set client_fac = 'Engineering' where client_id = 8;
update client set client_fac = 'Engineering' where client_id = 9;
update client set client_fac = 'Engineering' where client_id = 10;
update client set client_fac = 'Engineering' where client_id = 11;
update client set client_fac = 'Engineering' where client_id = 12;
update client set client_fac = 'Engineering' where client_id = 13;
update client set client_fac = 'Engineering' where client_id = 14;
update client set client_fac = 'Engineering' where client_id = 15;
update client set client_fac = 'Engineering' where client_id = 16;
update client set client_fac = 'Engineering' where client_id = 17;
update client set client_fac = 'Engineering' where client_id = 18;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 19;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 20;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 21;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 22;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 23;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 24;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 25;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 26;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 27;
update client set client_fac = 'Engineering' where client_id = 28;
update client set client_fac = 'Engineering' where client_id = 29;
update client set client_fac = 'Engineering' where client_id = 30;
update client set client_fac = 'Engineering' where client_id = 31;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 32;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 33;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 34;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 35;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 36;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 37;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 38;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 39;
update client set client_fac = 'Engineering' where client_id = 40;
update client set client_fac = 'Engineering' where client_id = 41;
update client set client_fac = 'Engineering' where client_id = 42;
update client set client_fac = 'Engineering' where client_id = 43;
update client set client_fac = 'Engineering' where client_id = 44;
update client set client_fac = 'Engineering' where client_id = 45;
update client set client_fac = 'Engineering' where client_id = 46;
update client set client_fac = 'Engineering' where client_id = 47;
update client set client_fac = 'Engineering' where client_id = 48;
update client set client_fac = 'Engineering' where client_id = 49;
update client set client_fac = 'Engineering' where client_id = 50;
update client set client_fac = 'Engineering' where client_id = 51;
update client set client_fac = 'Engineering' where client_id = 52;
update client set client_fac = 'Engineering' where client_id = 53;
update client set client_fac = 'Engineering' where client_id = 54;
update client set client_fac = 'Engineering' where client_id = 55;
update client set client_fac = 'Engineering' where client_id = 56;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 57;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 58;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 59;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 60;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 61;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 62;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 63;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 64;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 65;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 66;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 67;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 68;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 69;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 70;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 71;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 72;
update client set client_fac = 'Architecture' where client_id = 73;
update client set client_fac = 'Architecture' where client_id = 74;
update client set client_fac = 'Architecture' where client_id = 75;
update client set client_fac = 'Architecture' where client_id = 76;
update client set client_fac = 'Architecture' where client_id = 77;
update client set client_fac = 'Architecture' where client_id = 78;
update client set client_fac = 'Architecture' where client_id = 79;
update client set client_fac = 'Architecture' where client_id = 80;
update client set client_fac = 'Architecture' where client_id = 81;
update client set client_fac = 'Architecture' where client_id = 82;
update client set client_fac = 'Architecture' where client_id = 83;
update client set client_fac = 'Architecture' where client_id = 84;
update client set client_fac = 'Architecture' where client_id = 85;
update client set client_fac = 'Architecture' where client_id = 86;
update client set client_fac = 'Engineering' where client_id = 87;
update client set client_fac = 'Engineering' where client_id = 88;
update client set client_fac = 'Engineering' where client_id = 89;
update client set client_fac = 'Engineering' where client_id = 90;
update client set client_fac = 'Engineering' where client_id = 91;
update client set client_fac = 'Engineering' where client_id = 92;
update client set client_fac = 'Engineering' where client_id = 93;
update client set client_fac = 'Engineering' where client_id = 94;
update client set client_fac = 'Engineering' where client_id = 95;
update client set client_fac = 'Engineering' where client_id = 96;
update client set client_fac = 'Engineering' where client_id = 97;
update client set client_fac = 'Engineering' where client_id = 98;
update client set client_fac = 'Engineering' where client_id = 99;
update client set client_fac = 'Engineering' where client_id = 100;
update client set client_fac = 'Engineering' where client_id = 101;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 102;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 103;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 104;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 105;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 106;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 107;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 108;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 109;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 110;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 111;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 112;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 113;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 114;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 115;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 116;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 117;
update client set client_fac = 'Architecture' where client_id = 118;
update client set client_fac = 'Architecture' where client_id = 119;
update client set client_fac = 'Architecture' where client_id = 120;
update client set client_fac = 'Architecture' where client_id = 121;
update client set client_fac = 'Architecture' where client_id = 122;
update client set client_fac = 'Architecture' where client_id = 123;
update client set client_fac = 'Architecture' where client_id = 124;
update client set client_fac = 'Architecture' where client_id = 125;
update client set client_fac = 'Architecture' where client_id = 126;
update client set client_fac = 'Architecture' where client_id = 127;
update client set client_fac = 'Architecture' where client_id = 128;
update client set client_fac = 'Architecture' where client_id = 129;
update client set client_fac = 'Architecture' where client_id = 130;
update client set client_fac = 'Architecture' where client_id = 131;
update client set client_fac = 'Engineering' where client_id = 132;
update client set client_fac = 'Engineering' where client_id = 133;
update client set client_fac = 'Engineering' where client_id = 134;
update client set client_fac = 'Engineering' where client_id = 135;
update client set client_fac = 'Engineering' where client_id = 136;
update client set client_fac = 'Engineering' where client_id = 137;
update client set client_fac = 'Engineering' where client_id = 138;
update client set client_fac = 'Engineering' where client_id = 139;
update client set client_fac = 'Engineering' where client_id = 140;
update client set client_fac = 'Engineering' where client_id = 141;
update client set client_fac = 'Engineering' where client_id = 142;
update client set client_fac = 'Engineering' where client_id = 143;
update client set client_fac = 'Engineering' where client_id = 144;
update client set client_fac = 'Engineering' where client_id = 145;
update client set client_fac = 'Engineering' where client_id = 146;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 147;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 148;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 149;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 150;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 151;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 152;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 153;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 154;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 155;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 156;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 157;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 158;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 159;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 160;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 161;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 162;
update client set client_fac = 'Architecture' where client_id = 163;
update client set client_fac = 'Architecture' where client_id = 164;
update client set client_fac = 'Architecture' where client_id = 165;
update client set client_fac = 'Architecture' where client_id = 166;
update client set client_fac = 'Architecture' where client_id = 167;
update client set client_fac = 'Architecture' where client_id = 168;
update client set client_fac = 'Architecture' where client_id = 169;
update client set client_fac = 'Architecture' where client_id = 170;
update client set client_fac = 'Architecture' where client_id = 171;
update client set client_fac = 'Architecture' where client_id = 172;
update client set client_fac = 'Architecture' where client_id = 173;
update client set client_fac = 'Architecture' where client_id = 174;
update client set client_fac = 'Architecture' where client_id = 175;
update client set client_fac = 'Architecture' where client_id = 176;
update client set client_fac = 'Engineering' where client_id = 177;
update client set client_fac = 'Engineering' where client_id = 178;
update client set client_fac = 'Engineering' where client_id = 179;
update client set client_fac = 'Engineering' where client_id = 180;
update client set client_fac = 'Engineering' where client_id = 181;
update client set client_fac = 'Engineering' where client_id = 182;
update client set client_fac = 'Engineering' where client_id = 183;
update client set client_fac = 'Engineering' where client_id = 184;
update client set client_fac = 'Engineering' where client_id = 185;
update client set client_fac = 'Engineering' where client_id = 186;
update client set client_fac = 'Engineering' where client_id = 187;
update client set client_fac = 'Engineering' where client_id = 188;
update client set client_fac = 'Engineering' where client_id = 189;
update client set client_fac = 'Engineering' where client_id = 190;
update client set client_fac = 'Engineering' where client_id = 191;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 192;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 193;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 194;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 195;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 196;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 197;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 198;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 199;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 200;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 201;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 202;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 203;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 204;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 205;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 206;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 207;
update client set client_fac = 'Architecture' where client_id = 208;
update client set client_fac = 'Architecture' where client_id = 209;
update client set client_fac = 'Architecture' where client_id = 210;
update client set client_fac = 'Architecture' where client_id = 211;
update client set client_fac = 'Architecture' where client_id = 212;
update client set client_fac = 'Architecture' where client_id = 213;
update client set client_fac = 'Architecture' where client_id = 214;
update client set client_fac = 'Architecture' where client_id = 215;
update client set client_fac = 'Architecture' where client_id = 216;
update client set client_fac = 'Architecture' where client_id = 217;
update client set client_fac = 'Architecture' where client_id = 218;
update client set client_fac = 'Architecture' where client_id = 219;
update client set client_fac = 'Architecture' where client_id = 220;
update client set client_fac = 'Architecture' where client_id = 221;
update client set client_fac = 'Engineering' where client_id = 222;
update client set client_fac = 'Engineering' where client_id = 223;
update client set client_fac = 'Engineering' where client_id = 224;
update client set client_fac = 'Engineering' where client_id = 225;
update client set client_fac = 'Engineering' where client_id = 226;
update client set client_fac = 'Engineering' where client_id = 227;
update client set client_fac = 'Engineering' where client_id = 228;
update client set client_fac = 'Engineering' where client_id = 229;
update client set client_fac = 'Engineering' where client_id = 230;
update client set client_fac = 'Engineering' where client_id = 231;
update client set client_fac = 'Engineering' where client_id = 232;
update client set client_fac = 'Engineering' where client_id = 233;
update client set client_fac = 'Engineering' where client_id = 234;
update client set client_fac = 'Engineering' where client_id = 235;
update client set client_fac = 'Engineering' where client_id = 236;
update client set client_fac = 'Engineering' where client_id = 237;
update client set client_fac = 'Engineering' where client_id = 238;
update client set client_fac = 'Engineering' where client_id = 239;
update client set client_fac = 'Engineering' where client_id = 240;
update client set client_fac = 'Engineering' where client_id = 241;
update client set client_fac = 'Engineering' where client_id = 242;
update client set client_fac = 'Engineering' where client_id = 243;
update client set client_fac = 'Engineering' where client_id = 244;
update client set client_fac = 'Engineering' where client_id = 245;
update client set client_fac = 'Engineering' where client_id = 246;
update client set client_fac = 'Engineering' where client_id = 247;
update client set client_fac = 'Engineering' where client_id = 248;
update client set client_fac = 'Engineering' where client_id = 249;
update client set client_fac = 'Engineering' where client_id = 250;
update client set client_fac = 'Engineering' where client_id = 251;
update client set client_fac = 'Engineering' where client_id = 252;
update client set client_fac = 'Engineering' where client_id = 253;
update client set client_fac = 'Engineering' where client_id = 254;
update client set client_fac = 'Engineering' where client_id = 255;
update client set client_fac = 'Engineering' where client_id = 256;
update client set client_fac = 'Engineering' where client_id = 257;
update client set client_fac = 'Engineering' where client_id = 258;
update client set client_fac = 'Engineering' where client_id = 259;
update client set client_fac = 'Engineering' where client_id = 260;
update client set client_fac = 'Engineering' where client_id = 261;
update client set client_fac = 'Engineering' where client_id = 262;
update client set client_fac = 'Engineering' where client_id = 263;
update client set client_fac = 'Engineering' where client_id = 264;
update client set client_fac = 'Engineering' where client_id = 265;
update client set client_fac = 'Engineering' where client_id = 266;
update client set client_fac = 'Engineering' where client_id = 267;
update client set client_fac = 'Engineering' where client_id = 268;
update client set client_fac = 'Engineering' where client_id = 269;
update client set client_fac = 'Engineering' where client_id = 270;
update client set client_fac = 'Engineering' where client_id = 271;
update client set client_fac = 'Engineering' where client_id = 272;
update client set client_fac = 'Engineering' where client_id = 273;
update client set client_fac = 'Engineering' where client_id = 274;
update client set client_fac = 'Engineering' where client_id = 275;
update client set client_fac = 'Engineering' where client_id = 276;
update client set client_fac = 'Engineering' where client_id = 277;
update client set client_fac = 'Engineering' where client_id = 278;
update client set client_fac = 'Engineering' where client_id = 279;
update client set client_fac = 'Engineering' where client_id = 280;
update client set client_fac = 'Engineering' where client_id = 281;
update client set client_fac = 'Engineering' where client_id = 282;
update client set client_fac = 'Engineering' where client_id = 283;
update client set client_fac = 'Engineering' where client_id = 284;
update client set client_fac = 'Engineering' where client_id = 285;
update client set client_fac = 'Aviation & Space Sciences' where client_id = 286;
update client set client_fac = 'Architecture' where client_id = 287;
update client set client_fac = 'Architecture' where client_id = 288;
update client set client_fac = 'Architecture' where client_id = 289;
update client set client_fac = 'Architecture' where client_id = 290;
update client set client_fac = 'Architecture' where client_id = 291;
update client set client_fac = 'Architecture' where client_id = 292;
update client set client_fac = 'Architecture' where client_id = 293;
update client set client_fac = 'Architecture' where client_id = 294;
update client set client_fac = 'Architecture' where client_id = 295;
update client set client_fac = 'Architecture' where client_id = 296;
update client set client_fac = 'Architecture' where client_id = 297;
update client set client_fac = 'Architecture' where client_id = 298;
update client set client_fac = 'Architecture' where client_id = 299;
update client set client_fac = 'Architecture' where client_id = 300;

select*from client;


ALTER TABLE `rsys`.`student` 
ADD COLUMN `client_fac` VARCHAR(45) NOT NULL AFTER `client_gender`,
ADD COLUMN `client_type` VARCHAR(45) NOT NULL AFTER `client_fac`,
CHANGE COLUMN `sid` `client_id` INT NOT NULL ,
CHANGE COLUMN `sname` `client_name` VARCHAR(45) NOT NULL ,
CHANGE COLUMN `saddress` `client_address` VARCHAR(45) NOT NULL ,
CHANGE COLUMN `sgender` `client_gender` CHAR(1) NOT NULL , RENAME TO  `rsys`.`client` ;


insert into reservatesfor values ('07.03.2021', 'online');
insert into reservatesfor values ('07.03.2021', 'counter');
insert into reservatesfor values ('06.05.2021', 'online');
insert into reservatesfor values ('06.05.2021', 'counter');
insert into reservatesfor values ('15.11.2021', 'online');
insert into reservatesfor values ('15.11.2021', 'counter');
insert into reservatesfor values ('31.12.2021', 'online');
insert into reservatesfor values ('31.12.2021', 'counter');
insert into reservatesfor values ('28.02.2021', 'online');
insert into reservatesfor values ('28.02.2021', 'counter');
insert into reservatesfor values ('01.04.2021', 'online');
insert into reservatesfor values ('01.04.2021', 'counter');
insert into reservatesfor values ('08.06.2021', 'online');
insert into reservatesfor values ('08.06.2021', 'counter');
insert into reservatesfor values ('20.01.2021', 'online');
insert into reservatesfor values ('20.01.2021', 'counter');

insert into paysfor values ('08.03.2021', 'card');
insert into paysfor values ('08.03.2021', 'cash');
insert into paysfor values ('08.05.2021', 'card');
insert into paysfor values ('08.05.2021', 'cash');
insert into paysfor values ('17.11.2021', 'card');
insert into paysfor values ('17.11.2021', 'cash');
insert into paysfor values ('01.01.2021', 'card');
insert into paysfor values ('01.01.2021', 'cash');
insert into paysfor values ('01.03.2021', 'card');
insert into paysfor values ('01.03.2021', 'cash');
insert into paysfor values ('01.04.2021', 'card');
insert into paysfor values ('01.04.2021', 'cash');
insert into paysfor values ('10.06.2021', 'card');
insert into paysfor values ('10.06.2021', 'cash');
insert into paysfor values ('22.01.2021', 'card');
insert into paysfor values ('22.01.2021', 'cash');

create table `rsys`.`paysfor` (
`Pdate` VARCHAR(45) not null,
`pay_meth` VARCHAR(45) not null);

create table `rsys`.`reservatesfor`(
`Rdate` varchar(45) not null,
`res_meth` varchar (45) not null);


ALTER TABLE `rsys`.`student` 
ADD COLUMN `Rdate` VARCHAR(45) NOT NULL AFTER `sgender`,
ADD COLUMN `Pdate` VARCHAR(45) NOT NULL AFTER `Rdate`,
ADD COLUMN `res_meth` VARCHAR(45) NOT NULL AFTER `Pdate`,
ADD COLUMN `pay_meth` VARCHAR(45) NOT NULL AFTER `res_meth`;


insert into staff values (110, 'Haluk Bicer', 'Eskisehir', 'M');

insert into student values (201, 'Suheyla Damlar', 'Ankara', 'F');
insert into student values (202, 'Damla Kaptan', 'Eskisehir', 'F');
insert into student values (203, 'Yagmur Reis', 'Eskisehir', 'F');
insert into student values (204, 'Yasemin Salas', 'Eskisehir', 'F');
insert into student values (205, 'Melis Mektup', 'Eskisehir', 'F');
insert into student values (206, 'Leyla Dalar', 'Ankara', 'F');
insert into student values (207, 'Hulya Salat', 'Eskisehir', 'F');
insert into student values (208, 'Vural Gural', 'Ankara', 'M');
insert into student values (209, 'Baris Banker', 'Eskisehir', 'M');
insert into student values (210, 'Can Kutalmis', 'Ankara', 'M');
insert into student values (211, 'Burak Degirmencioglu', 'Eskisehir', 'M');
insert into student values (212, 'Berat Berkay Ata', 'Eskisehir', 'M');
insert into student values (213, 'Gokhan Kol', 'Eskisehir', 'M');
insert into student values (214, 'Alper Ak', 'Eskisehir', 'M');
insert into student values (215, 'Gorkem Erdem', 'Eskisehir', 'M');
insert into student values (216, 'Gorkem Ceyhan', 'Eskisehir', 'M');
insert into student values (217, 'Mehmet Ceyhan', 'Eskisehir', 'M');
insert into student values (218, 'Ferhat Ceylan', 'Eskisehir', 'M');

insert into student values (219, 'Ceren Kirik', 'Eskisehir', 'F');
insert into student values (220, 'Ceren Ali', 'Eskisehir', 'F');
insert into student values (221, 'Gokcen Yurt', 'Eskisehir', 'F');
insert into student values (222, 'Goksel Bor', 'Eskisehir', 'F');
insert into student values (223, 'Ayla Ay', 'Eskisehir', 'F');
insert into student values (224, 'Aysel Haktan', 'Eskisehir', 'F');
insert into student values (225, 'Cennet Gursoy', 'Eskisehir', 'F');
insert into student values (226, 'Melisa Guney', 'Eskisehir', 'F');
insert into student values (227, 'Yaren Kara', 'Eskisehir', 'F');
insert into student values (228, 'Sena Sefa', 'Eskisehir', 'F');
insert into student values (229, 'Aslihan As', 'Eskisehir', 'F');
insert into student values (230, 'Bilge Guven', 'Eskisehir', 'F');
insert into student values (231, 'Derin Denge', 'Eskisehir', 'F');
insert into student values (246, 'Isil Dalga', 'Eskisehir', 'F');
insert into student values (247, 'Ilgaz Cemal', 'Eskisehir', 'F');
insert into student values (248, 'Tuana Tunc', 'Eskisehir', 'F');

insert into student values (232, 'Furkan Gul', 'Eskisehir', 'M');
insert into student values (233, 'Furkan Gencoglu', 'Eskisehir', 'M');
insert into student values (234, 'Olgu Deniz', 'Eskisehir', 'M');
insert into student values (235, 'Salih Cam', 'Eskisehir', 'M');
insert into student values (236, 'Polat Vural', 'Eskisehir', 'M');
insert into student values (237, 'Tunc Tokmak', 'Eskisehir', 'M');
insert into student values (238, 'Demir Yaman', 'Eskisehir', 'M');
insert into student values (239, 'Fikret Yilmaz', 'Eskisehir', 'M');
insert into student values (240, 'Atilla Yilmaz', 'Eskisehir', 'M');
insert into student values (241, 'Erkut Dogan', 'Eskisehir', 'M');
insert into student values (242, 'Erman Onay', 'Eskisehir', 'M');
insert into student values (243, 'Resul Kuyucu', 'Eskisehir', 'M');
insert into student values (244, 'Ediz Ruzgar Kuyucu', 'Eskisehir', 'M');
insert into student values (245, 'Eymen Reha Kuyucu', 'Eskisehir', 'M');
insert into student values (249, 'Kivanc Anlar', 'Eskisehir', 'M');
insert into student values (250, 'Yilmaz Guven', 'Eskisehir', 'M');

insert into student values (251, 'Yigit Er', 'Eskisehir', 'M');
insert into student values (252, 'Yildirim Ertan', 'Eskisehir', 'M');
insert into student values (253, 'Demir Dumanci', 'Eskisehir', 'M');
insert into student values (254, 'Batuhan Bay', 'Eskisehir', 'M');
insert into student values (255, 'Batuhan Kan', 'Eskisehir', 'M');
insert into student values (256, 'Berkhan Ten', 'Eskisehir', 'M');
insert into student values (257, 'Furkan Serhat', 'Eskisehir', 'M');
insert into student values (258, 'Dogan Sahin', 'Eskisehir', 'M');
insert into student values (259, 'Bogachan Dogru', 'Eskisehir', 'M');
insert into student values (260, 'Bugrahan Can', 'Eskisehir', 'M');
insert into student values (261, 'Hakan Dik', 'Eskisehir', 'M');
insert into student values (262, 'Hikmet Sag', 'Eskisehir', 'M');
insert into student values (263, 'Yekta Dalga', 'Eskisehir', 'M');
insert into student values (264, 'Kemal Soy', 'Eskisehir', 'M');
insert into student values (265, 'Kerem Leylak', 'Eskisehir', 'M');
insert into student values (266, 'Ferit Damat', 'Eskisehir', 'M');
insert into student values (267, 'Cahit Can Golge', 'Eskisehir', 'M');
insert into student values (268, 'Kaan Kalip', 'Eskisehir', 'M');
insert into student values (269, 'Kagan Soydan', 'Eskisehir', 'M');
insert into student values (270, 'Koray Sol', 'Eskisehir', 'M');
insert into student values (271, 'Polat Bektas', 'Eskisehir', 'M');
insert into student values (272, 'Kenan Varlik', 'Eskisehir', 'M');
insert into student values (273, 'Aziz Guclu', 'Eskisehir', 'M');
insert into student values (274, 'Muhammet Oncu', 'Eskisehir', 'M');
insert into student values (275, 'Omer Emre', 'Eskisehir', 'M');

insert into student values (276, 'Alaz Kacar', 'Eskisehir', 'F');
insert into student values (277, 'Gamze Bayar', 'Eskisehir', 'F');
insert into student values (278, 'Gamze Coskun', 'Eskisehir', 'F');
insert into student values (279, 'Feriha Cagli', 'Adana', 'F');
insert into student values (280, 'Ajda Can', 'Eskisehir', 'F');
insert into student values (281, 'Sezen Firat', 'Izmir', 'F');
insert into student values (282, 'Zeynep Unal', 'Eskisehir', 'F');
insert into student values (283, 'Umay Polat', 'Adana', 'F');
insert into student values (284, 'Kadriye Kadir', 'Izmir', 'F');
insert into student values (285, 'Gulsen Guloglu', 'Eskisehir', 'F');
insert into student values (286, 'Eda Keser', 'Eskisehir', 'F');
insert into student values (287, 'Ece Uncu', 'Izmir', 'F');
insert into student values (288, 'Ecenur Okcu', 'Eskisehir', 'F');
insert into student values (289, 'Senanur Kumar', 'Eskisehir', 'F');
insert into student values (290, 'Ebru Kolat', 'Eskisehir', 'F');
insert into student values (291, 'Melis Bolat', 'Ankara', 'F');
insert into student values (292, 'Gonul Goz', 'Eskisehir', 'F');
insert into student values (293, 'Nil Nehir', 'Izmit', 'F');
insert into student values (294, 'Emine Emin', 'Eskisehir', 'F');
insert into student values (295, 'Ovgu Akbas', 'Ankara', 'F');
insert into student values (296, 'Yaren Gulec', 'Eskisehir', 'F');
insert into student values (297, 'Elvan Aksoy', 'Eskisehir', 'F');
insert into student values (298, 'Ozlem Dogrusoz', 'Kutahya', 'F');
insert into student values (299, 'Ozlem Oze', 'Eskisehir', 'F');
insert into student values (300, 'Ozlem Guzel', 'Kirikkale', 'F');


set sql_safe_updates = 0;

insert into company values (1, 'Eskisehir Yemek Ltd. Sti.');
insert into company values (2, 'Yunus Emre Yemek Ltd. Sti.');

insert into meal values ('vegeterian', 3);
insert into meal values ('normal', 4);

update student set sname = 'Deniz Korez'  where sid = 98;
update student set sname = 'Danyal Duru' where sid = 99;
update student set sname = ' Ferya Cam' where sid= 100;
update student set sgender = 'M' where sid= 200;
update staff set staddress = 'Eskisehir' where stid = 89;

update student set Rdate = '15.01.2021' where saddress = 'Eskisehir';
update student set Rdate = '10.03.2021' where saddress = 'Ankara';
update student set Rdate = '01.04.2021' where saddress = 'Kirikkale';
update student set Rdate = '08.06.2021' where saddress = 'Antalya';
update student set Rdate = '06.05.2021' where saddress = 'Adana';
update student set Rdate = '12.03.2021' where saddress = 'Kutahya';
update student set Rdate = '23.04.2021' where saddress = 'Izmir'; 
update student set Rdate = '19.01.2021' where saddress = 'Izmit';
update student set Rdate = '30.12.2021' where saddress = 'Kocaeli';
update student set Rdate = '28.11.2021' where saddress = 'Tokat';
update student set Rdate = '17.10.2021' where saddress = 'Istanbul';
update student set Rdate = '04.10.2021' where saddress = 'Manisa';
update student set Rdate = '31.12.2021' where saddress = 'Nigde';
update student set Rdate = '16.02.2021' where saddress = 'Sakarya';
update student set Rdate = '27.03.2021' where saddress = 'Kirklareli';

update student set Pdate = '16.01.2021' where saddress = 'Eskisehir';
update student set Pdate = '11.03.2021' where saddress = 'Ankara';
update student set Pdate = '03.04.2021' where saddress = 'Kirikkale';
update student set Pdate = '09.06.2021' where saddress = 'Antalya';
update student set Pdate = '07.05.2021' where saddress = 'Adana';
update student set Pdate = '14.03.2021' where saddress = 'Kutahya';
update student set Pdate = '25.04.2021' where saddress = 'Izmir'; 
update student set Pdate = '21.01.2021' where saddress = 'Izmit';
update student set Pdate = '31.12.2021' where saddress = 'Kocaeli';
update student set Pdate = '29.11.2021' where saddress = 'Tokat';
update student set Pdate = '18.10.2021' where saddress = 'Istanbul';
update student set Pdate = '05.10.2021' where saddress = 'Manisa';
update student set Pdate = '02.01.2021' where saddress = 'Nigde';
update student set Pdate = '18.02.2021' where saddress = 'Sakarya';
update student set Pdate = '29.03.2021' where saddress = 'Kirklareli';

select * from student;

update student set res_meth = 'online' where saddress = 'Eskisehir';
update student set res_meth  = 'counter' where saddress = 'Ankara';
update student set res_meth  = 'online' where saddress = 'Kirikkale';
update student set res_meth  = 'online' where saddress = 'Antalya';
update student set res_meth  = 'counter' where saddress = 'Adana';
update student set res_meth  = 'online' where saddress = 'Kutahya';
update student set res_meth  = 'online' where saddress = 'Izmir'; 
update student set res_meth  = 'counter' where saddress = 'Izmit';
update student set res_meth  = 'online' where saddress = 'Kocaeli';
update student set res_meth  = 'online' where saddress = 'Tokat';
update student set res_meth  = 'online' where saddress = 'Istanbul';
update student set res_meth  = 'online' where saddress = 'Manisa';
update student set res_meth  = 'counter' where saddress = 'Nigde';
update student set res_meth  = 'online' where saddress = 'Sakarya';
update student set res_meth  = 'online' where saddress = 'Kirklareli';

set sql_safe_updates = 0;

update client set client_type = 'student' where client_address = 'Eskisehir';
update client set client_type = 'student' where client_address = 'Ankara';
update client set client_type  = 'student' where client_address = 'Kirikkale';
update client set client_type  = 'student' where client_address = 'Antalya';
update client set client_type  = 'student' where client_address = 'Adana';
update client set client_type  = 'student' where client_address = 'Kutahya';
update client set client_type  = 'student' where client_address = 'Izmir'; 
update client set client_type  = 'staff' where client_address = 'Izmit';
update client set client_type  = 'student' where client_address = 'Kocaeli';
update client set client_type  = 'student' where client_address = 'Tokat';
update client set client_type  = 'student' where client_address = 'Istanbul';
update client set client_type  = 'student' where client_address = 'Manisa';
update client set client_type  = 'student' where client_address = 'Nigde';
update client set client_type  = 'student' where client_address = 'Sakarya';
update client set client_type  = 'staff' where client_address = 'Kirklareli';

select * from client;

ALTER TABLE `rsys`.`staff` 
ADD COLUMN `Rdate` VARCHAR(45) NOT NULL AFTER `stgender`,
ADD COLUMN `Pdate` VARCHAR(45) NOT NULL AFTER `Rdate`,
ADD COLUMN `pay_meth` VARCHAR(45) NOT NULL AFTER `Pdate`,
ADD COLUMN `res_meth` VARCHAR(45) NOT NULL AFTER `pay_meth`,
CHANGE COLUMN `stname` `stname` VARCHAR(45) NOT NULL ,
CHANGE COLUMN `staddress` `staddress` VARCHAR(45) NOT NULL ,
CHANGE COLUMN `stgender` `stgender` CHAR(1) NOT NULL ;

select *from staff;

update staff set Rdate = '18.01.2021' where stgender = 'F';
update staff set Rdate = '26.03.2021' where stgender = 'M';

update staff set Pdate = '20.01.2021' where stgender = 'F';
update staff set Pdate = '27.03.2021' where stgender = 'M';

update staff set res_meth = 'online' where stgender = 'F';
update staff set res_meth = 'counter' where stgender = 'M';

update staff set res_meth = 'online' where stid = 60;
update staff set res_meth = 'online' where stid = 65;
update staff set res_meth = 'online' where stid = 68;
update staff set res_meth = 'online' where stid = 102;
update staff set res_meth = 'online' where stid = 105;
update staff set res_meth = 'online' where stid = 97;
update staff set res_meth = 'online' where stid = 67;
update staff set res_meth = 'online' where stid = 103;

update staff set pay_meth = 'cash' where stgender = 'F';
update staff set pay_meth = 'card' where stgender = 'M';

select * from staff;

update staff set pay_meth = 'cash' where stid = 60;
update staff set pay_meth = 'cash' where stid = 65;
update staff set pay_meth = 'cash' where stid = 68;
update staff set pay_meth = 'cash' where stid = 102;
update staff set pay_meth = 'cash' where stid = 105;
update staff set pay_meth = 'cash' where stid = 97;
update staff set pay_meth = 'cash' where stid = 67;
update staff set pay_meth = 'cash' where stid = 103;
update staff set pay_meth = 'cash' where stid = 8;
update staff set pay_meth = 'cash' where stid = 10;
update staff set pay_meth = 'cash' where stid = 15;
update staff set pay_meth = 'cash' where stid = 110;
update staff set pay_meth = 'cash' where stid = 40;
update staff set pay_meth = 'cash' where stid = 45;
update staff set pay_meth = 'cash' where stid = 48;
update staff set pay_meth = 'cash' where stid = 41;

