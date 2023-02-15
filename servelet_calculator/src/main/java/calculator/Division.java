package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.catalina.Server;
@WebServlet("/div")
public class Division extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1=Integer.parseInt(req.getParameter("num1"));
        double num2=Integer.parseInt(req.getParameter("num2"));
        System.out.println("The divsion of "+num1+" and "+num2 +" is "+(num1/num2));
        res.getWriter().print("<h1 style=\"color:blue\">The division of "+num1+" and "+num2+" is "+(num1/num2));
	
	}
}
