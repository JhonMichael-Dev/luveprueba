package com.pruebaluve.startrek.servicios;

import java.util.ArrayList;
import java.util.Arrays;

import com.pruebaluve.startrek.entidades.Resultado;

public class Cerebro {

	public int calcularFujoMaximo(int porcentajeDaño) {
		int flujoMaximo = 100;
		if (porcentajeDaño >= 0 && porcentajeDaño <= 100) {
			flujoMaximo -= porcentajeDaño;
			return flujoMaximo;
		} else {
			return 0;
		}
	}

	public int calcularVelocidadMaxima(int[] porcentajeDaño) {
		int numeroInjectores = porcentajeDaño.length;
		if (numeroInjectores > 0) {
			int[] flujosMaximos = new int[numeroInjectores];
			for (int i = 0; i < porcentajeDaño.length; i++) {
				flujosMaximos[i] = calcularFujoMaximo(porcentajeDaño[i]);
			}
			int sumaFlujos = Arrays.stream(flujosMaximos).sum();
			return sumaFlujos / numeroInjectores;
		} else {
			return 0;
		}
	}

	public Resultado calcularFujoInjectores(int[] porcentajeDaño, int porcentajeVelocidad) {
		int numeroInjectores = porcentajeDaño.length;
		if (porcentajeVelocidad >= 0 && porcentajeVelocidad < 200 && numeroInjectores > 0) {
			int velocidadRequerida = numeroInjectores * porcentajeVelocidad;
			ArrayList<Double> flujos = new ArrayList<>();
			Resultado resultado = new Resultado(flujos, 0, calcularVelocidadMaxima(porcentajeDaño));
			double[] flujosMaximos = new double[numeroInjectores];
			for (int i = 0; i < porcentajeDaño.length; i++) {
				flujosMaximos[i] = calcularFujoMaximo(porcentajeDaño[i]);
			}
			double sumaFlujos = this.sumaComponentes(flujosMaximos);
			double dividendo = Math.abs(sumaFlujos - velocidadRequerida);

			double divisor = numeroInjectores - Arrays.stream(flujosMaximos).filter(x -> x == 0.0).count();
			double cociente = dividendo / divisor;

			if (sumaFlujos >= velocidadRequerida) {
				for (int i = 0; i < flujosMaximos.length; i++) {
					if (flujosMaximos[i] >= cociente) {
						dividendo -= cociente;
						if (flujosMaximos[i] == 0) {
							flujos.add(flujosMaximos[i]);
						} else {
							flujos.add(flujosMaximos[i] - cociente);
						}
					} else {
						dividendo = dividendo - 2 * flujosMaximos[i] + cociente;
						cociente = dividendo / (divisor - (i + 1));
						flujos.add(flujosMaximos[i]);
					}
				}
				resultado.setFlujos(flujos);
				resultado.setTiempoOperacion(Double.POSITIVE_INFINITY);
			} else {
				if (cociente <= 99) {
					for (int i = 0; i < flujosMaximos.length; i++) {
						if (flujosMaximos[i] == 0) {
							flujos.add(flujosMaximos[i]);
						} else {
							flujos.add(flujosMaximos[i] + cociente);
						}
					}
					resultado.setFlujos(flujos);
					resultado.setTiempoOperacion(100 - cociente);
				} else {
					return null;
				}
			}
			return resultado;
		} else {
			return null;
		}
	}

	private double sumaComponentes(double[] flujosMaximos) {
		double suma = 0;
		for (int i = 0; i < flujosMaximos.length; i++) {
			suma += flujosMaximos[i];
		}
		return suma;
	}
}
