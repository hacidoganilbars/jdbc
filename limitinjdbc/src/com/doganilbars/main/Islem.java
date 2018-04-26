package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();

		System.out.println("2 kayýttan sonra 3 kayýt döndür");
		System.out.println("=========================================");
		List<Urun> urunler = urunModel.limit(2, 3);
		for (Urun urun : urunler) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("özellik: " + urun.isOzellik());
			System.out.println("açýklama: " + urun.getAciklama());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("=========================================");

		}

	}

}
