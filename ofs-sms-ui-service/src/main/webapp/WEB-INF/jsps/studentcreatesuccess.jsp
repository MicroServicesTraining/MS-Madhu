<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	if(request.getAttribute("studentMgmtResponse") != null){  	
%>
<h2>${studentMgmtResponse.message}</h2> 
New Student Roll Number :: ${ studentMgmtResponse.data.studentId } <br />
Student Name :: ${ studentMgmtResponse.data.studentName }<br />
Student City :: ${ studentMgmtResponse.data.studentProfile.city }


<%} %>
</body>
</html>