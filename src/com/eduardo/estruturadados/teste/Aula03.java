package com.eduardo.estruturadados.teste;

import com.eduardo.estruturadados.Vetor;

public class Aula03 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        
        System.out.println(vetor.tamanho());
    }
}