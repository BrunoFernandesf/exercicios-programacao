var result = document.querySelector(".result");
var product;
var place;
var fee;
var total;

product = parseFloat(prompt("Digite o valor do produto"));
place = prompt("Digite a sua localização");

if(place === "US") {
    fee = 5;
} else if (place === "Europe") {
    fee = 7;
} else if (place === "Canada") {
    fee = 3;
} else {
    fee = 9;
}

total = product + fee;
result.textContent = `O valor a ser pago é ${total}, ${product} pelo produto e ${fee} pela entrega`;