package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Restauracao;

public interface RestauracaoRepository extends CrudRepository<Restauracao, Integer>{

	@Query(value ="SELECT r FROM Restauracao r WHERE r.usuario.id = :usuarioId")
	List<Restauracao> findAll(Integer usuarioId);
}
