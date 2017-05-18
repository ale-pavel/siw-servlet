<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap.min.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prodotto Selezionato</title>
</head>
<body>
<div class="container">
	<h1>Prodotto Selezionato:</h1>
	<div class="list-group">
		<a class="list-group-item">ID: <b>${prodotto.id}</b></a>
		<a class="list-group-item">Nome: <b>${prodotto.nome}</b></a>
		<a class="list-group-item">Descrizione: <b>${prodotto.descrizione}</b></a>
		<a class="list-group-item">Codice: <b>${prodotto.codice}</b></a>
		<a class="list-group-item">Prezzo: <b>${prodotto.prezzo}</b></a>		
	</div>
</div>
</body>
</html>