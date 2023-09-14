package ex08;

public class Salary {
    public static void main(String[] args){
        double minWage = 400;
        int years = 5;
        int children = 2;

        double formulaSalary = minWage + (20 * years) + (children * 30);

        System.out.println("O valor total é: "+formulaSalary);
    }
}
