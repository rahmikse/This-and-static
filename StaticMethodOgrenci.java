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
		//// Private yapt���m�z s�n�f de�i�kenimize Static method ile  bir nesne olu�turmadan eri�iyoruz.
		return ogrenciSayisi;
	}
}

