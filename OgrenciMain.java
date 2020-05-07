package sunum;

public class OgrenciMain {

	public static void main(String[] args) {
		System.out.println("Ba�lang��ta �grenci say�s�: " + Ogrenci.ogrenciSayisi);
		
		// iki tane ogrenci nesnesi olusturuyoruz
		Ogrenci ogrenci1 = new Ogrenci("Rahmi K�se", 21, "0001");
		Ogrenci ogrenci2 = new Ogrenci("Ahmet K�se", 21, "0002");
	
		int ogrSayi = Ogrenci.ogrenciSayisi;
		System.out.println("�grenci say�s� (Sinif uzerinden): " + ogrSayi);

		ogrSayi = ogrenci1.ogrenciSayisi;
		System.out.println("�grenci say�s�(Ilk nesne uzerinden): " + ogrSayi);

		ogrSayi = ogrenci2.ogrenciSayisi;
		System.out.println("�grenci say�s� (Ikinci nesne uzerinden): " + ogrSayi);
	}

}
