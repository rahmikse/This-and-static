package sunum;

public class Araba {
	
	int model_yil; // Nesneye ait deðiþken
	String plaka; // Nesneye ait deðiþken
	String marka; // Nesneye ait deðiþken
	String renk; // Nesneye ait deðiþken
	double motor_hacmi; // Nesneye ait deðiþken
	static int araba_sayisi = 0; //Sýnýfa ait deðiþken
	Araba (int model_yili,String plaka,String marka,String renk,double motor_hacmi) {
		this.model_yil=model_yili;
		this.plaka=plaka;
		this.renk=renk;
		this.motor_hacmi=motor_hacmi;
		this.marka=marka;
		araba_sayisi++; // Her yaratýlan nesne için araba sayýsý 1 artsýn diyoruz.
		
		System.out.println(araba_sayisi + " . aracýn model yýlý :" + model_yili);
		System.out.println(araba_sayisi + " . aracýn plakasý :" + plaka);
		System.out.println(araba_sayisi + " . aracýn markasý :" + marka);
		System.out.println(araba_sayisi + " . aracýn rengi :" + renk);
		System.out.println(araba_sayisi + " . aracýn motor hacmi :" + motor_hacmi);
		System.out.println("");




	}
	
	public static int getAraba_sayisi() {
		return araba_sayisi;
	}
}
