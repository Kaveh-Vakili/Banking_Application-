<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<div class="NAVBAR">
		<a class="active" href="#login">Login</a> <a class="active"
			href="#register">Register</a> <a class="active" href="#news">News</a>
		<a class="active" href="#worldclock">World Clock</a>

	</div>
	
	<h1>
	Register
	</h1>
	
	<form action="register" method="post">
	<label>First Name</label> <input type="text" name="firstname" 	id="firstname"><br>
	<label>Last Name</label> <input type="text" name="lastname" 	id="lastname"><br>
	<label>Username</label> <input type="text" name="username" 	id="username"><br>
	<label>Password</label> <input type="text" name="password" 	id="password">
	<input type="submit" value="submit" id="submit">
	
	
	</form>
</body>
</html>