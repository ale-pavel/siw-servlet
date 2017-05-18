<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Prodotti</title>
</head>
<body>
<div class="cotainer">
	<h2>Lista Prodotti inseriti:</h2>
	<div class="list-group">
		<c:forEach var="prodotto" items="${prodotti}">
		<div class="col-sm-12">
			<a class="list-group-item col-sm-4" href="controller?id=${prodotto.id}">${prodotto.nome}</a>
			<a class="btn btn-danger col-sm-2" href="controller?delete=${prodotto.id}">Cancella</a><br>
		</div>
		</c:forEach>
	</div>
</div>
</body>
</html>