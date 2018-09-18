package br.ufpr.models;

import java.util.HashMap;

public class Cliente {
	
	private int idCliente;
	private String nomeCliente;
	
	/* as notas avaliadas pelo usuário */
	HashMap<String, Double> avaliacao = new HashMap<>();
	
	public HashMap<String, Double> getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(HashMap<String, Double> avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setNotaAvaliada(String produto, Double nota) {
		this.avaliacao.put(produto, nota);
	}
	
	public Double getNotaAvaliada(String produto) {
		return this.avaliacao.get(produto);
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", avaliacao=" + avaliacao + "]";
	}
	
}
