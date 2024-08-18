var result = document.querySelector(".result")
var years
var children
var total;

years = parseInt(prompt("Digite a quantidade de anos trabalhado"))
children = parseInt(prompt("Digite a quantidade de filhos"))

total = 400 + (20 * years) + (30 * children)
result.textContent = "O salário do funcionário é: " + total

