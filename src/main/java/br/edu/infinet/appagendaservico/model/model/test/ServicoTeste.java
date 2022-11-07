package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.ServicoController;
import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.domain.RaioX;
import br.edu.infinet.appagendaservico.model.domain.Restauracao;
import br.edu.infinet.appagendaservico.model.service.ServicoService;

@Order(4)
@Component
public class ServicoTeste implements ApplicationRunner{
	
	@Autowired
	private ServicoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Serviços ##");
		
		Procedimento p1 = new Procedimento();
		p1.setPreventivo(false);
		p1.setTipo("Clareamento");
		p1.setDiagnostico("Clareamento");
		p1.setCodigo(12);
		p1.setPreco(1000F);
		p1.setData(LocalDateTime.now().minusDays(3));
		service.incluir(p1);
		
		System.out.println("Procedimento - " + p1);
		
		Restauracao r1 = new Restauracao();
		r1.setCodDente(25);
		r1.setAnosGarantia(20);
		r1.setMaterialUtilizado("cerâmica");
		r1.setCodigo(27);
		r1.setPreco(100F);
		r1.setData(LocalDateTime.now().minusDays(30));
		service.incluir(r1);
		System.out.println("Restauração - " + r1);
		
		
		RaioX ra = new RaioX();
		ra.setTipo("Panorâmica");
		ra.setDentistaResponsavel("José Luiz");
		ra.setDiagnostico("Todos os dentes romperam a gengiva");
		ra.setCodigo(28);
		ra.setPreco(600F);
		ra.setData(LocalDateTime.now().minusDays(15));
		service.incluir(ra);
		
		System.out.println("Raio X - " + ra);
		
		
	}

}
