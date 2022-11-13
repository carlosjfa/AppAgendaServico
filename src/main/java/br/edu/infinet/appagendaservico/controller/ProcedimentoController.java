package br.edu.infinet.appagendaservico.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.ProcedimentoService;

@Controller
@RequestMapping(value="/procedimento")
public class ProcedimentoController {
	

	@Autowired
	private ProcedimentoService service;

	
	@GetMapping(value="/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		model.addAttribute("listagem",  service.obterLista(user));
		return "procedimento/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/procedimento/lista";
	}
	

	@PostMapping(value="/incluir")
	public String incluir(Procedimento procedimento, @SessionAttribute("user") Usuario user) {
		procedimento.setUsuario(user);
		procedimento.setData(LocalDateTime.now());
		service.incluir(procedimento);
		return "redirect:/procedimento/lista";
		
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "procedimento/cadastro";
	}

}
