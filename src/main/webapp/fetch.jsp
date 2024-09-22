<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header {
    display: flex;
    align-items: center;
    justify-content: center;
    gap:20px;
    border: 2px solid black;
    padding: 20px;
    background-color: gray;
}
table {
	width: 50%;
	margin-left:30%;
	margin-top: 20px;
}
th{
	background-color: silver;
}
</style>
</head>
<body>
<header>
		<a href="/" >ADD</a>
			<a href="/fetch">Fetch</a>
		
	</header>
	<table border="2">
		<tr>
			<th>Driver Name</th>
			<th>Capacity</th>
			<th>Load Capacity</th>
			<th>Location</th>
			<th>Status</th>
		</tr>
		<c:forEach var="t" items="${Truck}">
		
			<tr>
				<td>${t.driverName}</td>
				<td>${t.capacity}</td>
				<td>${t.loadCapacity}</td>
				<td>${t.location}</td>
				<td><a href="status.jsp">Click</a></td>
			</tr>
		
		</c:forEach>
		
	</table>
</body>
</html>