<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<style>
.error {
	color: red
}
</style>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="submit" modelAttribute="emp">
Username: <form:input path="name" />
		<br>
		<form:errors path="name" cssClass="error" />
Password: <form:password path="password" />
		<br>
		<form:errors path="password" cssClass="error" />
Age: <form:input path="age" />
		<br>
		<input type="submit" value="submit" />
		<br>
		<form:errors path="age" cssClass="error" />
	</form:form>

</body>
</html>