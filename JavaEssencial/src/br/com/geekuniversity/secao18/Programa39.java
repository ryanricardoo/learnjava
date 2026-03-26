package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa39 {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Carlos Marcelo", "Rua dos Faróis - 100", 55);
        Cliente cli2 = new Cliente("Marcio Macedo", "Avenida da Paz - 91", 55);

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 200, 300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1);
        System.out.println(c2);

        if(c1.equals(c2)){
            System.out.println("As contas são iguias.");
        }else {
            System.out.println("As contas são diferentes.");
        }

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);

        System.out.println(((Conta) prateleira.pegar(0)).getSaldo());

        if ((Object)cli1 instanceof Conta){
            System.out.println("O objeto é do tipo Conta");
        }else{
            System.out.println("O objeto não é do tipo Conta");
        }




    }
}
