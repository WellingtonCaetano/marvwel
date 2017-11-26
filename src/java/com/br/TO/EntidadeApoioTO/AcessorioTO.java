/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.TO.EntidadeApoioTO;

/**
 *
 * @author EDSON
 */
public class AcessorioTO {
    
    private long codigo;
    private String nome;
    private double valor_aluguel;

    public AcessorioTO() {
        
        this.codigo = 0;
        this.nome ="";
        this.valor_aluguel = 0;
                
    }

    
    
    public AcessorioTO(long codigo, String nome) {
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

    public double getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    @Override
    public String toString() {
        return "AcessorioTO{" + "codigo=" + codigo + ", nome=" + nome + ", valor_aluguel=" + valor_aluguel + '}';
    }
    
}
