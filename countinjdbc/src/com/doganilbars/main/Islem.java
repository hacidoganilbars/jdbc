package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		UrunModel urunModel = new UrunModel();
		System.out.println("Count Urun (�r�n say�s�): " + urunModel.count());
	}

}
