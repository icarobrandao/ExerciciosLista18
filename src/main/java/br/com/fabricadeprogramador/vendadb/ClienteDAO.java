package br.com.fabricadeprogramador.vendadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

	public void cadastrar(Cliente cliente){
		Connection con = ConnectionFactory.getConnection();
		String sql = "insert into cliente (nome, cpf, email) values (? ,?, ?)";
		
		
		try {
			
			PreparedStatement stm = con.prepareStatement(sql);

			stm.setString(1,cliente.getNome());
			stm.setString(2,cliente.getCpf());
			stm.setString(3,cliente.getEmail());
			
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void alterar (Cliente cliente){
		Connection con = ConnectionFactory.getConnection();
		String sql = "update from cliente nome=?. cpf=?, email=? where id =?";
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1,cliente.getNome());
			stm.setString(2, cliente.getCpf());
			stm.setString(3,cliente.getEmail());
			stm.setInt(4,cliente.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void excluir (Cliente cliente){
		Connection con = ConnectionFactory.getConnection();
		String sql = "delete from cliente where id=?";
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1,cliente.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
