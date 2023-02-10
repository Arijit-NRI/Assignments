<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Form</h1>
	<form action="LoginResponseServlet.jsp" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="test@example.com"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>
