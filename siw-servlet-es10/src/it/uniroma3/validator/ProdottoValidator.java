package it.uniroma3.validator;

import javax.servlet.http.HttpServletRequest;

import it.uniroma3.model.Prodotto;

public class ProdottoValidator {

	public boolean validate(HttpServletRequest request) {
		boolean tuttoOk = true;

		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String codice = request.getParameter("codice");
		String prezzo = request.getParameter("prezzo");
		Prodotto prodotto = (Prodotto) request.getAttribute("prodottoInserito");

		if (nome==null || nome.equals("")) {
			request.setAttribute("errorNome", "Campo Obbligatorio");
			tuttoOk = false;
		} else 
			prodotto.setNome(nome);

		if (descrizione==null || descrizione.equals("")) {
			request.setAttribute("errorDescrizione", "Campo Obbligatorio");
			tuttoOk = false;
		} else
			prodotto.setDescrizione(descrizione);

		if (codice==null || codice.equals("")) {
			request.setAttribute("errorCodice", "Campo Obbligatorio");
			tuttoOk = false;
		} else
			prodotto.setCodice(codice);

		if (prezzo==null || prezzo.equals("")) {
			request.setAttribute("errorPrezzo", "Campo Obbligatorio");
			tuttoOk = false;
		} else {
			try {
				Float p = Float.parseFloat(prezzo);
				if(p < 0) {
					tuttoOk = false;
					request.setAttribute("errorPrezzo", "Inserire un prezzo positivo");
				} else
					prodotto.setPrezzo(p);
			} catch(NumberFormatException e) {
				request.setAttribute("errorPrezzo", "Inserire un prezzo numerico");
				tuttoOk = false;
			}
		}
		return tuttoOk;
	}

}
