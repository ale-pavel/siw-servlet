<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserimento Studente</title>
</head>
<body>
<form method="get" action="studenteController">
	<p>Matricola <input type="text" name="matricola" maxlength="6" required
	value="<% if(request.getParameter("matricola")!=null) out.println(request.getParameter("matricola")); %>"/>
	<% if(request.getAttribute("matricolaError")!=null) 
	out.println(request.getAttribute("matricolaError"));%>
	Nome <input type="text" name="nome" size="9" maxlength="32" required
	value="<% if(request.getParameter("nome")!=null) out.println(request.getParameter("nome")); %>"/>
	<% if(request.getAttribute("nomeError")!=null) 
	out.println(request.getAttribute("nomeError"));%>
	</p>
	<input type="reset" value="Reimposta" />
	<input type="submit" name="inviaDati" value="Invia" />
</form>

</body>
</html>