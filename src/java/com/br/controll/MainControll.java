package com.br.controll;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.br.command.Command;
import com.br.command.HomeCommand;
import com.br.command.CadastroClienteCommand;
import com.br.command.CadastroFuncionarioCommand;
import com.br.command.CadastroLocacaoCommand;
import com.br.command.CadastroMarcaCommand;
import com.br.command.CadastroModeloCommand;
import com.br.command.CadastroOcorrenciaCommand;
import com.br.command.CadastroVeiculoCommand;
import com.br.command.ListaClienteCommand;
import com.br.command.ListaFuncionarioCommand;
import com.br.command.ListaMarcaCommand;
import com.br.command.ListaModeloCommand;
import com.br.command.ListaVeiculoCommand;
import com.br.command.LoginCommand;

@WebServlet("/mainControll")
public class MainControll extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Command> comandos = new HashMap<>();
	private String action;
	private String next;

	@Override
	public void init() throws ServletException {
             
            
            // comandos que chaman as telas  vazia para nova acao 
                comandos.put("PGhome", new HomeCommand());
                comandos.put("PGLogin", new LoginCommand());
                comandos.put("PGcadastrarFuncionario", new CadastroFuncionarioCommand());
                comandos.put("PGcadastrarMarca", new CadastroMarcaCommand());
                comandos.put("PGcadastrarCliente", new CadastroClienteCommand());
                comandos.put("PGcadastrarModelo", new CadastroModeloCommand());
                comandos.put("PGcadastrarVeiculo", new CadastroVeiculoCommand());
                  
                
           //comandos que salva o request ou a acao 
                comandos.put("salvarFuncionario",new CadastroFuncionarioCommand());
                comandos.put("salvarVeiculo", new CadastroVeiculoCommand());
                comandos.put("salvarCliente",new CadastroClienteCommand());  
                comandos.put("salvarLocacao", new CadastroLocacaoCommand());
                comandos.put("salvarOcorrencia",new CadastroOcorrenciaCommand());  
                comandos.put("salvarModelo",new CadastroModeloCommand());
                comandos.put("salvarMarca", new CadastroMarcaCommand());
                
                
            // comandos de alteracao e remocao     
                comandos.put("RemoveFuncionario", new ListaFuncionarioCommand());
                comandos.put("EditarFuncionario", new ListaFuncionarioCommand());
                comandos.put("RemoveCliente", new ListaClienteCommand());
                comandos.put("EditarCliente", new ListaClienteCommand());
                comandos.put("RemoveMarca", new ListaMarcaCommand());
                comandos.put("EditarMarca", new ListaMarcaCommand());
                
             // comandos de  listagem 
                comandos.put("ListarFuncionarios", new ListaFuncionarioCommand());             
                comandos.put("ListarClientes", new ListaClienteCommand());         
                comandos.put("ListarVeiculos",new ListaVeiculoCommand());    
                comandos.put("ListarModelos", new ListaModeloCommand());  
                comandos.put("ListarMarcas", new ListaMarcaCommand());
                     
             
               
              
                comandos.put("loginAcesso", new LoginCommand());
                
               
	}     

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action = req.getParameter("action");

		Command command = isCommand(action);
		next = command.execute(req);
		req.getRequestDispatcher(next).forward(req, resp);
	}

	private Command isCommand(String action) {
		Command command = null;
		for (String key : comandos.keySet()) {
			if (key.equalsIgnoreCase(action)) {
				command = comandos.get(key);
			}

		}

		return command;
	}
}
