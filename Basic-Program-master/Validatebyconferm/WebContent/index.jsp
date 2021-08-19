<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>login form</title>
<style>
.container {
	width: 30%;
	border: 3px solid black;
	margin: auto;
	padding: 20px;
	font-size: 18px;
}

#myform table tr td input {
	font-size: 18px;
}
</style>
</head>
<body>
<div class="container">
	<form method="post" action="Login"id="myform">
		<table>
			<tr>
				<td>Email ID:</td>
			</tr>
			<tr>
				<td><input type="text" name="email" required="required" /><br /></td>
			</tr>
			<tr>
				<td>Password:</td>
			</tr>
			<tr>
				<td><input type="text" name="pass" required="required" /> <br /></td>
			</tr>
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>
		</table>
	</form>
	<table>
	<tr><td><a href="index.html">New Register</a></td></tr></table>
</div>
</body>
</html>