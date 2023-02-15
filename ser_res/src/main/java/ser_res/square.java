package ser_res;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sqr")
public class square extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int i=(int)req.getAttribute("takevaluebyadd");
	resp.getWriter().print("<h1> The square of sum is "+i*i+".</h1>");
}
}
