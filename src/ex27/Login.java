package ex27;

import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "Bruno";
        String password = "senha";
        int cont = 0;

        while (cont < 3){
            System.out.println("Digite o seu login");
            String usernameFill = input.next();
            System.out.println("Digite a sua senha");
            String passwordFill = input.next();
            if(Objects.equals(usernameFill, username) && Objects.equals(passwordFill, password)){
                System.out.println("Credenciais corretas");
                break;
            }
            cont++;
            System.out.println("Credenciais corretas - Tentativa "+ cont);
        }
        System.out.println("Programa finalizado");
    }
}
