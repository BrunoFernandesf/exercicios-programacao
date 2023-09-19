package ex21;

import java.util.Scanner;

public class AvgFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avg = 0;

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        avg = (double) (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("A média dos números é: " +avg);
    }
}
