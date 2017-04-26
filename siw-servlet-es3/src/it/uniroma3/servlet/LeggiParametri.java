package it.uniroma3.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/processaDati")
public class LeggiParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String cf = request.getParameter("codice_fiscale").toUpperCase();
		String password = request.getParameter("password").toUpperCase();
		
		String address = request.getRemoteAddr();
		String host = (String)request.getRemoteHost();
		String userAgent = request.getHeader("User-Agent");

		String[] linguaggi = request.getParameterValues("linguaggio"); 
		String corso = request.getParameter("corso");
		String messaggio = request.getParameter("message");
		String esame = request.getParameter("esame");

		// creo gli attributi in comune per l'application context
		request.setAttribute("cf", cf);
		request.setAttribute("password", password);
		request.setAttribute("address", address);
		request.setAttribute("host", host);
		request.setAttribute("userAgent", userAgent);
		request.setAttribute("corso", corso);
		request.setAttribute("messaggio", messaggio);
		request.setAttribute("esame", esame);
		request.setAttribute("linguaggi", linguaggi);

		// leggo (alcune) intestazioni http della richiesta


		ServletContext application = this.getServletContext();
		RequestDispatcher rd  = application.getRequestDispatcher("/mostraDati");
		rd.forward(request, response);
		return;

	}
}
