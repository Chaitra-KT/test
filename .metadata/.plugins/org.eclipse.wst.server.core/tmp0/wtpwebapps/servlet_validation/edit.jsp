<%@page import="dto.User"%>
<%@page import="dao.Userdao"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String email=request.getParameter("email");
Userdao dao=new Userdao();
User user=dao.find(email);

%>

<form action="update" method="post">
Name:       <input type="text" name="name" value="<%=user.getName()  %>"> <br>
Phone No.:  <input type="text" name="phone"value="<%=user.getMobile() %>"><br>

Email:      <input type="email" name="mail" value="<%=user.getEmail()%>"><br>
<%--disabled,readonly,hidden --%>
Password:   <input type="password" name="pwd" value="<%=user.getPassword()%>"><br>
Gender: 
<%if(user.getGender().equals("male")) {%>   
 <input type="radio" value="male" name="gender" value="male" checked="checked">Male
 <input type="radio" value="female" name="gender" value="female">FeMale
 <% }else{%>
 <input type="radio" value="female" name="gender" value="female" checked="checked">FeMale
 <input type="radio" value="male" name="gender" value="male">Male
 <%} %>
Address:    <textarea rows="10" cols="20" name="adrs" value="<%=user.getAddress()%>"></textarea><br>
<button>Signup</button>
<button type="reset">cancel</button>
</body>
</html>