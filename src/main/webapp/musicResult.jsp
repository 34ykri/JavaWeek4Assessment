<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music Result</title>
</head>
<body>
	<h1>Recommended Song based off Emotion</h1>
	<p>Emotion: ${userMusic.getEmotion()}</p>
	<p>Recommended Song: ${userMusic.getSong()}</p>
	<a href="index.jsp">Find another Song</a>
</body>
</html>