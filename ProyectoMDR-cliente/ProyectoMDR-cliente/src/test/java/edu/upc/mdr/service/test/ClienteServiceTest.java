package edu.upc.mdr.service.test;

import java.util.ArrayList;

import javax.swing.plaf.BorderUIResource.BevelBorderUIResource;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.upc.mdr.bean.BeanCliente;
import edu.upc.mdr.service.ClienteService;

public class ClienteServiceTest {

	private ClienteService clienteService = null;

	public ClienteServiceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
		this.clienteService = (ClienteService) context
				.getBean("clienteServiceClient");
	}

	@Test
	public void testMostrarCliente() {
		ArrayList<BeanCliente> p1 = clienteService.ListarClientes();
		
		System.out.println(p1.get(0).getNombreCliente());
		
		//System.out.println(clienteService.NombreCliente());
	}
}
