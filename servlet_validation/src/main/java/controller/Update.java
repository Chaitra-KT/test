package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Userdao;
import dto.User;
@WebServlet("/update")
public class Update extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("mail"));
		user.setPassword(req.getParameter("pwd"));
		user.setMobile(Long.parseLong(req.getParameter("phone")));
		user.setAddress(req.getParameter("adrs"));
		user.setGender(req.getParameter("gender"));
		
		Userdao dao = new Userdao();
		
		dao.update(user);
		List<User> list=dao.fetchAll();
		req.setAttribute("list", list);
	req.getRequestDispatcher("Result.jsp").forward(req, res);	
	}

}
