package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/role")
public class SelectRole extends HttpServlet
{
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	// TODO Auto-generated method stub
	String role=req.getParameter("role");
	if(role==null) {
		resp.getWriter().print("<h1>Atleast select one role </h1>");
		req.getRequestDispatcher("Signup.html").include(req,resp);
		
	}else {
		if(role.equals("teacher")) {
			resp.sendRedirect("Teachersignup.html");
		}else {
			resp.sendRedirect("studentsignup.html");
		}
		
	}
	
}
}
