/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.TO.LocacaoTO;
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
public class LocacaoPO implements InterfacePersistencia<LocacaoTO>{
    
    @Override
	public void salvar(LocacaoTO obj) {
           
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.locacao( dt_emissao, dt_retirada, dt_devolucao,cliente,veiculo,total_diarias, ");		
		sql.append(" VALUES (?, ?, ?, ?, ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(LocacaoTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.locacao SET  dt_emissao=?, dt_retirada=?, dt_devolucao=?,cliente=?,veiculo=?,total_diarias=?,");
		sql.append(" WHERE codigo=?");
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
		sql.append("DELETE FROM public.locacao WHERE codigo=?");

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
	public List<LocacaoTO> list(LocacaoTO obj) {
		List<LocacaoTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("select * from locacao where 1=1 ");
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
	public void setStatement(PreparedStatement statement, LocacaoTO obj) {

		try {
                        statement.setDate(1,new java.sql.Date( obj.getDt_emissao().getTime()));
                        statement.setDate(2,new java.sql.Date( obj.getDt_retirada().getTime()));
                        statement.setDate(3,new java.sql.Date( obj.getDt_devolucao().getTime()));
			statement.setLong(4, obj.getClienteTO().getCodigo());
                        statement.setLong(5, obj.getVeiculoTO().getCodigo());
                        statement.setDouble(6, obj.getTotal_diarias());
			
			if (obj.getCodigo() != 0) {
				statement.setLong(7, obj.getCodigo());
			}
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public LocacaoTO setRest(ResultSet set) {
		LocacaoTO to = new LocacaoTO();
		try {
			to.setCodigo(set.getLong("codigo"));
                        to.setDt_emissao(set.getDate("dt_emissao"));			
			to.setDt_retirada(set.getDate("dt_retirada"));                        
                        to.setDt_devolucao(set.getDate("dt_devolucao"));
                        to.setTotal_diarias(set.getDouble("total_diarias"));
			to.getClienteTO().setCodigo(set.getLong("cliente"));
                        to.getVeiculoTO().setCodigo(set.getLong("veiculo"));
		} catch (Exception e) {
		}
		return to;
	}

    
}
