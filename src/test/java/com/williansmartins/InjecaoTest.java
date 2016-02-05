package com.williansmartins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.williansmartins.model.Modelo;

import junit.framework.TestCase;

public class InjecaoTest  extends TestCase{
	
	public void teste1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer/Spring-Modelo.xml");
		Modelo modelo = (Modelo) context.getBean("modelo");
		modelo.setIdade(33);
		modelo.setNome("Willians");
		System.out.println(modelo);
	}
}
