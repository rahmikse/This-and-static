package sunum;

public class Araba1 {
	private String arabaMarka;
	private int  modelY�l;
	private double motorHacmi;
	private String arabaRenk;
	public static int arabaSayisi =0;
	
	public Araba1(String arabaMarka,String arabaRenk,int modelY�l,double motorHacmi) {
		this.arabaMarka=arabaMarka;
		this.arabaRenk=arabaRenk;
		this.modelY�l=modelY�l;
		this.motorHacmi=motorHacmi;
		arabaSayisi++;
		System.out.println(this.arabaSayisi + ".Araban�n Markas� :" +this.arabaMarka +" Araban�n Rengi :" +this.arabaRenk + 
				" Model Y�l� :" + this.modelY�l+	" Araban�n Motor HAcmi :"+this.motorHacmi);
		
	}

}
