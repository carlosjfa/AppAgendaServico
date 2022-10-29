package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.PacienteController;
import br.edu.infinet.appagendaservico.model.domain.Paciente;

@Order(2)
@Component
public class PacienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Pacientes ##");
		
		Paciente p1 = new Paciente();
		p1.setNome("Maria Alice dos Santos");
		p1.setDataNascimento(LocalDate.parse("2007-12-01"));
		p1.setEndereco("Rua Volta, 178, Vila da Penha");
		p1.setTelefone("21999878787");
		PacienteController.incluir(p1);
		
		System.out.println("Paciente - " + p1);
	
	
		Paciente p2 = new Paciente();
		p2.setNome("Marcus Oliveira");
		p2.setDataNascimento(LocalDate.parse("2001-01-10"));
		p2.setEndereco("Rua São João, 23/201, Irajá");
		p2.setTelefone("21987656789");
		PacienteController.incluir(p2);
		
		System.out.println("Paciente - " + p2);
		
		Paciente p3 = new Paciente();
		p3.setNome("Aline dos Santos Martins");
		p3.setDataNascimento(LocalDate.parse("1978-10-10"));
		p3.setEndereco("Rua são José, 33, Vila da Penha");
		p3.setTelefone("2187889878");
		PacienteController.incluir(p3);
		
		System.out.println("Paciente - " + p3);
	
	}

}
