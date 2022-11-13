package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.RaioX;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.repository.RaioXRepository;

@Service
public class RaioXService {

	@Autowired
	private RaioXRepository raioXRepository;
	
	public void incluir(RaioX raioX) {
		raioXRepository.save(raioX);
	}
	
	public void excluir (Integer id) {
		raioXRepository.deleteById(id);
	}
	
	public Collection<RaioX> obterLista() {
		return (Collection<RaioX>) raioXRepository.findAll();
	}
	
	public Collection<RaioX> obterLista(Usuario user) {
		return (Collection<RaioX>) raioXRepository.findAll(user.getId());
	}
}
