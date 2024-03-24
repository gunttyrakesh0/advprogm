function validateform(){
	let ProId=document.getElementById("prodId").value;
	let ProName=document.getElementById("prodname").value;
	let ProPrice=document.getElementById("prodprice").value;
	let ProBrand=document.getElementById("prodbrand").value;
	let ProMadein=document.getElementById("promadein").value;
	
	if(ProId.trim() === "" ||ProName.trim() === "" ||ProPrice.trim() === "" ||
	ProBrand.trim() === "" ||ProMadein.trim() === ""){
		alert("All fields must be filled out");
		return false;
	}
	if(parseFloat(ProPrice)<0){
		alert("pro price must be non-negative value")
		return false;
	}
	if(ProName.length > 50 ||ProBrand > 50){
		alert("product name and product brand must be less than 50 characters")
		return false;
	}
	
	//get the mfg & exp dates
	var prodmfDate=document.getElementById("promfg").value;
	var prodExpDate=document.getElementById("proexpy").value;	
	
	//convert into date format
	var manufacturingDateobj = new Date(prodmfDate);
	var expiryDateobj=new Date(prodExpDate);
	
	//check the validating of dates
	 if(manufacturingDateobj>expiryDateobj){
		 alert("manufacturing date cannot be greater than expiry date");
		 return false;
	 }
	return true;
}