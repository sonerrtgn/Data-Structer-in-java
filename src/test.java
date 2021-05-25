package Linkedlistandhash;

public class test {
	public static void main(String[] args) {
		/*
		 * x elamanlý bir dizi her elemaný bir linked list tutacak, linked listler ise kiþisel verileri.
		 * verilerin kullanýcý adlarý ve adlarýna göre bir hash fonksiyonu uygulanýp indis sayýsý hesaplanacak.
		 * Linked list  olarak kullanýlmasý çakýþan verilerin yinede eklenebilmesini saðlayacak.
		 * Ýçeride 1milyon veride olsa O(n) sürede arama iþlemi gerçekleþecek.
		 * 
		 */
		
		hash benim_hash = new hash();
		benim_hash.ÝnsertHash("sono", "soner", "tugan","deneme123", 20);
		benim_hash.ÝnsertHash("asd", "mehmet", "kim","deneme123", 20);
		benim_hash.ÝnsertHash("asdd", "irem", "kima","deneme123", 20);
		benim_hash.ÝnsertHash("dsaf", "irfan", "kimb","deneme123", 20);
		benim_hash.ÝnsertHash("fsad", "demir", "kimc","deneme123", 20);
		benim_hash.ÝnsertHash("asd123", "murat", "kimd","deneme123", 20);
		benim_hash.ÝnsertHash("qweq", "demircan", "kimf","deneme123", 20);

		benim_hash.giris_yap("sono", "soner123");
		benim_hash.giris_yap("sono", "deneme123");

		benim_hash.print_hash();
		
		print_iki_boyutlu_dizi(benim_hash.cakisma_varmi());

		
	}
	
	public static void print_iki_boyutlu_dizi(int[][] dizi) {
		int count = 0;
		int uzunluk = dizi.length;
		while(count < uzunluk ) {
			System.out.print(dizi[count][0]+ ".sýrada "+dizi[count][1]+" adet çakýþma vardýr.\n");
			count++;
		}
		
	}

}
