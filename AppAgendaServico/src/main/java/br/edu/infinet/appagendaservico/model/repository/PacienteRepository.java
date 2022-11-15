package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

	@Query("SELECT p FROM Paciente p WHERE p.usuario.id = :id")
	List<Paciente> obterLista(Integer id);

}
