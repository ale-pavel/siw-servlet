package it.uniroma3.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/controller")
public class ControllerDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA

		// leggo e manipolo i parametri
		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();

		// metto i valori nella sessione
		HttpSession session = request.getSession();
		session.setAttribute("NOME", nome);
		session.setAttribute("COGNOME", cognome);

		// inoltro
		ServletContext application  = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/ConfermaDati.jsp");
		rd.forward(request, response);
		return; 
	}
}
