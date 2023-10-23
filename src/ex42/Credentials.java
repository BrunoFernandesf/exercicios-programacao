package ex42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> credentials = new ArrayList<>();

        System.out.println("Digite o seu usuário: ");
        String username = input.next();
        HashMap<String, List<String>> userDictionary = new HashMap<>();

        System.out.println("Digite a sua senha: ");
        String password = input.next();
        credentials.add(password);
        System.out.println("Tem foto: ");
        String hasPhotoString = input.next();
        credentials.add(hasPhotoString);

        System.out.println("Digite seu email: ");
        String email = input.next();
        credentials.add(email);

        userDictionary.put(username, credentials);
        String value = userDictionary.get(username).toString();
        System.out.println(value);
    }
}
