package com.eduardo.estruturadados.teste;

import com.eduardo.estruturadados.Vetor;

public class Aula09 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        
        int pos = vetor.busca("B");
        if(pos >-1) {
            vetor.remove(pos);
        }else {
            System.out.println("Elemento não exsite no vetor");
        }
        System.out.println(vetor);
    }

}
