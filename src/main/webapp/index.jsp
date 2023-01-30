<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music Recommendation</title>
</head>
<body>
	<h1>Welcome to the Music Recommendation App</h1>
	<h3>What are you feeling today</h3>
	<form action="getMusicServlet" method="post">
	<input type="submit" name="userEmotion" value="Happy">
	<input type="submit" name="userEmotion" value="Sad">
	<input type="submit" name="userEmotion" value="Excited">
	<input type="submit" name="userEmotion" value="Mad">
	</form>
	<br />
	<a href="game.jsp">Go to Game Recommendation</a>
</body>
</html>