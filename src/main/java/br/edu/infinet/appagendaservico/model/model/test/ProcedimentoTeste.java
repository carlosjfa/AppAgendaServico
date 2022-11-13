package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.ProcedimentoService;

@Order(5)
@Component
public class ProcedimentoTeste implements ApplicationRunner{

	@Autowired
	private ProcedimentoService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de procedimentos ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Procedimento p1 = new Procedimento();
		p1.setPreventivo(false);
		p1.setNome("Clareamento");
		p1.setTipo("Clareamento");
		p1.setDiagnostico("Clareamento");
		p1.setCodigo(27);
		p1.setPreco(100F);
		p1.setData(LocalDateTime.now().minusDays(30));
		p1.setUsuario(usuario);
		service.incluir(p1);
		
		System.out.println("Procedimento - " + p1);
		
		Procedimento p2 = new Procedimento();
		p2.setPreventivo(true);
		p2.setNome("Limpeza");
		p2.setTipo("Limpeza");
		p2.setDiagnostico("Limpeza");
		p2.setCodigo(10);
		p2.setPreco(500F);
		p2.setData(LocalDateTime.now().minusDays(180));
		p2.setUsuario(usuario);
		service.incluir(p2);
		
		System.out.println("Procedimento - " + p2);
		
		Procedimento p3 = new Procedimento();
		p3.setPreventivo(false);
		p3.setNome("Molde");
		p3.setDiagnostico("Molde para bloco do dente código número 22");
		p3.setTipo("Molde para bloco"); 
		p3.setCodigo(30);
		p3.setPreco(700F);
		p3.setData(LocalDateTime.now().minusDays(365));
		p3.setUsuario(usuario);
		service.incluir(p3);
		
		System.out.println("Procedimento - " + p3);
		
	}
	
}
