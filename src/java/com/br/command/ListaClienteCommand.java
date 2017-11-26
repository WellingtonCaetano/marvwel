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
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author EDSON
 */
public class ListaClienteCommand  implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        
         
           ClienteTO cliente = new ClienteTO();      
           ClientePO dao = new ClientePO();
           String acao = request.getParameter(ConstanteCadastro.ACAO);
           String PAGINA = ConstanteView.PGLISTACLIENTE; 
           String codigo = (request.getParameter(ConstanteCadastro.CODIGO));
           
        if (acao.equalsIgnoreCase("RemoveCliente")) {
            dao.remove(Long.parseLong(codigo));

        }
        else if (acao.equalsIgnoreCase("EditarCliente")) {
            
            cliente.setCodigo(Long.parseLong(codigo));
            Iterator clie = dao.list(cliente).iterator();
            request.setAttribute("clienteTO", clie .next());
            PAGINA =   ConstanteView.CADASTRO_CLIENTE;
        }
        
        request.setAttribute("clientes", dao.list(new ClienteTO()).iterator());   
      
        return  PAGINA;
        
        
        
        
        
       
       
    }
    
}
