package com.sathya.servlet;

import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/GenerateServlet")
public class GenerateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int start=Integer.parseInt(request.getParameter("Startnumber"));
		 String operationss=request.getParameter("operations");
		 int end=Integer.parseInt(request.getParameter("endnumber"));
		 
		 //process the data
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 int i;
		 switch(operationss)
		 {
		 case "Even" : for(i=start; i<end; i++) {
			 			if(i%2==0) {
			 				al.add(i);
			 			}
		 }
		 				break;
		 case "Odd" : for(i=start; i<end; i++) {
	 						if(i%2!=0) {
	 						al.add(i);
	 						}
		 				}
						break;
				
		 case "Prime" :		 
			 				for(i=start; i<end; i++) {
			 					int count=0;
			 				for(int j=2; j<i; j++) {
			 					if(i%j==0) 
			 						count++;
			 				}
			 					if(count==0)
			 						al.add(i);
			 					 	 
			 				}
			 					break;
		 case "Perfect" : 	 
			 				for(i=start; i<=end; i++) {
			 					int sum=0;
			 				for(int j=1; j<i; j++) {
			 					if(i%j==0) {
			 						sum=sum+j;
			 					}
			 				}
			 				if(sum==i)
			 					al.add(sum);
		 					}
			 				break;
			 					
		case "Strong" :     for(i=start; i<=end; i++) {
							int temp=i,rem=1,result=1,result1=0;
					 				 while(temp>0){
					 				  rem=temp%10;
					 				  temp=temp/10;
					 				  result=1;
					 				  while(rem>0){
					 					  result=result*rem;
					 					  rem--;
					 				  }
					 				  result1=result1+result;
					 				 }
					 				 if(result1==i)
					 					 al.add(i);
				   				}
							     break;
		case "Armstrong" :  	for(i=start; i<=end; i++) {
					      			int temp=i, temp1=i,rem=0,result=0,count=0,p=1;
					      			while(temp>0){
					      				temp=temp/10;
					      				count++;
					      			}
					      			while (temp1>0){
					      				int count1=count;
					      				rem=temp1%10;
					      				temp1=temp1/10;
					      				p=1;
					      				while(count1>0){
					      					p=p*rem;
					      					count1--;
					      				}
					      				result=result+p;
            					  
					      			}
					      			if(result==i)
					      				al.add(i);	 
		 						}
		 						break;
		 			}	 
		 //step3 render the respons
		 PrintWriter writer= response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<body bgcolor=pink>");
		 writer.println("<h1>GENTERATING NUMBERS<h1>");
		 writer.println("GENERATE NUMBERS..."+" "+operationss+" "+al);
		// writer.println("ODD NUMBERS..."+" "+operationss+" "+al);
		 //writer.println("PRIME NUMBERS..."+" "+operationss+" "+al);
		 //writer.println("STRONG NUMBERS..."+" "+operationss+" "+al);
		// write.println("ARMSTRONG NUMBERS..."+" "+operationss+" "+al);
		 writer.println("</body>");
		 writer.println("</html>");
	}

}
