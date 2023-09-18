package ex17;

public class SumSequence {
    public static void main(String[] args) {
        int start = 1;
        int end = 99;
        int sum = 0;

        for(int i = start; i <= end; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("A soma dos números é: "+sum);
    }
}
