package com.br.TO.EntidadeApoioTO;

public class CategoriaTO {

	private long codigo;
	private String nome;
	private double valorDiaria;

	public CategoriaTO() {
		this.codigo = 0;
		this.nome = "";
		this.valorDiaria = 0;
	}

    public CategoriaTO(long codigo) {
        this.codigo = codigo;
    }
        

	public CategoriaTO(String nome, double valorDiaria) {
		this.nome = nome;
		this.valorDiaria = valorDiaria;
	}

	public CategoriaTO(long codigo, String nome, double valorDiaria) {
		this.codigo = codigo;
		this.nome = nome;
		this.valorDiaria = valorDiaria;
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

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

}
