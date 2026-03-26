package exerc_geek_university;

import java.util.Scanner;

class Exercicio02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1;
        int quadrado;
        System.out.print("Digite um número: ");
        n1 = Integer.parseInt(teclado.nextLine());
        quadrado = n1 * n1;
        System.out.print("O quadrado de " + n1 + " é " + quadrado);

        teclado.close();
    }
}

