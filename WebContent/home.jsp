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
<title>Home</title>
<style>
body {
	background-image: url("image/login.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 1400px 800px;
	padding-left: 250px;
	padding-top: 100px;
	font-size: 19px"
}

.btnalign {
	padding-left: 230px;
}
</style>
</head>
<body>

	<form method="post" action="SearchHomeServlet">
		<table>
			<tr>
				<td>
					<div align="center" style="width: 600px">
						<br> <br> <br>
						<h2>Search Location</h2>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<table>
							<tr>
								<td><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter the location
										:&nbsp;&nbsp;</h5></td>
								<td><select name="location">
										<option value="-1">------Choose------</option>
										<option value="chennai">chennai</option>
										<option value="coimbatore">coimbatore</option>
										<option value="madurai">madurai</option>
										<option value="thanjavur">thanjavur</option>
										<option value="thirunalveli">thirunalveli</option>
								</select></td>
							</tr>
						</table>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<div class="btnalign">
							<tr>
								<td><button type="submit" class="btn btn-success">SEARCH</button></td>
							</tr>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>