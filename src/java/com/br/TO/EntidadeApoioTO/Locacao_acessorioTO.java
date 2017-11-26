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
public class Locacao_acessorioTO {
   
    private long codigo ;
    private long codigo_locacao;
    private long codigo_acessorio;

    public Locacao_acessorioTO() {
        this.codigo = 0;
        this.codigo_acessorio=0;
        this.codigo_locacao =0;
    }
    

    public Locacao_acessorioTO(long codigo, long codigo_locacao, long codigo_acessorio) {
        this.codigo = codigo;
        this.codigo_locacao = codigo_locacao;
        this.codigo_acessorio = codigo_acessorio;
    }

    
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo_locacao() {
        return codigo_locacao;
    }

    public void setCodigo_locacao(long codigo_locacao) {
        this.codigo_locacao = codigo_locacao;
    }

    public long getCodigo_acessorio() {
        return codigo_acessorio;
    }

    public void setCodigo_acessorio(long codigo_acessorio) {
        this.codigo_acessorio = codigo_acessorio;
    }

    @Override
    public String toString() {
        return "Locacao_acesorioTO{" + "codigo=" + codigo + ", codigo_locacao=" + codigo_locacao + ", codigo_acessorio=" + codigo_acessorio + '}';
    }
    
    
    
}
