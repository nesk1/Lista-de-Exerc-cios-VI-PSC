package atividade.pkg1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

        }
        scanner.close();
        System.out.println("Os números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetor[i]);
        }
    }

}
