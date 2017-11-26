package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import javax.swing.JOptionPane;

public class MarcaPO implements InterfacePersistencia<MarcaTO> {

	@Override
	public void salvar(MarcaTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.marca(  nome)VALUES ( ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(MarcaTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.marcaSET  nome=? WHERE codigo=?");

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
             
		sql.append("DELETE FROM public.marca");
		sql.append(" WHERE codigo=?");
                try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
                        JOptionPane.showMessageDialog(null,"modeloset"+statement);
		} catch (SQLException e) {
			e.printStackTrace();
                                e.getMessage();
		}

	}

	@Override
	public List<MarcaTO> list(MarcaTO obj) {
		List<MarcaTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("SELECT codigo, nome FROM public.marca where 1=1");
		if (obj.getCodigo() != 0) {
			sql.append(" and codigo=" + obj.getCodigo());
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
	public void setStatement(PreparedStatement statement, MarcaTO obj) {
		try {
			statement.setString(1, obj.getNome());
			if (obj.getCodigo() != 0) {
				statement.setLong(2, obj.getCodigo());
			}
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public MarcaTO setRest(ResultSet set) {
		MarcaTO to = new MarcaTO();
		try {
			to.setCodigo(set.getLong("codigo"));
			to.setNome(set.getString("nome"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return to;
	}

}
