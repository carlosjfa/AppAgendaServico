package br.edu.infinet.apiusuario.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infinet.apiusuario.model.domain.Usuario;

public interface UsuarioRespository extends CrudRepository<Usuario, Integer>{

	Usuario findByEmail(String email);

}
