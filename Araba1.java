package sunum;

public class Araba1 {
	private String arabaMarka;
	private int  modelYýl;
	private double motorHacmi;
	private String arabaRenk;
	public static int arabaSayisi =0;
	
	public Araba1(String arabaMarka,String arabaRenk,int modelYýl,double motorHacmi) {
		this.arabaMarka=arabaMarka;
		this.arabaRenk=arabaRenk;
		this.modelYýl=modelYýl;
		this.motorHacmi=motorHacmi;
		arabaSayisi++;
		System.out.println(this.arabaSayisi + ".Arabanýn Markasý :" +this.arabaMarka +" Arabanýn Rengi :" +this.arabaRenk + 
				" Model Yýlý :" + this.modelYýl+	" Arabanýn Motor HAcmi :"+this.motorHacmi);
		
	}

}
