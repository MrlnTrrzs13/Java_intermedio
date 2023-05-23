<!--<%
	//Scriptlet

	String empresa = (String)request.getAttribute("empresa");
	System.out.println(empresa);
%>-->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"></c:import>
	
	<c:if test="${not empty empresa}">
		Empresa ${empresa} registrada!
	</c:if>
	
	<c:if test="${empty empresa}">
		Ninguna Empresa registrada!
	</c:if>

	<!-- Scriptlet	
	Empresa <% out.println(empresa); %> registrada!
	Empresa <%= empresa %> registrada! -->
	
</body>
</html>

<html>
<body>
