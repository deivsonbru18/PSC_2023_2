package AtividadeRevisao;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir a altura da figura
        System.out.print("Digite a altura da figura (não ultrapasse 20 linhas): ");
        int altura = scanner.nextInt();
        
        // Verifica se a altura está dentro do limite
        if (altura > 20) {
            System.out.println("A altura inserida ultrapassa o limite de 20 linhas.");
        } else {
            // Imprime a figura
            for (int i = 1; i <= altura; i++) {
                // Imprime os asteriscos
                for (int j = 1; j <= i; j++) {
                    System.out.print("∗ ");
                }
                System.out.println(); // Move para a próxima linha após imprimir os asteriscos
            }
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
