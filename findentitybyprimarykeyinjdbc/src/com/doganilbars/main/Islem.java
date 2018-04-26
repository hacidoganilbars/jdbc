package com.doganilbars.main;

import java.text.SimpleDateFormat;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {

	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();
		Urun urun = urunModel.find(2);
		if (urun != null) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("açýklama: " + urun.getAciklama());
			System.out.println("özellik: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
		} else {
			System.out.println("Bu id ye sahip urun bilgisi bulunamadý");
		}

	}

}
