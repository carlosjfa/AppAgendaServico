package br.edu.infinet.appagendaservico.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="trestauracao")
public class Restauracao extends Servico {

	
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

	@Override
	public String toString() {
		return super.toString() + ";" + codDente + ";" + materialUtilizado + ";" + anosGarantia;
	}
	
	
	
}
