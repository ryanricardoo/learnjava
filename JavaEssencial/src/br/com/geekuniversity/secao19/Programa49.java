package br.com.geekuniversity.secao19;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.HashMap;
import java.util.Map;

public class Programa49 {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cli1 = new Cliente("Carlos Daniel", "Rua da Felicidade - 100", 48);
        Cliente cli2 = new Cliente("Domingos de Jesus", "Rua Carvão Azul - 214", 32);

        Conta c1 = new Conta(1, 250, 500, cli1);
        Conta c2 = new Conta(2, 400, 1000, cli2);

        contas.put("Pessoa Física", c1);
        contas.put("Pessoa Jurídica", c2);

//      System.out.println(contas.size());
        System.out.println(contas.get("Pessoa Física"));

    }
}
