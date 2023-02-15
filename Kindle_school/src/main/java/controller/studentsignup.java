package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dto.student;
import lombok.Data;
@WebServlet("/student")
public class studentsignup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		student s1=new student();

		s1.setName(req.getParameter("name"));
		s1.setMobile(Long.parseLong(req.getParameter("phone")));
		s1.setEmail(req.getParameter("mail"));
		//s1.setId((req.getParameter("id"));
		s1.setStandard(req.getParameter("cls"));
		Date date1=Date.valueOf(req.getParameter("dob"));
		
		LocalDate date2=LocalDate.now();
		int age=date2.getYear()-date1.getYear();
		s1.setDob(date1);
		StudentDao dao=new StudentDao();
try {
		dao.savestudent(s1);
		resp.getWriter().print("<h1>Account created Successfully</h1>");
		req.getRequestDispatcher("login.html").include(req, resp);
}catch(Exception e) {
		resp.getWriter().print("<h1>Email/Phone number Exist</h1>");
		req.getRequestDispatcher("studentsignup.html").include(req, resp);
}
		
		//s1.setPassword(req.getParameter("password"));
		
		
	//	s1.setDob(req.getParameter("dob"));
		super.doPost(req, resp);
	}

}
