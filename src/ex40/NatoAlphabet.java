package ex40;

import java.util.HashMap;
import java.util.Scanner;

public class NatoAlphabet {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner input = new Scanner(System.in);

        dictionary.put("a","Alfa");
        dictionary.put("b","Bravo");
        dictionary.put("c","Charlie");
        dictionary.put("d","Delta");
        dictionary.put("e","Echo");
        dictionary.put("f","Foxtrot");
        dictionary.put("g","Golf");
        dictionary.put("h","Hotel");
        dictionary.put("i","India");
        dictionary.put("j","Juliett");
        dictionary.put("k","Kilo");
        dictionary.put("l","Lima");
        dictionary.put("m","Mike");
        dictionary.put("n","November");
        dictionary.put("o","Oscar");
        dictionary.put("p","Papa");
        dictionary.put("q","Quebec");
        dictionary.put("r","Romeo");
        dictionary.put("s","Sierra");
        dictionary.put("t","Tango");
        dictionary.put("u","Uniform");
        dictionary.put("v","Victor");
        dictionary.put("w","Whiskey");
        dictionary.put("x","Xray");
        dictionary.put("y","Yankee");
        dictionary.put("z","Zulu");

        System.out.println("Digite as palavras");
        String text = input.next();

        for (int i = 0; i < text.length(); i++) {
            String value = dictionary.get(String.valueOf(text.charAt(i)));
            System.out.println(value);
        }
    }
}
