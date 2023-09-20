package ex24;

import java.util.Scanner;

public class SequenceZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while(true){
            number = input.nextInt();

            if(number <= 0){
                break;
            }
            sum += number;
        }
        System.out.println("Soma é: "+sum);

    }
}
