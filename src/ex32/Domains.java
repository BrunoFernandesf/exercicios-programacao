package ex32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Domains {
    public static void main(String[] args) {
        //IT, hubspot, pigeon
        //.com, .biz, .net
        List<String> listName = new ArrayList<>(Arrays.asList("it", "hubspot", "pigeon"));
        List<String> listDomain = new ArrayList<>(Arrays.asList(".com", ".biz", ".net"));

        int index1 = 0;
        int index2 = 0;
        for(String s : listName){
            System.out.println(s);
            for (String s1 : listDomain){
                System.out.println(s1);
            }
        }

    }
}
