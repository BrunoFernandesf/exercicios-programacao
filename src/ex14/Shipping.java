package ex14;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shippingCost = 0;
        double valorTotal = 0;

        System.out.println("Digite o país onde vive em letra maiuscula: ");
        String country = input.nextLine();

        switch (country){
            case "US":
                shippingCost = 5;
                break;
            case "EUROPA":
                shippingCost = 7;
                break;
            case "CANADA":
                shippingCost = 3;
                break;
            default:
                shippingCost = 9;
                break;
        }
        valorTotal = 20 + shippingCost;
        System.out.println("Você tem que pagar "+valorTotal+" 20 pelo produto e "+shippingCost+" pela entrega");
    }
}
