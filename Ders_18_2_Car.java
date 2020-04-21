package com.YouTubeDers;

public class Ders_18_2_Car {
	private String color; // public kulland���m�z i�in bu �zelliklere her class dan ula�abiliriz. Public
							// =>ula��labilir
							// Private => �zel
	private String model;
	private  double engine;
	private int doors;

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) { // Araba kap� kap� say�m�z sadece 4 veya 2 olabilir diye bir ko�ul belirledik.
			this.doors = doors; // araba kap� say�m�z ko�ula uyarsa girdi�imiz 2 veya 4 de�erine e�it olacak.
		} else { // Araba kap� say�m�z �artlara uymazsa alttaki mesaj� alaca��z.
			System.out.println("Kap� say�s� sadece 2 veya 4 olabilir");

		}

	}

	public String getColor() {
		return this.color;
	}

	public void start() {
		System.out.println("Araba �al��t�...");
	}

	public void stop() {

		System.out.println("Araba durdu...");
	}
}
