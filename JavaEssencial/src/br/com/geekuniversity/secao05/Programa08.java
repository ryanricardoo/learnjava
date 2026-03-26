package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade = 5;
        String nome;


        do {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            if(idade > 0) {
                System.out.println(nome + " tem " + idade + " anos de idade.");
            }

        } while(idade > 0);
        teclado.close();

    }
}

