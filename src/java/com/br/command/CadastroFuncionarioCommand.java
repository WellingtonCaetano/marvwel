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
public class CadastroFuncionarioCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) { 

       
        String acao = request.getParameter(ConstanteCadastro.ACAO); 
        String PAGINA = ConstanteView.CADASTRO_FUNCIONARIO;
        String codigo = (request.getParameter(ConstanteCadastro.CODIGO));
       
        if(acao.equalsIgnoreCase("salvarFuncionario")){  
            
        FuncionarioTO fun = new FuncionarioTO();      
        FuncionarioPO dao = new FuncionarioPO();
      
        String cpf = request.getParameter(ConstanteCadastro.CPF);
        String nome = request.getParameter(ConstanteCadastro.NOME);
        String senha = request.getParameter(ConstanteCadastro.SENHA);
       
        fun.setCpf(cpf);
        fun.setNome(nome);
        fun.setSenha(senha);   
        if ( request.getParameter("codigo").equalsIgnoreCase("")) { 
            
            dao.salvar(fun);
        } else {
            fun.setMatricula(Long.parseLong(codigo));          
            dao.atualizar(fun);
        }
        request.setAttribute("funcionarios", new FuncionarioPO().list(new FuncionarioTO()).iterator());         
        PAGINA =  ConstanteView.PGLISTAFUNCIONARIO;
        }       
        return PAGINA;
    }

}
