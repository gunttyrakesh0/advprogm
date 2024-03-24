package com.sathya.tech;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=  request.getParameter("Username");
		String password=request.getParameter("Password");
		long mobile=Long.parseLong(request.getParameter("Usermobile"));
		String email=request.getParameter("Useremail");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("DOB");
		String[] quals=request.getParameterValues("qulification");
		String country=request.getParameter("country");
		String[] lang=request.getParameterValues("language");
		String q=String.join(",", quals);
		String l=String.join(",", lang);
		
		 PrintWriter write=response.getWriter();
		 response.setContentType("text/html");
		 write.println("<html>");
		 write.println("<body>");
		 write.println("your username..."+username);
		 write.println("your password..."+password);
		 write.println("your mobile..."+mobile);
		 write.println("your  email..."+ email);
		 write.println("your  gender..."+ gender);
		 write.println("your  dob..."+ dob);
		 write.println("your  qualification..."+ q);
		 write.println("your  country..."+ country);
		 write.println("your  language..."+ l);
		 write.println("</body>");
		 write.println("</html>");
	}

}
