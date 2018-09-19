package br.ufpr.servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufpr.dao.UserPredictDAO;
import br.ufpr.slopeone.SlopeOne;

@WebServlet(name = "processa", urlPatterns = "/Processa")
public class Processa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static String[] mAllItems;
	Map<String, Map<String, Double>> mData;
	Map<String, Map<String, Double>> diffMatrix;
	Map<String, Map<String, Integer>> freqMatrix;

	public Processa() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> lista = new ArrayList<>();

		// a base de dado
		Map<String, Map<String, Double>> data = new HashMap<>();

		// resultado do algoritmo
		Map<String, Double> resultado = new HashMap<>();

		HashMap<String, Double> user = new HashMap<>();
		UserPredictDAO dao = new UserPredictDAO();
		ArrayList<String> nomes = new ArrayList<>();
		String nomeUsuario = request.getParameter("nomeUsuario");

		for (int i = 0; i <= 7; i++) {
			lista.add(request.getParameter("movel_" + i));
		}

		// itens for avaliacao
		String movel1 = "movel1";
		String movel2 = "movel2";
		String movel3 = "movel3";
		String movel4 = "movel4";
		String movel5 = "movel5";
		String movel6 = "movel6";
		String movel7 = "movel7";
		String movel8 = "movel8";

		mAllItems = new String[] { movel1, movel2, movel3, movel4, movel5, movel6, movel7, movel8 };
		
		
		// carregando o banco de dados
		try {
			nomes = dao.getClientes();
			for (String nome : nomes) {
				data.put(nome, dao.getAvaliacaoPorUsuario(nome));
			}
		} catch (Exception error) {
			System.out.println(error);
		}
		
		// inserindo no banco de dados para o usuário em especifico
		
		try {
			int idCliente = dao.insertCliente(nomeUsuario);
			dao.insertNota(Double.parseDouble(lista.get(0)), "movel1", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(1)), "movel2", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(2)), "movel3", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(3)), "movel4", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(4)), "movel5", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(5)), "movel6", idCliente);
			dao.insertNota(Double.parseDouble(lista.get(6)), "movel7", idCliente);
			resultado = dao.getAvaliacaoPorUsuario(nomeUsuario);
			data.put(nomeUsuario, resultado);
		} catch (Exception error) {
			System.out.println("Para o usuário em especifico foi feito o seguinte erro" + error);
		}

		// fazendo um pré-processamento
		SlopeOne so = new SlopeOne(data);
		resultado = so.predict(resultado);
		System.out.println("Resultado da predição: " + resultado );
		request.setAttribute("nota_final_algoritmo", String.valueOf(resultado.get("movel8")));
		request.setAttribute("nota_final_usuario", lista.get(7));

		// TODO: fazendo 
		request.getRequestDispatcher("WEB-INF/show.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
