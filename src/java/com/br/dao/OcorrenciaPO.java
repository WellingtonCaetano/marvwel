/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.TO.OcorrenciaTO;
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
 * 
 * codigo_locacao integer,
  descricao character varying(250),
  valor_total numeric(5,2),
  dt_emissao date,
 */
public class OcorrenciaPO implements InterfacePersistencia<OcorrenciaTO>{
    
      @Override
	public void salvar(OcorrenciaTO obj) {
           
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.ocorrencia( codigo_locacao,descricao, valor_total,dt_emissao, ");		
		sql.append(" VALUES (?, ?, ?, ?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
			setStatement(statement, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(OcorrenciaTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.ocorrencia SET  codigo_locacao=?, descricao=?,valor_total=?,dt_emissao=?,");
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
		sql.append("DELETE FROM public.ocorrencia WHERE codigo=?");

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
	public List<OcorrenciaTO> list(OcorrenciaTO obj) {
		List<OcorrenciaTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("select * from ocorencia where 1=1 ");
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
	public void setStatement(PreparedStatement statement, OcorrenciaTO obj) {

		try {
                        statement.setLong(1, obj.getCodigo_locacao());
                        statement.setString(2,obj.getDescricao());
                        statement.setDouble(3,obj.getValor_total());
                        statement.setDate(4,new java.sql.Date( obj.getDt_emissao().getTime()));           
			
			if (obj.getCodigo() != 0) {
				statement.setLong(5, obj.getCodigo());
			}
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public OcorrenciaTO setRest(ResultSet set) {
		OcorrenciaTO to = new OcorrenciaTO();
		try {
			to.setCodigo(set.getLong("codigo"));
                        to.setCodigo_locacao(set.getLong("codigo_locacao"));			
			to.setDescricao(set.getString("descricao"));                        
                        to.setValor_total(set.getDouble("valor_total"));
                        to.setDt_emissao(set.getDate("dt_emissao"));
			
		} catch (Exception e) {
		}
		return to;
	}

    
    
}
