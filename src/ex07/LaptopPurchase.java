package ex07;

public class LaptopPurchase {
    public static void main(String[] args){
        double price = 500;
        double tax = 10;
        double valorDiferenca = 0;

        valorDiferenca = price * (tax/100);

        System.out.println("O preco atualizado é: "+(price + valorDiferenca));
    }
}
