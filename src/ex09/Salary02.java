package ex09;

public class Salary02 {
    public static void main(String[] args) {
        double minWage = 400;
        int years = 5;
        int children = 2;
        boolean missWork = false;

        double formulaSalary = minWage + (20 * years) + (children * 30) + 100;

        if(missWork == false){
            System.out.println("O valor é: "+ formulaSalary);
        } else {
            System.out.println("O valor total é: "+(formulaSalary-100));
        }
    }
}
