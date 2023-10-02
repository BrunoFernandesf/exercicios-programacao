package ex30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        List<Integer> listaSal = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        String continuar = "";
        int contagem = 0;
        int maiorSal = 0;
        int contadorSal = 0;

        while(!continuar.equals("sair")){
            System.out.println("Digite seu nome");
            String nome = input.next();
            System.out.println("Digite seu salário");
            int salario = input.nextInt();
            listaNome.add(nome);
            listaSal.add(salario);
            contagem++;

            System.out.println("Deseja continuar? Digite 'sair' para fechar o programa");
            continuar = input.next();
        }
        for(int i = 0; i<contagem; i++){
            if(listaSal.get(i) > maiorSal){
                maiorSal = listaSal.get(i);
                contadorSal = i;
            }
            System.out.println(listaNome.get(i) +"-"+ listaSal.get(i));
        }
        System.out.println("O maior salário é: "+listaNome.get(contadorSal) +"-"+listaSal.get(contadorSal));
    }
}
