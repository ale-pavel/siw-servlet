<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserire dati Prodotto</title>
</head>
<body>
	<div class="container">
		<h2>Inserimento dati Prodotto</h2>
		<form method="get" action="controller" class="form-horizontal">
			<div class="form-group col-sm-12">
				<label class="col-sm-2 control-label">Nome:</label>
				<div class="col-sm-8"><input class="form-control" type="text" name="nome"
					value="${prodottoInserito.nome}"></div>
				<div class="col-sm-2">${errorNome}</div>
			</div>
			<div class="form-group col-sm-12">
				<label class="col-sm-2 control-label">Descrizione:</label>
				<div class="col-sm-8"><input class="form-control" type="text" name="descrizione"
					value="${prodottoInserito.descrizione}"></div>
				<div class="col-sm-2">${errorDescrizione}</div>
			</div>
			<div class="form-group col-sm-12">
				<label class="col-sm-2 control-label">Prezzo: </label>
				<div class="col-sm-8"><input class="form-control" type="text" name="prezzo"
					value="${prodottoInserito.prezzo}"></div>
				<div class="col-sm-2">${errorPrezzo}</div>
			</div>
			<div class="form-group col-sm-12">
				<label class="col-sm-2 control-label">Codice:</label>
				<div class="col-sm-8"><input class="form-control" type="text" name="codice"
					value="${prodottoInserito.codice}"></div>
				<div class="col-sm-2">${errorCodice}</div>
			</div>
			<div class="form-group col-sm-12">
				<div class="col-sm-offset-2 col-sm-1">
					<input class="btn btn-primary" type="submit" value="Invia"></div>
				<div class="col-sm-1">
					<input class="btn btn-default" type="reset" value="Reimposta">
				</div>
			</div>
		</form>
	</div>
</body>
</html>