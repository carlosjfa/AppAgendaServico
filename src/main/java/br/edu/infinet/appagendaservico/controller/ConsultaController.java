package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Consulta;
import br.edu.infinet.appagendaservico.model.service.ConsultaService;

@Controller
@RequestMapping(value="/consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaService service;

	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  service.obterLista());
		return "consulta/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/consulta/lista";
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "consulta/cadastro";
	}
	
	
	@PostMapping(value="/incluir")
	public String incluir(Consulta consulta) {
		service.incluir(consulta);
		return "redirect:/consulta/lista";
		
	}

}
