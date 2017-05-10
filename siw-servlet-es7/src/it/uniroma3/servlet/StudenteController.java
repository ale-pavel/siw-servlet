package it.uniroma3.servlet;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// leggo i parametri
		String matricola = request.getParameter("matricola");
		String nome = request.getParameter("nome");
		String nextPage = "/studente.jsp";
		
		boolean tuttoOk = true; //Per verificare se almeno un campo non è corretto, e indirizzare l'utente a newStudente.jsp

		Studente stud = new Studente(matricola, nome);
		request.setAttribute("studente", stud);

		/*request.setAttribute("nome", nome);
		request.setAttribute("matricola", matricola);*/

		if(matricola==null || matricola.equals("")) {
			request.setAttribute("matricolaError", "Matricola non valida");
			tuttoOk = false;
		}
		if(nome==null || nome.equals("")) {
			request.setAttribute("nomeError", "Nome non valido");
			tuttoOk = false; }
		if (!tuttoOk)
			nextPage = "/newStudente.jsp";
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
}
