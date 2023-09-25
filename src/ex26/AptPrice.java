package ex26;

import java.util.Scanner;

public class AptPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int priceInput = input.nextInt();
        int priceTotal = 0;
        int contApt = 0;
        int avgPrice = 0;

        while(priceInput >= 1){
            priceTotal += priceInput;
            priceInput = input.nextInt();
            contApt++;
        }
        avgPrice = priceTotal/contApt;
        System.out.println("O valor médio dos apartamentos é igual a : "+avgPrice+" Foram registrados "+contApt+" apartamentos");

        int valInput = input.nextInt();
        while(valInput >= 1){
            if(valInput > avgPrice){
                System.out.println("Acima do valor médio");
            }else{
                System.out.println("Abaixo do valor médio");
            }
            valInput = input.nextInt();
        }
    }
}
