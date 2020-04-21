package sunum;

public class Mainn {

	public static void main(String[] args) {

		System.out.println("Başlangıçtaki araba sayımız  " + Araba.getAraba_sayisi());

		System.out.println("\n");

		Araba a1 = new Araba(2018, "34 UZY 2507", "Fiat Linea ", "Kırmızı", 1.6);
		Araba a2 = new Araba(2016, "34 AKM 4589", "Honda Civic ", "Siyah", 1.6);

		int araba_sayisi;
		
		
		Araba.getAraba_sayisi();

		araba_sayisi = Araba.getAraba_sayisi();
		System.out.println("Araba Sayısı " + araba_sayisi);

	}
	

}
