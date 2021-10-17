package com.pruebaluve.startrek.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.pruebaluve.startrek.entidades.Resultado;
import com.pruebaluve.startrek.servicios.Cerebro;

public class CalcularFlujoInjectoresTest {

	Cerebro cerebro = new Cerebro();

	@Test
	public void testCaso1() {
		// Con daños: A = 0%; B = 0%; C = 0%.
		// y un porcentaje de velocidad de la luz: 100%
		int[] test = { 0, 0, 0 };
		int velocidadTest = 100;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 100mg/s; B = 100mg/s; C = 100mg/s
		// Tiempo de Operacion: Infinito
		// Velocidad Maxima: 100%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(100.0);
		flujos.add(100.0);
		flujos.add(100.0);
		double tiempoOperacion = Double.POSITIVE_INFINITY;
		int velocidadMaxima = 100;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso2() {
		// Con daños: A = 0%; B = 0%; C = 0%.
		// y un porcentaje de velocidad de la luz: 90%
		int[] test = { 0, 0, 0 };
		int velocidadTest = 90;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 90mg/s; B = 90mg/s; C = 90mg/s
		// Tiempo de Operacion: Infinito
		// Velocidad Maxima: 100%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(90.0);
		flujos.add(90.0);
		flujos.add(90.0);
		double tiempoOperacion = Double.POSITIVE_INFINITY;
		int velocidadMaxima = 100;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso3() {
		// Con daños: A = 0%; B = 0%; C = 0%.
		// y un porcentaje de velocidad de la luz: 30%
		int[] test = { 0, 0, 0 };
		int velocidadTest = 30;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 30mg/s; B = 30mg/s; C = 30mg/s
		// Tiempo de Operacion: Infinito
		// Velocidad Maxima: 100%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(30.0);
		flujos.add(30.0);
		flujos.add(30.0);
		double tiempoOperacion = Double.POSITIVE_INFINITY;
		int velocidadMaxima = 100;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso4() {
		// Con daños: A = 20%; B = 10%; C = 0%.
		// y un porcentaje de velocidad de la luz: 30%
		int[] test = { 20, 10, 0 };
		int velocidadTest = 100;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 90mg/s; B = 100mg/s; C = 110mg/s
		// Tiempo de Operacion: 90 minutos
		// Velocidad Maxima: 90%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(90.0);
		flujos.add(100.0);
		flujos.add(110.0);
		double tiempoOperacion = 90.0;
		int velocidadMaxima = 90;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso5() {
		// Con daños: A = 0%; B = 0%; C = 100%.
		// y un porcentaje de velocidad de la luz: 80%
		int[] test = { 0, 0, 100 };
		int velocidadTest = 80;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 120mg/s; B = 120mg/s; C = 0mg/s
		// Tiempo de Operacion: 80 minutos
		// Velocidad Maxima: 66.67%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(120.0);
		flujos.add(120.0);
		flujos.add(0.0);
		double tiempoOperacion = 80.0;
		int velocidadMaxima = 200 / 3;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso6() {
		// Con daños: A = 0%; B = 0%; C = 0%.
		// y un porcentaje de velocidad de la luz: 150%
		int[] test = { 0, 0, 0 };
		int velocidadTest = 150;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 150mg/s; B = 150mg/s; C = 150mg/s
		// Tiempo de Operacion: 50 minutos
		// Velocidad Maxima: 100%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(150.0);
		flujos.add(150.0);
		flujos.add(150.0);
		double tiempoOperacion = 50.0;
		int velocidadMaxima = 100;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso7() {
		// Con daños: A = 0%; B = 0%; C = 30%.
		// y un porcentaje de velocidad de la luz: 140%
		int[] test = { 0, 0, 30 };
		int velocidadTest = 140;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 150mg/s; B = 150mg/s; C = 120mg/s
		// Tiempo de Operacion: 50 minutos
		// Velocidad Maxima: 90%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(150.0);
		flujos.add(150.0);
		flujos.add(120.0);
		double tiempoOperacion = 50.0;
		int velocidadMaxima = 90;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

	@Test
	public void testCaso8() {
		// Con daños: A = 20%; B = 50%; C = 40%.
		// y un porcentaje de velocidad de la luz: 170%
		int[] test = { 20, 50, 40 };
		int velocidadTest = 170;

		// Se debe conseguir los siguientes resultados:
		// null

		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(null, respuesta);
	}

	@Test
	public void testCaso9() {
		// Con daños: A = 100%; B = 100%; C = 0%.
		// y un porcentaje de velocidad de la luz: 40%
		int[] test = { 100, 100, 0 };
		int velocidadTest = 40;

		// Se debe conseguir los siguientes resultados:
		// Flujos: A = 0mg/s; B = 0mg/s; C = 120mg/s
		// Tiempo de Operacion: 80 minutos
		// Velocidad Maxima: 33%
		ArrayList<Double> flujos = new ArrayList<>();
		flujos.add(0.0);
		flujos.add(0.0);
		flujos.add(120.0);
		double tiempoOperacion = 80.0;
		int velocidadMaxima = 100 / 3;

		Resultado esperado = new Resultado(flujos, tiempoOperacion, velocidadMaxima);
		Resultado respuesta = cerebro.calcularFujoInjectores(test, velocidadTest);
		assertEquals(esperado.getFlujos(), respuesta.getFlujos());
		assertEquals(esperado.getTiempoOperacion(), respuesta.getTiempoOperacion(), 0.0);
		assertEquals(esperado.getPorcentajevelocidadMaxima(), respuesta.getPorcentajevelocidadMaxima());
	}

}
