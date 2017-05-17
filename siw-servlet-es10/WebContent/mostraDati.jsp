<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap.min.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dati Prodotto inseriti</title>
</head>
<body>
<div class="container">
	<h1>Hai confermato i seguenti dati:</h1>
	<ul>
		<li>Nome: <b>${prodottoInserito.nome}</b></li>
		<li>Descrizione: <b>${prodottoInserito.descrizione}</b></li>
		<li>Codice: <b>${prodottoInserito.codice}</b></li>
		<li>Prezzo: <b>${prodottoInserito.prezzo}</b></li>		
	</ul>
</div>
</body>
</html>