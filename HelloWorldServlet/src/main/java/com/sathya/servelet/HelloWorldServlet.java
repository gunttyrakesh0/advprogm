package com.sathya.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rakesh")
public class HelloWorldServlet extends HttpServlet {
	 
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		
		response.setContentType("text/html");
		/*writer.println("Welcome to SathyaTech");
		writer.println("Welcome to Web Application");
		writer.println("i am rakesh");*/
		
		writer.println("<html>");
		writer.println("<h1>This is first application</h1>");
		writer.println("<h2>India won by 106 runs</h2>");
		writer.println("<h3>siraj shown  symbol to benstokes</h3>");
		writer.println("</html>");
		}
 
}