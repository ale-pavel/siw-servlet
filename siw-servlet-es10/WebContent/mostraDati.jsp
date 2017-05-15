<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dati Prodotto inseriti:</title>
</head>
<body>
	<h1>Hai confermato i seguenti dati:</h1>
	<ul>
		<li>Nome: <b>${ prodottoInserito.nome }</b></li>
		<li>Descrizione: <b>${ prodottoInserito.descrizione }</b></li>
		<li>Codice: <b>${ prodottoInserito.codice }</b></li>
		<li>Prezzo: <b>${ prodottoInserito.prezzo }</b></li>		
	</ul>
</body>
</html>