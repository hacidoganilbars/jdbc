package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;
import com.doganilbars.models.UrunModel.Direction;

public class Islem {
	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();

		System.out.println("Fiyata göre sýralama azdan çoka doðru (asceding)");
		System.out.println("==============================================");
		List<Urun> urunler = urunModel.orderBy(Direction.ASC);
		for (Urun urun : urunler) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("açýklama: " + urun.getAciklama());
			System.out.println("özellik: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("==============================================");
		}

		System.out.println("\nFiyata göre sýralama çoktan aza doðru (desceding)");
		System.out.println("##########################################################");
		List<Urun> urunler2 = urunModel.orderBy(Direction.DESC);
		for (Urun urun : urunler2) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("açýklama: " + urun.getAciklama());
			System.out.println("özellik: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("##########################################################");
		}
	}

}
