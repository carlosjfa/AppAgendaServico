package br.edu.infinet.appagendaservico.model.domain;

import java.time.LocalDateTime;

public abstract class Servico {

	private Integer id;
	private int codigo;
	private float preco;
	private LocalDateTime data;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return codigo + ";" + preco + ";" + data;
	}

}
