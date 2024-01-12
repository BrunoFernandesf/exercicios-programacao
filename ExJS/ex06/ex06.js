var result = document.querySelector(".result");
var money;
var bitcoin_price = 50;
var ethereum_price = 25;
var litecoin_price = 10;

money = parseInt(prompt("Digite o total de dinheiro que você tem"));
result.textContent = "Com "+ money + "$ você pode comprar: " + money/bitcoin_price + " bitcoins" + " , " + money/ethereum_price + "Ethereum, e " + money/litecoin_price;