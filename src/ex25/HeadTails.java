package ex25;

import java.util.Scanner;

public class HeadTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        int contCara = 0;
        int contCoroa = 0;
        int qtd = 0;

        while(true){
            System.out.println("Digite a opção de cara ou coroa, e stop para parar");
            option = input.next();

            if(option.equals("stop")){
                break;
            } else if (option.equals("cara")) {
                contCara++;
            }else {
                contCoroa++;
            }
            qtd++;
        }
        System.out.println("Cara ganhou "+contCara +" vezes e coroa ganhou "+contCoroa + " vezes");
        double percCara = (double) contCara /qtd;
        double percCoroa = (double) contCoroa /qtd;
        System.out.println((percCara*100)+"% Cara, "+(percCoroa*100) + "% Coroa");
    }
}
