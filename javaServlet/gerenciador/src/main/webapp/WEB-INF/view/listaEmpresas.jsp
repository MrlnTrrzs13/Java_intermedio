<%@page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, com.alura.gerenciador.modelo.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"></c:import>

	Usuario Logeado: ${ loginUsuario.login }
	<br>
	<br>

	<c:if test="${not empty empresa }">
		Empresa ${ empresa } registrada! <br/>
	</c:if>
	<h1>Lista de Empresas: <br /></h1>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">			
			<li>
				${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaApertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${ empresa.id }">Modificar</a>
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${ empresa.id }">Eliminar</a>
			</li>			
		</c:forEach>
	</ul>
	
	<!-- scriptlet -->
	<!--<ul>
		<%
			List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
			for (Empresa empresa : lista) {
		%>
			<li> <%= empresa.getNombre()%> </li>
		<% 
			} 
		%>
	</ul>-->
</body>
</html>