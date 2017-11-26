package com.br.command;

import com.br.TO.LoginTO;
import com.br.bo.LoginBO;
import com.br.constate.ConstanteView;
import com.br.msguser.MsgMap;
import javax.servlet.http.HttpServletRequest;



public class LoginCommand implements Command {

	@Override
	public String execute(HttpServletRequest request) {
            
		String next = ConstanteView.LOGIN;
                
                
                if(!request.isRequestedSessionIdValid()){
                   next = ConstanteView.HOME;
		String msgErro = null, msgSucesso = null;
		String[] args = { request.getParameter("email"), request.getParameter("senha") };

		MsgMap map = MsgMap.getInstancia();
		int retorno = LoginBO.validarLogin(args);

		if (retorno != 0) {
			LoginTO to =LoginTO.getInstania(); 
			request.setAttribute("login", to);
			
			msgErro = map.getMsg(retorno);
			request.setAttribute("msgErro", msgErro);
			request.setAttribute("msgSucesso", msgSucesso);
		} else {
			next = ConstanteView.HOME;
		}
                }
		return next;
	}

}
