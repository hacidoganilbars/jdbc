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

		System.out.println("Fiyata g�re s�ralama azdan �oka do�ru (asceding)");
		System.out.println("==============================================");
		List<Urun> urunler = urunModel.orderBy(Direction.ASC);
		for (Urun urun : urunler) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("�zellik: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("==============================================");
		}

		System.out.println("\nFiyata g�re s�ralama �oktan aza do�ru (desceding)");
		System.out.println("##########################################################");
		List<Urun> urunler2 = urunModel.orderBy(Direction.DESC);
		for (Urun urun : urunler2) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("�zellik: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("##########################################################");
		}
	}

}
