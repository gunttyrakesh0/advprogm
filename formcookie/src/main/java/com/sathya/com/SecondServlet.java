package com.sathya.com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qualification=request.getParameter("qualification");
		 String designation=request.getParameter("designation");		
		//create the cookie
	 	 Cookie cookie3=new Cookie("qualification",qualification );
	 	 Cookie cookie4=new Cookie("designation", designation);
	 	 
	 	 //add the cookie into response object
	 	 
	 	 response.addCookie(cookie3);
	 	 response.addCookie(cookie4);
	 	 
		 	//dispatch into next form
		 	RequestDispatcher dispatcher=request.getRequestDispatcher("Formc2.html");
		 	dispatcher.forward(request, response);
	}

}
