package sunum;

public class Araba {
	
	int model_yil; // Nesneye ait de�i�ken
	String plaka; // Nesneye ait de�i�ken
	String marka; // Nesneye ait de�i�ken
	String renk; // Nesneye ait de�i�ken
	double motor_hacmi; // Nesneye ait de�i�ken
	static int araba_sayisi = 0; //S�n�fa ait de�i�ken
	Araba (int model_yili,String plaka,String marka,String renk,double motor_hacmi) {
		this.model_yil=model_yili;
		this.plaka=plaka;
		this.renk=renk;
		this.motor_hacmi=motor_hacmi;
		this.marka=marka;
		araba_sayisi++; // Her yarat�lan nesne i�in araba say�s� 1 arts�n diyoruz.
		
		System.out.println(araba_sayisi + " . arac�n model y�l� :" + model_yili);
		System.out.println(araba_sayisi + " . arac�n plakas� :" + plaka);
		System.out.println(araba_sayisi + " . arac�n markas� :" + marka);
		System.out.println(araba_sayisi + " . arac�n rengi :" + renk);
		System.out.println(araba_sayisi + " . arac�n motor hacmi :" + motor_hacmi);
		System.out.println("");




	}
	
	public static int getAraba_sayisi() {
		return araba_sayisi;
	}
}
