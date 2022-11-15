package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.Restauracao;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.repository.RestauracaoRepository;

@Service
public class RestauracaoService {

	@Autowired
	private RestauracaoRepository repository;
	
	public void incluir(Restauracao restauracao) {
		repository.save(restauracao);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Restauracao> obterLista(){
		return (Collection<Restauracao>) repository.findAll();
	}
	
	public Collection<Restauracao> obterLista(Usuario user){
		return (Collection<Restauracao>) repository.findAll(user.getId());
	}
}
