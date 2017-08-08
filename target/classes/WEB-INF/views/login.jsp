<html >
<head>
<meta charset="UTF-8"></meta>
<title>login</title>
</head>
<body>
	<!-- <a th:href="@{http://www.thymeleaf.org}">Thymeleaf</a>
	<a th:href = "@{http://localhost:8080/hello}">hello</a>
	<p th:text="${message}">Hello World!</p> -->
	<form action="login.do" method="post">
		userName:<input type="text" name="username"></input>
		<p>
			password:<input type="password" name="password"></input>
		</p>
			<input type="submit" value="login"></input>
	</form>

</body>
</html>