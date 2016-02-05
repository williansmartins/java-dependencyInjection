package com.williansmartins.model;

public class Classe2 {
	private int valor1;
	private double valor2;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "Classe2 [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}

}
