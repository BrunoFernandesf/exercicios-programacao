package ex22;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet = new int [5];

        for(int i = 0; i < vet.length; i++){
            vet[i] = input.nextInt();
        }

        for(int i = 0; i < vet.length; i++){
            if(vet[i] >= 0){
                System.out.println("Positivo");
            }else{
                System.out.println("Negativo");
            }
        }
    }
}
