package atividade6;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1));
            double somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }

            medias[i] = somaNotas / 4;
        }

        int alunosAprovados = 0;
        for (int i = 0; i < 10; i++) {
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + alunosAprovados);

        scanner.close();
    }
}
