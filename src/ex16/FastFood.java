package ex16;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = 0;

        System.out.println("-----------------------");
        System.out.println("Escolha uma das opções do menu");
        System.out.println("Burguer");
        System.out.println("Pizza");
        System.out.println("Hot Dog");
        String escolha = input.nextLine();

        switch (escolha){
            case "Burguer":
                valor = 5;
                break;
            case "Pizza":
                valor = 3;
                break;
            case "Hot Dog":
                valor = 1.5;
                break;
        }

        System.out.println(escolha+" "+valor+"$");
    }
}
