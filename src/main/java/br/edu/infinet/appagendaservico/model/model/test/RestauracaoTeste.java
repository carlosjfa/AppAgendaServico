package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.RestauracaoController;
import br.edu.infinet.appagendaservico.model.domain.Restauracao;

@Order(5)
@Component
public class RestauracaoTeste implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Restaurações ##");
		
		Restauracao r1 = new Restauracao();
		r1.setCodDente(25);
		r1.setAnosGarantia(20);
		r1.setMaterialUtilizado("cerâmica");
		r1.setCodigo(27);
		r1.setPreco(100F);
		r1.setData(LocalDateTime.now().minusDays(30));
		RestauracaoController.incluir(r1);
		System.out.println("Restauração - " + r1);
		
		Restauracao r2 = new Restauracao();
		r2.setCodDente(16);
		r2.setAnosGarantia(5);
		r2.setMaterialUtilizado("resina");
		r2.setCodigo(10);
		r2.setPreco(500F);
		r2.setData(LocalDateTime.now().minusDays(180));
		RestauracaoController.incluir(r2);		
		System.out.println("Restauração - " + r2);
		
		Restauracao r3 = new Restauracao();
		r3.setCodDente(31);
		r3.setAnosGarantia(30);
		r3.setMaterialUtilizado("metal");
		r3.setCodigo(30);
		r3.setPreco(700F);
		r3.setData(LocalDateTime.now().minusDays(365));
		RestauracaoController.incluir(r3);
		System.out.println("Restauração - " + r3);

		
	}

}
