package com.doganilbars.main;

import com.doganilbars.entities.Grup;
import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		UrunModel urunModel = new UrunModel();
		for (Grup grup : urunModel.groupBy()) {
			System.out.println(grup.getUreticiFirma());
			System.out.println("Min Price (En d���k fiyat): " + grup.getMinFiyat());
			System.out.println("Max Price (En y�ksek fiyat): " + grup.getMaxFiyat());
			System.out.println("Avg Price (Fiyat ortalamas�): " + grup.getAvgFiyat());
			System.out.println("Count Product (Firmaya ait �r�n say�s�): " + grup.getCountUrun());
			System.out.println("Sum Quantities (Firmaya ait �r�n miktar�): " + grup.getSumMiktar());
			System.out.println("================================================");
		}
	}

}
