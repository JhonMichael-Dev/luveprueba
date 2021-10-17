package com.pruebaluve.startrek.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pruebaluve.startrek.servicios.Cerebro;

public class CalcularFlujoMaximaTest {

	Cerebro cerebro = new Cerebro();

	@Test
	public void testCaso1() {
		// Con un daño del 0% en el motor Warp, el flujo maximo de plasma debe ser
		// 100mg/s
		int resultado = cerebro.calcularFujoMaximo(0);
		int esperado = 100;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testCaso2() {
		// Con un daño del 40% en el motor Warp, el flujo maximo de plasma debe ser
		// 60mg/s
		int resultado = cerebro.calcularFujoMaximo(30);
		int esperado = 70;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testCaso3() {
		// Con un daño del 32% en el motor Warp, el flujo maximo de plasma debe ser
		// 68mg/s
		int resultado = cerebro.calcularFujoMaximo(32);
		int esperado = 68;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testCaso4() {
		// Con un daño del 100% en el motor Warp, el flujo maximo de plasma debe ser
		// 0mg/s
		int resultado = cerebro.calcularFujoMaximo(100);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testCaso5() {
		// Con un daño del 100% en el motor Warp, el flujo maximo de plasma debe ser
		// 0mg/s
		int resultado = cerebro.calcularFujoMaximo(101);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testCaso6() {
		// Con un daño del -1% en el motor Warp, el flujo maximo de plasma debe ser
		// 0mg/s
		int resultado = cerebro.calcularFujoMaximo(-1);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}

}
