var result = document.querySelector(".result");
var number;

number = parseInt(prompt("Digite um número"));
result.textContent = `O último dígito é ${number % 10}`;