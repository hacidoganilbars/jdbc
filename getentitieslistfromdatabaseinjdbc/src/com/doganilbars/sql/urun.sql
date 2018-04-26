CREATE TABLE 'urun' (
'id' int (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
'isim' varchar(250) COLLATE utf8_unicode_ci NOT NULL,
'fiyat' decimal(10,1) NOT NULL,
'miktar' int(11) NOT NULL,
'aciklama' text COLLATE utf8_unicode_ci NOT NULL,
'ozellik' tinyint(1) NOT NULL,
'dateCreated' date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO 'urun' ('isim','fiyat','miktar','aciklama','özellik','dateCreated') VALUES
('laptop 1','2.0',5,'Description of laptop 1',1,'2018-03-19'),
('laptop 2','12.0',7,'Description of laptop 2',0,'2018-03-21'),
('computer 1','4.0',6,'Description of computer 1',1,'2018-03-23'),
('computer 2','10.0',6,'Description of computer 2',1,'2018-03-14'),
('computer 3','21.0',4,'Description of computer 3',0,'2018-03-26'),
('tivi 1','17.0',2,'Description of tivi 1',1,'2018-03-23'),
('tivi 2','32.0',8,'Description of tivi 2',0,'2018-03-29'),