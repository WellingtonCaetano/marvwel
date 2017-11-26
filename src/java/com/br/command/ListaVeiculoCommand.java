/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.VeiculoTO;
import com.br.constate.ConstanteView;
import com.br.dao.VeiculoPO;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author EDSON
 */
public class ListaVeiculoCommand  implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("veiculos", new VeiculoPO().list(new VeiculoTO()));
        return ConstanteView.PGLISTAVEICULO;
    }
    
}
