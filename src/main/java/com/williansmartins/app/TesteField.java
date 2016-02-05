package com.williansmartins.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.williansmartins.field.TestaFields;

public class TesteField {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/Spring-Modelo.xml");

		TestaFields t = (TestaFields) context.getBean("testaFieldId");
		t.metodo();

	}
}
