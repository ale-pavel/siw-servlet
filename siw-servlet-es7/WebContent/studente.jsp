<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="it.uniroma3.servlet.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Studente stud = (Studente) request.getAttribute("studente"); %>
Nome: <%= stud.getNome() %>
<p>
Matricola: <%= stud.getMatricola() %>
</p>
</body>
</html>