/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.EntidadeApoioTO.ModeloTO;
import com.br.constate.ConstanteView;
import com.br.dao.ModeloPO;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author EDSON
 */
public class CadastroModeloCommand  implements Command{

  @Override
    public String execute(HttpServletRequest request) {
       String next = ConstanteView.CADASTRO_MODELO;
       String acao = request.getParameter("action");
       
       if(!acao.equals("cadastrarModelo")){
           if(acao.equalsIgnoreCase("salvarModelo")){
           ModeloTO modelo= new ModeloTO();
           modelo.setNome((String) request.getParameter("nome"));         
           new ModeloPO().salvar(modelo);
           next = ConstanteView.HOME;
           }
       }
       return next;
    }
}
