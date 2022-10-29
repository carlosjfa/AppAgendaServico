package br.edu.infinet.appagendaservico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class AppController {

	@GetMapping
	public String telaHome() {
		return "home";
	}
}
