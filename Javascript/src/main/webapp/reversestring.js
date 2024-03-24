  function converToreverse(){
	 //read the data and store in variable
	const str= document.getElementById('inputstring').value;
	
	//convert to string to reversestring
    let revstring="";
    for (let i = str.length - 1; i >= 0; i--){
        revstring += str[i];
        }


	
	// set the output
	document.getElementById('reverseoutput').value=revstring	 
}
