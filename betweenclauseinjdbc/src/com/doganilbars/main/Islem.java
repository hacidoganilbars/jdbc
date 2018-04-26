package com.doganilbars.main;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();

		List<Urun> urunler = urunModel.between(BigDecimal.valueOf(2), BigDecimal.valueOf(10));
		for (Urun urun : urunler) {
			System.out.println("ÝD: " + urun.getId());
			System.out.println("Ýsim: " + urun.getIsim());
			System.out.println("Fiyat: " + urun.getFiyat());
			System.out.println("Miktar: " + urun.getMiktar());
			System.out.println("Açýklama: " + urun.getAciklama());
			System.out.println("Özellik: " + urun.isOzellik());
			System.out.println("Ýmalat Tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("===========================================");
		}

	}

}
