package ex39;

import java.util.HashMap;
import java.util.Scanner;

public class MorseOp {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("a",".-");
        dictionary.put("b","-...");
        dictionary.put("c","-.-.");
        dictionary.put("d","-..");
        dictionary.put("e",".");
        dictionary.put("f","..-.");
        dictionary.put("g","--.");
        dictionary.put("h","....");
        dictionary.put("i","..");
        dictionary.put("j",".---");
        dictionary.put("k","-.-");
        dictionary.put("l",".-..");
        dictionary.put("m","--");
        dictionary.put("n","-.");
        dictionary.put("o","---");
        dictionary.put("p",".--.");
        dictionary.put("q","--.-");
        dictionary.put("r",".-.");
        dictionary.put("s","...");
        dictionary.put("t","-");
        dictionary.put("u","..-");
        dictionary.put("v","...-");
        dictionary.put("w",".--");
        dictionary.put("x","-..-");
        dictionary.put("y","-.--");
        dictionary.put("z","--..");

        System.out.println("Escolha a opção de tradução digite 1 para portugues-morse  ou 2 para morse-português");
        int op = input.nextInt();
        System.out.println("Digite o texto");
        String text = input.next();

        if(op == 1){
            for (int i = 0; i < text.length(); i++){
                String value = dictionary.get(String.valueOf(text.charAt(i)));
                System.out.println(value);
            }
        }else {

        /*}

            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                if (entry.getValue().equals(morseCode)) {
                    return entry.getKey();
                }
        */}
    }
}
