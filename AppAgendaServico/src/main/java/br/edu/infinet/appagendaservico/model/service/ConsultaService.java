package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.Consulta;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.repository.ConsultaRepository;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRepository repository;
	
	public void incluir(Consulta consulta) {
		repository.save(consulta);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Consulta> obterLista(){
		return (Collection<Consulta>) repository.findAll();
	}
	
	public Collection<Consulta> obterLista(Usuario user){
		return (Collection<Consulta>) repository.findAll(user.getId());
	}
}
