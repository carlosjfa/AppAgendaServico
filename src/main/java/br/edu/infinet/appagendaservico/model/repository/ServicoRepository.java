package br.edu.infinet.appagendaservico.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Servico;

public interface ServicoRepository extends CrudRepository<Servico, Integer> {

}
