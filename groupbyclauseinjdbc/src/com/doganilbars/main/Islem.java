package com.doganilbars.main;

import com.doganilbars.entities.Grup;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		UrunModel urunModel = new UrunModel();
		for (Grup grup : urunModel.groupBy()) {
			System.out.println(grup.getUreticiFirma());
			System.out.println("Min Price (En düþük fiyat): " + grup.getMinFiyat());
			System.out.println("Max Price (En yüksek fiyat): " + grup.getMaxFiyat());
			System.out.println("Avg Price (Fiyat ortalamasý): " + grup.getAvgFiyat());
			System.out.println("Count Product (Firmaya ait Ürün sayýsý): " + grup.getCountUrun());
			System.out.println("Sum Quantities (Firmaya ait Ürün miktarý): " + grup.getSumMiktar());
			System.out.println("================================================");
		}
	}

}
