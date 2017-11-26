/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.FuncionarioTO;
import com.br.constate.ConstanteCadastro;
import com.br.constate.ConstanteView;
import com.br.dao.FuncionarioPO;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author EDSON
 */
public class ListaFuncionarioCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        
          
           FuncionarioTO fun = new FuncionarioTO();      
           FuncionarioPO dao = new FuncionarioPO();
           String acao = request.getParameter(ConstanteCadastro.ACAO);
           String PAGINA = ConstanteView.PGLISTAFUNCIONARIO; 
           String codigo = (request.getParameter(ConstanteCadastro.CODIGO));
           
        if (acao.equalsIgnoreCase("RemoveFuncionario")) {
            dao.remove(Long.parseLong(codigo));

        }
        else if (acao.equalsIgnoreCase("EditarFuncionario")) {
            fun.setMatricula(Long.parseLong(codigo));
            Iterator funcionario = dao.list(fun).iterator();
            request.setAttribute("funcionarioTO", funcionario.next());
            PAGINA =   ConstanteView.CADASTRO_FUNCIONARIO;
        }
        request.setAttribute("funcionarios", dao.list(new FuncionarioTO()).iterator());   
      
        return  PAGINA;
    }
    
}
