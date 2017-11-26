/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.command;

import com.br.constate.ConstanteView;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author EDSON
 */
public class HomeCommand implements Command{

    @Override
    public String execute(HttpServletRequest request) {
      return ConstanteView.HOME;
    }
    
}
