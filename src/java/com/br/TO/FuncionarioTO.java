package com.br.TO;

public class FuncionarioTO {

    private long matricula;
    private String senha;
    private String nome;
    private String cpf;

    public FuncionarioTO() {
        this.matricula = 0;
        this.senha = "";
        this.cpf = "";
        this.nome = "";
    }

    

    public FuncionarioTO(String nome, String senha) {
        this.matricula = 0;
        this.nome = nome;
        this.senha = senha;
    }

    public FuncionarioTO( String senha, String nome, String cpf) {      
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "FuncionarioTO{" + "matricula=" + matricula + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + '}';
    }
    

}
