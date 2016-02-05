package com.williansmartins.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.williansmartins.model.Classe2;
import com.williansmartins.model.Modelo;


public class TesteComplexo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/Spring-Modelo.xml");
		
		Modelo modelo = (Modelo) context.getBean("modelo2Id");
		modelo.setIdade(33);
		modelo.setNome("Willians");
		
		Classe2 classe2 = (Classe2) context.getBean("classe2Id");
		classe2.setValor1(222);
		classe2.setValor2(44);
		modelo.setClasse2(classe2);
		
		System.out.println(modelo);
	}
}
