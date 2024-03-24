package com.sathya.tech;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  //step1; read the data
		int num1=Integer.parseInt(request.getParameter("First"));
		int num2=Integer.parseInt(request.getParameter("Second"));
		String operation=request.getParameter("operations");
		
		//step2;process the data
		int result=0;
		switch(operation) {
		case "+" : result=num1+num2;
					break;
		case "-" : result=num1-num2;
					break;
		case "*" : result=num1*num2;
					break;
		case "%" : result=num1%num2;
					break;
		case "/" : result=num1/num2;
					break;

		}
		//step3 render the response
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<html>");
		write.println("<body bgcolor=pink>");
		write.println("<h1>calculator result</h1>");
		write.println("your first number..."+num1);
		write.println("your second number..."+num2);
		write.println("your operations"+operation);
		write.println("your result.."+result);
		write.println("</body>");
		write.println("</html>");
	}
}
