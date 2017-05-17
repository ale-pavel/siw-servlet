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
	<div class="list-group">
		<a class="list-group-item">Nome: <b>${prodottoInserito.nome}</b></a>
		<a class="list-group-item">Descrizione: <b>${prodottoInserito.descrizione}</b></a>
		<a class="list-group-item">Codice: <b>${prodottoInserito.codice}</b></a>
		<a class="list-group-item">Prezzo: <b>${prodottoInserito.prezzo}</b></a>		
	</div>
</div>
</body>
</html>