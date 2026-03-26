package br.com.geekuniversity.secao19;

import br.com.geekuniversity.secao11.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class Programa47 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes =  new ArrayList<Cliente>();

        Cliente cli1 = new Cliente("Carlos Sainz", "Rua Loreto - 8", 13);
        Cliente cli2 = new Cliente("Charles Leclerc", "Rua Interlagos - 639", 55);
        Cliente cli3 = new Cliente("Maria da Silva", "Rua Angelina - 457", 23);

        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);

        Collections.sort(clientes);

        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
}
