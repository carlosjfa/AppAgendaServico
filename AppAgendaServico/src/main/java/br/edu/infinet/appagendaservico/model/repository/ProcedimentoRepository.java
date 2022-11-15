package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Procedimento;

public interface ProcedimentoRepository extends CrudRepository<Procedimento,Integer>{
	
	@Query(value="SELECT p FROM Procedimento p WHERE p.usuario.id = :usuarioId")
	List <Procedimento> findAll(Integer usuarioId);
}
