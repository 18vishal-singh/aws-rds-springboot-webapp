<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Truck Pooling Service</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}

table#t01 {
	width: 100%;
	background-color: #f1f1c1;
}

table#t02 {
	width: 100%;
	background-color: #F5DAD4;
}
</style>
</head>

<h1>WHO ARE YOU:</h1>
<body>
	<form method="post">
		<input type="radio" name="user" value="driver"> Driver<br>
		<input type="radio" name="user" value="customer"> Customer<br>
		<input type="submit" />
	</form>
	<div align="right">
		<h2 align="left">Driver Details</h2>
		<table id="t01" class="table table-default">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Vehicle_no</th>
				<th>Destination city</th>
				<th>Present city</th>
				<th>Mobile_no</th>
			</tr>
			<c:forEach var="d" items="${drivers}">
				<tr>
					<td>${d.id}</td>
					<td>${d.name}</td>
					<td>${d.vehicle_no}</td>
					<td>${d.dcity}</td>
					<td>${d.pcity}</td>
					<td>${d.mobileno}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div align="right">
		<h2 align="left">Customer Details</h2>
		<table id="t02" class="table table-default">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Destination city</th>
				<th>Present city</th>
				<th>Mobile_no</th>
			</tr>
			<c:forEach var="c" items="${customers}">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.dcity}</td>
					<td>${c.pcity}</td>
					<td>${c.mobileno}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
