package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		UrunModel urunModel = new UrunModel();
		System.out.println("Sum Quantities(toplam ürün miktarý): " + urunModel.sumMiktar());
		System.out.println("Total (toplam urunlerin deðeri): " + urunModel.toplam());
	}

}
