<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>Employee Registration Form</h1>
	
	<form action="<%= request.getContextPath() %>/register" method="POST">
		<table style="width: 80%">
			<tr>
				<td>First Name</td><td><input type="text" name="firstname" /></td>
			</tr>
			<tr>
				<td>Last Name</td><td><input type="text" name="lastname" /></td>
			</tr>
			<tr>
				<td>Username</td><td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td><td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Address</td><td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Contact</td><td><input type="text" name="contact" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>