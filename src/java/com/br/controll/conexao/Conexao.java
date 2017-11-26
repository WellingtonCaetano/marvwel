package com.br.controll.conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Conexao instancia;

	public static Conexao getInstancia() {
		if (instancia == null)
			instancia = new Conexao();
		return instancia;
	}
	
	
	private Conexao() {
	}


	private Connection connection = null;

	public Connection getConnection() {
		if (connection != null)
			return connection;
		else {
			try {

				String driver = "org.postgresql.Driver";
				String url = "jdbc:postgresql://localhost:5432/marvwel";
				String user = "postgres";
				String password = "123456";
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}
	public static void main(String[] args) {
		try {
			
			Connection con = Conexao.getInstancia().getConnection();
			System.out.println("conexão: "+con);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
