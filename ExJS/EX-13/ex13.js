var result = document.querySelector(".result");
var hours;
var isMember;
var tax;
var sum;

hours = parseInt(prompt("Digite a quantidade de horas gastas"));
isMember = prompt("É um membro? S ou N");

if(isMember === "S") {
    tax = (hours * 2) * 0.1
    sum = (hours * 2) + tax;
} else {
    tax = (hours * 2) * 0.2
    sum = (hours * 5) + tax;
}

result.textContent = `O valor a ser pago é de ${sum}`