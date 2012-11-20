<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.test.phonegab.ConexionGoogle" %>
<%@ page import="com.test.phonegab.Contacto" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba Obtener datos del Cloud SQL</title>
</head>
<body>
	<ul>
		<%
			ConexionGoogle con=new ConexionGoogle();
			String mensaje="Si sale esto es porque se compilo codigo java";
			List<Contacto> list=con.getContactos();
			%> <p> <% mensaje %> </p> <%
			for(Contacto e:list)
			{%>
			<li>Nombre:<%= e.getNombre() %></li>
			<li>Apellido:<%= e.getCargo() %></li>
			<li>Email:<%= e.getEmail() %></li>
			<%}	%>
	</ul>
</body>
</html>