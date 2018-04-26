package com.doganilbars.main;

import java.math.BigDecimal;
import java.util.Date;

import com.doganilbars.entity.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		UrunModel urunModel = new UrunModel();
		Urun urun = new Urun();
		urun.setIsim("Ürün 4");
		urun.setFiyat(BigDecimal.valueOf(10));
		urun.setMiktar(6);
		urun.setAciklama("Açýklama ürün 4");
		urun.setOzellik(true);
		urun.setImalatTarihi(new Date());
		boolean result = urunModel.create(urun);
		System.out.println("Reult: " + result);

	}

}
