package com.sathya.tech;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
 
@WebServlet("/AddproductServlet")
@MultipartConfig
public class AddproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      String prodid=  request.getParameter("proId");
		      String proname=  request.getParameter("proname");
		      double proprice=Double.parseDouble(request.getParameter("proprice"));
		      String probrand=request.getParameter("probrand");
		      String promadein=request.getParameter("promadein");
		      Date prodmfgdate=Date.valueOf(request.getParameter("promfg"));
		      Date prodexpdate=Date.valueOf(request.getParameter("proexpy"));
		      Part part=request.getPart("proimage");
		      
		      
		      InputStream inputstream=part.getInputStream();
		      
		      //conversion of inputstream to byte array
		      
		     byte[] proImage= IOUtils.toByteArray(inputstream);
		     
		     Part part1=request.getPart("proAudio");
		     InputStream inputstream1=part1.getInputStream();
		     byte[] proAudio= IOUtils.toByteArray(inputstream1);
		     
		     Part part2=request.getPart("provideo");
		     InputStream inputstream2=part2.getInputStream();
		     byte[] provideo= IOUtils.toByteArray(inputstream2);
		      
		      //using above details create the product object
		      Product product=new Product();
		      product.setProId(prodid);
		      product.setProName(proname);
		      product.setProprice(proprice);
		      product.setProBrand(probrand);
		      product.setProMadeIn(promadein);
		      product.setProMfgDate(prodmfgdate);
		      product.setProExpDate(prodexpdate);
		      product.setProImage(proImage);
		      product.setProAudio(proAudio);
		      product.setProvideo(provideo);
		      
		      Productdao productdao=new Productdao();
		      
			 
				int result = productdao.save(product);
				
				if(result==1) {
					request.setAttribute("saveResult",result);
					RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
					dispatcher.forward(request, response);
				}
				else {
					response.setContentType("text/html");
					PrintWriter write=response.getWriter();
					write.println("DATA INSERTION FAILED....."+result);  
					RequestDispatcher dispatcher=request.getRequestDispatcher("add-product.html");
					dispatcher.include(request, response);
				}
	}

}
