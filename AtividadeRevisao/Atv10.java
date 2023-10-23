package AtividadeRevisao;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci que você deseja imprimir: ");
        int numeroDeTermos = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + numeroDeTermos + " termos da sequência de Fibonacci são:");
        
        // Imprime os primeiros n termos da sequência de Fibonacci
        for (int i = 1; i <= numeroDeTermos; ++i) {
            System.out.print(primeiroTermo + " ");

            // Calcula o próximo termo da sequência
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
