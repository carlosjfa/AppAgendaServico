package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.model.domain.Paciente;
import br.edu.infinet.appagendaservico.model.repository.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository repository;
	
	public void incluir (Paciente paciente) {
		repository.save(paciente);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
	
	public Collection<Paciente> obterLista(){
		return (Collection<Paciente>) repository.findAll();
	}
}
