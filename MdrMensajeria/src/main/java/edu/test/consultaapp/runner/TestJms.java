package edu.test.consultaapp.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.test.consultaapp.source.ConsultaService;

public class TestJms {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		ConsultaService consultaService = (ConsultaService) ctx.getBean("consultaService");
		
		for(int i =1; i<=5; i++)
			consultaService.sendConsulta(i, "Pepito", "pepito@pepin.com", "Hola Mundo");
	}
}