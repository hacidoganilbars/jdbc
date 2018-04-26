CREATE SCHEMA `urunbilgiler` ;

CREATE TABLE `urunbilgiler`.`urun` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `isim` VARCHAR(250) NOT NULL,
  `fiyat` DECIMAL(10,1) NOT NULL,
  `miktar` INT NOT NULL,
  `aciklama` TEXT(250) NOT NULL,
  `ozellikli` TINYINT(1) NOT NULL,
  `imalatTarihi` DATE NOT NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('laptop 1', '2.0', '5', 'laptop 1 açýklamasý', '1', '2018-03-19');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('laptop2', '12.0', '7', 'laptop 2 açýklamasý', '0', '2018-03-21');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masaüstü bilgisayar 1', '4.0', '6', 'masaüstü 1 açýklamasý', '1', '2018-03-23');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masaüstü bilgisayar 2', '10.0', '6', 'masaüstü 2 açýklamasý', '1', '2018-03-14');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('masaüstü bilgisayar 3', '21.0', '4', 'masaüstü 3 açýklamasý', '0', '2018-03-26');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('televizyon 1', '17.0', '2', 'televizyon 1 açýklamasý', '1', '2018-03-23');
INSERT INTO `urunbilgiler1`.`urun` (`isim`, `fiyat`, `miktar`, `aciklama`, `ozellikli`, `imalatTarihi`, `ureticiFirma`) VALUES ('televizyon 2', '32.0', '8', 'televizyon 2 açýklamasý', '0', '2018-03-29');


USE `urunbilgiler1`;
DROP procedure IF EXISTS `findAll`;
USE `urunbilgiler`;
DROP procedure IF EXISTS `findAll`;

DELIMITER $$
USE `urunbilgiler`$$
CREATE PROCEDURE `findAll` ()
BEGIN
SELECT * FROM urun;
END$$

DELIMITER ;
