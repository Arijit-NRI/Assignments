<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = request.getParameter("email");
String password = request.getParameter("password");

if (email != null && password != null) {
    if (email.equals("test@example.com") && password.equals("password")) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>
</head>
<body>
	<h1>Login Successful</h1>
	<p>Welcome, test@example.com</p>
</body>
</html>
<%
    } else {
        response.sendRedirect("error");
    }
} else {
    response.sendRedirect("error");
}
%>
