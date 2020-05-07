package sunum;

public class Araba1Main {

	public static void main(String[] args) {
		System.out.println("Başlangıçtaki Araba Sayısı : " + Araba1.arabaSayisi);
		Araba1 araba1 = new Araba1("Fiat Linea","Lacivert",2016,1.3);
		Araba1 araba2 = new Araba1("Ford Focus","Gri",2015,1.6);
		
		int arabaSayisi = Araba1.arabaSayisi;
		
		System.out.println("Son Durumda Araba Sayımız : "+arabaSayisi);
	}

}
