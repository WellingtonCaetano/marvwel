/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.EntidadeApoioTO.CategoriaTO;
import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.TO.EntidadeApoioTO.ModeloTO;
import com.br.TO.VeiculoTO;
import com.br.constate.ConstanteCadastro;
import com.br.constate.ConstanteView;
import com.br.dao.CategoriaPO;
import com.br.dao.MarcaPO;
import com.br.dao.ModeloPO;
import com.br.dao.VeiculoPO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author EDSON
 */
public class CadastroVeiculoCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {

        String next = ConstanteView.CADASTRO_VEICULO;

        String acao = request.getParameter("action");

        if (acao.equals(request.getParameter("PGcadastrarVeiculo"))) {
//            next = ConstanteView.HOME;            

            VeiculoTO veiculo = new VeiculoTO();

            //Pega valores da tela
            String codigo = request.getParameter(ConstanteCadastro.CODIGO);
//            veiculo.getCategoria().setCodigo(Long.parseLong(request.getParameter(ConstanteCadastro.CODIGO_CATEGORIA)));
            veiculo.getCategoria().setCodigo(Long.parseLong(request.getParameter("categoria")));
            veiculo.getMarca().setCodigo(Long.parseLong(request.getParameter(ConstanteCadastro.CODIGO_MARCA)));
            veiculo.getModelo().setCodigo(Long.parseLong(request.getParameter(ConstanteCadastro.CODIGO_MODELO)));
            veiculo.setAnoFabricacao(Integer.parseInt(request.getParameter(ConstanteCadastro.ANO_FABRICACAO)));
            veiculo.setPlaca(request.getParameter(ConstanteCadastro.PLACA));
            veiculo.setChassi(request.getParameter(ConstanteCadastro.CHASSI));
            veiculo.setMotor(request.getParameter(ConstanteCadastro.MOTOR));
            veiculo.setPorta(Integer.parseInt(request.getParameter(ConstanteCadastro.PORTA)));
            veiculo.setPassageiro(Integer.parseInt(request.getParameter(ConstanteCadastro.PASSAGEIRO)));
            veiculo.setValorFranquia(Float.parseFloat(request.getParameter(ConstanteCadastro.VALOR_FRANQUIA)));
            veiculo.setStatus(Boolean.parseBoolean(request.getParameter(ConstanteCadastro.STATUS)));

            VeiculoPO dao = new VeiculoPO();
            //executa ações
            if (codigo == null || codigo.isEmpty()) {                
                dao.salvar(veiculo);
                next = ConstanteView.PGLISTAVEICULO;
            } else {
                veiculo.setCodigo(Long.parseLong(codigo));
                dao.atualizar(veiculo);
                next = ConstanteView.PGLISTAVEICULO;
            }
        }
        
        //lista nas combos
        request.setAttribute("categorias", new CategoriaPO().list(new CategoriaTO()));
        request.setAttribute("marcas", new MarcaPO().list(new MarcaTO()));
        request.setAttribute("modelos", new ModeloPO().list(new ModeloTO()));

        return next;
    }

}
