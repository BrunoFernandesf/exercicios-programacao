package ex33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listNames = new ArrayList<>();
        ArrayList<Double> listSal = new ArrayList<>();
        int cont = 0;
        int totalSal =0;

        while(true){
            System.out.println("Digite o nome ou 'quit' para sair ");
            String name = input.next();

            if(name.equals("quit")){
                break;
            }

            System.out.println("Digite o salário: ");
            double sal = input.nextInt();
            totalSal+= sal;

            listNames.add(name);
            listSal.add(sal);
            cont++;
        }

        System.out.println("A empresa tem "+cont +" funcionários e a quantidade de salarios é: "+totalSal);
    }
}
