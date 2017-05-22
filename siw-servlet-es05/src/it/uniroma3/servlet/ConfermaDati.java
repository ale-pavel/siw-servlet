package it.uniroma3.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/conferma")
public class ConfermaDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		//Prendo la sessione associata alla richiesta inoltrata da /controller, che contiene gli attributi NOME,COGNOME
		HttpSession session = request.getSession();

		// imposto il tipo di risposta (HTML)
		response.setContentType("text/html");

		// preparo un oggetto su cui scrivere la risposta, DOPO aver specificato il tipo di risposta (text/html)
		PrintWriter out = response.getWriter();

		// scrivo il corpo
		out.println("<!DOCTYPE html>"); 
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>mostra parametri</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>" + session.getAttribute("NOME") + "</b></li>");
		out.println("<li>Cognome: <b>" + session.getAttribute("COGNOME") + "</b></li>");
		out.println("</ul>");
		out.println("<h2>Scegli:</h2>");
		out.println("<ul>");
		out.println("<li><a href=\"mostra\">Conferma i dati inseriti</a></li>");
		out.println("<li><a href= " + response.encodeURL("inserimento.html") + ">Torna all'inserimento</a></li>");
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}
}