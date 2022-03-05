<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Get Employees List</h2>
<form method="post" action="http://localhost:8080/oauth/authorize">
<input type="hidden" name="response_type" value="code" />
<input type="hidden" name="client_id" value="demo-app" />
<input type="hidden" name="redirect_rui" value="http://localhost:8080/employees/all" />
<input type="hidden" name="scope" value="read" />
<input type="submit" value="EmployeesList" />
</form>
</body>
</html>