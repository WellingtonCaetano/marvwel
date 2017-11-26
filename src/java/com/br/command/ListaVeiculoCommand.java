/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.VeiculoTO;
import com.br.constate.ConstanteView;
import com.br.dao.VeiculoPO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author EDSON
 */
public class ListaVeiculoCommand implements Command {
           
    public ListaVeiculoCommand() {
        
    }
    
    @Override
    public String execute(HttpServletRequest request) {
      
        String next = ConstanteView.PGLISTAVEICULO;
        String acao = request.getParameter("action");

        if (acao.equals(request.getParameter("delet"))) {

            //Tela a ser chamada apos edição
            next = ConstanteView.PGLISTAVEICULO;

            long codigo = Long.parseLong(request.getParameter("codigo"));
            new VeiculoPO().remove(codigo);
            request.setAttribute("veiculos", new VeiculoPO().list(new VeiculoTO()));

        } else if (acao.equals(request.getParameter("edit"))) {
            next = ConstanteView.CADASTRO_VEICULO; // PGLocacao  
            
            VeiculoTO veiculo = null;           
            //lista objeto a ser editado       
            VeiculoTO obj = new VeiculoTO(Long.parseLong(request.getParameter("codigo")));
            ArrayList<VeiculoTO> listVeiculo = (ArrayList) new VeiculoPO().list(obj);
            request.setAttribute("veiculo", listVeiculo.get(0));

        }
        
        request.setAttribute("veiculos", new VeiculoPO().list(new VeiculoTO()));
        return next;
    }

}
