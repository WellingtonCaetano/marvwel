package com.br.TO.EntidadeApoioTO;

public class CaracteristicaTO {

	private long codigo;
	private String nome;

	public CaracteristicaTO() {
		this.codigo = 0;
		this.nome = "";
	}

	public CaracteristicaTO(String nome) {
		this.nome = nome;
	}

	public CaracteristicaTO(long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
