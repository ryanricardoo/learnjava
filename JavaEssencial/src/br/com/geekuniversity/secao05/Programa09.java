package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;
        String nome;

        // variável de controle; condição de parada; forma de incremento;
        // i iniciado em 0; enquanto i for menor que 5 vai haver loop; forma de incremento;
        // i++ -> i = i + 1, ou seja como o i inicia sendo i = 0, vai sendo incrementado um dentro;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos de idade.");
            }
        }
            teclado.close();
        }
    }
