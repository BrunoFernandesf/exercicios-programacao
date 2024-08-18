var price;
var tax;
var totalPrice;

price = Number(prompt("What is the price of the laptop"));
tax = Number(prompt("Type the tax percentage"));

totalPrice = price * (1 + (tax/100));
alert(`Total price is ${totalPrice.toFixed(2)}`);