package servelet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PrintHello implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse req1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       String first=req.getParameter("first");
		   String last=req.getParameter("last");
		System.out.println("Hello i am "+first+" "+last);
		req1.getWriter().print("Hello i am "+first+" "+last);
	}

}
