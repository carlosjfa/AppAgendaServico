package br.edu.infinet.appagendaservico.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infinet.appagendaservico.clients.IEnderecoClient;
import br.edu.infinet.appagendaservico.model.domain.Endereco;
import br.edu.infinet.appagendaservico.model.domain.Servico;
import br.edu.infinet.appagendaservico.model.domain.Usuario;
import br.edu.infinet.appagendaservico.model.repository.UsuarioRespository;

@Service
public class UsuarioService {
	
	@Autowired
	private IEnderecoClient enderecoClient;


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
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) repository.findAll();
	}
	
	
}
