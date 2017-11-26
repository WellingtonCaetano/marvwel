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
public class Veiculo_caracteristicaTO {
    
    private long codigo;
    private long codigo_veiculo;
    private long codigo_caracteristica;

    public Veiculo_caracteristicaTO() {
        this.codigo=0;
        this.codigo_caracteristica=0;
        this.codigo_veiculo =0;
        
    }

    public Veiculo_caracteristicaTO(long codigo, long codigo_veiculo, long codigo_caracteristica) {
        this.codigo = codigo;
        this.codigo_veiculo = codigo_veiculo;
        this.codigo_caracteristica = codigo_caracteristica;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo_veiculo() {
        return codigo_veiculo;
    }

    public void setCodigo_veiculo(long codigo_veiculo) {
        this.codigo_veiculo = codigo_veiculo;
    }

    public long getCodigo_caracteristica() {
        return codigo_caracteristica;
    }

    public void setCodigo_caracteristica(long codigo_caracteristica) {
        this.codigo_caracteristica = codigo_caracteristica;
    }

    @Override
    public String toString() {
        return "Veiculo_caracteriticaTO{" + "codigo=" + codigo + ", codigo_veiculo=" + codigo_veiculo + ", codigo_caracteristica=" + codigo_caracteristica + '}';
    }
    
    
}
