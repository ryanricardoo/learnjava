package br.com.geekuniversity.secao06;

public class Programa15 {
    public static void main(String[] args) {
        int n1 = 12, n2 = 6, n3 = 34, res, n4 = 8, n5 = 5;
        float res2;

        // Soma
        res = n1 + n2 + n3;
        System.out.println("O resultado da soma é: " + res);

        // Subtracao
        res = n1 - n3;
        System.out.println("O resultado da subtração é: " + res);

        // Divisao Inteiro
        res = n4 / n5;
        System.out.println("O resultado da divisão é: " + res);

        // Divisao Real
        res2 = (float) n4 / n5;
        System.out.println("O resultado da multiplicação é: " + res2);


        // Módulo -> Se o resto do módulo da variável por 2 for 0, significa que o valor da variável é par. Mas se o resto for
        // 1 significa que é ímpar
        res = n1 % 2;
        System.out.println("O resto da divisão de " + n1 + " por 2 é: " + res);

    }
}
