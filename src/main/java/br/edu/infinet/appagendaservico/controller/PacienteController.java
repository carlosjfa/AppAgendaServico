package br.edu.infinet.appagendaservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infinet.appagendaservico.model.domain.Paciente;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.PacienteService;

@Controller
@RequestMapping(value="/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService service;
	
	@GetMapping(value="/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		model.addAttribute("listagem",  service.obterLista(user));
		return "paciente/lista";
	}
	
	@GetMapping
	public String telaCadastro(Model model) {
		return "paciente/cadastro";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/paciente/lista";
	}
	
	@PostMapping(value="/incluir")
	public String incluir(Paciente paciente, @SessionAttribute("user") Usuario user) {
		paciente.setUsuario(user);
		service.incluir(paciente);
		return "redirect:/paciente/lista";
		
	}

}
