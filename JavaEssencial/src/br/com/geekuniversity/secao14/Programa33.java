package br.com.geekuniversity.secao14;

public class Programa33 {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador();

        System.out.println("\nA marca desse ventilador é: " + v1.marca);

        v1.ligar();

        v1.desligar();
    }
}
