package ex15;

import java.util.Scanner;

public class contaTelefone {
    public static void main(String[] args) {
        int seconds;
        double charge;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de segundos da ligação");
        seconds = input.nextInt();

        if(seconds > 0 && seconds < 501){
            charge = seconds * 0.01;
        } else if(seconds > 500 && seconds < 801){
            charge = 500 * 0.01;
            charge += seconds * 0.008;
        } else {
            charge = 500 * 0.01;
            charge += 299 * 0.008;
            charge += seconds * 0.005;
        }

        System.out.printf("O valor a ser pago é de %.2f ",charge);

    }
}
