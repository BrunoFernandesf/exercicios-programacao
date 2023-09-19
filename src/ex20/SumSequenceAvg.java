package ex20;

import java.util.Scanner;

public class SumSequenceAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 1;
        int sum = 0;
        double avg = 0;
        int i = 0;

        System.out.println("Digite o número límite");
        int end = input.nextInt();

        for(i = start; i <= end; i++){
            System.out.println(i);
            sum += i;
        }
        avg = (double) sum / i;

        System.out.println("A soma dos números é: "+sum);
        System.out.println("Aa média doss números é: "+avg);
    }
}
