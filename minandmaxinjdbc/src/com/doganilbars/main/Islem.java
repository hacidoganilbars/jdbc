package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {

		UrunModel urunModel = new UrunModel();
		System.out.println("(The biggest price) En y�ksek fiyat: " + urunModel.max());
		System.out.println("(The smallest price) En d���k fiyat: " + urunModel.min());
	}

}
