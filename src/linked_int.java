package Linkedlistandhash;

public class linked_int {
	node_int bas;
	int eleman_sayisi = 0;
	public linked_int(int deger,int sira) {
		bas = new node_int(deger,sira);
		eleman_sayisi++;
	}
	public linked_int() {
		bas = null;
	}
	public void ekle_linked_int(int deger,int sira) {
		if(bas == null) {
			bas = new node_int(deger,sira);
			eleman_sayisi++;
			return ;
		}
		node_int node_int_bas_tut = bas;
		while(node_int_bas_tut.ileri != null) {
			node_int_bas_tut = node_int_bas_tut.ileri;
		}
		node_int_bas_tut.ileri = new node_int(deger,sira);	
		eleman_sayisi++;
	}
	public int[][] GetArray() {
		int[][] array = new int[eleman_sayisi][2];
		node_int node_int_bas_tut = bas;

		for(int i=0;i<eleman_sayisi;i++) {
			array[i][0] = node_int_bas_tut.sira;
			array[i][1] = node_int_bas_tut.deger;

			node_int_bas_tut = node_int_bas_tut.ileri;
		}
		return array;
	}
	

}
