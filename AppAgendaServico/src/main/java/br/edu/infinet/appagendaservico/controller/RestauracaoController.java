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

import br.edu.infinet.appagendaservico.model.domain.Restauracao;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.RestauracaoService;

@Controller
@RequestMapping(value="/restauracao")
public class RestauracaoController {
	
	@Autowired
	private RestauracaoService service;
	
	@GetMapping(value="/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		model.addAttribute("listagem",  service.obterLista(user));
		return "restauracao/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/restauracao/lista";
	}
	
	@PostMapping(value="/incluir")
	public String incluir(Restauracao restauracao, @SessionAttribute("user") Usuario user) {
		restauracao.setUsuario(user);
		restauracao.setData(LocalDateTime.now());
		service.incluir(restauracao);
		return "redirect:/restauracao/lista";
		
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "restauracao/cadastro";
	}

}
