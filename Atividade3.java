package atividade.pkg3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        System.out.println("Digite 4 notas: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;
        System.out.println("\nAs notas digitadas são:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("\nA média das notas é: " + media);
    }

}
