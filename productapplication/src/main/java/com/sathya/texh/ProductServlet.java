package com.sathya.texh;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:read the requested data
		 int proId=Integer.parseInt(request.getParameter("ProductId"));
		 String proName=request.getParameter("Productname");
		 double proprice=Double.parseDouble(request.getParameter("Productprice"));
		 int proQuntity=Integer.parseInt(request.getParameter("ProductQuntity"));
		 
		 //step2:process the data
		 int TotalBill;
		 double discount;
		 TotalBill=(int) (proQuntity*proprice);
		 if(TotalBill<1000)
		 {
			 	discount=TotalBill;
		 }
		 else if(TotalBill>1000&&TotalBill<5000)
		 {
			 discount=TotalBill*0.05;
		 }
		 else if(TotalBill>5000&&TotalBill<10000)
		 {
			 discount=TotalBill*0.10;
		 }
		 else 
		 {
			 discount=TotalBill*0.15;
		 }
		 
	       //TotalBill <1000 :No discount
		//TotalBill>1000 <5000 :5% discount
		//TotalBill >5000 <10000:10% discount
		//TotalBill>10000 <20000 :20% discount
		 
		 //step3:render the response
		 response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
		 writer.println("<html>");
		 writer.println("<h>PRODUCT INVOICE</h>");
		 writer.println("<br><br> <body bgcolor=pink>");
		 writer.println("<br><br> productId...."+proId);
		 writer.println("<br><br> productName...."+proName);
		 writer.println("<br><br> productprice...."+proprice);
		 writer.println("<br><br> productQuntity...."+proQuntity);
		 writer.println("<br><br> TotalBill..."+TotalBill);
		 
		 writer.println("</html>");

	 
	}

}
