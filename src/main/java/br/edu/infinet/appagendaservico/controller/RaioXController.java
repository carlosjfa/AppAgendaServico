package br.edu.infinet.appagendaservico.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.RaioX;

@Controller
@RequestMapping(value="/raiox")
public class RaioXController {
	
	private static Map<Integer, RaioX> mapa = new HashMap<>();
	private static Integer id = 1;
	
		
	public static void incluir(RaioX raiox) {
		raiox.setId(id++);
		mapa.put(raiox.getId(), raiox);
		System.out.println("> " + raiox);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<RaioX> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  obterLista());
		return "raiox/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/raiox/lista";
	}

}
