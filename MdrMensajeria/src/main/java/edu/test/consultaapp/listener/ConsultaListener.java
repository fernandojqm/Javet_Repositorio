package edu.test.consultaapp.listener;

import java.util.Map;
import org.springframework.stereotype.Component;

import edu.test.consultaapp.domain.Consulta;

@Component
public class ConsultaListener {
	
	public void consultaReceived(Map<String, Object> message) throws Exception {
		int idConsulta = (Integer) message.get("idConsulta");
		String NombreCliente = (String) message.get("NombreCliente");
		String emailCliente = (String) message.get("emailCliente");
		String ConsultaCliente = (String) message.get("ConsultaCliente");
		
		@SuppressWarnings("unused")
		Consulta ClientAsk = new Consulta(idConsulta, NombreCliente, emailCliente, ConsultaCliente);
		System.out.println("Consulta rebibida: " + idConsulta + ", NombreCliente: "
				+ NombreCliente + ", emailCliente: " + emailCliente + ", ConsultaCliente: " + ConsultaCliente);
	}
}
