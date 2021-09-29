package Lista_3;

import java.util.Scanner;

public class Exercicio3_6 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int c = 0;
        double pi = 3.14;

        System.out.println("Digite o perímetro da circunferência em cm: ");
        c = scanner.nextInt();

        double raio = (c/pi)/2;
        double area = (raio*raio)*pi;

        System.out.println("O tamanho do raio é: " + raio + "cm");
        System.out.println("O tamanho da área é: " + area + "cm²"); 
        scanner.close();
    }
}
