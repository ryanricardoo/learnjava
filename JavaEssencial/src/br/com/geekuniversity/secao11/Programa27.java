package br.com.geekuniversity.secao11;
//Private
public class Programa27 {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Carlos João", "Rua A - 100", 44);

        System.out.println("Nome: " + cl1.getNome());
        System.out.println("Endereço: " + cl1.getEndereco());

        Cliente cl2 = new Cliente("Thiago Victor", "Rua Jardim Azul - 33", 44);

        System.out.println("Nome: " + cl2.getNome());
        System.out.println("Nome: " + cl2.getEndereco());

    }
}
