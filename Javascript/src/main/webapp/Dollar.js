 function converToruppee(){
	 //read the data and store in variable
	 
	const dollars= document.getElementById('dollarinput').value;
	
	//convert to dollar to ruppee
	
	const ruppee=(parseInt(dollars)*81);
	
	// set the output
	document.getElementById('ruppeeoutput').value=ruppee;
	 
 }