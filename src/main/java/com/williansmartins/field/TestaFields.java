package com.williansmartins.field;

import com.williansmartins.model.Classe2;

public class TestaFields implements TestaFieldsInterface {

	private Classe2 classe2;

	public void setClasse2(Classe2 classe2) {
		this.classe2 = classe2;
	}

	public void metodo() {
		classe2.setValor1(2);
		classe2.setValor2(123);
		System.out.println(classe2);
	}
}
