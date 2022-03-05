<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsps Demo</title>
</head>
<body>
<h1>Welcome</h1>
<%= new Date() %>
<br />
<a href="./login">LOGIN</a>

<h2>Get Employees List</h2>
<form method="post" action="http://localhost:8080/oauth/authorize">
<input type="hidden" name="response_type" value="code" />
<input type="hidden" name="client_id" value="demo-app" />
<input type="hidden" name="redirect_uri" value="http://localhost:8080/employees/all" />
<input type="hidden" name="scope" value="read" />
<input type="submit" value="EmployeesList" />
</form>
</body>
</html>