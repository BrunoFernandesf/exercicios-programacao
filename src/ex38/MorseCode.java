package ex38;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
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

        String text = input.next();
        for (int i = 0; i < text.length(); i++){
            String value = dictionary.get(String.valueOf(text.charAt(i)));
            System.out.println(value);
        }
    }
}
