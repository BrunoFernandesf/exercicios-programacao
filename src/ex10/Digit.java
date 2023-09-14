package ex10;

public class Digit {
    public static void main(String[] args) {
        int number = 12;
        int lastDigit = 0;

        lastDigit = number % 10;
        System.out.println("Last digit: "+lastDigit);
    }
}
