package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Servico;
import br.edu.infinet.appagendaservico.model.service.ServicoService;

@Controller
@RequestMapping(value="/servico")
public class ServicoController {
	
	@Autowired
	private ServicoService service;
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  service.obterLista());
		return "servico/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/servico/lista";
	}
	

	@PostMapping(value="/incluir")
	public String incluir(Servico servico) {
		service.incluir(servico);
		return "redirect:/servico/lista";
		
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "servico/cadastro";
	}

}
