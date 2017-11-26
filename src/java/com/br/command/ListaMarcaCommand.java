/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.constate.ConstanteCadastro;
import com.br.constate.ConstanteView;
import com.br.dao.MarcaPO;
import com.br.dao.ModeloPO;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author EDSON
 */
public class ListaMarcaCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
        MarcaTO marca = new MarcaTO();
        MarcaPO dao = new MarcaPO();
           String acao = request.getParameter(ConstanteCadastro.ACAO);
           String PAGINA = ConstanteView.PGLISTAMARCAS; 
           String codigo = (request.getParameter(ConstanteCadastro.CODIGO));
           
        if (acao.equalsIgnoreCase("RemoveMarca")) {
          
            dao.remove(Long.parseLong(codigo));
            
          

        }
        else if (acao.equalsIgnoreCase("EditarMarca")) {
            
             marca.setCodigo(Long.parseLong(codigo));
            Iterator marcas = dao.list(marca).iterator();
            request.setAttribute("marcaTO", marcas .next());
            PAGINA =   ConstanteView.CADASTRO_MARCA;
        }
        
        
        request.setAttribute("marcas", dao.list(new MarcaTO()).iterator());   
      
        return  PAGINA; 
        
        
        
        
        
      
    }
    
}
