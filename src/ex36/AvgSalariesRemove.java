package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgSalariesRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();
        List<Double> listaSal = new ArrayList<>();
        List<String> listaRemov = new ArrayList<>();
        String nome;
        double sal;
        String op = "";
        double somaSal = 0;
        int cont = 0;

        while(!op.equals("sair")){
            System.out.println("Digite o nome");
            nome = input.next();
            System.out.println("Digite o salário");
            sal = input.nextDouble();
            listaNomes.add(nome);
            listaSal.add(sal);
            System.out.println("Deseja continuar? Digite 'sair' para finalizar o programa");
            op = input.next();
            cont++;
            somaSal += sal;

        }
        double totalSal = somaSal/cont;

        System.out.println("A média dos salários é: ");
        System.out.printf("%.2f %n", totalSal);
        System.out.println("---------------------");

        for(int i = 0; i<listaSal.size(); i++){
            if(listaSal.get(i) < totalSal){
                System.out.println(listaNomes.get(i) +" é abaixo da média" );
                listaNomes.remove(i);
                listaSal.remove(i);
                listaRemov.add(listaNomes.get(i));
                listaRemov.add(String.valueOf(listaSal.get(i)));
            }
            else {
                System.out.println(listaNomes.get(i) +" é acima da média");
            }
        }
        System.out.println(listaNomes);
        System.out.println(listaSal);

        //System.out.println(listaRemov);
    }
}

