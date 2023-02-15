package ser_res;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Addition extends HttpServlet
{
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int a=Integer.parseInt(req.getParameter("num1"));
int b=Integer.parseInt(req.getParameter("num2"));
int c=a+b;
resp.getWriter().print("<h1>The "+a+" and "+b+" sum is "+c+".</h1>");
req.setAttribute("takevaluebyadd", c);
req.getRequestDispatcher("sqr").forward(req, resp);
resp.sendRedirect("sqr");
}
}
