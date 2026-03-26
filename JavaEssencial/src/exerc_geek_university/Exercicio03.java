package exerc_geek_university;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;
        String resultado;


        System.out.print("Digite o primeiro número: ");
        n1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo número: ");
        n2 = Integer.parseInt(teclado.nextLine());

        resultado = (n1 > n2) ? n1 + " é maior que " + n2 +"!" : n2 + " é maior que "  + n1 +"!";
        System.out.println(resultado);

        teclado.close();
    }
}
