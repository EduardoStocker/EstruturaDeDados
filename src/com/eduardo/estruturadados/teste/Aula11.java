package com.eduardo.estruturadados.teste;

import com.eduardo.estruturadados.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(1);
        
        vetor.adiciona("String");
        vetor.adiciona("String2");
        vetor.adiciona("String3");
        vetor.adiciona("String4");
        
        System.out.println(vetor);
        
    }
}