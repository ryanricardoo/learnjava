package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
        System.out.print("Digite o primeiro número a ser calculado na divisão: ");
        int n1 = teclado.nextInt();

        System.out.print("Digite o se segundo a ser calculado na divisão: ");
        int n2 = teclado.nextInt();

        int res = n1 / n2;
        System.out.println("O valor da divisão de " + n1 + " por " + n2 + " é " + res + ".");

        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro inesperado.");
        }finally {
            System.out.println("Continua o processo");
        }
        teclado.close();
    }

}
