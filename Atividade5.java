package atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int countPares = 0;
        int countImpares = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                pares[countPares] = numeros[i];
                countPares++;
            } else {
                impares[countImpares] = numeros[i];
                countImpares++;
            }
        }

        System.out.println("\nNúmeros digitados:");
        imprimirVetor(numeros);
        System.out.println("\nNúmeros Pares:");
        imprimirVetor(pares, countPares);
        System.out.println("\nNúmeros Ímpares:");
        imprimirVetor(impares, countImpares);

        scanner.close();
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
