package br.ufpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.ufpr.config.BDConfig;
import br.ufpr.models.Cliente;
import br.ufpr.models.Nota;

public class UserPredictDAO {

	public List<Cliente> listarTodosClientes() throws Exception {
		List<Cliente> lista = new ArrayList<>();

		Connection conexao = BDConfig.getConnection();

		String sql = "select * from Cliente as cliente,"
				+ " Notas as notas where cliente.idCliente = notas.idCliente";

		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(rs.getInt(1));
			cliente.setNomeCliente(rs.getString(2));
			cliente.setNotaAvaliada(rs.getString(4), rs.getDouble(5));
			lista.add(cliente);
		}

		return lista;
	}
	
	public ArrayList<String> getClientes() throws Exception {
		ArrayList<String> lista = new ArrayList<String>();
		
		Connection conexao = BDConfig.getConnection();
		
		String sql = "select * from cliente";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()) {
			lista.add(rs.getString(2));
		}
		
		return lista;
	}
	
	public HashMap<String, Double> getAvaliacaoPorUsuario(String nome) throws Exception{
		HashMap<String, Double> lista = new HashMap<>();
		
		Connection conexao = BDConfig.getConnection();
		
		String sql = "select * from Cliente as cliente, Notas as notas "
				+ "where cliente.idCliente = notas.idCliente and cliente.nomeCliente=(?)";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, nome);
		ResultSet rs = statement.executeQuery();
		
		
		while (rs.next()) {
			lista.put(rs.getString(4), rs.getDouble(5));
		}
		
		return lista;
	}

	public int insertCliente(String cliente) throws Exception {
		int idGerado = 0;
		Connection conexao = BDConfig.getConnection();

		String sql = "insert into Cliente(nomeCliente) values (?)";

		PreparedStatement statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		statement.setString(1, cliente);
		statement.execute();

		ResultSet rs = statement.getGeneratedKeys();
		/* se foi gerado um id de respost de cadastro */
		if (rs.next()) {
			idGerado = rs.getInt(1);
		}
		return idGerado;
	}
	
	public int insertOnlyNota(Nota nota) throws Exception {
		int contador = 0;
		Connection conexao = BDConfig.getConnection();

		String sql = "insert into Notas(nota,nomeProduto, idCliente) values(?,?, ?)";

		PreparedStatement statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		statement.setDouble(1, nota.getNota());
		statement.setString(2, nota.getProduto());
		statement.setInt(3, nota.getIdCliente());
		statement.execute();

		ResultSet rs = statement.getGeneratedKeys();
		/* se foi gerado um id de respost de cadastro */
		if (rs.next()) {
			contador = rs.getInt(1);
		}
		return contador;
	}
	
	public int insertNota(Double nota, String cliente, int idCliente) throws Exception {
		int contador = 0;
		Connection conexao = BDConfig.getConnection();

		String sql = "insert into Notas(nota,nomeProduto, idCliente) values(?,?, ?)";

		PreparedStatement statement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		statement.setDouble(1, nota);
		statement.setString(2, cliente);
		statement.setInt(3, idCliente);
		statement.execute();

		ResultSet rs = statement.getGeneratedKeys();
		/* se foi gerado um id de respost de cadastro */
		if (rs.next()) {
			contador = rs.getInt(1);
		}
		return contador;
	}

}
