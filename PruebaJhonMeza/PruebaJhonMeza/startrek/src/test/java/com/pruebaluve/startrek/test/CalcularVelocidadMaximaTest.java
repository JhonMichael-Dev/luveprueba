package com.pruebaluve.startrek.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pruebaluve.startrek.servicios.Cerebro;

public class CalcularVelocidadMaximaTest {

	Cerebro cerebro = new Cerebro();

	@Test
	public void testCaso1() {
		// Con daños: A = 0%; B = 0%; C = 0%.
		// y un porcentaje de velocidad de la luz: 100%
		int[] test = { 0, 0, 0 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 100;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso2() {
		// Con daños: A = 20%; B = 10%; C = 0%.
		// y un porcentaje de velocidad de la luz: 100%
		int[] test = { 20, 10, 0 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 90;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso3() {
		// Con daños: A = 0%; B = 0%; C = 100%.
		// y un porcentaje de velocidad de la luz: 100%
		int[] test = { 0, 0, 100 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 200 / 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso4() {
		// Con daños: A = 0%; B = 0%; C = 30%.
		// y un porcentaje de velocidad de la luz: 140%
		int[] test = { 0, 0, 30 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 90;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso5() {
		// Con daños: A = 20%; B = 50%; C = 40%.
		// y un porcentaje de velocidad de la luz: 170%
		int[] test = { 20, 50, 40 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 190 / 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso6() {
		// Con cualquier porcentaje de daño en los injectores.
		// y un porcentaje de velocidad de la luz mayor a 199%
		int[] test = { 101, 500, 400 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 0;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso7() {
		// Con daños: A = 100%; B = 100%; C = 0%.
		// y un porcentaje de velocidad de la luz: 30%
		int[] test = { 100, 100, 0 };
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 100 / 3;
		assertEquals(esperado, respuesta);
	}

	@Test
	public void testCaso8() {
		// Con daños: A = 100%; B = 100%; C = 0%.
		// y un porcentaje de velocidad de la luz: 30%
		int[] test = {};
		int respuesta = cerebro.calcularVelocidadMaxima(test);
		int esperado = 0;
		assertEquals(esperado, respuesta);
	}

}
