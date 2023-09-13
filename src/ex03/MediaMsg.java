package ex03;

import ex02.Calculo;

import java.util.Scanner;

public class MediaMsg {

    public static void main(String[] args){
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

        int avg = calculo.grades(geometry, algebra, physics);
        if(avg >= 7){
            System.out.println("Muito bem");
        } else if (avg > 6 || avg > 4) {
            System.out.println("Você precisa se esforçar mais");
        } else {
            System.out.println("Não passou! Você realmente precisa se esforçar mais");
        }
    }

}
