package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(45);
        numeros.add(547);
        numeros.add(9779);
        numeros.add(5859);
        numeros.add(914179);

        Collections.sort(numeros);

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }

}
