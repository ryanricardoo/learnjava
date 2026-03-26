package exerc_geek_university;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor a ser calculado: ");
        int entrada = Integer.parseInt(teclado.nextLine());
        int resultado = calcular(entrada);

        System.out.print("O dobro de " + entrada + " é "+ resultado);

    }
    static int calcular(int numero){
        return numero * 2;
    }
}
