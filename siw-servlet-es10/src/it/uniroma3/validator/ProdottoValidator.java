package it.uniroma3.validator;

import javax.servlet.http.HttpServletRequest;

public class ProdottoValidator {

	public boolean validate(HttpServletRequest request) {
		boolean tuttoOk = true;
		
		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String codice = request.getParameter("codice");
		String prezzo = request.getParameter("prezzo");
		
		if (nome==null || nome.equals("")) {
			request.setAttribute("errorNome", "Campo Obbligatorio");
			tuttoOk = false;
		}
		
		if (descrizione==null || descrizione.equals("")) {
			request.setAttribute("errorDescrizione", "Campo Obbligatorio");
			tuttoOk = false;
		}
		
		if (codice==null || codice.equals("")) {
			request.setAttribute("errorCodice", "Campo Obbligatorio");
			tuttoOk = false;
		}
		
		if (prezzo==null || prezzo.equals("")) {
			request.setAttribute("errorPrezzo", "Campo Obbligatorio");
			tuttoOk = false;
		}
		
		try {
			Float.parseFloat(prezzo);
		} catch(NumberFormatException e) {
			request.setAttribute("errorPrezzo", "Inserire un prezzo numerico");
			tuttoOk = false;
		}
		
		request.setAttribute("nome", nome);
		request.setAttribute("descrizione", descrizione);
		request.setAttribute("codice", codice);
		request.setAttribute("prezzo", prezzo);
		
		return tuttoOk;
	}
	
}
