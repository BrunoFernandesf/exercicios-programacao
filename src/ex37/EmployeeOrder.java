package ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeOrder {
    public static void main (String [] args){
        List<String> listNomes = new ArrayList<String>();
        List<Integer> listSal = new ArrayList<Integer>();

        listNomes.add("Mary");
        listNomes.add("John");
        listNomes.add("George");
        listNomes.add("Nicole");
        listNomes.add("Nick");
        listNomes.add("Jim");
        listNomes.add("Jack");
        listNomes.add("Johanna");

        listSal.add(32343);
        listSal.add(12134);
        listSal.add(25342);
        listSal.add(35342);
        listSal.add(42343);
        listSal.add(32134);
        listSal.add(15342);
        listSal.add(25342);

        Collections.sort(listSal);
        System.out.println(listSal);
    }
}
