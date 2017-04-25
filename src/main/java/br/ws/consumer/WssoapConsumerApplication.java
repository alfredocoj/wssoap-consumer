package br.ws.consumer;

import br.ws.consumer.entities.Aluno;
import br.ws.consumer.wsdl.PostAlunoResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WssoapConsumerApplication  {//implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(WssoapConsumerApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(AlunoClient alunoClient) { //AlunoClient alunoClient
		return args -> {

			/*GetAlunoResponse response = alunoClient.getAlunoById(7);
		
			System.out.println("ID = "+response.getAluno().getAlunoId());
			System.out.println("Nome = "+response.getAluno().getAlunoName());
			System.out.println("Idade = "+response.getAluno().getAlunoIdade());
			System.out.println("Classe = "+response.getAluno().getAlunoClasse());*/

            Aluno aluno = new Aluno();
            aluno.setAlunoName( "Aluno de Teste" );
            aluno.setAlunoIdade( 15 );
            aluno.setAlunoClasse( "A1" );
            PostAlunoResponse response = alunoClient.addAluno( aluno );

            System.out.println( response.getAluno().getAlunoName() );

			
		};
	}
}
