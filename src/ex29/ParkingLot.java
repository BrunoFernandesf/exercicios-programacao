package ex29;

import java.util.Scanner;


public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDrivers = 0;
        double totalEarnings = 0;

        while (true) {
            // Pergunta se o motorista é um membro
            System.out.print("Are you a member? (Yes/No): ");
            String isMember = scanner.next().toLowerCase();

            // Verifica a resposta do motorista
            if (!isMember.equals("yes") && !isMember.equals("no")) {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
                continue;
            }

            // Calcula o custo fixo com base no status de membro
            double fixedCost = (isMember.equals("yes")) ? 1.5 : 3;

            // Pergunta ao motorista quantas horas ele estacionou
            System.out.print("How many hours have you parked?: ");
            int hoursParked = scanner.nextInt();

            // Verifica se o número de horas é válido
            if (hoursParked < 1) {
                System.out.println("Invalid input. Please enter a valid number of hours.");
                continue;
            }

            // Calcula o custo com base no número de horas estacionadas
            double cost = fixedCost + calculateHourlyCost(hoursParked);

            // Imprime o custo a ser pago pelo motorista
            System.out.println("Total amount is $" + cost);

            // Atualiza o total de motoristas e ganhos
            totalDrivers++;
            totalEarnings += cost;

            // Pergunta ao usuário se deseja continuar
            System.out.print("Do you want to continue? (Yes/No): ");
            String continueOption = scanner.next().toLowerCase();

            // Verifica se o usuário quer continuar
            if (!continueOption.equals("yes")) {
                break;
            }
        }

        // Imprime o número total de motoristas que pagaram e os ganhos totais
        System.out.println(totalDrivers + " driver(s) paid. The total earnings are $" + totalEarnings);

        // Fecha o scanner
        scanner.close();
    }

    // Calcula o custo por hora com base no número de horas estacionadas
    private static double calculateHourlyCost(int hours) {
        if (hours == 1) {
            return 2;
        } else if (hours == 2) {
            return 1.5;
        } else if (hours == 3) {
            return 1;
        } else {
            return 0.5 * (hours - 3);
        }
    }
}