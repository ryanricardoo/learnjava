package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programa50 {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(31, "Ana Araujo");
        pessoas.put(56, "Marcelo Felipe");
        pessoas.put(28, "Diego Simeone");
        pessoas.put(28, "Diego Simeone");

        //Coleçao de chaves
        System.out.println("Chaves: " + pessoas.keySet());

        //Coleçao de valores
        System.out.println("Valores: " + pessoas.values());

        //Coleçao de associação
        System.out.println("Associações: " + pessoas.entrySet());

        System.out.println();

        //Formas de Iterar sobre a coleção de chaves
        //Forma 1
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        System.out.println();

        //Forma 2
        Set<Integer> chaves = pessoas.keySet();
        for(Integer idade: chaves){
            System.out.println(pessoas.get(idade));
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });



    }
}
