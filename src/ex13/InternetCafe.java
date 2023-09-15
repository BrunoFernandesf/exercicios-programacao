package ex13;

import java.util.Scanner;

public class InternetCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean premium = true;
        double payment = 0;

        System.out.println("Digite a quantidade de horas que o cliente ficou: ");
        int hours = input.nextInt();

        if(premium == false){
            payment = (5 * hours) * 0.2;
            System.out.println("O cliente ficou "+hours+" por 5$ a hora com um adicional de 20%, ficando o total igual a "+(payment+(payment*0.2)));
        }else{
            payment = (2 * hours);
            System.out.println("O cliente ficou "+hours+" por 2$ a hora com um adicional de 10%, ficando o total igual a "+(payment+(payment*0.1)));

        }
    }
}
