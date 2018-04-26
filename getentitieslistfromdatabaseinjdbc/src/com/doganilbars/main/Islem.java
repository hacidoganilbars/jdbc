package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {

	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		UrunModel urunModel = new UrunModel();

		List<Urun> urunler = urunModel.findAll();
		for (Urun urun : urunler) {
			System.out.println("�D: " + urun.getId());
			System.out.println("�sim: " + urun.getIsim());
			System.out.println("Fiyat: " + urun.getFiyat());
			System.out.println("Miktar: " + urun.getMiktar());
			System.out.println("A��klama: " + urun.getAciklama());
			System.out.println("�malat Tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
			System.out.println("�zellikli: " + urun.isOzellik());
			System.out.println("==================================");
		}

	}
}
