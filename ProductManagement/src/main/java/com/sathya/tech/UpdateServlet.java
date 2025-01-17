package com.sathya.tech;

import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
import java.sql.Date;
import java.util.Base64;
@WebServlet("/UpdateServlet")
@MultipartConfig
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String proId = request.getParameter("proId");
	        String updatedProName = request.getParameter("proname");
	        double updatedProPrice = Double.parseDouble(request.getParameter("proprice"));
	        String updatedProBrand = request.getParameter("probrand");
	        String updatedProMadeIn = request.getParameter("promadein");
	        Date updatedProMfgDateStr = Date.valueOf(request.getParameter("promfg"));
	        Date updatedProExpDateStr = Date.valueOf(request.getParameter("proexpy"));
//	        Part part=request.getPart("proimage");
//		      InputStream inputstream=part.getInputStream();
//		      
////		      conversion of inputstream to byte array
//		      
//		    byte[] updatedproimage= IOUtils.toByteArray(inputstream);

	  
			 Product product=new Product();
		      product.setProId(proId);
		      product.setProName(updatedProName);
		      product.setProprice(updatedProPrice);
		      product.setProBrand(updatedProBrand);
		      product.setProMadeIn(updatedProMadeIn);
		      product.setProMfgDate(updatedProMfgDateStr);
		      product.setProExpDate(updatedProExpDateStr);
		    //  product.setProImage(updatedproimage);
		      
		      Part filepart=request.getPart("newproImage");
		       if(filepart!=null && filepart.getSize()>0) {
		    	   InputStream inputstream=filepart.getInputStream();
		    	   byte[] newImageData=IOUtils.toByteArray(inputstream);
		    	   product.setProImage(newImageData);
		       }
		       else {
		    	  //Part file=request.getPart("existingImage");
		    	   String s=request.getParameter("existingImage");
		    	   byte [] existingImage =Base64.getDecoder().decode(s);
		    	   //InputStream inputstream=filepart.getInputStream();
		    	   product.setProImage(existingImage);
		    	   
		       }

				Productdao dao=new Productdao();
			int result= dao.UpdateProductList(product);
			 

				if(result==1) {
					
					RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
					dispatcher.forward(request, response);
				}
				else {
					PrintWriter writer=response.getWriter();
					writer.println("no success");
					
					
					
					RequestDispatcher dispatcher=request.getRequestDispatcher(" editform.jsp");
					dispatcher.include(request, response);
				}
		}
	 

	}
