package sunum;

public class StaticMethodMian {

	public static void main(String[] args) {
		System.out.println("Baslangicta ogrenci sayisi: " + Ogrenci.getOgrenciSayisi());

		// iki tane ogrenci nesnesi olusturuyoruz
		Ogrenci ogrenci1 = new Ogrenci("Rahmi Köse ", 21, "0001");
		Ogrenci ogrenci2 = new Ogrenci("Ahmet Köse ", 21, "0002");

		int ogrSayi = Ogrenci.getOgrenciSayisi();
		System.out.println("Ogrenci sayisi: " + ogrSayi);
	}
}
	


