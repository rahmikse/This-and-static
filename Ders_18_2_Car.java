package com.YouTubeDers;

public class Ders_18_2_Car {
	private String color; // public kullandýðýmýz için bu özelliklere her class dan ulaþabiliriz. Public
							// =>ulaþýlabilir
							// Private => özel
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
		if (doors == 2 || doors == 4) { // Araba kapý kapý sayýmýz sadece 4 veya 2 olabilir diye bir koþul belirledik.
			this.doors = doors; // araba kapý sayýmýz koþula uyarsa girdiðimiz 2 veya 4 deðerine eþit olacak.
		} else { // Araba kapý sayýmýz þartlara uymazsa alttaki mesajý alacaðýz.
			System.out.println("Kapý sayýsý sadece 2 veya 4 olabilir");

		}

	}

	public String getColor() {
		return this.color;
	}

	public void start() {
		System.out.println("Araba çalýþtý...");
	}

	public void stop() {

		System.out.println("Araba durdu...");
	}
}
