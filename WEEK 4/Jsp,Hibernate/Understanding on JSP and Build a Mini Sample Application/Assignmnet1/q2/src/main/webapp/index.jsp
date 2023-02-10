<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>  
<body>  
hi
<sql:setDataSource var="snapshot"
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:orcl2" user="sys as sysdba"
	password="{please use ur own password}" />

<sql:query dataSource="${snapshot}" var="result">
  (select * from employee);
</sql:query>

<table>
	<tr>
		<th>ID</th>
		<th>Email</th>
	</tr>
	<c:forEach var="row" items="${result.rows}">
		<tr>
			<td>${row.empid}</td>
			<td>${row.email}</td>
		</tr>
	</c:forEach>
</table>
</body>  
</html>  


