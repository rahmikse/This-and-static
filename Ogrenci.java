package sunum;

public class Ogrenci {
	private String isim; 	// Nesne De�i�keni
	private int yas;	// Nesne De�i�keni
	private String ogrenciNo;	// Nesne De�i�keni
	public static int ogrenciSayisi = 0;	// S�n�f De�i�keni

	public Ogrenci(String isim, int yas, String ogrenciNo) {
		this.isim = isim;
		this.yas = yas;
		this.ogrenciNo = ogrenciNo;

		 ogrenciSayisi++; // Her nesne �retildi�inde art�� g�sterecek
		System.out.println(ogrenciSayisi + ". ��renci " + isim + " Ya� " + yas + " Numara " + ogrenciNo);
}

	public static int getOgrenciSayisi() {
		return ogrenciSayisi;
	}
}