var result = document.querySelector(".result");
var years;
var kids;
var daysOff = true;
var sum;

years = parseInt(prompt("Digite a quantidade de anos trabalhados"));
kids = parseInt(prompt("Digite a quantidade de filhos"));

if(daysOff === true) {
    sum = 400 + (20 * years) + (30 * kids) + 100;
} else {
    sum = 400 + (20 * years) + (30 * kids);
}

result.textContent = `O valor do salário é ${sum}`
