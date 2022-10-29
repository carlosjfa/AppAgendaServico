package br.edu.infinet.appagendaservico.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Restauracao;

@Controller
@RequestMapping(value="/restauracao")
public class RestauracaoController {
	
	private static Map<Integer, Restauracao> mapa = new HashMap<>();
	private static Integer id = 1;
	
		
	public static void incluir(Restauracao restauracao) {
		restauracao.setId(id++);
		mapa.put(restauracao.getId(), restauracao);
		System.out.println("> " + restauracao);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Restauracao> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  obterLista());
		return "restauracao/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/restauracao/lista";
	}

}
