package com.br.TO;

import com.br.TO.EntidadeApoioTO.CategoriaTO;
import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.TO.EntidadeApoioTO.ModeloTO;
import java.util.Date;

public  class VeiculoTO {

	private long codigo;
        private CategoriaTO categoria;
        private MarcaTO marca;
        private ModeloTO modelo;
        private int  anoFabricação;
        private String placa;
	private String chassi;
        private String motor;
        private int porta;
        private int passageiro;
        private float valorFranquia;
        private boolean status;

    public VeiculoTO(){
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.placa = placa;
        this.chassi = chassi;
        this.motor = motor;
        this.porta = porta;
        this.passageiro = passageiro;
        this.valorFranquia = valorFranquia;
        this.status = status;
    }

    public VeiculoTO(long codigo, CategoriaTO categoria, MarcaTO marca, ModeloTO modelo, int anoFabricação, String placa, String chassi, String motor, int porta, int passageiro, float valorFranquia, boolean status) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.placa = placa;
        this.chassi = chassi;
        this.motor = motor;
        this.porta = porta;
        this.passageiro = passageiro;
        this.valorFranquia = valorFranquia;
        this.status = status;
    }

    public VeiculoTO(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public CategoriaTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTO categoria) {
        this.categoria = categoria;
    }

    public MarcaTO getMarca() {
        return marca;
    }

    public void setMarca(MarcaTO marca) {
        this.marca = marca;
    }

    public ModeloTO getModelo() {
        return modelo;
    }

    public void setModelo(ModeloTO modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public float getValorFranquia() {
        return valorFranquia;
    }

    public void setValorFranquia(float valorFranquia) {
        this.valorFranquia = valorFranquia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VeiculoTO{" + "codigo=" + codigo + ", categoria=" + categoria + ", marca=" + marca + ", modelo=" + modelo + ", anoFabrica\u00e7\u00e3o=" + anoFabricação + ", placa=" + placa + ", chassi=" + chassi + ", motor=" + motor + ", porta=" + porta + ", passageiro=" + passageiro + ", valorFranquia=" + valorFranquia + ", status=" + status + '}';
    }
        		
}
