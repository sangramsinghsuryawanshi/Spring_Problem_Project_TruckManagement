<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	form{
		margin-top:20px;
		justify-content: center;
		text-align: center;
		border: 2px solid black ;
		padding: 20px;
		width: 40%;
		margin-left: 25%;
		background-color: olive;
		align-items: center;
		
	}
</style>
</head>
<body>
	<header>
		<a href="/">ADD</a>
		<a href="/fetch">Fetch</a>
	</header>
	<form action="/insert" method="post">
		<h2>Add Truck</h2>
		<lable>Driver Name:</lable>
		<input type="text" name="driverName" placeholder="Enter Name.." required="required"><br><br>
		<lable>Capacity:</lable>
		<input type="number" name="capacity" placeholder="Enter Truck Actual Capacity.." required="required"><br><br>
		<lable>Load Capacity:</lable>
		<input type="number" name="loadCapacity" placeholder="Enter Truck Load Capacity.." required="required"><br><br>
		<lable>Location:</lable>
		<input type="text" name="location" placeholder="Enter location..." required="required"><br><br>
		<button type="submit">submit</button>
	</form>
	
	<h2 style="color: blue;" >${msg}</h2>	
</body>
</html>