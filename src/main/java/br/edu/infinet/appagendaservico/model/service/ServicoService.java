package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.Servico;
import br.edu.infinet.appagendaservico.model.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repository;
	
	public void incluir(Servico servico) {
		repository.save(servico);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Servico> obterLista(){
		return (Collection<Servico>) repository.findAll();
	}
}
