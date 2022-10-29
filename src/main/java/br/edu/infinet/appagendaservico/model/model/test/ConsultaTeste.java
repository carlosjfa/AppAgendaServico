package br.edu.infinet.appagendaservico.model.model.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infinet.appagendaservico.controller.ConsultaController;
import br.edu.infinet.appagendaservico.model.domain.Consulta;
import br.edu.infinet.appagendaservico.model.domain.Paciente;
import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.domain.RaioX;
import br.edu.infinet.appagendaservico.model.domain.Restauracao;
import br.edu.infinet.appagendaservico.model.domain.Servico;

@Order(1)
@Component
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Consultas ##");
		
		Procedimento pr = new Procedimento();
		pr.setPreventivo(false);
		pr.setTipo("Clareamento");
		pr.setDiagnostico("Clareamento");
		pr.setCodigo(27);
		pr.setPreco(100F);
		pr.setData(LocalDateTime.now().minusDays(30));
		
		System.out.println("Procedimento - " + pr);
		
		Restauracao r1 = new Restauracao();
		r1.setCodDente(25);
		r1.setAnosGarantia(20);
		r1.setMaterialUtilizado("cerâmica");
		r1.setCodigo(27);
		r1.setPreco(100F);
		r1.setData(LocalDateTime.now().minusDays(30));
		
		System.out.println("Restauração - " + r1);
		
		
		RaioX ra = new RaioX();
		ra.setTipo("Panorâmica");
		ra.setDentistaResponsavel("José Luiz");
		ra.setDiagnostico("Todos os dentes romperam a gengiva");
		ra.setCodigo(27);
		ra.setPreco(100F);
		ra.setData(LocalDateTime.now().minusDays(30));
		
		List<Servico> servicos1 = List.of(pr,r1);
		List<Servico> servicos2 = List.of(pr,r1,ra);
		
		Paciente p1 = new Paciente();
		p1.setNome("Maria Alice dos Santos");
		p1.setEndereco("Rua Volta, 178, Vila da Penha");
		p1.setTelefone("21999878787");
		
		Paciente p2 = new Paciente();
		p2.setNome("Marcus Oliveira");
		p2.setEndereco("Rua São João, 23/201, Irajá");
		p2.setTelefone("21987656789");
		
		Consulta c1 = new Consulta();
		c1.setData(LocalDateTime.now().minusDays(1));
		c1.setConvenio("Particular");
		c1.setPrimeiraVez(true);
		c1.setRetorno(false);
		c1.setPaciente(p1);
		c1.setServicos(servicos1);
		ConsultaController.incluir(c1);
		
		System.out.println("Consulta - " + c1);
		
		Consulta c2 = new Consulta();
		c2.setData(LocalDateTime.now());
		c2.setConvenio("Bradesco");
		c2.setPrimeiraVez(false);
		c2.setRetorno(false);
		c2.setPaciente(p1);
		c2.setServicos(servicos2);
		ConsultaController.incluir(c2);
		System.out.println("Consulta - " + c2);
		
		Consulta c3 = new Consulta(p2);
		c3.setData(LocalDateTime.now().minusDays(3));
		c3.setConvenio("Unimed");
		c3.setPrimeiraVez(false);
		c3.setRetorno(true);
		c3.setServicos(servicos2);
		ConsultaController.incluir(c3);
		System.out.println("Consulta - " + c3);
		
	}

}
