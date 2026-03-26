package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        Scanner teclado = new Scanner(System.in);
        boolean res;

        nomes.add("maria");
        nomes.add("Carla");
        nomes.add("Josefa");
        nomes.add("Diego");
        nomes.add("Maria");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Informe o " + (i+1) + "/5 nomes.");
            String nome = teclado.nextLine();
            res = nomes.add(nome);
            if (!res){
                System.out.println("O nome não pode ser repetido");
                i--;
            }
        }

        System.out.println("No conjunto temos: " + nomes.size() + "elementos.");

        for(String nome: nomes){
            System.out.println(nome);
        }

        teclado.close();


        //System.out.println(nomes.size());

//        Collections.sort(nomes);

//        System.out.println(nomes.contains("maria"));

    }
}
