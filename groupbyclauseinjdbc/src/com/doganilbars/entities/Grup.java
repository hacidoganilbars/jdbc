package com.doganilbars.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Grup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ureticiFirma;
	private BigDecimal minFiyat;
	private BigDecimal maxFiyat;
	private int sumMiktar;
	private int countUrun;
	private double avgFiyat;

	public String getUreticiFirma() {
		return ureticiFirma;
	}

	public void setUreticiFirma(String ureticiFirma) {
		this.ureticiFirma = ureticiFirma;
	}

	public BigDecimal getMinFiyat() {
		return minFiyat;
	}

	public void setMinFiyat(BigDecimal minFiyat) {
		this.minFiyat = minFiyat;
	}

	public BigDecimal getMaxFiyat() {
		return maxFiyat;
	}

	public void setMaxFiyat(BigDecimal maxFiyat) {
		this.maxFiyat = maxFiyat;
	}

	public int getSumMiktar() {
		return sumMiktar;
	}

	public void setSumMiktar(int sumMiktar) {
		this.sumMiktar = sumMiktar;
	}

	public int getCountUrun() {
		return countUrun;
	}

	public void setCountUrun(int countUrun) {
		this.countUrun = countUrun;
	}

	public double getAvgFiyat() {
		return avgFiyat;
	}

	public void setAvgFiyat(double avgFiyat) {
		this.avgFiyat = avgFiyat;
	}

}
