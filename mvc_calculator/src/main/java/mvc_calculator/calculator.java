package mvc_calculator;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class calculator {
	@RequestMapping("add")
	public void  sum(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		

		response.getWriter().print("<h1>The addition of "+num1+" and "+num2+" is "+(num1+num2)+"</h1>");		
}
	@RequestMapping("sub")
	public void  subtraction(@RequestParam int num1 ,@RequestParam int num2,HttpServletResponse response) throws IOException {
		
		

		response.getWriter().print("<h1>The Subtraction of "+num1+" and "+num2+" is "+(num1-num2)+"</h1>");		
}
	@RequestMapping("mul")
	@ResponseBody
	public String  Multiplication(@RequestParam int num1 ,@RequestParam int num2)  {
		
		

		return "<h1>The multiplication of "+num1+" and "+num2+" is "+(num1*num2)+"</h1>";
}

	
	@RequestMapping("div")
	public ModelAndView  Division(@RequestParam double num1 ,@RequestParam int num2){
		ModelAndView andview=new ModelAndView();
		andview.addObject("num1",num1);
		andview.addObject("num2",num2);
		andview.addObject("msg","division");
		andview.addObject("result",num1/num2);
		andview.setViewName("Result.jsp");
		return andview;
		
		
}

}
