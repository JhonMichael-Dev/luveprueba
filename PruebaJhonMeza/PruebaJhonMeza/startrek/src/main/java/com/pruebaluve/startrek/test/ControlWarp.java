package com.pruebaluve.startrek.test;

import com.pruebaluve.startrek.servicios.Cerebro;

public class ControlWarp {

	public static void main(String[] args) {
		Cerebro cerebro = new Cerebro();
		int randomNumeroInjectores = generarRandom(5);
		int[] randomDañoInjectores = new int[randomNumeroInjectores];
		int randomVelocidad = generarRandom(199);

		for (int i = 0; i < randomDañoInjectores.length; i++) {
			randomDañoInjectores[i] = generarRandom(100);
		}

		System.out.println("Numero de injectores: " + randomNumeroInjectores);
		for (int i = 0; i < randomDañoInjectores.length; i++) {
			System.out.println("Daño injector: " + i + " -> " + randomDañoInjectores[i]);
		}

		System.out.println("Velocidad requerida: " + randomVelocidad);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Velocidad Maxima: " + cerebro.calcularVelocidadMaxima(randomDañoInjectores) + "%");
		System.out.println(cerebro.calcularFujoInjectores(randomDañoInjectores, randomVelocidad));

		System.out.println("-------------------------------------------------------------");
		int[] test = { 20, 10, 0 };
		int velocidadTest = 100;
		System.out.println("Daños: A = " + test[0] + "%; B = " + test[1] + "%; C = " + test[2] + "%");
		System.out.println("Porcentaje de velocidad de la luz: " + velocidadTest + "%");
		System.out.println(cerebro.calcularFujoInjectores(test, velocidadTest));

	}

	private static int generarRandom(int maximo) {
		int respuesta = (int) Math.floor(Math.random() * (1 + maximo));
		if (respuesta == 0) {
			respuesta += 1;
		}
		return respuesta;
	}
}
