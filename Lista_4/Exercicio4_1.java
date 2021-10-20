package Lista_4;

import java.util.Scanner;

public class Exercicio4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int qntdnotas = 0;
        double nota = 0;
        double acumula = 0;

        System.out.println("Digite quantas notas quer informar: ");
        qntdnotas = scanner.nextInt();
    
        for(int i=1; i<=qntdnotas; i++){
            System.out.println("Informe a " + i + "ª nota");
            nota = scanner.nextDouble();
            acumula = acumula + nota;
        }
        System.out.println("A média das notas é: " + (acumula/qntdnotas));
        scanner.close();
    }
}

