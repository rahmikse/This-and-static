package com.YouTubeDers;

public class Ders_18_OOPGiriþveClasslar_Sýnýflar {

	public static void main(String[] args) {
		Ders_18_2_Car car1 = new Ders_18_2_Car();
		car1.setColor("Gümüþ");
		car1.setDoors(2);
		car1.setEngine(1.6);
		car1.setModel("Fiat");

		car1.start();

		System.out.println("Arabanýn rengi : " + car1.getColor());
		System.out.println("Arabanýn modeli : " + car1.getModel());
		System.out.println("Arabanýn motor hacmi : " + car1.getEngine());
		System.out.println("Arabanýn kapý sayýsý : " + car1.getDoors());

		car1.stop();

	}

}
