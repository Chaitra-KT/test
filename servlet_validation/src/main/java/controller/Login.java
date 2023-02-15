package controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import dto.User;
//@WebServlet("/login")
public class Login extends GenericServlet {
@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String cname=getServletConfig().getInitParameter("cname");
	//String cname=getServletConfig().getInitParameter("cname");
	String cbranch=getServletConfig().getInitParameter("cbranch");

		// TODO Auto-generated method stub
	//@Override
//protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	String Email=	req.getParameter("mail");
	String password=	req.getParameter("pwd");
	Userdao dao=new Userdao(); 
	User user=dao.find(Email);
	if(user==null) {
		res.getWriter().print("<h1>Invalid Email</h1>");	
	req.getRequestDispatcher("Login.html").include(req,res);	
	}else {
	if(user.getPassword().equals(password)) {
		
/*		
	//	res.sendRedirect("http://www.youtube.com/");
		res.getWriter().print("<h1>Login successfully "+cname+" "+cbranch+"</h1>");	
		List<User> list = dao.fetchAll();
		for(User u:list) {
res.getWriter().print("<h1>User name:"+u.getName()+"</h1>");
res.getWriter().print("<h1>User  Email:"+u.getEmail()+"<h1>");
res.getWriter().print("<h1>User Mobile No.:"+u.getMobile()+"</h1>");
res.getWriter().print("<h1>Gender:"+u.getGender()+"</h1>");
res.getWriter().print("<h1>Address:"+u.getAddress()+"</h1>");
res.getWriter().print("---------------------------------------");

		}
		res.getWriter().print("<h1>-----------------------</h1>");
		res.getWriter().print("<table border=\"1\">"
	+"<tr>"
	+"<th>User Name</th>"
	+"<th>User email</th>"
	+"<th>User Mobile</th>"
	+"<th>User Gender</th>"
	+"<th>User Address</th>"
	+"</tr>");
for(User u:list) {
	res.getWriter().print(""
			+ "<tr><th>"+u.getName()+"</th>"
			+ "<th>"+u.getEmail()+"</th>"
			+ "<th>"+u.getMobile()+"</th>"
			+ "<th>"+u.getGender()+"</th>"
			+ "<th>"+u.getAddress()+"</th>"
			+ "</tr>");
}
res.getWriter().print("</table>");
		*/
		List<User> list=dao.fetchAll();
		req.setAttribute("list", list);
	req.getRequestDispatcher("Result.jsp").include(req, res);	
	}else {
	res.setContentType("text/html");
	res.getWriter().print("Invalid Login");
	req.getRequestDispatcher("Login.html").include(req,res);	

	
		}
	//res.getWriter().print("<h1>Email: "+Email+"</h1><br>");
	//res.getWriter().print("<h1>Password : "+password+"</h1>");
	}
	
	
	}
	
}
