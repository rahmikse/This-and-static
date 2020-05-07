package sunum;

public class StaticMethodOgrenci {
	private String isim; // Nesne degiskeni
	private int yas; // Nesne degiskeni
	private String ogrenciNo; // Nesne degiskeni
	private static int ogrenciSayisi = 0; // Sinif degiskeni

	public StaticMethodOgrenci(String isim, int yas, String ogrenciNo) {
		this.isim = isim;
		this.yas = yas;
		this.ogrenciNo = ogrenciNo;
		
		// Her nesne yaratildiginda sinif degiskenini artiriyoruz.
		ogrenciSayisi++;
	}

	public static int getOgrenciSayisi() {  
		//// Private yaptýðýmýz sýnýf deðiþkenimize Static method ile  bir nesne oluþturmadan eriþiyoruz.
		return ogrenciSayisi;
	}
}

