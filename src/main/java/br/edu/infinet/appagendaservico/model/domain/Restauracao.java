package br.edu.infinet.appagendaservico.model.domain;

public class Restauracao extends Servico {

	private Integer id;
	private int codDente;
	private String materialUtilizado;
	private int anosGarantia;
	
	public int getCodDente() {
		return codDente;
	}
	public void setCodDente(int codDente) {
		this.codDente = codDente;
	}
	public String getMaterialUtilizado() {
		return materialUtilizado;
	}
	public void setMaterialUtilizado(String materialUtilizado) {
		this.materialUtilizado = materialUtilizado;
	}
	public int getAnosGarantia() {
		return anosGarantia;
	}
	public void setAnosGarantia(int anosGarantia) {
		this.anosGarantia = anosGarantia;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return super.toString() + ";" + codDente + ";" + materialUtilizado + ";" + anosGarantia;
	}
	
	
	
}
