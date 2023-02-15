package controller;

	import java.io.IOException;
	
	import javax.servlet.GenericServlet;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import dao.Userdao;
	import dto.User;
	//@WebServlet("/signup")
	public class Signup extends GenericServlet
	{
	
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String cname=getServletConfig().getInitParameter("cname");
			String cbranch=getServletConfig().getInitParameter("cbranch");
			
			String name=req.getParameter("name");
			long mobile=Long.parseLong(req.getParameter("phone"));
			String email=req.getParameter("mail");
			String password=req.getParameter("pwd");
			String gender=req.getParameter("gender");
			String address=req.getParameter("adrs");
			User u1=new User();
			u1.setName(name);
			u1.setMobile(mobile);
			u1.setEmail(email);
			u1.setPassword(password);
			u1.setGender(gender);
			u1.setAddress(address);
		
			
			Userdao dao=new Userdao();
			dao.save(u1);
			res.getWriter().print("<h1>Account signed up successfully"+cname+" "+cbranch+"</h1>");
			req.getRequestDispatcher("Login.html").include(req,res);
				
		//	res.getWriter().print("<h1>signup successfully</h1><br><a href=\"Login.html\">Click here to login</a>");
		
			
	//res.getWriter().print("<h1>Name: "+name+"<h1><br>");
 //res.getWriter().print("<h1>Phoneno:"+mobile+"<h1><br>");
//	res.getWriter().print("<h1>Email: "+email+"<h1><br>");
//	res.getWriter().print("<h1>Password: "+password+"<h1><br>");
//	res.getWriter().print("<h1>Gender: "+gender+"<h1><br>");
	//res.getWriter().print("<h1>Address: "+address+"<h1><br>");
	}

}
