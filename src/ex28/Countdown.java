package ex28;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        while(num >= 0){
            System.out.println("Digite um número");
            num = input.nextInt();
            System.out.println("----------------------------");
            for(int i = num; i > 0; i--){
                System.out.println(i);
            }
            if(num < 0){
                break;
            }
            System.out.println("Go!");
        }
        System.out.println("Exit Program");
    }
}
