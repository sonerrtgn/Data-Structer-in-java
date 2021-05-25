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
		while(head_pointer_tut.Get�leri() != null){
			head_pointer_tut = head_pointer_tut.Get�leri();
		}
		head_pointer_tut.Set�leri(new node(k_adi,adi,soy_adi,sifre,yas));
		eleman_sayisi++;
	}
	public void print_linked() {
		node head_pointer_tut = head;
		System.out.print("[ ==> 0. Eleman�n ad�: "+head_pointer_tut.GetAdi()+", soy ad�: "+head_pointer_tut.GetSoy_adi());
		int count = 1;
		while(head_pointer_tut.Get�leri() != null){
			head_pointer_tut = head_pointer_tut.Get�leri();
			System.out.print(" -> "+count+". Eleman�n ad�: "+head_pointer_tut.GetAdi()+", soy ad�: "+head_pointer_tut.GetSoy_adi());
			count++;
		}
		System.out.print("  ]");
	}
	
	public boolean listede_sifre_ara(String sifre,String k_adi) {
		node node_bas_tut = head;
		if(node_bas_tut.GetSifre() == sifre && node_bas_tut.GetK_adi() == k_adi) {
			return true;
		}
		while(node_bas_tut.Get�leri() != null) {
			node_bas_tut = node_bas_tut.Get�leri();
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














