package sunum;

public class OgrenciMain {

	public static void main(String[] args) {
		System.out.println("Baþlangýçta ögrenci sayýsý: " + Ogrenci.ogrenciSayisi);
		
		// iki tane ogrenci nesnesi olusturuyoruz
		Ogrenci ogrenci1 = new Ogrenci("Rahmi Köse", 21, "0001");
		Ogrenci ogrenci2 = new Ogrenci("Ahmet Köse", 21, "0002");
	
		int ogrSayi = Ogrenci.ogrenciSayisi;
		System.out.println("Ögrenci sayýsý (Sinif uzerinden): " + ogrSayi);

		ogrSayi = ogrenci1.ogrenciSayisi;
		System.out.println("Ögrenci sayýsý(Ilk nesne uzerinden): " + ogrSayi);

		ogrSayi = ogrenci2.ogrenciSayisi;
		System.out.println("Ögrenci sayýsý (Ikinci nesne uzerinden): " + ogrSayi);
	}

}
