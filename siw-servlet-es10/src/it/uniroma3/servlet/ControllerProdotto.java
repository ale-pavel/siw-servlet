package it.uniroma3.servlet;

import it.uniroma3.model.Prodotto;
import it.uniroma3.validator.ProdottoValidator;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class ControllerProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String codice = request.getParameter("codice");
		String prezzo = request.getParameter("prezzo");
		
		String nextPage = "";
		ProdottoValidator validator = new ProdottoValidator();
		
		if (validator.validate(request)) {
			nextPage = "/mostraDati.jsp";
			request.setAttribute("prodottoInserito", new Prodotto(nome, descrizione, codice, Float.parseFloat(prezzo)));
		} else
			nextPage = "/index.jsp";
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
}
