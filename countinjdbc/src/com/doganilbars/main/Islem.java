package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		UrunModel urunModel = new UrunModel();
		System.out.println("Count Urun (ürün sayýsý): " + urunModel.count());
	}

}
