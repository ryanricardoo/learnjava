package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {

    static void escrever() {
        String msg;
        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream ler = new PrintStream(new FileOutputStream("arquivo2.txt", true));

            do {
                System.out.println("Digite uma entrada ou 0 para sair: ");
                msg = teclado.nextLine();

                if (!msg.contains("0")) {
                    ler.println(msg);
                }
            } while (!msg.contains("0"));
            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não criado/encontrado!");
        }


        teclado.close();
    }

    static void ler(){

        try{
            Scanner ler = new Scanner(new FileInputStream("arquivo2.txt"));

            while(ler.hasNextLine()){
                String linha = ler.nextLine();
                System.out.println(linha);
            }
            ler.close();
        }catch (FileNotFoundException e){
            System.out.println("Escrita não realizada!");
        }
    }

    public static void main(String[] args) {
        escrever();


        System.out.println("====== Registros do arquivo ======");
        ler();
    }
}