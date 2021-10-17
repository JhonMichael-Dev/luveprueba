package com.pruebaluve.startrek.entidades;

import java.util.ArrayList;

public class Resultado {
	private ArrayList<Double> flujos;
	private double tiempoOperacion;
	private int porcentajevelocidadMaxima;

	public Resultado() {

	}

	public Resultado(ArrayList<Double> flujos, double tiempoOperacion, int porcentajevelocidadMaxima) {
		super();
		this.flujos = flujos;
		this.tiempoOperacion = tiempoOperacion;
		this.porcentajevelocidadMaxima = porcentajevelocidadMaxima;
	}

	public ArrayList<Double> getFlujos() {
		return flujos;
	}

	public void setFlujos(ArrayList<Double> flujos) {
		this.flujos = flujos;
	}

	public double getTiempoOperacion() {
		return tiempoOperacion;
	}

	public void setTiempoOperacion(double tiempoOperacion) {
		this.tiempoOperacion = tiempoOperacion;
	}

	public int getPorcentajevelocidadMaxima() {
		return porcentajevelocidadMaxima;
	}

	public void setPorcentajevelocidadMaxima(int porcentajevelocidadMaxima) {
		this.porcentajevelocidadMaxima = porcentajevelocidadMaxima;
	}

	@Override
	public String toString() {
		return "Resultado [flujos=" + flujos + ", tiempoOperacion=" + tiempoOperacion + ", porcentajevelocidadMaxima="
				+ porcentajevelocidadMaxima + "]";
	}

}
