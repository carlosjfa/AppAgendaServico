package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.RaioXController;
import br.edu.infinet.appagendaservico.model.domain.RaioX;
import br.edu.infinet.appagendaservico.model.service.RaioXService;

@Order(7)
@Component
public class RaioXTeste implements ApplicationRunner {

	@Autowired
	private RaioXService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Raios X ##");
		
		RaioX r1 = new RaioX();
		r1.setTipo("Panorâmica");
		r1.setDentistaResponsavel("José Luiz");
		r1.setDiagnostico("Todos os dentes romperam a gengiva");
		r1.setCodigo(27);
		r1.setPreco(100F);
		r1.setData(LocalDateTime.now().minusDays(30));
		service.incluir(r1);
		
		System.out.println("Raio X - " + r1);
		
		RaioX r2 = new RaioX();
		r2.setTipo("Projeção cefalométrica lateral");
		r2.setDentistaResponsavel("João da Silva");
		r2.setDiagnostico("Os dentes 23 a 25 e os dentes 31 a 35 não estão alinhados");
		r2.setCodigo(10);
		r2.setPreco(500F);
		r2.setData(LocalDateTime.now().minusDays(180));
		service.incluir(r2);
		
		System.out.println("Raio X - " + r2);
		
		RaioX r3 = new RaioX();
		r3.setTipo("Interproximal");
		r3.setDentistaResponsavel("Maria Neves");
		r3.setDiagnostico("Existe evidência inicial de cárie no dente 23");
		r3.setCodigo(30);
		r3.setPreco(700F);
		r3.setData(LocalDateTime.now().minusDays(365));
		service.incluir(r3);
		System.out.println("Raio X - " + r3);
		
	}

}
