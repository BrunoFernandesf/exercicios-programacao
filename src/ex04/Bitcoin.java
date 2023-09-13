package ex04;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do bitcoin comprado");
        double val = input.nextDouble();
        System.out.println("Digite a mudança percentual");
        double percent = input.nextInt();

        double valorVariacao = val * (percent / 100);
        double valorAtualizado = val + valorVariacao;

        System.out.println("-----------------------------");
        System.out.println("Valor do bitcoin: "+ val);
        System.out.println("Aumento do valor: "+ percent);
        System.out.println("Valor variação: "+ valorVariacao);
        System.out.println("Valor atualizado: "+ valorAtualizado);
    }
}
