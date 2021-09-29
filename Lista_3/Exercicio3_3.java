package Lista_3;

import java.util.Scanner;

public class Exercicio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int soma;
        int subtr;
        int multip;
        int div;

        System.out.println("Digite o 1º número: ");
        A = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        B = scanner.nextInt();

        soma = ((A + B));
        subtr = (A - B);
        multip = (A * B);
        div = (A / B);

        System.out.println("\n" + A + " + " + B + " = " + soma);
        System.out.println(+A + " - " + B + " = " + subtr);
        System.out.println(+A + " * " + B + " = " + multip);
        System.out.println(+A + " / " + B + " = " + div);
        scanner.close();
    }
}