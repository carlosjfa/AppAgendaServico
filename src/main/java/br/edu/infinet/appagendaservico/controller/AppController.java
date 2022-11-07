package br.edu.infinet.appagendaservico.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
@RequestMapping(value="/")
public class AppController {
	
	@Autowired
	private UsuarioService service;

	@GetMapping
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value="/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(Model model,@RequestParam String email,@RequestParam String senha) {
		
		Usuario usuario = service.validar(email, senha);
		
		if (usuario != null) {
			model.addAttribute("user", usuario);
			return "home";
		}
		
		return "login";
	}

	@GetMapping(value="/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/";
	}
}
