package br.edu.infinet.appagendaservico.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.appagendaservico.model.domain.Usuario;

public interface UsuarioRespository extends CrudRepository<Usuario, Integer>{

	Usuario findByEmail(String email);

}
