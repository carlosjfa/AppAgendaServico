package br.edu.infinet.appagendaservico.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="tprocedimento")
public class Procedimento extends Servico {
	
	private String tipo;
	private boolean preventivo;
	private String diagnostico;
	
	public boolean isPreventivo() {
		return preventivo;
	}
	public void setPreventivo(boolean preventivo) {
		this.preventivo = preventivo;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ";" + tipo + ";" + preventivo + ";" + diagnostico;
	}
}
