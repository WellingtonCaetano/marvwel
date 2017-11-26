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
public class LocacaoTO {
    
    private long codigo ;
    private Date dt_emissao;
    private ClienteTO clienteTO;
    private VeiculoTO veiculoTO;
    private Date dt_retirada;
    private Date dt_devolucao;
    private double total_diarias;

    public LocacaoTO() {
        this.codigo = 0;
        this.dt_emissao = new Date();
        this.dt_retirada = new Date();
        this.dt_devolucao = new Date();
        this.clienteTO = new ClienteTO();
        this.veiculoTO = new VeiculoTO();
        this.total_diarias = 0;
        
    }

    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDt_emissao() {
        return dt_emissao;
    }

    public void setDt_emissao(Date dt_emissao) {
        this.dt_emissao = dt_emissao;
    }

    public ClienteTO getClienteTO() {
        return clienteTO;
    }

    public void setClienteTO(ClienteTO clienteTO) {
        this.clienteTO = clienteTO;
    }

    public VeiculoTO getVeiculoTO() {
        return veiculoTO;
    }

    public void setVeiculoTO(VeiculoTO veiculoTO) {
        this.veiculoTO = veiculoTO;
    }

    public Date getDt_retirada() {
        return dt_retirada;
    }

    public void setDt_retirada(Date dt_retirada) {
        this.dt_retirada = dt_retirada;
    }

    public Date getDt_devolucao() {
        return dt_devolucao;
    }

    public void setDt_devolucao(Date dt_devolucao) {
        this.dt_devolucao = dt_devolucao;
    }

    public double getTotal_diarias() {
        return total_diarias;
    }

    public void setTotal_diarias(double total_diarias) {
        this.total_diarias = total_diarias;
    }
    
    
    
}
