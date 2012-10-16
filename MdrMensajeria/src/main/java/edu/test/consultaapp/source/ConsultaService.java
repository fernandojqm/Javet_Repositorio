package edu.test.consultaapp.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.test.consultaapp.domain.Consulta;

@Service("consultaService")
public class ConsultaService {
	static int consultaSequence = 1;
	
	@Autowired
	private ConsultaSender consultaSender;
	public void setConsultaSender(ConsultaSender consultaSender){
		this.consultaSender = consultaSender;
	}
	
	public void sendConsulta(int idConsulta, String NombreCliente, String emailCliente, String ConsultaCliente){
		Consulta consulta = new Consulta(idConsulta, NombreCliente, emailCliente, ConsultaCliente);
		consultaSender.sendConsulta(consulta);
	}
	
}
