package ex11;

public class purchaseAmount {
    public static void main(String[] args) {
        int hours = 10;
        int incomeHour = 100;
        double ps4 = 200;
        double samsungPhone = 900;
        double tv = 500;
        double skin = 9.99;

        double salary = incomeHour * hours;

        System.out.printf("Você pode comprar %.0f ps4, %.0f samsung, %.0f tv, %.0f skin", salary/ps4, salary/samsungPhone, salary/tv, salary/skin);
    }
}
