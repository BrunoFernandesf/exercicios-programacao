var geometry
var algebra
var physics

geometry = parseFloat(prompt("Digite a sua nota de Geometria"));
algebra = parseFloat(prompt("Digite a sua nota de Algebra"));
physics = parseFloat(prompt("Digite a sua nota de Física"));

var avg = (geometry + algebra + physics) / 3;
alert("A sua média é: "+ avg);