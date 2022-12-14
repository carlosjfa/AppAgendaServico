package br.edu.infinet.appagendaservico.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tconsulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime data;
	private String convenio;
	private boolean primeiraVez;
	private boolean retorno;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="idPaciente")
	private Paciente paciente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Servico> servicos;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	public Consulta() {
		this.data = LocalDateTime.now();
	}
	
	public Consulta(Paciente paciente) {
		this();
		this.paciente = paciente;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public boolean isRetorno() {
		return retorno;
	}
	public void setRetorno(boolean retorno) {
		this.retorno = retorno;
	}
	public boolean isPrimeiraVez() {
		return primeiraVez;
	}
	public void setPrimeiraVez(boolean primeiraVez) {
		this.primeiraVez = primeiraVez;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return data + ";" + convenio + ";" + primeiraVez + ";" + retorno + ";" + paciente + ";" + servicos.size();
	}
	
	
}
