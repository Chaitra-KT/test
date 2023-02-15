<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world!</h1>

<% 
//Scriptlet tag
int a=5;
//System.out.println(a);
//.getWriter()
//out.print("<h1>"+a+"</h1>");
%>
<h1><% out.print(a); %></h1>



<%--Expression tag --%>                                                                                  
<h1>
First:<%=a 
//it gives the output equal out.print or response.getWriter().print()
%></h1> 


<%! int a=9; %><%--Declarative tag ! --%>
<h1>Second:<%=this.a %></h1>
<%--Comment tag --%>
<%--Directive tag"@" is used for import the files --%>
<%List list=new ArrayList(); %>
<% list.add(0);%>
<% list.add(1);%>
<h1><%=list %></h1>

</body>
</html>