package com.sathya.tech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/EditServlet")
@MultipartConfig
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String proId=request.getParameter("proId"); 
		Productdao dao=new Productdao();
		 Product existingproduct=dao.findbyId(proId);
		 
		 request.setAttribute("existingproduct", existingproduct);
		 
		 RequestDispatcher dispatcher=request.getRequestDispatcher(" editform.jsp");
		 dispatcher.forward(request, response);	 
	}
}
