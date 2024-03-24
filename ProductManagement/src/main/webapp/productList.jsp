<%@page import="com.sathya.tech.Productdao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html;"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Products List</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	</head>
	<body>
	
	<div class="form-group">
		
		<h1 class="text-center text-success">LIST OF AVAILABLE PRODUCTS</h1>
		
	</div>
	
	<div class="form-group">
		<a  class="btn btn-success" href="add-product.html">SAVE PRODUCT </a>	
	</div>
	
	<div class="form-group">
	
		<input type="text" placeholder="search">	
	
	</div>
	
	<div class="form-group">
	
		<c:if test="${saveResult==1}">
		<h1 class="text-success text-center">DATA INSERTED SUCCESSFULLY</h1>
		</c:if>
		
	</div>
	
	<div>
	
		<c:if test="${deleteResult==1}">
		<h1 class="text-danger text-center">DELETION SUCCESSFULLY</h1>
		</c:if>
		
	</div>
	
	<div>
	
		<c:if test="${deleteResult==0}">
		<h1 class="text-danger text-center">DELETION FAILED</h1>
		</c:if>
		
	</div>
	
	<div>
	
		<c:if test="${UpdateResult==1}">
		<h1 class="text-danger text-center">DELETION SUCCESSFULL</h1>
		</c:if>
		
	</div>
	<div>
	
		<c:if test="${UpdateResult==0}">
		<h1 class="text-danger text-center">DELETION FAILED</h1>
		</c:if>
		
	</div>
	
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th> Product ID</th>
					<th> Product NAME</th>
					<th> PRICE </th>
					<th> BRAND </th>
					<th> MADE-IN </th>
					<th> MANUFACTURE DATE </th>
					<th> EXPIRY DATE </th>
					<th> IMAGE </th>
					<th> Audio</th>
					<th>video</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="<%=new Productdao().findAll()%>">
				<tr>
					<td>${product.proId}</td>
					<td>${product.proName}</td>
					<td>${product.proprice}</td>
					<td>${product.proBrand}</td>
					<td>${product.proMadeIn}</td>
					<td>${product.proMfgDate}</td>
					<td>${product.proExpDate}</td>
					<td> 
						   <img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="product image"
							style="max-width: 100px; max-height:100px;">
				    </td>
				    
				    <td>
				    <audio controls>
				   		 <source src="data:video/mp3;base64,${Base64.getEncoder().encodeToString(product.proAudio)}" type="audio/mp3">
				    </audio>
				    </td>
				    
				     <td>
				    <video controls width="200" height="200">
				    	<source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.provideo)}" type="video/mp4">
				    </video>
				    </td>
				    
					<td>
							<a class="btn btn-primary" href="./DeleteServlet?proId=${product.proId}">Delete</a>
							<a class="btn btn-primary" href="./EditServlet?proId=${product.proId}">EDIT</a>
					</td>		 
				</tr>
				</c:forEach>
			</tbody>
		</table> 
	</body>
</html>