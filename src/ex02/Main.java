package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int geometry = 0;
        int algebra = 0;
        int physics = 0;
        Calculo calculo = new Calculo();

        System.out.println("Digite a nota de Geometria");
        geometry = input.nextInt();
        System.out.println("Digite a nota de Algebra");
        algebra = input.nextInt();
        System.out.println("Digite a nota de Física");
        physics = input.nextInt();

        calculo.grades(geometry, algebra, physics);
    }
}