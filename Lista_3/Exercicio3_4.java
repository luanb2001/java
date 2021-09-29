package Lista_3;

import java.util.Scanner;

public class Exercicio3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Número: ");
        int num = scanner.nextInt();
        System.out.println("Digite o Expoente: ");
        int expoente = scanner.nextInt();

        double result = Math.pow(num, expoente);

        System.out.println("\n" + num + " elevado a " + expoente + " = " + result);
        scanner.close();
    }
}
