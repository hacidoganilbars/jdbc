package com.doganilbars.main;

import java.math.BigDecimal;
import java.util.Date;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		UrunModel urunModel = new UrunModel();
		Urun urun = new Urun();
		urun.setId(2);
		urun.setIsim("Urun 2");
		urun.setFiyat(BigDecimal.valueOf(10));
		urun.setMiktar(6);
		urun.setAciklama("Ýyi makina");
		urun.setOzellik(true);
		urun.setImalatTarihi(new Date());
		boolean result = urunModel.update(urun);
		System.out.println("Result: " + result);

	}

}
