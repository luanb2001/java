package Lista_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor[] = new double[20];
        int i = 0;
        double soma = 0;
        double media = 0;

        System.out.println("\nInforme 20 valores\n");
        try{
            for (i = 0; i < valor.length; i++) {
                System.out.printf("Informe o " + (i + 1) + "º valor de " + valor.length + ": ");
                valor[i] = scanner.nextInt();
                soma += valor[i];
            }
            media = soma / valor.length;
            System.out.println("\nMédia = " + media);
            System.out.println("\nValores abaixo da média:");
            
            for (i = 0; i < valor.length; i++) {
                if (valor[i] < media) {
                    System.out.println(valor[i]);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }  
    }
}