package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.service.ProcedimentoService;

@Controller
@RequestMapping(value="/procedimento")
public class ProcedimentoController {
	

	@Autowired
	private ProcedimentoService service;

	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  service.obterLista());
		return "procedimento/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/procedimento/lista";
	}
	

	@PostMapping(value="/incluir")
	public String incluir(Procedimento procedimento) {
		service.incluir(procedimento);
		return "redirect:/procedimento/lista";
		
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "procedimento/cadastro";
	}

}
