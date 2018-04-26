package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();

		System.out.println("ismi mas ile ba�layan urun bilgileri");
		System.out.println("==========================================");
		List<Urun> urunler1 = urunModel.startsWith("mas");
		for (Urun urun : urunler1) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("�zellikli: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("==========================================");
		}

		System.out.println("\nismi top 2 ile biten �r�n bilgileri");
		System.out.println("##############################################");
		List<Urun> urunler2 = urunModel.endsWith("top 2");
		for (Urun urun : urunler2) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("�zellikli: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("##############################################");
		}

		System.out.println("\nisminde viz ge�en �r�n bilgileri");
		System.out.println("*************************************************");
		List<Urun> urunler3 = urunModel.contains("viz");
		for (Urun urun : urunler3) {
			System.out.println("id: " + urun.getId());
			System.out.println("isim: " + urun.getIsim());
			System.out.println("fiyat: " + urun.getFiyat());
			System.out.println("miktar: " + urun.getMiktar());
			System.out.println("a��klama: " + urun.getAciklama());
			System.out.println("�zellikli: " + urun.isOzellik());
			System.out.println("imalat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("*************************************************");

		}

	}

}
