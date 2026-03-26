package br.com.geekuniversity.secao04;// if, else, if else
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] agrs) {
        Scanner teclado = new Scanner(System.in);

        //Declarando e inicializando a variável
        int numero;

        System.out.print("Digite um número: ");
        numero = Integer.parseInt(teclado.nextLine());

       if(numero > 5 && numero % 2 == 0) {
           System.out.println("Sim, o número " + numero + " é maior que 5 e é par!");
       }else if (numero > 5 && numero % 2 != 0){
           System.out.println("O número "+ numero + " é maior que 5 e é impar!");
       }else if(numero == 5){
           System.out.println("Os números são iguais!");
       }else if(numero < 5 && numero % 2 !=0){
           System.out.println("O número "+ numero + " é menor que 5 e é impar!");
       }else{
           System.out.println("Não, o número " + numero + " é menor que 5 e é par!");

       }
       }
    }