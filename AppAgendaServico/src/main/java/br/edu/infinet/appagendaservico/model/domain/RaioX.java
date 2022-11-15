package br.edu.infinet.appagendaservico.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="traiox")
public class RaioX extends Servico {

	private String tipo;
	private String dentistaResponsavel;
	private String diagnostico;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDentistaResponsavel() {
		return dentistaResponsavel;
	}
	public void setDentistaResponsavel(String dentistaResponsavel) {
		this.dentistaResponsavel = dentistaResponsavel;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + tipo + ";" + dentistaResponsavel + ";" + diagnostico;
	}
	
}
