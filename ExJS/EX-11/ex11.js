var result = document.querySelector(".result");
var hours;
var income;
var salary;

hours = parseFloat(prompt("Digite quantas horas trabalhou"));
income = parseFloat(prompt("Digite quanto é o seu ganho por hora"));

salary = hours * income;
console.log(salary);

result.textContent = `Você pode comprar ${Math.floor(salary/200)} ps4, ${Math.floor(salary/900)} samsung phone, ${Math.floor(salary/500)} tvs, ${Math.floor(salary/9.99)} game skins `
