<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Gestion usuario </h1><h3> agregando un  titulo tres</h3>
    

<%!String d="",n="",e="",p="",u=""; %>
<%
if(request.getParameter("d")!=null){

d=request.getParameter("d");
n=request.getParameter("n");
e=request.getParameter("e");
p=request.getParameter("p");
u=request.getParameter("u");


JOptionPane.showMessageDialog(null, d+n+e+p);

}
%>
<form action="Usuario" method="post">
<input type="text" name="doc" value="<%=d %>" placeholder="Docuemnto">
<input type="text" name="nom" value="<%=n %>"placeholder="nombre">
<input type="text" name="usu" value="<%=u %>" placeholder="usuario">
<input type="email" name="ema" value="<%=e%>" placeholder="correo">
<input type="password" name="cla" value="<%=p %>" placeholder="clave">
<div></div>
<div><input type="submit" name="btnins"  value="Registrar">
<input type="submit" name="btncon"  value="Consultar">
<input type="submit" name="btnact"  value="Actualizar">
<input type="submit" name="btneli"  value="Eliminar"></div>
</form>



</body>
</html>
