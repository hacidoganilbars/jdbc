package com.doganilbars.main;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();
		System.out.println("Call between Method");
		for (Urun urun : urunModel.between(BigDecimal.valueOf(2), BigDecimal.valueOf(10))) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("�zellik: " + urun.isOzellik());
			System.out.println("============================================================");
		}
	}

}