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
	<ul class="list-group">
		<li class="list-group-item">Nome: <b>${prodottoInserito.nome}</b></li>
		<li class="list-group-item">Descrizione: <b>${prodottoInserito.descrizione}</b></li>
		<li class="list-group-item">Codice: <b>${prodottoInserito.codice}</b></li>
		<li class="list-group-item">Prezzo: <b>${prodottoInserito.prezzo}</b></li>		
	</ul>
</div>
</body>
</html>