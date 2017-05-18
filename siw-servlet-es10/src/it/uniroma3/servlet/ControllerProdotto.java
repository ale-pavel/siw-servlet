package it.uniroma3.servlet;

import it.uniroma3.model.Prodotto;
import it.uniroma3.service.ProductService;
import it.uniroma3.validator.ProdottoValidator;
import java.io.IOException;
import java.util.List;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String nextPage = "";
		ProdottoValidator validator = new ProdottoValidator();
		Prodotto prodotto = new Prodotto();
		request.setAttribute("prodottoInserito", prodotto);

		if (validator.validate(request)) {
			ProductService service = new ProductService();
			service.inserisciProdotto(prodotto);
			nextPage = "/mostraDati.jsp";
		} else
			nextPage = "/index.jsp";

		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/listaProdotti.jsp";
		ProductService service = new ProductService();

		if(request.getParameter("delete") != null) {
			Long id = Long.parseLong(request.getParameter("delete"));
			service.delete(id);
			nextPage = "/listaProdotti.jsp";
		}

		if(request.getParameter("id") != null) {
			Long id = Long.parseLong(request.getParameter("id"));
			Prodotto prodotto = service.getOneProduct(id);
			request.setAttribute("prodotto", prodotto);
			nextPage = "/prodotto.jsp";
		} else {		
			List<Prodotto> prodotti = service.getProdotti();
			request.setAttribute("prodotti", prodotti);
		}
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);	
	}
}
