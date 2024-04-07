package atividade.pkg4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] caracteres = new char[10];

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteres[i] = scanner.next().charAt(0);
        }

        int consoantes = 0;
        System.out.println("\nConsoantes digitadas:");
        for (int i = 0; i < 10; i++) {
            char caractere = caracteres[i];

            if (Character.isLetter(caractere) && !"AEIOUaeiou".contains(String.valueOf(caractere))) {
                System.out.println(caractere);
                consoantes++;
            }
        }

        System.out.println("\nTotal de consoantes lidas: " + consoantes);

        scanner.close();
    }
}
