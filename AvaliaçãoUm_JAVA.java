package Prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Avaliação {
    public static void main(String[] args) {
        try {
            BufferedReader leitura = new BufferedReader(new FileReader("./listadesordenada.txt")); //leitura da lista
            int cont = 0;
            String value = "";
            while (true) {
                value = leitura.readLine();
                if (value != null)
                    System.out.println(value);
                else
                    break;
                cont++;
            }
            leitura.close();

            leitura = new BufferedReader(new FileReader("./listadesordenada.txt")); //segunda leitura da lista
            value = "";

            int[] array = new int[cont]; //array com o tamanho das linhas
            cont = 0;
            while (true) {
                value = leitura.readLine();
                if (value == null){
                    break;
                }
                array[cont] = Integer.parseInt(value);
                cont++;
            }   
            leitura.close();

            System.out.println("\nProcesso de Ordenação: ");
            for (int i = 0; i < array.length; i++) {
                int atual = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] >= atual) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = atual;

            System.out.println(Arrays.toString(array)); //imprimindo o processo de ordenação
            }

            ArrayList<Integer> lista = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                lista.add(array[i]);
            }
            BufferedWriter lista2 = new BufferedWriter(new FileWriter("listaordenada.txt"));//exportando a lista ordenada para um arquivo

            System.out.println("\nArray: ");    //imprimindo o array
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                lista2.append("\n" + array[i]);
            }

            System.out.println("\nCollection: ");   //imprimindo a collection ordenada
            for (int collection:lista){
                System.out.println(collection);
            }             
            lista2.close();

        } catch (IOException exception) {
            System.out.println("Erro de exceção I/O: " + exception.getMessage()); //impressão da mensagem de erro se algo estiver errado
        }

    }
}