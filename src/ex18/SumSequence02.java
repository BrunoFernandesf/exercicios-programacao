package ex18;

import java.util.Scanner;

public class SumSequence02 {
    public static void main(String[] args) {
        int start = 0;
        int end = 102;
        int sum = 0;

        for(int i = start; i < end; i++){
            if(i % 2 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("A soma dos números é: "+sum);
    }
}
