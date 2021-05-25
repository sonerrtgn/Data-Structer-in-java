package Linkedlistandhash;

public class test {
	public static void main(String[] args) {
		/*
		 * x elamanl� bir dizi her eleman� bir linked list tutacak, linked listler ise ki�isel verileri.
		 * verilerin kullan�c� adlar� ve adlar�na g�re bir hash fonksiyonu uygulan�p indis say�s� hesaplanacak.
		 * Linked list  olarak kullan�lmas� �ak��an verilerin yinede eklenebilmesini sa�layacak.
		 * ��eride 1milyon veride olsa O(n) s�rede arama i�lemi ger�ekle�ecek.
		 * 
		 */
		
		hash benim_hash = new hash();
		benim_hash.�nsertHash("sono", "soner", "tugan","deneme123", 20);
		benim_hash.�nsertHash("asd", "mehmet", "kim","deneme123", 20);
		benim_hash.�nsertHash("asdd", "irem", "kima","deneme123", 20);
		benim_hash.�nsertHash("dsaf", "irfan", "kimb","deneme123", 20);
		benim_hash.�nsertHash("fsad", "demir", "kimc","deneme123", 20);
		benim_hash.�nsertHash("asd123", "murat", "kimd","deneme123", 20);
		benim_hash.�nsertHash("qweq", "demircan", "kimf","deneme123", 20);

		benim_hash.giris_yap("sono", "soner123");
		benim_hash.giris_yap("sono", "deneme123");

		benim_hash.print_hash();
		
		print_iki_boyutlu_dizi(benim_hash.cakisma_varmi());

		
	}
	
	public static void print_iki_boyutlu_dizi(int[][] dizi) {
		int count = 0;
		int uzunluk = dizi.length;
		while(count < uzunluk ) {
			System.out.print(dizi[count][0]+ ".s�rada "+dizi[count][1]+" adet �ak��ma vard�r.\n");
			count++;
		}
		
	}

}
