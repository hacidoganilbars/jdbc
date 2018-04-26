package com.doganilbars.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Urun implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String isim;

	private BigDecimal fiyat;

	private int miktar;

	private String aciklama;

	private boolean ozellik;

	private Date imalatTarihi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public BigDecimal getFiyat() {
		return fiyat;
	}

	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}

	public int getMiktar() {
		return miktar;
	}

	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public boolean isOzellik() {
		return ozellik;
	}

	public void setOzellik(boolean ozellik) {
		this.ozellik = ozellik;
	}

	public Date getImalatTarihi() {
		return imalatTarihi;
	}

	public void setImalatTarihi(Date imalatTarihi) {
		this.imalatTarihi = imalatTarihi;
	}

}
