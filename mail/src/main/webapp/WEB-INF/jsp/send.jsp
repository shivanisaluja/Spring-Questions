<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@                                  page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "resources/css/styles.css" rel ="stylesheet">
<title>result</title>
</head>
<body>
<h1>Email sent to <c:out value="${email.getMailTo() }"></c:out> </h1>
<h3>Mail Again</h3>
<form action="/mail">
<button type = "submit" class="btn">home</button>
</form>
</body>
</html>