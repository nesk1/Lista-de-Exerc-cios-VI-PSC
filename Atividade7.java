package atividade7;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        int multiplicacao = 1;
        for (int num : vetor) {
            soma += num;
            multiplicacao *= num;
        }

        System.out.println("\nNúmeros digitados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        scanner.close();
    }
}
