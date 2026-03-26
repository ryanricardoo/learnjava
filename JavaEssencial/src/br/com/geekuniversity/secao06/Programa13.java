package br.com.geekuniversity.secao06;

// Tipos de Dados Alfanuméricos
// Caracteres e Strings
public class Programa13 {
    public static void main(String[] args) {
        //Tipos primitivos
        char letra = 'a';//sempre aspas simples, aspas duplas é sempre String
        char letra1 = 97; // 97 em decimal == a

        System.out.println("Letra1 "+ letra1);

        letra1 = (char) (letra1 + 1); // cast

        //Tipos não primitivos
        Character letra2 = 'A';
        String nome = "Teste";


        System.out.println("Letra "+ letra);
        System.out.println("Letra1 "+ letra1);
        System.out.println("Letra2 "+ letra2);
        System.out.println("String "+ nome);

        System.out.println("char size: " + Character.SIZE);
        System.out.println("char valor Min: " + Character.MIN_VALUE);
        System.out.println("char valor Max: " + Character.MAX_VALUE);

        System.out.println("Tamanho da String: " + nome.length()); // Tamanho da String
        System.out.println("Tamanho da String: " + (Character.SIZE * nome.length()) + " bits"); //


    }
}
