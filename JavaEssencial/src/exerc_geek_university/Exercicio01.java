package exerc_geek_university;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in); //Permite receber dados via teclado
         int numero;

         System.out.print("Digite um valor: ");
         numero = Integer.parseInt(teclado.nextLine());
         System.out.println("Seu número é: " + numero);

         teclado.close();

    }
}

//System.out.print("Digite um número: ");
//numero = Integer.parseInt(teclado.nextLine());
//System.out.println("Seu número escolhido é: " + numero);
//teclado.close();