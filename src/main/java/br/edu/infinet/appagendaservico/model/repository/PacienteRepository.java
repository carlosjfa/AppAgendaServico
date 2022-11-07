package br.edu.infinet.appagendaservico.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

}
