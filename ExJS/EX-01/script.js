var resultA = document.querySelector(".result-01");
var resultB = document.querySelector(".result-02");

var a = 10;
var b = 20;
var c = 0;

c = a;
a = b;
b = c;

resultA.innerHTML = `Variável A = ${a}`;
resultB.innerHTML = `Variável B = ${b}`;