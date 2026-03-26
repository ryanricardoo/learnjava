package br.com.geekuniversity.secao11;

public class Programa25 {

    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao da Silva", "Rua da Paz, 45", 29);
        Cliente maria = new Cliente("Maria das Dores", "Rua B, 100", 55);

        Conta conta_joao = new Conta(1, 100.0f, 1000.0f, joao);
        Conta conta_maria = new Conta(2, 500.0f, 2000.0f, maria);

        System.out.println("Saldo do João(ANTES DO SAQUE): " + conta_joao.getSaldo());
        System.out.println("Saldo de Maria(ANTES DO SAQUE): " + conta_maria.getSaldo());

        conta_joao.sacar(500.0f);
        System.out.println("Saldo do joão(APÓS O SAQUE): " + conta_joao.getSaldo());
        conta_joao.limite = 10000.00f;
        System.out.println("O novo limite de João é: " + conta_joao.getSaldo());
    }



}
