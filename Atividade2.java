package atividade.pkg2;
import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double[] vetor= new double[10];
        int i;
        System.out.println("Digite 10 numeros reais: ");
        for (i=0; i<10; i++){
            System.out.println("Número "+ (i+1) + ": ");
            vetor[i]=scanner.nextDouble();
            
        }
                scanner.close();
                System.out.println("Os números digitados em ordem inversa são:");
        for (i = 9; i >= 0; i--) {
            System.out.println("Número " + (10 - i) + ": " + vetor[i]);
        }
    }

}
