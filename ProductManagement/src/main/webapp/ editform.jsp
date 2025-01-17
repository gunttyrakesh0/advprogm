<title>Add product</title>
<!--Bootstrap CDN link to get the support of Bootstrap -->
<%@page import="com.sathya.tech.Productdao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html;"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

	<script src="formvalidation.js"></script>
	
</head>
<body>
	<div class="container mt-5 text-center">
		<h1 class="text-center font-italic mb-1">EDIT FORM</h1>
		<form method="post" action="./UpdateServlet" enctype="multipart/form-data" onsubmit="return validateform()">
		
			<div class="form-group">
    		<label class="font-italic font-weight-bold" for="prodId">Product ID</label>
    		<input type="text" class="form-control-sm" id="prodId" name="proId"  value="${existingproduct.proId}"  required>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="proname">Product name</label>
				<input type="text" class="form-control-sm" id="prodname"
					name="proname" value="${existingproduct.proName}" required>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="proprice">Product price</label>
				<input type="text" class="form-control-sm" id="prodprice"
					name="proprice"  value="${existingproduct.proprice}">
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="probrand">Product Brand</label>
				<input type="text" class="form-control-sm" id="prodbrand"
					name="probrand"  value="${existingproduct.proBrand}" required>
			</div>
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="promadein">Product MadeIn</label>
				<input type="text" class="form-control-sm" id="promadein"
					name="promadein"  value="${existingproduct.proMadeIn}"   required>
			</div>
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="promfg">Product MFG DATE</label>
				<input type="date" class="form-control-sm" id="promfg"
					name="promfg"   value="${existingproduct.proMfgDate}"  required>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="proexpy">Product EXPIRY DATE</label>
				<input type="date" class="form-control-sm" id="proexpy"
					name="proexpy"   value="${existingproduct.proExpDate}"  required>
			</div>
			
			<!-- Display the current product  image -->
			
			<div class="form-group">
				<label class="font-italic font-weight-bold"
					for="proimage">current Image</label>
				<image id="currentImage"
					src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingproduct.proImage)}" alt="current product image" 
							style="max-widht: 100px; max-height: 100px;">
				<input type="hidden" class="form-control-sm" id="existingImage"
					name="existingImage" accept="image/*"  value="${Base64.getEncoder().encodeToString(existingproduct.proImage)}">
			</div>
			
			<!-- Allow the user to upload a new image -->
			
			<div class="form-group">
			<label class="font-italic font-weight-bold" for="newproImage">New product</label>
			<input type="file" class="form-control-file-sm" id="newImage" name="newproImage"
			  accept="image/*">
			</div>
			
			<div>
				<input type="submit" class="btn btn-success" value="update product"/>
			</div>
			
		</form>
	</div>

</body>
</html> 