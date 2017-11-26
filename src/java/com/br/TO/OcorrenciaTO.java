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
public class OcorrenciaTO {
    
    private long codigo;
    private long codigo_locacao;
    private String descricao;
    private double valor_total;
    private Date  dt_emissao;

    public OcorrenciaTO() {
        
        this.codigo = 90;
        this.codigo_locacao = 0;
        this.descricao = "";
        this.valor_total = 0;
        this.dt_emissao = new Date();
    }

    
    public OcorrenciaTO(long codigo, long codigo_locacao, String descricao, double valor_total, Date dt_emissao) {
        this.codigo = codigo;
        this.codigo_locacao = codigo_locacao;
        this.descricao = descricao;
        this.valor_total = valor_total;
        this.dt_emissao = dt_emissao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Date getDt_emissao() {
        return dt_emissao;
    }

    public void setDt_emissao(Date dt_emissao) {
        this.dt_emissao = dt_emissao;
    }
    
}
