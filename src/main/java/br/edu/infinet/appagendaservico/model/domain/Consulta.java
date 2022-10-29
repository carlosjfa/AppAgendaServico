package br.edu.infinet.appagendaservico.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Consulta {

	private Integer id;
	private LocalDateTime data;
	private String convenio;
	private boolean primeiraVez;
	private boolean retorno;
	private Paciente paciente;
	private List<Servico> servicos;
	
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

	@Override
	public String toString() {
		return data + ";" + convenio + ";" + primeiraVez + ";" + retorno + ";" + paciente + ";" + servicos.size();
	}
	
	
}