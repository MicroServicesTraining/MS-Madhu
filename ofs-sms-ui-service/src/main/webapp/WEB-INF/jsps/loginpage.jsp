<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<form method = "POST", action = "./login/validate">
		Name : <input type = "text" name = "userName" /><br />
		Password : <input type = "password" name = "password" /><br />
		<input type = "submit" value = "LOGIN" />
		<input type = "reset" value = "CLEAR" />		
	</form>
</body>
</html>