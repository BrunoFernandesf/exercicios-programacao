package ex41;

import java.util.HashMap;
import java.util.Scanner;

public class NatoAlphabetOp {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner input = new Scanner(System.in);

        dictionary.put("a", "Alfa");
        dictionary.put("b", "Bravo");
        dictionary.put("c", "Charlie");
        dictionary.put("d", "Delta");
        dictionary.put("e", "Echo");
        dictionary.put("f", "Foxtrot");
        dictionary.put("g", "Golf");
        dictionary.put("h", "Hotel");
        dictionary.put("i", "India");
        dictionary.put("j", "Juliett");
        dictionary.put("k", "Kilo");
        dictionary.put("l", "Lima");
        dictionary.put("m", "Mike");
        dictionary.put("n", "November");
        dictionary.put("o", "Oscar");
        dictionary.put("p", "Papa");
        dictionary.put("q", "Quebec");
        dictionary.put("r", "Romeo");
        dictionary.put("s", "Sierra");
        dictionary.put("t", "Tango");
        dictionary.put("u", "Uniform");
        dictionary.put("v", "Victor");
        dictionary.put("w", "Whiskey");
        dictionary.put("x", "Xray");
        dictionary.put("y", "Yankee");
        dictionary.put("z", "Zulu");

        System.out.println("Choose an option:");
        System.out.println("1. Translate from Text to NATO Phonetic Alphabet");
        System.out.println("2. Translate from NATO Phonetic Alphabet to Text");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline character

        if (choice == 1) {
            System.out.println("Enter the text to translate to NATO Phonetic Alphabet:");
            String text = input.nextLine().toLowerCase();

            for (int i = 0; i < text.length(); i++) {
                String character = String.valueOf(text.charAt(i));
                if (dictionary.containsKey(character)) {
                    String value = dictionary.get(character);
                    System.out.println(value);
                } else {
                    System.out.println("Invalid character: " + character);
                }
            }
        } else if (choice == 2) {
            System.out.println("Enter NATO Phonetic Alphabet words separated by space:");
            String[] words = input.nextLine().split(" ");

            for (String word : words) {
                boolean found = false;
                for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(word)) {
                        System.out.print(entry.getKey());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid NATO Phonetic Alphabet word: " + word);
                }
            }
        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }

        input.close();
    }
}