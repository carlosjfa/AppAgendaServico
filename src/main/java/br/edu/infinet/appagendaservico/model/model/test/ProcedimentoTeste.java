package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.ProcedimentoController;
import br.edu.infinet.appagendaservico.model.domain.Procedimento;

@Order(4)
@Component
public class ProcedimentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de procedimentos ##");
		
		Procedimento p1 = new Procedimento();
		p1.setPreventivo(false);
		p1.setTipo("Clareamento");
		p1.setDiagnostico("Clareamento");
		p1.setCodigo(27);
		p1.setPreco(100F);
		p1.setData(LocalDateTime.now().minusDays(30));
		ProcedimentoController.incluir(p1);
		
		System.out.println("Procedimento - " + p1);
		
		Procedimento p2 = new Procedimento();
		p2.setPreventivo(true);
		p2.setTipo("Limpeza");
		p2.setDiagnostico("Limpeza");
		p2.setCodigo(10);
		p2.setPreco(500F);
		p2.setData(LocalDateTime.now().minusDays(180));
		ProcedimentoController.incluir(p2);
		
		System.out.println("Procedimento - " + p2);
		
		Procedimento p3 = new Procedimento();
		p3.setPreventivo(false);
		p3.setDiagnostico("Molde para bloco do dente código número 22");
		p3.setTipo("Molde para bloco"); 
		p3.setCodigo(30);
		p3.setPreco(700F);
		p3.setData(LocalDateTime.now().minusDays(365));
		ProcedimentoController.incluir(p3);
		
		System.out.println("Procedimento - " + p3);
		
	}
	
}