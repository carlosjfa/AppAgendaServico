package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.UsuarioService;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioService service;
	
	
	@GetMapping
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value="/incluir")
	public String incluir (Usuario usuario) {
		service.incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/usuario/lista";
	}
	
	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep){
		
		model.addAttribute("endereco", service.obterCep(cep));
		
		return "usuario/cadastro";
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  service.obterLista());
		return "usuario/lista";
	}
	
}
