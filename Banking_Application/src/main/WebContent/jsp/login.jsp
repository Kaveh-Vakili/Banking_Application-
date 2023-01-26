<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.io.*,java.text.*,java.util.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank of London</title>
</head>
<body>
	<div class="NAVBAR">
		<a class="active" href="#login">Login</a> <a class="active"
			href="#register">Register</a> <a class="active" href="#news">News</a>
		<a class="active" href="#worldclock">World Clock</a>

	</div>
	
	<h1>
	Login
	
	</h1>
	
	<form>
	
	<label>Username</label> <input type="text" name="username" 	id="username"><br>
	<label>Password</label> <input type="text" name="password" 	id="password">
	<input type="submit" value="submit" id="submit">
	
	
	</form>
	
	
</body>
</html>