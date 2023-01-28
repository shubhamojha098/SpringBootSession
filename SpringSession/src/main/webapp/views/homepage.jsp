<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form method="post" action="persistsession">
<textarea rows="5"  name="msg"></textarea><br>
<input type="submit" value="Add Session"/><br> <br>
</form>
<a href="destroy"><input type="button" value="Invalidate Session"/></a><br>
${msgdata}
${msg}
	
</body>
</html>