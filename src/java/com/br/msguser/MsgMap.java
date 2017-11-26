package com.br.msguser;

import java.util.HashMap;

public class MsgMap {

	private static MsgMap instancia;

	private MsgMap() {
	}

	public static synchronized MsgMap getInstancia() {
		if (instancia == null)
			instancia = new MsgMap();

		// cadastro de user e vend.
		erro = new HashMap<>();
		erro.put(1, "Nome obrigatório!");
		erro.put(2, "CPF obrigatório!");
		erro.put(3, "Endereço obrigatório!");
		erro.put(4, "E-mail obrigatório!");
		erro.put(5, "Fone obrigatório!");
		erro.put(6, "Data Nascimento obrigatório!");

		// mensagens de logim
		erro.put(7, "Emial ou senha invalido!");

		return instancia;
	}

	private static HashMap<Integer, String> erro;

	public  String getMsg(int codigo) {
		return erro.get(codigo);
	}
}
