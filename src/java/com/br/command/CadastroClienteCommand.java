/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.ClienteTO;
import com.br.constate.ConstanteCadastro;
import com.br.constate.ConstanteView;
import com.br.dao.ClientePO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author EDSON
 */
public class CadastroClienteCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        
        String PAGINA = ConstanteView.CADASTRO_CLIENTE;
        String codigo =request.getParameter(ConstanteCadastro.CODIGO);  
        String acao = request.getParameter(ConstanteCadastro.ACAO);
       
        
       
        if(acao.equals("salvarCliente")){
            
            
            ClientePO dao = new ClientePO();
            ClienteTO cliente = new ClienteTO();
            cliente.setNome(request.getParameter(ConstanteCadastro.NOME));
            cliente.setSenha(request.getParameter(ConstanteCadastro.SENHA));
            cliente.setCpf(request.getParameter(ConstanteCadastro.CPF));
            cliente.setCnh(request.getParameter(ConstanteCadastro.CNH));
            cliente.setTelefone(request.getParameter(ConstanteCadastro.FONE));
            cliente.setEmail(request.getParameter(ConstanteCadastro.EMAIL));
            cliente.setEndereco(request.getParameter(ConstanteCadastro.ENDERECO));  
            cliente.setCep(request.getParameter(ConstanteCadastro.CEP));
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter(ConstanteCadastro.DATA));
                cliente.setDt_nascimento(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            boolean stats;
            String status = request.getParameter(ConstanteCadastro.STATUS);
            if (status.equals("a")) {
                stats = true;
            } else {
                stats = false;
            }
            cliente.setStatus(stats);         
            
            if(request.getParameter("codigo").equalsIgnoreCase("")) {               
              
                dao.salvar(cliente);                
            } else {
               
                cliente.setCodigo(Long.parseLong(codigo));
                dao.atualizar(cliente);
                 
            }  
            request.setAttribute("clientes", new ClientePO().list(new ClienteTO()).iterator());  
            PAGINA =  ConstanteView.PGLISTACLIENTE;
        }
         
        return PAGINA;
    }

}
