package br.edu.infinet.appagendaservico.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tusuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Paciente> pacientes;
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Consulta> consultas;
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Servico> servicos;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="idEndereco")
	private Endereco endereco;
	
	
	public List<Consulta> getConsultas() {
		return consultas;
	}



	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}



	public List<Servico> getServicos() {
		return servicos;
	}



	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public List<Paciente> getPacientes() {
		return pacientes;
	}



	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}



	@Override
	public String toString() {
		return id + ";" + nome + ";" + email + ";" + senha;
	}
	
}
