package ex31;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DifferentValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Object> list = new ArrayList<Object>();
        String name;
        int sal;

        System.out.println("Digite a quantidade de funcionários");
        int quant = input.nextInt();

        for(int i = 0; i < quant; i++){
            Employee employee1 = new Employee();
            System.out.println("Digite o nome do funcionário");
            name = input.next();
            employee1.setName(name);
            System.out.println("Digite o salario do funcionário");
            sal = input.nextInt();
            employee1.setSal(sal);

            list.add(employee1);

            System.out.println(employee1);
        }
        System.out.println(list);
    }
}
