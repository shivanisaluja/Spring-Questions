<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib prefix="mo" uri="http://www.springframework.org/tags/form"  %>    
    
<!DOCTYPE html>
<html>
<head>

<link href="resources/css/first.css" rel="stylesheet">



<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		.error {color:red}
		
</style>
</head>
<body>

<h3>COurse Form.</h3><br>
<mo:form action="fortest" method="post" modelAttribute="model123">
<label for="uid">Enter email: </label>
<mo:input path="userId"  id="uid" placeholder="enter user id"/>
<mo:errors path="userId" cssClass="error"/><br><br>
<label for="pwds">Enter Password: </label>
<mo:input path="pwd"  id="pwds" placeholder="enter user pass"/>
<mo:errors path="pwd" cssClass="error"/><br><br>

<!-- <h4>
custom validation's made via @interface class _courseCode
<br></h4> -->

<label for="cc">Course COde: </label>
<mo:input path="CCode" id="cc" placeholder="enter course no"/>
		<mo:errors path="CCode" cssClass="error" /><br><br>
		
<label for="phn">Enter Phone NUmber </label>
<mo:input path="phoneno"  id="phn" placeholder="enter phone no"/>
<mo:errors path="phoneno" cssClass="error"/><br><br>

<%-- <br> Interest : 
<label for="Bird watching">Bird watching: </label>
<mo:checkbox path="hobby" id="Bird watching" value="Bird watching"/>
<label for="Astronomy">Astronomy: </label>
<mo:checkbox path="hobby" id="Astronomy" value="Astronomy"/>
<label for="Snowboarding">Snowboarding:</label>
 <mo:checkbox path="hobby" id="Snowboarding" value="Snowboarding"/><br> --%>

<br>sex:
<!--used label tag for better interaction  --><br>
<label for="male">Male:</label>
 <mo:radiobutton path="sex"  id="male" value="Male"/>
<label for="female">Female:</label>
 <mo:radiobutton path="sex" id="female" value="Female"/><br>
<br><br><br>
<button class="button button1">SUBMIT</button>


</mo:form>
<br><br><br><br><br><br>
//19CSU294
</body>
</html>