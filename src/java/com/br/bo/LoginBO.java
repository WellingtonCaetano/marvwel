package com.br.bo;



public class LoginBO {

	private static LoginBO instancia;

	private LoginBO() {
	}

	public static synchronized LoginBO getInstancia() {
		if (instancia == null)
			instancia = new LoginBO();
		return instancia;
	}

	public static int validarLogin(String... args) {
		int retorno = 0;
		if (args[0].equalsIgnoreCase("")) {
			retorno = 7;
		}
		
		if (args[1].equalsIgnoreCase("")) {
			retorno = 7;
		}
		
//		if (!isSenhaEmail(args)) {
//			retorno = 7;
//		}

		return retorno;
	}

//	private static boolean isSenhaEmail(String... args) {
//		ObjCadastro to = ObjCadastro.getInstania();
//		UserDAO daoUser = UserDAO.getInstancia();
//		VendedorDAO daoVend = VendedorDAO.getInstancia();
//		boolean retorno = false;
//
//		to.setEmail(args[0]);
//		to.setSenha(args[1]);
//
//		if (daoUser.list(to).size() != 0) {
//			retorno = true;
//		} else if (daoVend.list(to).size() != 0) {
//			retorno = true;
//		}
//
//		return retorno;
//	}
}
