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
public class ListaModeloCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
       request.setAttribute("modelos", new ModeloPO().list(new ModeloTO()));
       return ConstanteView.PGLISTAMODELOS;
    }
    
}
