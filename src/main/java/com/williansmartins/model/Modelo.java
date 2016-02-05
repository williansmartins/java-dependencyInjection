package com.williansmartins.model;

public class Modelo {
	private String nome;
	private int idade;
	private Classe2 classe2;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public Classe2 getClasse2() {
		return classe2;
	}

	public void setClasse2(Classe2 classe2) {
		this.classe2 = classe2;
	}

	@Override
	public String toString() {
		return "Modelo [nome=" + nome + ", idade=" + idade + ", classe2="
				+ classe2 + "]";
	}

}
