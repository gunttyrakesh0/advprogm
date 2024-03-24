/*function fruitprocessor(apples,oranges){
	return `juice preparing with ${apples}-apples & ${oranges}-oranges`
}
document.write(fruitprocessor(8,6));*/


function cutfruitprocessor(fruit){
	return 4*fruit;
}
function fruitprocessor(apple,orange){
	 
	return `juice preparing with ${cutfruitprocessor(8)}-apples & ${cutfruitprocessor(6)}-oranges`
}
console.log(fruitprocessor())