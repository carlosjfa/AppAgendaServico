package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.RaioX;

public interface RaioXRepository extends CrudRepository<RaioX, Integer>{

	@Query(value = "SELECT r FROM RaioX r WHERE r.usuario.id = :usuarioId")
	List<RaioX> findAll(Integer usuarioId);
}
