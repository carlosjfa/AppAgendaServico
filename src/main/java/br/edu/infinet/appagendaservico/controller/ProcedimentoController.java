package br.edu.infinet.appagendaservico.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;

@Controller
@RequestMapping(value="/procedimento")
public class ProcedimentoController {
	
	private static Map<Integer, Procedimento> mapa = new HashMap<>();
	private static Integer id = 1;
	
		
	public static void incluir(Procedimento procedimento) {
		procedimento.setId(id++);
		mapa.put(procedimento.getId(), procedimento);
		System.out.println("> " + procedimento);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Procedimento> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value="/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",  obterLista());
		return "procedimento/lista";
	}
	
	@GetMapping(value="/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/procedimento/lista";
	}

}
