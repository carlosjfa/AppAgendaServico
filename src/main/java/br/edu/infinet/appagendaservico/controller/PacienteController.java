package br.edu.infinet.appagendaservico.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Paciente;

@Controller
@RequestMapping(value="/paciente")
public class PacienteController {
	
	private static Map<Integer, Paciente> mapa = new HashMap<>();
	private static Integer id = 1;
	
		
	public static void incluir(Paciente paciente) {
		paciente.setId(id++);
		mapa.put(paciente.getId(), paciente);
		System.out.println("> " + paciente);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Paciente> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  obterLista());
		return "paciente/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/paciente/lista";
	}

}
