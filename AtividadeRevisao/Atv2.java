package AtividadeRevisao;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número para ver a tabuada de multiplicação: ");
        int numero = scanner.nextInt();
        
        // Imprime a tabuada de multiplicação
        System.out.println("Tabuada de Multiplicação para " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
