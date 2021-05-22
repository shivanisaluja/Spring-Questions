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
<title>Email</title>
</head>
<body>
<h1> Welcome <c:out value="${name }"></c:out> to Gmail</h1>
<form:form action = "send" method = "post" modelAttribute= "email">
 <table id="emailFormBeanTable" border="0" width="80%">
 
 <tr>
<td>Email: <form:input path="mailTo" size="65" placeholder = "To whom-- Email ID"/>
<form:errors path = "mailTo" cssClass="error"></form:errors></td>
 
</tr>

<tr>
<td>Subject: <form:input path = "subject" size="65" placeholder = "subject"/>
<form:errors path = "subject" cssClass="error"></form:errors></td>
</tr>

<tr>
<td>Body:<br> <form:textarea path="message" rows="10" cols="100" placeholder = "body"/></td>
</tr>

<tr>
<td>Attach File: <form:input path="fileName" size="60" type = "file"/></td>
</tr>

<tr>
<td><button class="button button1"><span>SEND</span></button></td>
</tr>

</table>
</form:form>
</body>
</html>