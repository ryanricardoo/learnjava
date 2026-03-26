package br.com.geekuniversity.secao05;// For each = Para cada // Não há condição de parada, itera por cada elemento

public class Programa10 {
    public static void main(String[] args) {
        String nome = "Geek University";

        //Para cada um dos caracteres da String, imprima o caractere
        for(char letra : nome.toCharArray()){
                System.out.print(letra);
        }
    }
}
