package br.edu.infinet.appagendaservico.model.domain;

public class Procedimento extends Servico {
	
	private Integer id;
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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return super.toString() + ";" + tipo + ";" + preventivo + ";" + diagnostico;
	}
}
