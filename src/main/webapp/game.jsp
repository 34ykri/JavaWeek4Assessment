<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music Recommendation</title>
</head>
<body>
	<h1>Welcome to the Game Recommendation App</h1>
	<h3>What are you feeling today</h3>
	<form action="getGameServlet" method="post">
	<input type="submit" name="userGenre" value="Action">
	<input type="submit" name="userGenre" value="Horror">
	<input type="submit" name="userGenre" value="Pain">
	<input type="submit" name="userGenre" value="Online">
	</form>
	<br />
	<a href="index.jsp">Go to Music Recommendation</a>
</body>
</html>