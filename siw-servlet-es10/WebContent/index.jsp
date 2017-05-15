<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserire dati Prodotto</title>
</head>
<body>
	<form method="get" action="controller">
		<div>Nome *<input type="text" name="nome" value=" ${nome}" />${errorNome}</div>
		<div>Descrizione *<input type="text" name="descrizione" value="${descrizione}" /> ${errorDescrizione}</div>
		<div>Prezzo *<input type="text" name="prezzo" value="${prezzo}" />${errorPrezzo}</div>
		<div>Codice *<input type="text" name="codice" value="${codice}" />${errorCodice}</div>
		<div>*Campo Obbligatorio</div>
		<input type="submit" name="invia" value="Invia" /> 
		<input type="reset" value="Reimposta" />
	</form>
</body>
</html>