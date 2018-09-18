package br.ufpr.servelt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufpr.dao.UserPredictDAO;
import br.ufpr.models.Nota;
import br.ufpr.slopeone.SlopeOne;

@WebServlet(name = "inicializa", urlPatterns = "/Inicializa")
public class Inicializa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String[] mAllItems;
	Map<String, Map<String, Double>> mData;
    Map<String, Map<String, Double>> diffMatrix;
    Map<String, Map<String, Integer>> freqMatrix;

    
	public Inicializa() {
		super();
	}

	public void init(ServletConfig config) {
		  // a base de dado
        Map<String, Map<String, Double>> data = new HashMap<>();
        HashMap<String, Double> user = new HashMap<>();
        UserPredictDAO dao = new UserPredictDAO();
        ArrayList<String> nomes = new ArrayList<>();
      
        // itens for avaliacao
        String movel1 = "movel1";
        String movel2 = "movel2";
        String movel3 = "movel3";
        String movel4 = "movel4";
        String movel5 = "movel5";
        String movel6 = "movel6";
        String movel7 = "movel7";
        String movel8 = "movel8";

        mAllItems = new String[]{movel1, movel2, movel3, movel4, movel5, movel6, movel7, movel8};
        
        try{
        	nomes = dao.getClientes();
        	for(String nome: nomes) {
        		data.put(nome, dao.getAvaliacaoPorUsuario(nome));
        	}
        }catch(Exception error) {
        	System.out.println(error);
        }
		
        // fazendo um pré-processamento
        SlopeOne so = new SlopeOne(data);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
