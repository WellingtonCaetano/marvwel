package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.EntidadeApoioTO.CaracteristicaTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;

public class CaracteristicaPO implements InterfacePersistencia<CaracteristicaTO> {

	@Override
	public void salvar(CaracteristicaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.caracteristica( nome) VALUES (?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(CaracteristicaTO obj) {

		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.caracteristica SET  nome=? WHERE codigo=?");

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
		sql.append("DELETE FROM public.caracteristica WHERE codigo=?;");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			statement.setLong(1, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<CaracteristicaTO> list(CaracteristicaTO obj) {
		List<CaracteristicaTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("select * from public.caracteristica where 1=1 ");
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
	public void setStatement(PreparedStatement statement, CaracteristicaTO obj) {
		try {
			statement.setString(1, obj.getNome());
			if (obj.getCodigo() != 0) {
				statement.setLong(2, obj.getCodigo());
			}
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public CaracteristicaTO setRest(ResultSet set) {
		CaracteristicaTO cara = new CaracteristicaTO();
		try {
			cara.setCodigo(set.getLong("codigo"));
			cara.setNome(set.getString("nome"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cara;
	}

}
