package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infinet.appagendaservico.model.domain.Consulta;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.ConsultaService;
import br.edu.infinet.appagendaservico.model.service.PacienteService;
import br.edu.infinet.appagendaservico.model.service.ServicoService;

@Controller
@RequestMapping(value="/consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaService service;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private ServicoService servicoService;

	
	@GetMapping(value="/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		model.addAttribute("listagem",  service.obterLista(user));
		return "consulta/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/consulta/lista";
	}
	
	@GetMapping
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("pacientes", pacienteService.obterLista(usuario));
		model.addAttribute("servicos", servicoService.obterLista(usuario));
		return "consulta/cadastro";
	}
	
	
	@PostMapping(value="/incluir")
	public String incluir(Consulta consulta, @SessionAttribute("user") Usuario usuario) {
		consulta.setUsuario(usuario);
		service.incluir(consulta);
		return "redirect:/consulta/lista";
		
	}

}
