package com.satya.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:read the data
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//step2:process the data
		/*String status;
		if(username.equals("sathya")&&password.equals("sathya@123"))
		{
			status="Login sucessful";
		}
		else
		{
			status="Login fail";
		}
		//step3:render the response to client
		 PrintWriter writer =response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<h1>Login status</h1>"+status);
		 writer.println("</html>");*/
		 
		if(username.equals("sathya")&&password.equals("sathya@123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("sucess.html");
			dispatcher.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			PrintWriter write=response.getWriter();
			write.println("Login fail check the credentials once");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		}
	}
		 

	 

}
