package com.YouTubeDers;

public class Ders_18_OOPGiri�veClasslar_S�n�flar {

	public static void main(String[] args) {
		Ders_18_2_Car car1 = new Ders_18_2_Car();
		car1.setColor("G�m��");
		car1.setDoors(2);
		car1.setEngine(1.6);
		car1.setModel("Fiat");

		car1.start();

		System.out.println("Araban�n rengi : " + car1.getColor());
		System.out.println("Araban�n modeli : " + car1.getModel());
		System.out.println("Araban�n motor hacmi : " + car1.getEngine());
		System.out.println("Araban�n kap� say�s� : " + car1.getDoors());

		car1.stop();

	}

}
