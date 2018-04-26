package com.doganilbars.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.doganilbars.entities.Urun;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date from = simpleDateFormat.parse("23/03/2018");
			Date to = simpleDateFormat.parse("30/03/2018");
			UrunModel urunModel = new UrunModel();
			List<Urun> urunler = urunModel.findByDate(from, to);
			for (Urun urun : urunler) {
				System.out.println("id: " + urun.getId());
				System.out.println("isim: " + urun.getIsim());
				System.out.println("fiyat: " + urun.getFiyat());
				System.out.println("miktar: " + urun.getMiktar());
				System.out.println("ozellik: " + urun.isOzellik());
				System.out.println("açýklama: " + urun.getAciklama());
				System.out.println("imlat tarihi: " + simpleDateFormat.format(urun.getImalatTarihi()));
				System.out.println("===========================================================");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
