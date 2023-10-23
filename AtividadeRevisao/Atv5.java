package AtividadeRevisao;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Digite a altura da figura (entre 1 e 20): ");
            altura = scanner.nextInt();

            if (altura < 1 || altura > 20) {
                System.out.println("Erro: A altura deve estar entre 1 e 20.");
                System.out.print("Deseja continuar? (1 para Sim, 0 para Não): ");
                int opcao = scanner.nextInt();
                if (opcao != 1) {
                    System.out.println("Programa encerrado.");
                    return;
                }
            }
        } while (altura < 1 || altura > 20);

        // Imprime a figura
        for (int i = 1; i <= altura; i++) {
            // Imprime os asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move para a próxima linha após imprimir os asteriscos
        }

        // Fecha o scanner
        scanner.close();
    }
}
