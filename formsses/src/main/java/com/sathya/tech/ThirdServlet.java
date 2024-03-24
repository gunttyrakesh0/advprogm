package com.sathya.tech;

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
	private static final long serialVersionUID = 1L;

     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* String email=request.getParameter("email");
		 	String mobile=request.getParameter("mobile");		
		 	//create the session object
		 	HttpSession session=request.getSession(false);
		 	
		 	//place the data into session object
		 	//session.setAttribute("email", email);
		 	//session.setAttribute("mobile", mobile);
		 	
		 	
		 	response.setContentType("text/html");
		 	PrintWriter writer=response.getWriter();
		 	writer.println("<html>");
		 	writer.println("<body>");
		 	writer.println("<pre>");
		 	writer.println(session.getAttribute("username"));
		 	writer.println(session.getAttribute("age"));
		 	writer.println(session.getAttribute("qualification"));
		 	writer.println(session.getAttribute("designation"));
		 	writer.println("email"+email);
		 	writer.println("mobile number"+mobile);
		 	writer.println("</pre>");
		 	writer.println("</body>");
		 	writer.println("</html>");*/
		
		String email=request.getParameter("email");
	 	String mobile=request.getParameter("mobile");		
	 	//create the session object
	 	 Cookie[] cookie=request.getCookies();	 
	 	 
	 	
	 	response.setContentType("text/html");
	 	PrintWriter writer=response.getWriter();
	 	writer.println("<html>");
	 	writer.println("<body>");
	 	writer.println("<pre>");
	 	writer.println(cookie[0].getValue());
	 	writer.println(cookie[1].getValue());
	 	writer.println(cookie[2].getValue());
	 	writer.println(cookie[3].getValue());
	 	writer.println("email"+email);
	 	writer.println("mobile number"+mobile);
	 	writer.println("</pre>");
	 	writer.println("</body>");
	 	writer.println("</html>");
	}

}
