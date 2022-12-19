package com.eduardo.estruturadados.teste;

import com.eduardo.estruturadados.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato2", "4321-4567", "contato2@email.com");
        Contato c3 = new Contato("Contato3", "2345-6789", "contato3@email.com");

        Contato c4 = new Contato("Contato1", "1234-4567", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe");
        } else {
            System.out.println("Elemento não existe");
        }

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }

}
