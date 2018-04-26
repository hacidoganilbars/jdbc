package com.doganilbars.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Urun {
	private int id;

	private String isim;

	private int miktar;

	private BigDecimal fiyat;

	private boolean ozellik;

	private Date imalatTarihi;

	private String aciklama;

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

	public int getMiktar() {
		return miktar;
	}

	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}

	public BigDecimal getFiyat() {
		return fiyat;
	}

	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
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

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}
