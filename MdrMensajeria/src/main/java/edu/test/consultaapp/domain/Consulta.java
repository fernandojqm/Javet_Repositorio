package edu.test.consultaapp.domain;

public class Consulta {
	
	private int idConsulta;
	private String NombreCliente;
	private String emailCliente;
	private String ConsultaCliente;
	
	public Consulta(int idConsulta, String nombreCliente, String emailCliente,
			String consultaCliente) {
		super();
		this.idConsulta = idConsulta;
		NombreCliente = nombreCliente;
		this.emailCliente = emailCliente;
		ConsultaCliente = consultaCliente;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getConsultaCliente() {
		return ConsultaCliente;
	}

	public void setConsultaCliente(String consultaCliente) {
		ConsultaCliente = consultaCliente;
	}

}
