package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//leitura de arquivo
public class Programa43 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(new FileInputStream("entrada.txt")); //conecta-se c o arquivo do disco

            while(ler.hasNextLine()){ //enquanto tiver próxima linha
                String linha = ler.nextLine(); // próxima linha
                System.out.println(linha);
            }
            ler.close();
        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }

    }
}
