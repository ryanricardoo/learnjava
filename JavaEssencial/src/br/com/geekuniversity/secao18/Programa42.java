package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream("arquivo.txt");

            for (int i = 0; i <= 5; i++){
                System.out.println("Digite a informação: ");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }
            System.out.println("Arquivo concluído!");
            escrever.close();

        }catch (FileNotFoundException e){
            System.out.println("Não foi possível criar o arquivo");
        }



        teclado.close();

    }
}
