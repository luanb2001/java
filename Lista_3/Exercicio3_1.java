package Lista_3;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio3_1 {

    public static void main(String[] args) {

        try {
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./saidadoconsole.txt"));

            Scanner in = new Scanner(System.in);
            System.out.println("Digite o valor da tabuada: ");
            int valor = in.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.println(valor + " x " + i + " = " + (valor * i));
                escrita.append(valor + " x " + i + " = " + (valor * i) + "\n");
            }
            in.close();
            escrita.close();
        } catch (IOException exception) {
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }
    }
}