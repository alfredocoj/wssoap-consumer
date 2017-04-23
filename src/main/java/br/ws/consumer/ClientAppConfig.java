package br.ws.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientAppConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.ws.consumer.wsdl");
		return marshaller;
	}
	
	@Bean
	public AlunoClient studentClient(Jaxb2Marshaller marshaller) {
		AlunoClient client = new AlunoClient();
		client.setDefaultUri("http://localhost:8080/ws/alunos.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
