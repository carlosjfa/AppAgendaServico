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

import br.edu.infinet.appagendaservico.model.domain.RaioX;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.RaioXService;

@Controller
@RequestMapping(value="/raiox")
public class RaioXController {
	
	@Autowired
	private RaioXService service;
	
	@GetMapping(value="/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		model.addAttribute("listagem",  service.obterLista(user));
		return "raiox/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/raiox/lista";
	}


	@PostMapping(value="/incluir")
	public String incluir(RaioX raiox, @SessionAttribute("user") Usuario user) {
		raiox.setUsuario(user);
		raiox.setData(LocalDateTime.now());
		service.incluir(raiox);
		return "redirect:/raiox/lista";
		
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "raiox/cadastro";
	}
}
