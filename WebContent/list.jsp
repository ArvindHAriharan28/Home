<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: url("image/login.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 1400px 800px;
}

h3 {
	padding-left: 40px;
	padding_top: 20px;
}

table {
	border-collapse: separate;
	border-spacing: 30px;
}



tbody {
	font-size: 19px;
}
</style>
</head>
<body>
	<form method="post" action="BookServlet">
		<h3>List of House</h3>
		<table width="550px">
			<thead>
				<tr>
					<th align="left">NAME</th>
					<th align="left">ADDRESS</th>
					<th align="left">LOCATION</th>
					<th align="left">PRICE</th>
					<th align="left">CONTACT</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="location" items="${LOCATION}">
					<tr>
						<td><h5>${location.adminName}</h5></td>
						<td><h5>${location.address}</h5></td>
						<td><h5>${location.location}</h5></td>
						<td><h5>${location.price }</h5></td>
						<td><h5>${location.phoneNumber}</h5></td>
						<td>
						<td><button type="submit" class="btn btn-success" name="book"
								value="${location.adminId}">Book</button></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>