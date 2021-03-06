CREATE SCHEMA `urunbilgiler1` ;

CREATE TABLE `urunbilgiler1`.`urun` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isim` VARCHAR(250) NOT NULL,
  `fiyat` DECIMAL(10,1) NOT NULL,
  `miktar` INT NOT NULL,
  `aciklama` TEXT(250) NOT NULL,
  `ozellikli` TINYINT(1) NOT NULL,
  `imalatTarihi` DATE NOT NULL,
  `ureticiFirma` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('laptop 1', '2.0', '5', 'laptop 1 a��klamas�', '1', '2018-03-19', 'firma 1');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('laptop2', '12.0', '7', 'laptop 2 a��klamas�', '0', '2018-03-21', 'firma 1');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masa�st� bilgisayar 1', '4.0', '6', 'masa�st� 1 a��klamas�', '1', '2018-03-23', 'firma 2');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masa�st� bilgisayar 2', '10.0', '6', 'masa�st� 2 a��klamas�', '1', '2018-03-14', 'firma 2');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masa�st� bilgisayar 3', '21.0', '4', 'masa�st� 3 a��klamas�', '0', '2018-03-26', 'firma 2');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('televizyon 1', '17.0', '2', 'televizyon 1 a��klamas�', '1', '2018-03-23', 'firma 3');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('televizyon 2', '32.0', '8', 'televizyon 2 a��klamas�', '0', '2018-03-29', 'firma 3');


