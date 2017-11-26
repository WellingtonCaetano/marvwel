package com.br.dao;

import com.br.TO.EntidadeApoioTO.MarcaTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.EntidadeApoioTO.ModeloTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import java.sql.SQLException;
import java.util.Iterator;

public class ModeloPO implements InterfacePersistencia<ModeloTO> {

    @Override
    public void salvar(ModeloTO obj) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO public.modelo( nome,marca) VALUES (?,?)");

        try {
            Connection con = Conexao.getInstancia().getConnection();
            PreparedStatement statement = con.prepareStatement(sql.toString());
            setStatement(statement, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void atualizar(ModeloTO obj) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE public.modelo SET  nome=?,SET marca = ? WHERE codigo=?");

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
        sql.append("DELETE FROM public.modelo WHERE codigo=?");

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
    public List<ModeloTO> list(ModeloTO obj) {
        List<ModeloTO> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder().append("select * from modelo where 1=1 ");
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
    public void setStatement(PreparedStatement statement, ModeloTO obj) {
         try {
            statement.setString(1, obj.getNome());
            statement.setLong(2, obj.getMarca().getCodigo());
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
    public ModeloTO setRest(ResultSet set) {
        ModeloTO modelo = new ModeloTO();
        try {
            modelo.setCodigo(set.getLong("codigo"));
            modelo.setNome(set.getString("nome"));
            //marca
            MarcaTO marca = new MarcaTO();
            marca.setCodigo(set.getLong("marca"));
            Iterator<MarcaTO> listMarca =  new MarcaPO().list(marca).iterator();
            modelo.setMarca(listMarca.next());
    

        } catch (Exception e) {
            // TODO: handle exception
        }
        return modelo;
    }

}
