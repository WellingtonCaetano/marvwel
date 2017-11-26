/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

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
public class Veiculo_caracteristicaPO implements InterfacePersistencia<Veiculo_caracteristicaTO>{
    

    @Override
	public void salvar(Veiculo_caracteristicaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.veiculo_caracteristica(codigo_veiculo, codigo_caracteristica)  VALUES ( ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Veiculo_caracteristicaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.veiculo_caracteristica SET codigo_veiculo=?, codigo_caracteristica=? WHERE codigo=?");

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
		sql.append("DELETE FROM public.veiculo_caracteristica WHERE codigo=?;");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Veiculo_caracteristicaTO> list(Veiculo_caracteristicaTO obj) {

		List<Veiculo_caracteristicaTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder()
				.append("SELECT * FROM public.veiculo_caracteristica where 1=1 ");
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
	public void setStatement(PreparedStatement statement, Veiculo_caracteristicaTO obj) {
		try {
			statement.setLong(1, obj.getCodigo_veiculo());
			statement.setLong(2, obj.getCodigo_caracteristica());
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
	public Veiculo_caracteristicaTO setRest(ResultSet set) {
		Veiculo_caracteristicaTO vcara = new Veiculo_caracteristicaTO();
		try {
			vcara.setCodigo(set.getLong("codigo"));
			vcara.setCodigo_veiculo(set.getLong(("codigo_veiculo")));
			vcara.setCodigo_caracteristica(set.getLong("codigo_caracteristica"));

		} catch (Exception e) {
			// TODO: handle exception
		}
		return vcara;
	}

    
}
