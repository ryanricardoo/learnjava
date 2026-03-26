package exerc_ia;

import java.util.Scanner;

public class ExercicioIA11 {
    static double converterValor(double reais, double cotacao){
       return reais / cotacao;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double reais, cotacao, resultado;

        System.out.print("Digite o valor em reais: ");
        reais = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite o valor da cotação atual: ");
        cotacao = Double.parseDouble(teclado.nextLine());

        resultado = converterValor(reais, cotacao);
        System.out.printf("O valor convertido é: %.2f%n ", resultado);

    }
}
