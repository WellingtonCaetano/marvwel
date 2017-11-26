/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.TO.EntidadeApoioTO.AcessorioTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDSON
 */
public class AcessorioPO implements InterfacePersistencia<AcessorioTO>{
    
    
    @Override
	public void salvar(AcessorioTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.acessorio(nome, valor_aluguel)  VALUES ( ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(AcessorioTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.acessorio SET nome=?, valor_aluguel=? WHERE codigo=?");

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
		sql.append("DELETE FROM public.acessorio WHERE codigo=?;");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<AcessorioTO> list(AcessorioTO obj) {

		List<AcessorioTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder()
				.append("SELECT codigo, nome, valor_aluguel FROM public.acessorio where 1=1 ");
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
	public void setStatement(PreparedStatement statement, AcessorioTO obj) {
		try {
			statement.setString(1, obj.getNome());
			statement.setDouble(2, obj.getValor_aluguel());
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
	public AcessorioTO setRest(ResultSet set) {
		AcessorioTO cat = new AcessorioTO();
		try {
			cat.setCodigo(set.getLong("codigo"));
			cat.setNome(set.getString("nome"));
			cat.setValor_aluguel(set.getDouble("valor_aluguel"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		return cat;
	}

}

    

