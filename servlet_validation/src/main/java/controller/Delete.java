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

@WebServlet("/delete")
public class Delete extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	//protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String mail=req.getParameter("email");
		Userdao dao = new Userdao();
		User user=dao.find(mail);
		dao.delete(user);
		List<User> list=dao.fetchAll();
		req.setAttribute("list", list);
	req.getRequestDispatcher("Result.jsp").include(req, res);	
		
	}

}
