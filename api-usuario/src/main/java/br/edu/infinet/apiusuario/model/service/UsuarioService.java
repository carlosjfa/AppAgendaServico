package br.edu.infinet.apiusuario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.apiusuario.model.domain.Usuario;
import br.edu.infinet.apiusuario.model.repository.UsuarioRespository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRespository repository;

	public void incluir(Usuario usuario) {
		repository.save(usuario);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = repository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
		
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) repository.findAll();
	}
	
	
}
