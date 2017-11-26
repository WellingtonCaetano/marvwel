/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.TO.EntidadeApoioTO.Locacao_acessorioTO;
import com.br.TO.EntidadeApoioTO.Veiculo_caracteristicaTO;
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
public class Locacao_acessorioPO implements InterfacePersistencia<Locacao_acessorioTO>{
    
    
     @Override
	public void salvar(Locacao_acessorioTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.locacao_acessorio(codigo_locacao, codigo_acessorio)  VALUES ( ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Locacao_acessorioTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.locacao_acessorio SET codigo_locacao=?, codigo_acessorio=? WHERE codigo=?");

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
		sql.append("DELETE FROM public.locacao_acessorio WHERE codigo=?;");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Locacao_acessorioTO> list(Locacao_acessorioTO obj) {

		List<Locacao_acessorioTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder()
				.append("SELECT * FROM public.locacao_acessorio where 1=1 ");
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
	public void setStatement(PreparedStatement statement, Locacao_acessorioTO obj) {
		try {
			statement.setLong(1, obj.getCodigo_locacao());
                        statement.setLong(2, obj.getCodigo_acessorio());
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
	public Locacao_acessorioTO setRest(ResultSet set) {
		Locacao_acessorioTO l_acess = new Locacao_acessorioTO();
		try {
			l_acess.setCodigo(set.getLong("codigo"));
			l_acess.setCodigo_locacao(set.getLong(("codigo_locacao")));
			l_acess.setCodigo_acessorio(set.getLong("codigo_acessorio"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		return l_acess;
	}

    
}


