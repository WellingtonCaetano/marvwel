package com.br.TO;

public class LoginTO {

	private static LoginTO instancia;

	public static synchronized LoginTO getInstania() {
		if (instancia == null) {
			instancia = new LoginTO();
		}
		return instancia;
	}

	private LoginTO() {

	}

	private long id;
	private String email;
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
