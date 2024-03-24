package com.sathya.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
	 	String mobile=request.getParameter("mobile");		
	 	//create the session object
	 	 Cookie[] cookie=request.getCookies();	 	
	 	
	 	response.setContentType("text/html");
	 	PrintWriter writer=response.getWriter();
	 	writer.println("<html>");
	 	writer.println("<body>");
	 	writer.println("<pre>");
	 	writer.println(cookie[0]);
	 	writer.println(cookie[1]);
	 	writer.println(cookie[2]);
	 	writer.println(cookie[3]);
	 	writer.println("email"+email);
	 	writer.println("mobile number"+mobile);
	 	writer.println("</pre>");
	 	writer.println("</body>");
	 	writer.println("</html>");
	}

}
