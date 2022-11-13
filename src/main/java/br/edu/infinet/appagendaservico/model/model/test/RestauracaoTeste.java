package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.model.domain.Restauracao;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.RestauracaoService;

@Order(6)
@Component
public class RestauracaoTeste implements ApplicationRunner{
	
	@Autowired
	private RestauracaoService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Restaurações ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Restauracao r1 = new Restauracao();
		r1.setCodDente(25);
		r1.setNome("Bloco de cerâmica");
		r1.setAnosGarantia(20);
		r1.setMaterialUtilizado("cerâmica");
		r1.setCodigo(27);
		r1.setPreco(100F);
		r1.setData(LocalDateTime.now().minusDays(30));
		r1.setUsuario(usuario);
		service.incluir(r1);
		System.out.println("Restauração - " + r1);
		
		Restauracao r2 = new Restauracao();
		r2.setCodDente(16);
		r2.setNome("Bloco de resina");
		r2.setAnosGarantia(5);
		r2.setMaterialUtilizado("resina");
		r2.setCodigo(10);
		r2.setPreco(500F);
		r2.setData(LocalDateTime.now().minusDays(180));
		r2.setUsuario(usuario);
		service.incluir(r2);		
		System.out.println("Restauração - " + r2);
		
		Restauracao r3 = new Restauracao();
		r3.setCodDente(31);
		r3.setNome("Bloco de metal");
		r3.setAnosGarantia(30);
		r3.setMaterialUtilizado("metal");
		r3.setCodigo(30);
		r3.setPreco(700F);
		r3.setData(LocalDateTime.now().minusDays(365));
		r3.setUsuario(usuario);
		service.incluir(r3);
		System.out.println("Restauração - " + r3);

		
	}

}
