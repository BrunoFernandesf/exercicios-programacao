var laptop;
var tax;
var final_price;
var result = document.querySelector(".result");

laptop = parseFloat(prompt("Digite o valor do laptop"));
tax = parseFloat(prompt("Digite o valor da taxa"));
final_price = laptop * tax;

result.textContent = "O valor final é: " + (laptop + final_price); 