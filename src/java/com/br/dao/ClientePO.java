package com.br.dao;

import com.br.TO.ClienteTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import javax.swing.JOptionPane;

public class ClientePO implements InterfacePersistencia<ClienteTO> {

	@Override
	public void salvar(ClienteTO obj) {
           
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO public.cliente(nome,cpf,dt_nascimento,cnh,telefone,email,endereco,cep,status, senha) VALUES (?,?,?,?,?,?,?,?,?,?)");

		try {
			Connection con = Conexao.getInstancia().getConnection();
			PreparedStatement statement = con.prepareStatement(sql.toString());
                        
			setStatement(statement, obj); 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(ClienteTO obj) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE public.cliente SET  nome=?,cpf=?,dt_nascimento=?,cnh=?,telefone=?,email=?,endereco=?,cep=?,status=?, senha=? WHERE codigo=?");
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
		sql.append("DELETE FROM public.cliente");
		sql.append(" WHERE codigo=?");
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
	public List<ClienteTO> list(ClienteTO obj) {
		List<ClienteTO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder().append("select * from cliente where 1=1 ");
		if (obj.getCodigo()!= 0) {
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
	public void setStatement(PreparedStatement statement, ClienteTO obj) {
            
		try {
                    statement.setString(1, obj.getNome());
                    statement.setString(2, obj.getCpf());
                    statement.setDate(3, new java.sql.Date(obj.getDt_nascimento().getTime()));
                    statement.setString(4, obj.getCnh());
                    statement.setString(5, obj.getTelefone());
                    statement.setString(6, obj.getEmail());
                    statement.setString(7, obj.getEndereco());
                    statement.setString(8, obj.getCep());                   
                    statement.setBoolean(9, obj.isStatus());
                    statement.setString(10, obj.getSenha());
                
                    if (obj.getCodigo() != 0) {
                        statement.setLong(11, obj.getCodigo());
                    }
                   
                    statement.execute();
                     
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ClienteTO setRest(ResultSet set) {
		ClienteTO cliente = new ClienteTO();
		try {
			cliente.setCodigo(set.getLong("codigo"));
			cliente.setNome(set.getString("nome"));
			cliente.setSenha(set.getString("senha"));
                        cliente.setCpf(set.getString("cpf"));
                        cliente.setDt_nascimento(set.getDate("dt_nascimento"));
                        cliente.setCnh(set.getString("cnh"));
                        cliente.setTelefone(set.getString("telefone"));
                        cliente.setEmail(set.getString("email"));
                        cliente.setEndereco(set.getString("endereco"));
                        cliente.setSenha(set.getString("senha"));                  
                        cliente.setStatus(set.getBoolean("status"));
                        cliente.setCep(set.getString("cep"));
                    
                   		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cliente;
	}

  

}
