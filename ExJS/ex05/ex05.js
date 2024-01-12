var result = document.querySelector(".result");
var width;
var height;
var area;

width = parseInt(prompt("Digite a largura do terreno"));
height = parseInt(prompt("Digite a altura do terreno"));
area = width * height;

result.textContent = "A área do terreno é: "+ area;