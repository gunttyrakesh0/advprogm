package com.sathya.tech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proId=request.getParameter("proId"); 
		Productdao dao=new Productdao();
		 
		int result= dao.deletebyId(proId);
		 

			if(result==1) {
				request.setAttribute("UpdateResult", result);
				RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
				dispatcher.forward(request, response);
			}
			else {
				request.setAttribute("UpdateResult", result);
				RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
				dispatcher.forward(request, response);
			}
	}

	 

}
