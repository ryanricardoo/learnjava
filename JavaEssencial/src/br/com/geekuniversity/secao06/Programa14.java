package br.com.geekuniversity.secao06;// Tipos Booleanos

public class Programa14 {
    public static void main(String[] args) {
        //Tipos Primitivos
        boolean verdadeiro = true;
        boolean falso = false;
        boolean ativo = true;

        //Tipos não primitivos
        Boolean V = true;
        Boolean F = false;

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("V : " + V);
        System.out.println("F : " + F);

        if (verdadeiro == false) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if(ativo){
            System.out.println("Pode acessar o sistem!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
