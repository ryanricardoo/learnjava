package br.com.geekuniversity.secao08;//Faça um programa que receba diversar furtas, diversos nomes de frutas
//e imprima essas frutas em ordem contrária. O programa deve solicitar ao usuário quantas frutas ele quer


import java.util.Scanner;

public class Programa20 {
    static Scanner teclado = new Scanner(System.in);
    static String fruta[];
    static int qtd;

    public static void main(String[] args) {
        System.out.print("Informe a quantidade de frutas que deseja cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());

        cadastrar_dados(qtd);
        mostrar_dados(qtd);

        teclado.close();

        }
        static void cadastrar_dados(int quantidade){
            fruta = new String[quantidade];//DEFININDO O TAMANHO DO VETOR A PARTIR DA QUANTIDADE

            for (int i = 0; i < quantidade; i++){
                System.out.print("Informe a fruta " + (i + 1) + " : ");
                fruta[i] = teclado.nextLine();
            }

    }
    static void mostrar_dados(int quantidade){
        for (int i = (quantidade - 1); i >= 0; i-- ){
            System.out.println(fruta[i]);
        }
    }

}
