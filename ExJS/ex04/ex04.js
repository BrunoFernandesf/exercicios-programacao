var bitValue;
var increase;
var bitcointIncrease;
var result;
var response = document.querySelector('.response');


bitValue = parseFloat(prompt("Digite o valor do bitcoin: "));
increase = parseFloat(prompt("Digite o percentual de aumento ou diminuição: "));
bitcointIncrease = bitValue * (increase/100);

result = bitValue + bitcointIncrease;
response.textContent = "Valor final: "+ result + " Acrescimo: "+ increase;

console.log(bitValue);
console.log(increase);
console.log(bitcointIncrease);
console.log(result);