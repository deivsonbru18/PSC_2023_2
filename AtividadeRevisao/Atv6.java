package AtividadeRevisao;

import java.util.Scanner;

public class Atv6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 20;
        int somaIdadeMasculino = 0;
        int somaIdadeFeminino = 0;
        int countMasculino = 0;
        int countFeminino = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (sexo == 'M' || sexo == 'm') {
                somaIdadeMasculino += idade;
                countMasculino++;
            } else if (sexo == 'F' || sexo == 'f') {
                somaIdadeFeminino += idade;
                countFeminino++;
            } else {
                System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
                i--; // Decrementa i para que a iteração seja repetida para a mesma pessoa
            }
        }

        // Calcula média de idade para população masculina e feminina
        double mediaIdadeMasculino = (double) somaIdadeMasculino / countMasculino;
        double mediaIdadeFeminino = (double) somaIdadeFeminino / countFeminino;

        System.out.println("Média de idade da população masculina: " + mediaIdadeMasculino);
        System.out.println("Média de idade da população feminina: " + mediaIdadeFeminino);

        scanner.close();
    }
}
