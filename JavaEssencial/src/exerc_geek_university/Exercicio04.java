package exerc_geek_university;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());
        if(numero % 2 == 0){
           System.out.print("O número " + numero + " é par");
        }else{
            System.out.print("O número " + numero + " é impar");
        }
    }
}
