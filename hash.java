package Linkedlistandhash;

public class hash {
	private linkedlist[] hash_array;
	private int hash_boyut;
	
	public hash() { //bos isteklerde 1000 elemanlı bir linked list oluşturur.
		hash_array = new linkedlist[1000];
		hash_boyut = 1000;

	}
	public hash(int hash_array_boyut){
		hash_array = new linkedlist[hash_array_boyut];
		hash_boyut = hash_array_boyut;
	}
	public void İnsertHash(String k_adi,String adi,String soy_adi,String sifre,int yas) {
		int array_sira = hash_point(k_adi);
		if(hash_array[array_sira] == null) {
			hash_array[array_sira] = new linkedlist(k_adi,adi,soy_adi,sifre,yas);
		}else {
			hash_array[array_sira].insert(k_adi,adi,soy_adi,sifre,yas);
		}
	}
	
	private int hash_point(String k_adi) {
		int count = 0;
		int uzunluk = k_adi.length();
		int point = 0;
		while(count < uzunluk) {
			point += (int) k_adi.charAt(count);
			count++;
		}
		return ((point%hash_boyut)*uzunluk)%hash_boyut;
	}
	public void print_hash() {
		int count = 0;
		while(count < hash_boyut) {
			if(hash_array[count] != null) {
				System.out.print(count+". sırada ");
				hash_array[count].print_linked();
				System.out.print("\n");

			}
			count++;		
		
		}
	}
	public void print_hash_indis(int indis) {
		System.out.print(indis+". sırada ");
		hash_array[indis].print_linked();
		System.out.print("\n");
	}
	
	
	public int kullanici_ara(String k_adi) {
		int sira = hash_point(k_adi);
		if(hash_array[sira] != null) {
			return sira;
		}
		return -1;
	}
	
	public boolean giris_yap(String k_adi,String sifre) {
		int sira = hash_point(k_adi);
		if(hash_array[sira] != null) {
			boolean sonuc =  hash_array[sira].listede_sifre_ara(sifre,k_adi);
			if(sonuc)
				System.out.print("Başarıyla oturum açıldı. \n");
			else
				System.out.print("Oturum açılamadı. \n");

			return sonuc;
		}
		System.out.print("Oturum açılamadı. \n");

		return false;
	}
	public int[][] cakisma_varmi() {
		linked_int cakisma = new linked_int();
		int sira = 0;
		while(sira < hash_boyut) {
			if(hash_array[sira] != null) {
				if(hash_array[sira].GetEleman_sayisi() > 1) {
					cakisma.ekle_linked_int(hash_array[sira].GetEleman_sayisi(),sira);
				}
			}
			sira++;
		}
		
		return cakisma.GetArray();
	}
}
