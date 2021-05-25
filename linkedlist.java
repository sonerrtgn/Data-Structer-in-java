package Linkedlistandhash;

public class linkedlist {
	private node head;
	private int eleman_sayisi = 0;
	
	
	public linkedlist(String k_adi,String adi,String soy_adi,String sifre,int yas) {
		head = new node(k_adi,adi,soy_adi,sifre,yas);
		eleman_sayisi++;
		
	}
	
	public void insert(String k_adi,String adi,String soy_adi,String sifre,int yas) {
		node head_pointer_tut = head;
		while(head_pointer_tut.GetÝleri() != null){
			head_pointer_tut = head_pointer_tut.GetÝleri();
		}
		head_pointer_tut.SetÝleri(new node(k_adi,adi,soy_adi,sifre,yas));
		eleman_sayisi++;
	}
	public void print_linked() {
		node head_pointer_tut = head;
		System.out.print("[ ==> 0. Elemanýn adý: "+head_pointer_tut.GetAdi()+", soy adý: "+head_pointer_tut.GetSoy_adi());
		int count = 1;
		while(head_pointer_tut.GetÝleri() != null){
			head_pointer_tut = head_pointer_tut.GetÝleri();
			System.out.print(" -> "+count+". Elemanýn adý: "+head_pointer_tut.GetAdi()+", soy adý: "+head_pointer_tut.GetSoy_adi());
			count++;
		}
		System.out.print("  ]");
	}
	
	public boolean listede_sifre_ara(String sifre,String k_adi) {
		node node_bas_tut = head;
		if(node_bas_tut.GetSifre() == sifre && node_bas_tut.GetK_adi() == k_adi) {
			return true;
		}
		while(node_bas_tut.GetÝleri() != null) {
			node_bas_tut = node_bas_tut.GetÝleri();
			if(node_bas_tut.GetSifre() == sifre && node_bas_tut.GetK_adi() == k_adi ) {
				return true;
			}
		}
		
		return false;
	}
	public int GetEleman_sayisi() {
		return eleman_sayisi;
	}
	
	
	
	
	
}














