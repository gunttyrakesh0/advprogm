 var massratan=60;
 var massanu=58;
 var heightanu=1.524;
 var heightratan=1.829;
 let BMIratan=massratan/(heightratan*heightratan);;
 let BMIanu=massanu/(heightanu*heightanu);;
 console.log("log value of BMIratan"+BMIratan);
 console.log("log value of BMIanu"+BMIanu);
 document.write("the value of BMIratan"+BMIratan);
 document.write("the value of BMIanu"+BMIanu);
 var RatanHigherBMI=true;
 if(BMIratan>BMIanu){
 	console.log("the value of RatanHigherBMI"+RatanHigherBMI);
 	}
 	else{
		  RatanHigherBMI=false;
		  console.log("the value of RatanHigherBMI"+RatanHigherBMI);
	 }