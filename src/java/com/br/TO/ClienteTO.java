/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.TO;

import java.util.Date;

/**
 *
 * @author EDSON
 */
public class ClienteTO {
   private  long codigo;
   private String nome ;
   private String cpf;
   private Date dt_nascimento;
   private String cnh;
   private String endereco;
   private String telefone;
   private String  email;
   private boolean status;
   private String senha ;
   private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public ClienteTO() {
        this.codigo = 0;
        this.nome = "";
        this.cpf = "";
        this.dt_nascimento = new Date();
        this.cnh = "";
        this.endereco = "";
        this.telefone = "";
        this.email = "";
        this.status = false;
        this.senha = "";
        this.cep ="";
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "ClienteTO{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dt_nascimento=" + dt_nascimento + ", cnh=" + cnh + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", status=" + status + ", senha=" + senha + '}';
    }
    
    
}
