package ex05;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double width = 0;
        double height = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura do terreno");
        width = input.nextDouble();
        System.out.println("Digite a altura do terreno");
        height = input.nextDouble();

        System.out.println("A área do terreno é: "+ (width * height));
    }
}
