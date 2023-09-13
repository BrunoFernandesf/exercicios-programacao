package ex01;

public class ex01 {
    public static void main(String[] args){
        int conv = 0;
        int a = 10;
        int b = 20;

        conv = a;
        a = b;
        b = conv;

        System.out.println("A variável a tem valor: "+ a);
        System.out.println("A variável a tem valor: "+ b);
    }
}
