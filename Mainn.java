package sunum;

public class Mainn {

	public static void main(String[] args) {

		System.out.println("Ba�lang��taki araba say�m�z  " + Araba.getAraba_sayisi());

		System.out.println("\n");

		Araba a1 = new Araba(2018, "34 UZY 2507", "Fiat Linea ", "K�rm�z�", 1.6);
		Araba a2 = new Araba(2016, "34 AKM 4589", "Honda Civic ", "Siyah", 1.6);

		int araba_sayisi;
		
		
		Araba.getAraba_sayisi();

		araba_sayisi = Araba.getAraba_sayisi();
		System.out.println("Araba Say�s� " + araba_sayisi);

	}
	

}
