package Linkedlistandhash;

public class node {
	private String k_adi;
	private String adi;
	private String soy_adi;
	private String sifre;
	private int yas;
	private node ileri;
	
	public node(String k_adi,String adi,String soy_adi,String sifre,int yas) {
		this.k_adi = k_adi;
		this.adi = adi;
		this.soy_adi = soy_adi;
		this.yas = yas;
		this.sifre = sifre;
		this.ileri = null;
	}
	public String GetK_adi() {
		return this.k_adi;
	}
	public String GetAdi() {
		return this.adi;
	}
	public String GetSoy_adi() {
		return this.soy_adi;
	}
	public int GetYas() {
		return this.yas;
	}
	public String GetSifre() {
		return this.sifre;
	}
	public node Get›leri() {
		return this.ileri;
	}
	
	
	public void SetK_adi(String k_adi) {
		this.k_adi = k_adi;
	}
	public void SetAdi(String adi) {
		this.adi = adi;
	}
	public void SetSoy_adi(String soy_adi) {
		this.soy_adi = soy_adi;
	}
	public void SetYas(String sifre) {
		this.sifre = sifre;
	}
	public String SetSifre() {
		return this.sifre;
	}
	public void Set›leri(node ileri) {
		this.ileri = ileri;
	}
}
