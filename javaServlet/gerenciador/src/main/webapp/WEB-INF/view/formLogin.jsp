<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServerlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServerlet}" method="post">
		Login: <input type="text" name="login" />
		Password: <input type="password" name="password" />
		<input type="hidden" name="accion" value="Login" />
		<input type="submit" />
	</form>
</body>
</html>