package AtividadeRevisao;

import java.util.Scanner;

public class Av7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC e a classificação
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}
