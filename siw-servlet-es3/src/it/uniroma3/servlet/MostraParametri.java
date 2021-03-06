package it.uniroma3.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/mostraDati")
public class MostraParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// gestione della RISPOSTA

		// preparo il tipo (HTML)
		response.setContentType("text/html");
		// preparo un oggetto su cui scrivere la risposta
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
		out.println("<li>Nome: <b>"+request.getAttribute("cf")+"</b></li>");
		out.println("<li>Cognome: <b>"+request.getAttribute("password")+"</b></li>");
		for(String lang: (String[]) request.getAttribute("linguaggi")) {
			out.println("<li>Linguaggio: <b>"+lang+"</b></li>");
		}
		out.println("<li>Corso: <b>"+request.getAttribute("corso")+"</b></li>");
		out.println("<li>Messaggio: <b>"+request.getAttribute("messaggio")+"</b></li>");
		out.println("<li>Esame: <b>"+request.getAttribute("esame")+"</b></li>");
		out.println("</ul>");
		out.println("<h1>Altri dati relativi alla richiesta</h1>");
		out.println("<br />IP: <b>"+request.getAttribute("address")+"</b>");
		out.println("<br />Host: <b>"+request.getAttribute("host")+"</b>");
		out.println("<br />User Agent: <b>"+request.getAttribute("userAgent")+"</b>");
		out.println("</body>\n</html> ");

	}
}

