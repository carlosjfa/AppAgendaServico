package br.edu.infinet.appagendaservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Servico;

public interface ServicoRepository extends CrudRepository<Servico, Integer> {

	@Query("SELECT s FROM Servico s WHERE s.usuario.id = :id")
	List<Servico> obterLista(Integer id);

}
