package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.FuncionarioTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import javax.swing.JOptionPane;

public class FuncionarioPO implements InterfacePersistencia<FuncionarioTO> {

	@Override
	public void salvar(FuncionarioTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.funcionario(  cpf, nome, senha) VALUES (?,?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
                        
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(FuncionarioTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.funcionario SET  cpf= ? ,nome= ?, senha=? WHERE matricula=?");
		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
                         
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void remove(long id) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM public.funcionario");
		sql.append(" WHERE matricula=?");
		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<FuncionarioTO> list(FuncionarioTO obj) {
		List<FuncionarioTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("select * from funcionario where 1=1 ");
		if (obj.getMatricula() != 0) {
			sql.append(" and matricula=" + obj.getMatricula());
		}
		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				list.add(setRest(set));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void setStatement(PreparedStatement statement, FuncionarioTO obj) {
		try {
                        statement.setString(1, obj.getCpf());
			statement.setString(2, obj.getNome());
			statement.setString(3, obj.getSenha());

			if (obj.getMatricula() != 0) {
				statement.setLong(4, obj.getMatricula());
			}
                        
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public FuncionarioTO setRest(ResultSet set) {
		FuncionarioTO fun = new FuncionarioTO();
		try {
			fun.setMatricula(set.getLong("matricula"));
			fun.setNome(set.getString("nome"));
			fun.setSenha(set.getString("senha"));
                        fun.setCpf(set.getString("cpf"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fun;
	}

}
