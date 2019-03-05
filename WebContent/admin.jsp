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
	padding-left:270px;
	padding-top: 130px;
}

form {
	display: inline-block;
}
</style>
</head>
<body bgcolor="white">
	<form method="post" action="AddLocationServlet">
		
		
		<table>
			<tbody>
				<tr>
					<td style="color: black" colspan="2" style="padding-top:50px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<h2>ENTER THE DETAILS ABOUT LOCATION:</h2></td>
					<tr>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
				</tr>

							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><h5>NAME:</h5></td>
							<td><input type="text" name="adminName" required ></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							
							
							<tr align="left">
							<td><h5>LOCATION : </h5></td>
							<td> <select name="location">
							  <option value="-1">--------Choose--------</option>
							 
							  <option value="chennai">chennai</option>
							  <option value="coimbatore">coimbatore</option>
							  <option value="madurai">madurai</option>
							  <option value="thanjavur">thanjavur</option>
							   <option value="thirunelveli">thirunelveli</option>
							   
							</select>
			</td>
			</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><h5>ADDRESS:</h5></td>
							<td><input type="text" name="address" required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
							</tr>
							<tr align="left">
							<td><h5>PHONE NUMBER:</h5></td>
							<td><input type="number" name="phoneNumber"required></td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								</tr>
								<tr align="left">
							<td><h5>PRICE</h5></td>
							<td><input type="text" name="price" required></td>
							</tr>
							</tbody>
							</table>
							<table align="center">
								<tr> <td> &nbsp; </td> </tr>
							<tr>
								<td></td>
								<td>
									<td> <button type="submit" class="btn btn-success" style="width : 100px">ADD</button>
								</td>
							</tr>
							</table>
							</form>
							
							

</body>
</html>