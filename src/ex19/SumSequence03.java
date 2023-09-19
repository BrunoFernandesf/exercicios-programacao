package ex19;

import java.util.Scanner;

public class SumSequence03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 0;
        int sum = 0;

        System.out.println("Digite o número límite");
        int end = input.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("A soma dos números é: "+sum);
    }
}
