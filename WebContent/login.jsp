<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	background-size: 1400px 700px;
}

<
meta charset ="ISO-8859-1 "> <title>Login </title>.display {
	position: absolute;
	top: 37%;
	left: 25%;
}

h3 {
	color: Black;
}

h5 {
	color: red;
}

body {
	padding-left: 430px;
	padding-top: 85px;
	font-size: 20px;
}

form {
	display: inline-block;
}
</style>
</head>
<body>
	<form method="post" action="LoginServlet">


		<table>
			<tbody>
				<tr>
					<td colspan="2" style="padding-top: 30px; padding-left: 101px;">
						<h3>LOGIN</h3>
					</td>
					<td></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

			</tbody>
		</table>
		<table>
			<tbody>
				<tr>
					<td><h4>Email :</h4></td>
					<td><input type="email" name="email" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><h4>Password :</h4></td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><a href="register.jsp" style="text-decoration: none;"><h5>New
								User</h5></a></td>
					<td><a href="forgetpassword.html"
						style="text-decoration: none;"><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;Forgot Password ?</h5></a></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<td></td>
				<td>
					<button type="submit" class="btn btn-success" style="width: 100px">LOGIN</button>
				</td>
				</tr>
			</tbody>
		</table>
		<br>
		<table>
			<tr>
				<td style="color: red;">${STATUS}</td>
			</tr>


		</table>

	</form>
</body>

</body>
</html>