package Lista_4;

import java.util.LinkedList;

public class Exercicio4_7 {
    public static void main(String[] args) {
        System.out.println("Eduardo Siqueira\n");
        System.out.println("Crie um programa que simule a fila de um banco.\n");

        int[] senha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        LinkedList<Integer> fila = new LinkedList<Integer>();

        for(int i = 0; i < senha.length; i++) 
            fila.add (new Integer (senha[i]));
        
        System.out.println(fila.removeFirst() + ".");
        while(! fila.isEmpty())    
            System.out.println(fila.removeFirst());
        System.out.println();
    }
}
