package br.com.geekuniversity.secao12;

public class Exercicio2 {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Biz", "Branca", 1);

        moto.aumentarMarcha();
        moto.aumentarMarcha();
        moto.aumentarMarcha();
        moto.diminuirMarcha();
        moto.imprimir();
    }
}
