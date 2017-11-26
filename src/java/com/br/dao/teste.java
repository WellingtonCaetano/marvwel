/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.TO.ClienteTO;
import com.br.TO.EntidadeApoioTO.CategoriaTO;
import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.TO.EntidadeApoioTO.ModeloTO;
import com.br.TO.FuncionarioTO;
import com.br.TO.VeiculoTO;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author EDSON
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     
//        VeiculoTO to = new VeiculoTO();
//        to.setAnoFabricação(1);
//        to.getCategoria().setCodigo(1);
//        to.setStatus(true);
//        to.setPlaca("121212");
//        to.setValorFraquia(11.1);
//        to.setChassi("8888");
//        to.getMarca().setCodigo(1);
//        to.getModeli().setCodigo(1);
//        
//        VeiculoPO dao = new VeiculoPO();
//        dao.salvar(to);
//        
//        ClienteTO cliente = new ClienteTO();
//                       cliente.setCodigo(5);
//			cliente.setNome("edson");
//			cliente.setSenha("1234");
//                        cliente.setCpf("03112999");
//                        cliente.setDt_nascimento(new Date());
//                        cliente.setCnh("1111111");
//                        cliente.setTelefone("22222222");
//                        cliente.setEmail("3333333333");
//                        cliente.setEndereco("44444");                                      
//                        cliente.setStatus(true);
//                        cliente.setCep("00000");
//                        ClientePO daoo = new ClientePO();
//                        daoo.atualizar(cliente);
        
//                         FuncionarioTO fun = new FuncionarioTO();
//                         fun.setMatricula(5);
//                         fun.setNome("jeeee");
//                         fun.setCpf("03111111");
//                         fun.setSenha("111111");
//                         new FuncionarioPO().atualizar(fun);

            
//        Iterator it = new MarcaPO().list(new MarcaTO()).iterator();
//                while (it.hasNext()) {
//                 System.out.println(it.next());
//              }
                CategoriaTO c = new CategoriaTO();
                c.setCodigo(1);
                MarcaTO m = new MarcaTO();
                m.setCodigo(1);
                ModeloTO m1= new ModeloTO();
                m1.setCodigo(1);
                VeiculoTO veiculo = new VeiculoTO(0,c,m,m1, 0, 
                        "NGY1245", "8389923323","2.0", 0, 0, 0, true);
                VeiculoPO dao = new VeiculoPO();
                dao.salvar(veiculo);
                
                
                
                
    }
    
}
