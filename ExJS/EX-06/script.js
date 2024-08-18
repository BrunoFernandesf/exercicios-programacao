var money;
var priceBit;
var priceEthe;
var priceLite;

money = Number(prompt("How much money do you have? "));
priceBit = Number(prompt("Type the price of Bitcoin"));
priceEthe = Number(prompt("Type the price of Ethereum"));
priceLite = Number(prompt("Type the price of Litecoin"));

prompt(`With ${money} you can buy: ${money/priceBit} Bitcoins, ${money/priceEthe} Ethereum, ${money/priceLite} Litecoin`);
