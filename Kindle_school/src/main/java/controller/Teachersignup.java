package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dto.Teacher;

@WebServlet("/teachersignup")
public class Teachersignup extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	Teacher teacher=new Teacher();

	teacher.setName(req.getParameter("name"));
	teacher.setMobile(Long.parseLong(req.getParameter("phone")));
	teacher.setEmail(req.getParameter("mail"));
	teacher.setEmpid(req.getParameter("eid"));
	teacher.setPassword(req.getParameter("password"));
	teacher.setSubject(req.getParameter("sub"));
	super.doPost(req, resp);
}
}
