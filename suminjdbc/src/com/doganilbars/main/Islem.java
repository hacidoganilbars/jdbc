package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		UrunModel urunModel = new UrunModel();
		System.out.println("Sum Quantities(toplam �r�n miktar�): " + urunModel.sumMiktar());
		System.out.println("Total (toplam urunlerin de�eri): " + urunModel.toplam());
	}

}
