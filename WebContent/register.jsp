<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<style>
body {
	background-image: url("image/login.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 1400px 800px;
	padding-left: 470px;
	padding-top: 60px;
}

body {
	padding-left: 300px;
	padding-top: 25px;
	font-size: 20px;
}

h3 {
	color: black;
}

h4 {
	color: black;
}
h6{
color:red;
}

form {
	display: inline-block;
}
</style>
<body style="color: white; font-family: Times New Roman; font-size: 19px">

	<form method="post" action="AddRegistrationServlet">
		<table>
			<tbody>
				<tr align="center">
					<td style="color: black" colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<h3>Register</h3> <br>
					</td>
					<td></td>
				</tr>
				<tr align="left">

				</tr>
				<tr align="left">
					<td style="color: black"><h4>Name :</h4></td>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				<tr>
				<tr align="left">
					<td style="color: black"><h4>Phone no :</h4></td>
					<td><input type="number" name="phone" pattern="[6-9]{1}[0-9]{9}"  maxlength="10"  oninvalid="setCustomValidity('Plz enter valid mobile number')"
        required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><h4>EmailId :</h4></td>
					<td><input type="email" name="email" required "></td><h6><td>${status}</td></h6>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><h4>Password :</h4></td>
					<td><input type="password" name="password" required></td>
				</tr>

				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><h4>Address :</h4></td>
					<td><input type="text" name="address" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><h4>Security question :</h4></td>
					<td><select name="question">
							<option value="-1">-------------Choose-------------</option>
							<option value="school">Which school you studied?</option>
							<option value="nicname">what is your nic name?</option>
							<option value="city">what is your favourite city?</option>
					</select></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><h4>Security answer :</h4></td>
					<td><input type="text" name="answer" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit" class="btn btn-success" style="width: 100px">SIGN
							UP</button>
				</tr>

			</tbody>
		</table>
	</form>
</body>
</html>