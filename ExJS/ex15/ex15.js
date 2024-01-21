var result = document.querySelector(".result");
const fixedCost = 25;
var seconds;
var totalAmount = 0;

seconds = parseInt(prompt("Digite a quantidade em segundos da ligação"));

if (seconds >= 1) {
    if (seconds <= 500) {
        totalAmount = seconds * 0.01;
    } else if (seconds <= 800) {
        totalAmount += 500 * 0.01;
        totalAmount += (seconds - 500) * 0.008;
    } else {
        totalAmount += 500 * 0.01;
        totalAmount += 300 * 0.008;
        totalAmount += (seconds - 800) * 0.005;
    }
} else {
    result.textContent = "Sem valor adicional a ser pago";
}

result.textContent = `O valor a ser pago é ${fixedCost + totalAmount}, sendo ${fixedCost} o valor fixo e ${totalAmount.toFixed(2)} o valor de taxa`;


