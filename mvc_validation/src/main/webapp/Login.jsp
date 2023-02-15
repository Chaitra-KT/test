<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<h1>Welcome to login page</h1>
<form action="">
<table>
<tr>
<th>Email/Phone:</th>
<td><input type="text" name="email">
</td>
</tr>
<tr>
<th>Password:</th>
<td><input type="text" name=pwd">
</td>
</tr>
<tr>
<td><button type="reset">Cancel</button></td>
<td><button>Login</button></td>
</tr>
</table>
</form>
<br>
<a href="load" >New? Click here to sign up</a>
</body>
</html>