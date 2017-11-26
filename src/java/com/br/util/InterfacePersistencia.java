package com.br.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface InterfacePersistencia<T> {

	public  void  salvar(T obj) ;

	public void atualizar(T obj);

	public void remove(long id) ;

	public List<T> list(T obj) ;

	public void setStatement(PreparedStatement statement, T obj) ;

	public T setRest(ResultSet set) ;

}
