package com.doganilbars.main;

import com.doganilbars.models.UrunModel;

public class Islem {
	public static void main(String[] args) {
		UrunModel urunModel = new UrunModel();
		boolean result = urunModel.delete(2);
		System.out.println("Result: " + result);
	}

}
