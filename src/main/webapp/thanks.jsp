<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java servlet mail list</title>
<link rel= "stylesheet" href="main.css" type="text/css" />
</head>
<body>

<h1>Thanks for join with us</h1>
<p>Here is your in4:</p>
<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>

<p>To enter another email address, click Back button<p>
<form action="" method="get">
	<input type="hidden" name="action" value="join">
	<input type="submit" value="Return">
</form>
</body>
</html>