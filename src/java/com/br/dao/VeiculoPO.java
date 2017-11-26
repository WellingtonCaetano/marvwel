package com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.TO.EntidadeApoioTO.CategoriaTO;
import com.br.TO.EntidadeApoioTO.MarcaTO;
import com.br.TO.EntidadeApoioTO.ModeloTO;
import com.br.TO.VeiculoTO;
import com.br.controll.conexao.Conexao;
import com.br.util.InterfacePersistencia;
import javax.swing.JOptionPane;

public class VeiculoPO implements InterfacePersistencia<VeiculoTO> {

    @Override
    public void salvar(VeiculoTO obj) {

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO public.veiculo( categoria, marca, modelo, ano_fabricacao, placa, chassi, ");
        sql.append(" motor,porta,passageiro,valor_franquia, status)");
        sql.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?)");

        try {
            Connection con = Conexao.getInstancia().getConnection();
            PreparedStatement statement = con.prepareStatement(sql.toString());
            setStatement(statement, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void atualizar(VeiculoTO obj) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE public.veiculo SET  categoria=?, marca=?, modelo=?, ano_fabricacao=?, placa=?, chassi=?, ");
        sql.append(" motor=?,porta=?,passageiro=?,valor_franquia=?, status=? ");
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
        sql.append("DELETE FROM public.veiculo WHERE codigo=?");

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
    public List<VeiculoTO> list(VeiculoTO obj) {
        List<VeiculoTO> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder().append("select * from veiculo where 1=1 ");
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
    public void setStatement(PreparedStatement statement, VeiculoTO obj) {

        try {
            statement.setLong(1, obj.getCategoria().getCodigo());
            statement.setLong(2, obj.getMarca().getCodigo());
            statement.setLong(3, obj.getModelo().getCodigo());
            statement.setInt(4, obj.getAnoFabricação());
            statement.setString(5, obj.getPlaca());
            statement.setString(6, obj.getChassi());
            statement.setString(7, obj.getMotor());
            statement.setInt(8, obj.getPorta());
            statement.setInt(9, obj.getPassageiro());
            statement.setFloat(10, obj.getValorFranquia());
            statement.setBoolean(11, obj.isStatus());
            if (obj.getCodigo() != 0) {
                statement.setLong(12, obj.getCodigo());
            }

            statement.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public VeiculoTO setRest(ResultSet set) {
        VeiculoTO to = new VeiculoTO();
        try {
            to.setCodigo(set.getLong("codigo"));
            CategoriaTO cat = new CategoriaTO();
            //Categoria           
            CategoriaTO categoria = new CategoriaTO(set.getLong("categoria"));
            ArrayList<CategoriaTO> listCategoria = (ArrayList) new CategoriaPO().list(categoria);
            to.setCategoria(listCategoria.get(0));
            //marca
            MarcaTO marca = new MarcaTO(set.getLong("marca"));
            ArrayList<MarcaTO> listMarca = (ArrayList) new MarcaPO().list(marca);
            to.setMarca(listMarca.get(0));
            //Modelo
            ModeloTO modelo = new ModeloTO(set.getLong("modelo"));
            ArrayList<ModeloTO> listModelo = (ArrayList) new ModeloPO().list(modelo);
            to.setModelo(listModelo.get(0));    
            //
            to.setAnoFabricação(set.getInt("ano_fabricacao"));
            to.setPlaca(set.getString("placa"));
            to.setChassi(set.getString("chassi"));
            to.setMotor(set.getString("motor"));
            to.setPorta(set.getInt("porta"));
            to.setPassageiro(set.getInt("passageiro"));           
            to.setValorFranquia(set.getFloat("valor_franquia"));
            to.setStatus(set.getBoolean("status"));
            
        } catch (Exception e) {
        }
        return to;
    }

}
