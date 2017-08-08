<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="login.do" method="post">
		userName:<input type="text" name="username"></input>
		<p>
			password:<input type="password" name="password"></input>
		</p>
		<input type="submit" value="login"></input>
	</form> -->
	
	
	
	<sf:form method = "POST" commandName = "user">
		name:<sf:input path="name" /><br/>
		password:<sf:input path = "password"/><br/>
		<input type  = "submit" value ="register"/>
	</sf:form>
</body>
</html>