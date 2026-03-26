package exerc_ia;

import java.util.Scanner;

public class ExercicioIA {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);

            double peso, precoConta, ValorDesconto, ValorFinal;
            double valorKG = 4.33;
            double taxaDesconto = 0.1;

            System.out.print("Quer quantos KGs de ração? ");
            peso = Double.parseDouble(teclado.nextLine());


            precoConta = (peso * valorKG);

            System.out.println("O valor da sua conta é: " + precoConta);
            ValorDesconto = precoConta * taxaDesconto;
            System.out.println("O valor de desconto é: " + ValorDesconto);
            ValorFinal = precoConta - ValorDesconto;
            System.out.println("O valor final da sua conta é: " + ValorFinal);


            teclado.close();

        }
}
