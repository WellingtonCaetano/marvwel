package com.br.TO.EntidadeApoioTO;

public class MarcaTO {

    private long codigo;
    private String nome;

    public MarcaTO(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public MarcaTO(long codigo) {
        this.codigo = codigo;
    }

    public MarcaTO() {
        this.codigo = 0;
        this.nome = "";
    }

    public MarcaTO(String nome) {
        super();
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

    @Override
    public String toString() {
        return "MarcaTO{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

}
