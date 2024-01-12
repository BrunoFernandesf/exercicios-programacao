var geometry;
var algebra;
var physics;

var avg;

mensagem = document.querySelector('.result');


geometry = parseFloat(prompt('Digite a nota de Geometria'));
algebra = parseFloat(prompt('Digite a nota de algebra'));
physics = parseFloat(prompt('Digite a nota de física'));

avg = (geometry + algebra + physics) / 3;

if(avg >= 7) {
    mensagem.textContent = 'Bom trabalho';
}

else if(avg >= 4 && avg <= 6) {
    mensagem.textContent = 'Você precisa se dedicar mais';
}

else {
    mensagem.textContent = 'Você falhou, realmente precisa se dedicar!';
}