package br.ws.consumer;

import br.ws.consumer.wsdl.GetAlunoRequest;
import br.ws.consumer.wsdl.GetAlunoResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class AlunoClient extends WebServiceGatewaySupport{

	public GetAlunoResponse getAlunoById(int studentId) {
		GetAlunoRequest request = new GetAlunoRequest();
		request.setAlunoId(studentId);

		GetAlunoResponse response = (GetAlunoResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:8080/ws/alunos.wsdl",
				request,
				new SoapActionCallback("http://localhost:8080/ws/getAlunoResponse"));

		return response;
	}
}
