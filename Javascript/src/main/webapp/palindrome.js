 function palindrome(){
	const number= document.getElementById('noinput').value;
	 let val;
	 let palindorme="";
	 for(let i=number.length-1; i>=0; i--){
		 palindorme=palindorme+number[i];
	 }
	 if(number==palindorme)
	  val="number is palindrome";
	  else
	  	val="not a palindorme";
	 	
	 	document.getElementById('poutput').value=val
	 
 }