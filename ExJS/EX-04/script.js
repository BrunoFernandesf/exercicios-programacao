var bitcoinValue = 0;
var bitcoinPercent = 0;
var bitcoinTotal = 0;
var bitcoinVariation = 0;

bitcoinValue = Number(prompt("Type the value of the bitcoin at purchase"));
bitcoinPercent = Number(prompt("Type the percentage of increase or decrease"));

bitcoinTotal = bitcoinValue * (1 + (bitcoinPercent/100));

bitcoinVariation = bitcoinTotal - bitcoinValue;

alert(`The total value of the bitcoin is ${bitcoinTotal.toFixed(2)}`);
alert(`The increase or decrease value is ${bitcoinVariation.toFixed(2)}`);
