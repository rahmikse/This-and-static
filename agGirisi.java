package sunum;

public class agGirisi {
 private String IP;
 private int Port;
 
 public agGirisi(String IP,int Port) {
	 
	/* IP=IP;
	 Port=Port;  E�er bu �ekilde atama yaparsak yerel de�i�kenimizi yine yerel de�i�kene atam�� oluruz. */
	 this(IP,Port,"Windows"); // A�a��da olu�turdu�umuz 3 parametreli methodu  burda 2 parametreli methodda �a��rd�k.
	 
	 this.IP=IP;
	 this.Port=Port;  // Bu �ekilde this.de�i�ken ad� ile atama yap�ld���nda global de�i�kene atama yap�lm�� olur.
	 

	 }
 public agGirisi(String IP,int Port,String isletimSistemi) {
	 
 }

public agGirisi yeniSinif(String IP) {
	return this; // Ayn� s�n�f� referans alarak d�nmesini sa�lad�k.
}

public void Method(String IP) {
	System.out.println("Global IP : " + this.IP + " Yerel IP : " + IP); // Burada this ile global de�i�keni atad�k
	System.out.println(" Port " + this.Port );
}
}
