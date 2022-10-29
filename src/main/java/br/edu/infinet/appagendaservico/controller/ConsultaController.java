package br.edu.infinet.appagendaservico.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Consulta;

@Controller
@RequestMapping(value="/consulta")
public class ConsultaController {
	
	private static Map<Integer, Consulta> mapa = new HashMap<>();
	private static Integer id = 1;
	
		
	public static void incluir(Consulta consulta) {
		consulta.setId(id++);
		mapa.put(consulta.getId(), consulta);
		System.out.println("> " + consulta);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Consulta> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  obterLista());
		return "consulta/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/consulta/lista";
	}

}
