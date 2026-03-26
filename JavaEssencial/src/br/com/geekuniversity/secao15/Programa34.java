package br.com.geekuniversity.secao15;

public class Programa34 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Carlos Manoel");
        Conta c2 = new Conta("Pietro Mathias");
        Conta c3 = new Conta("Mauricio Lemos");

        System.out.println("Número da conta: " + c1.getNumero());
        System.out.println("Nome do cliente: " + c1.getCliente());

        System.out.println("Número da conta: " + c2.getNumero());
        System.out.println("Número do Cliente: " + c2.getCliente());

        System.out.println("Número da conta: " + c3.getNumero());
        System.out.println("Número do Cliente: " + c3.getCliente());
    }
}
