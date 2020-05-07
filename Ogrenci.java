package sunum;

public class Ogrenci {
	private String isim; 	// Nesne Deðiþkeni
	private int yas;	// Nesne Deðiþkeni
	private String ogrenciNo;	// Nesne Deðiþkeni
	public static int ogrenciSayisi = 0;	// Sýnýf Deðiþkeni

	public Ogrenci(String isim, int yas, String ogrenciNo) {
		this.isim = isim;
		this.yas = yas;
		this.ogrenciNo = ogrenciNo;

		 ogrenciSayisi++; // Her nesne üretildiðinde artýþ gösterecek
		System.out.println(ogrenciSayisi + ". Öðrenci " + isim + " Yaþ " + yas + " Numara " + ogrenciNo);
}

	public static int getOgrenciSayisi() {
		return ogrenciSayisi;
	}
}