package ex44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CredentialsPassword {
    public static void main(String[] args){
        boolean valid = false;

        Scanner input = new Scanner(System.in);
        List<String> credentials = new ArrayList<>();

        System.out.println("Digite o seu usuário: ");
        String username = input.next();
        HashMap<String, List<String>> userDictionary = new HashMap<>();

        while(valid == false){
            System.out.println("Digite a sua senha: ");
            String password = input.next();

            if(password.length() < 6 || password.length() > 12){
                System.out.println("Senha inválida");
            }else {
                credentials.add(password);
                valid = true;
            }
        }

        System.out.println("Tem foto: ");
        String hasPhotoString = input.next();
        credentials.add(hasPhotoString);

        System.out.println("Digite o seu email");
        String email = input.next();
        credentials.add(email);

        userDictionary.put(username, credentials);
        String value = userDictionary.get(username).toString();
        System.out.println(value);
    }
}
