var result = document.querySelector(".result");
var x;
var y;
var wikipedia = 0.1;
var memes = 0.05;
var consumption;

x = parseInt(prompt("Quantidade de horas no wikipedia"));
y = parseInt(prompt("Quantidade de horas vendo memes"));
consumption = (x * wikipedia) + (y * memes);

if(consumption > 100) {
    result.textContent = "Consumo muito alto";
    console.log("Consumo muito alto")

} else if ((x * wikipedia) < (y * memes)) {
    result.textContent = "Muitos memes";
    console.log("Muitos memes");
} else {
    result.textContent = "Consumo esperado";
}