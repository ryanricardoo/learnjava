package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade = 5;
        String nome;


        while (idade > 0) {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos de idade.");
        }
            teclado.close();

        }
    }

