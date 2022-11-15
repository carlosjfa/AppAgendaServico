package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Integer>{

	@Query(value="SELECT c FROM Consulta c WHERE c.usuario.id = :usuarioId")
	List<Consulta> findAll(Integer usuarioId);
}
