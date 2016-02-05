<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource var = "snapshot"
	driver="com.mysql.jdbc.Driver"
	url = "jdbc:mysql://localhost:3306/my_db"
	user = "root"
	password=""
/>
<sql:query dataSource = "${snapshot}" var="res">
select * from travel
</sql:query>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DATA BASE</title>
</head>
<body>
		<table border="1" width="50%">
		<tr>
	<th>TRAVEL ID</th>
	<th>SOURCE</th>
	<th>DESTINATION</th>
	<th>FARE</th>
</tr>
<c:forEach var="row" items="${res.rows}">
	<tr>
<td><c:out value = "${row.travelName}"/></td>
<td><c:out value = "${row.timing}"/></td>
<td><c:out value="${row.seat}"/></td>
<td><c:out value="${row.fare}"/></td>
 </tr>
</c:forEach>

</table>

</body>

</html>