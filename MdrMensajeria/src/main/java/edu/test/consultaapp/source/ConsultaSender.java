package edu.test.consultaapp.source;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import edu.test.consultaapp.domain.Consulta;


public class ConsultaSender {

	@Autowired
    private JmsTemplate jmsTemplate;
	
	public void sendConsulta(final Consulta consulta){
		jmsTemplate.send(
				new MessageCreator() {
					public Message createMessage(Session session) throws JMSException {
						MapMessage mapMessage = session.createMapMessage();
						mapMessage.setInt("idConsulta", consulta.getIdConsulta());
			            mapMessage.setString("NombreCliente", consulta.getNombreCliente());
			            mapMessage.setString("emailCliente", consulta.getEmailCliente());
			            mapMessage.setString("ConsultaCliente", consulta.getConsultaCliente());
			            return mapMessage;
					}
				}
		);
        System.out.println("Consulta enviada - id: "+ consulta.getIdConsulta());
	}
}
