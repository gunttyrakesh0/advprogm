package com.sathya.servlet;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //step1:Read the data
		int employeeid=Integer.parseInt(request.getParameter("EmployeeId"));
		String employeename=request.getParameter("EmployeeName");
		float Bs=(float) Double.parseDouble(request.getParameter("EmployeeBasicsalary"));
		
		//step:process the data
		double Gs,HRA,DA,PF;
		if(Bs>=50000)
		{
			HRA=Bs*0.3;
			DA=Bs*0.1;
			PF=Bs*0.06;
			Gs=Bs+HRA+DA-PF;
		}
		else if(Bs>25000&&Bs<50000)
		{
			HRA=Bs*0.2;
			DA=Bs*0.05;
			PF=Bs*0.03;
			Gs=Bs+HRA+DA-PF;
		}
		else
		{
			HRA=Bs*0.1;
			DA=Bs*0.03;
			PF=Bs*0.02;
			Gs=Bs+HRA+DA-PF;
		}
		
		//step3 render the response
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		 write.println("<html>");
		 write.println("<h>SALARY  INFO</h>");
		 write.println("<br><br> <body bgcolor=pink>");
		 write.println("<br><br> EMPLOYEEID...."+employeeid);
		 write.println("<br><br> EMPLOYEENAME...."+employeename);
		 write.println("<br><br> EMPLOYEE BASICSALARY...."+Bs);
		 write.println("<br><br> HRA AMOUNT...."+HRA);
		 write.println("<br><br> DA AMOUNT..."+DA);
		 write.println("<br><br> PF AMOUNT..."+PF);
		 write.println("<br><br> GROSS SALARY..."+Gs);
		 
		 write.println("</html>");
		
	}

}
