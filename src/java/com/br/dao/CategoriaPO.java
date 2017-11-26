package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.EntidadeApoioTO.CategoriaTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;

public class CategoriaPO implements InterfacePersistencia<CategoriaTO> {

	@Override
	public void salvar(CategoriaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.categoria(nome, valor_diaria)  VALUES ( ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(CategoriaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.categoria SET nome=?, valor_diaria=? WHERE codigo=?");

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
		sql.append("DELETE FROM public.categoria WHERE codigo=?;");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<CategoriaTO> list(CategoriaTO obj) {

		List<CategoriaTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder()
				.append("SELECT codigo, nome, valor_diaria FROM public.categoria where 1=1 ");
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
	public void setStatement(PreparedStatement statement, CategoriaTO obj) {
		try {
			statement.setString(1, obj.getNome());
			statement.setDouble(2, obj.getValorDiaria());
			if (obj.getCodigo() != 0) {
				statement.setLong(3, obj.getCodigo());
			}
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public CategoriaTO setRest(ResultSet set) {
		CategoriaTO cat = new CategoriaTO();
		try {
			cat.setCodigo(set.getLong("codigo"));
			cat.setNome(set.getString("nome"));
			cat.setValorDiaria(set.getDouble("valor_diaria"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		return cat;
	}

}
