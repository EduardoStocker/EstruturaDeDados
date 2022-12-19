package com.eduardo.estruturadados.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("A");
        arrayList.add("C");
        
        arrayList.add(1, "B");
        
        System.out.println(arrayList);
        
        int pos = arrayList.indexOf("B");
        if(pos > -1) {
            System.out.println("Elemento existe na pos " + pos);
        } else {
            System.out.println("Elemento não existe");
        }
        
        System.out.println(arrayList.get(1));
        
        arrayList.remove(0);
        arrayList.remove("B");
        
        System.out.println(arrayList);
        
        System.out.println(arrayList.size());
    }

}
