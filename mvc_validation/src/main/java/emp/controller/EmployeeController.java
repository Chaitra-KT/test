package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.EmployeeDao;
import emp.dto.Employee;

public class EmployeeController {
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeDao dao;
	
	
@RequestMapping("load")
public ModelAndView loadEmployee() {
	ModelAndView andView=new ModelAndView("signup.jsp");
    andView.addObject("employee",employee);
	return andView;
}
@RequestMapping("signup")
public ModelAndView saveEmployee(@ModelAttribute Employee employee){
dao.saveEmployee(employee);
	ModelAndView andView=new ModelAndView("Login.jsp");
	andView.addObject("msg","Account created Successfully");
	 return andView;
}
}
