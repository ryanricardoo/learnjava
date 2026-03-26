package br.com.geekuniversity.secao18;

import java.util.Locale;

public class Programa41 {
    public static void main(String[] args) {
        String frase = "No curso da geek university estou aprendendo python";
        System.out.println(frase);

        frase = frase.replace("o", "a");
        frase = frase.toUpperCase(Locale.ROOT);
        System.out.println(frase);

        frase = frase.toLowerCase(Locale.ROOT);
        System.out.println(frase);

        System.out.println(frase.charAt(1));



    }
}
