<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostra Parametri</title>
</head>
<body>
<h1>Dati inseriti nella form</h1>
<ul>
<li>Nome: <b><% out.println((String)session.getAttribute("NOME")); %></b></li>
<li>Cognome: <b><% out.println((String)session.getAttribute("COGNOME")); %></b></li>
</ul>
<h2>Scegli:</h2>
<ul>
<li><a href="<%= response.encodeURL("MostraDati.jsp") %>">Conferma i dati inseriti</a></li>
<li><a href="<%= response.encodeURL("inserimento.html") %>">Torna all'inserimento</a></li>
</ul>
</body>
</html>