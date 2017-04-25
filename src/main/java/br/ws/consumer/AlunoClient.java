package br.ws.consumer;

import br.ws.consumer.entities.Aluno;
import br.ws.consumer.wsdl.GetAlunoRequest;
import br.ws.consumer.wsdl.GetAlunoResponse;
import br.ws.consumer.wsdl.PostAlunoRequest;
import br.ws.consumer.wsdl.PostAlunoResponse;
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

	public PostAlunoResponse addAluno(Aluno aluno) {
		PostAlunoRequest request = new PostAlunoRequest();
		request.setAlunoName( aluno.getAlunoName() );
		request.setAlunoIdade( aluno.getAlunoIdade() );
		request.setAlunoClasse( aluno.getAlunoClasse() );

		PostAlunoResponse response = (PostAlunoResponse) getWebServiceTemplate().marshalSendAndReceive(
				"http://localhost:8080/ws/alunos.wsdl",
				request,
				new SoapActionCallback("http://localhost:8080/ws/postAlunoResponse"));

		return response;
	}
}
