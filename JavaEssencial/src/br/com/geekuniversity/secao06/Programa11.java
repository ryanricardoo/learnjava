package br.com.geekuniversity.secao06;//Tipos de dados
//Numéricos(Inteiros e Reais)

public class Programa11 {
    public static void main(String[] args) {
        //Tipos primários, são comuns//Primitivos
        int n1 = 999; // Inteiro  999999999999
        short n2 = 4; //Inteiro -> Curto, menor ou baixo
        byte n3 = 6;
        char n7 = 34;

        //Tipos não primários são classes que representam esses tipos primários // Não primitivos
        // Todos os não primitivos são extremamente úteis para listas, bancos de dados quando o NULL é necessário
        Integer n4 = 98;
        Short n5 = 7;
        Byte n6 = 9;
        //Character = 445;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n4 = " + n5);
        System.out.println("n4 = " + n6);
        System.out.println("n7 = " + n7);



        System.out.println("int/integer " + Integer.SIZE + "bits");  //Verifica o tamanho
        System.out.println("short/Short " + Short.SIZE + "bits");
        System.out.println("byte/Byte " + Byte.SIZE + "bits");

        System.out.println("Valor Min int/Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer: " + Integer.MAX_VALUE);

        System.out.println("Valor Min short/Short: " + Short.MIN_VALUE);
        System.out.println("Valor Max short/Short: " + Short.MAX_VALUE);

        System.out.println("Valor Max byte/Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor Max byte/Byte: " + Byte.MAX_VALUE);
    }
}
