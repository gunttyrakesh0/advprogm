package com.sathys.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/fullnameServlet")
public class fullnameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		
		//process the data
		String statuss = null;
		 
         statuss="firstname+middlename+lastname";
	 
		PrintWriter writer =response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<h1>fullname status</h1>"+statuss);
		 writer.println("</html>");
	}

	 

}
