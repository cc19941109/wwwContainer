<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Register</h1>

    <form method="POST">
      Name: <input type="text" name="username" /><br/>
      credits: <input type="text" name="credits" /><br/>
      Password: <input type="password" name="password" /><br/>
      
      <input type="submit" value="Register" />
    </form>
  </body>
</html>
