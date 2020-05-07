package sunum;

public class agGirisi {
 private String IP;
 private int Port;
 
 public agGirisi(String IP,int Port) {
	 
	/* IP=IP;
	 Port=Port;  Eðer bu þekilde atama yaparsak yerel deðiþkenimizi yine yerel deðiþkene atamýþ oluruz. */
	 this(IP,Port,"Windows"); // Aþaðýda oluþturduðumuz 3 parametreli methodu  burda 2 parametreli methodda çaðýrdýk.
	 
	 this.IP=IP;
	 this.Port=Port;  // Bu þekilde this.deðiþken adý ile atama yapýldýðýnda global deðiþkene atama yapýlmýþ olur.
	 

	 }
 public agGirisi(String IP,int Port,String isletimSistemi) {
	 
 }

public agGirisi yeniSinif(String IP) {
	return this; // Ayný sýnýfý referans alarak dönmesini saðladýk.
}

public void Method(String IP) {
	System.out.println("Global IP : " + this.IP + " Yerel IP : " + IP); // Burada this ile global deðiþkeni atadýk
	System.out.println(" Port " + this.Port );
}
}
