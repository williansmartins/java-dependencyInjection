package com.williansmartins.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.williansmartins.model.Modelo;


public class TesteSimples {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/Spring-Modelo.xml");
		
		Modelo modelo = (Modelo) context.getBean("modelo");
		modelo.setIdade(33);
		modelo.setNome("Willians");
		
		System.out.println(modelo);
	}
}
