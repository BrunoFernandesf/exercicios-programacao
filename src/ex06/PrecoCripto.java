package ex06;

import java.util.Scanner;

public class PrecoCripto {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double bitcoin = 100;
        double ethereum = 25;
        double litecoin = 10;

        System.out.println("Digite a quantidade de dinheiro disponível para compra: ");
        double dinheiro = input.nextDouble();

        System.out.printf("Com %.2f reais você pode comprar: %.0f Bitcoins %.0f Ethereum, e %.0f Litecoins",dinheiro, bitcoin, ethereum, litecoin);
    }
}
