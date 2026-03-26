package br.com.geekuniversity.secao17;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

import java.util.Scanner;

//GERANDO EXECUTÁVEIS JAR
// JAR - JAVA ARCHIVE
public class Principal {
        static Cliente cliente = new Cliente("Carlos José", "Rua Alfredo, 88", 63);
        static Conta conta = new Conta(1, 200, 300, cliente);
        static Scanner teclado = new Scanner(System.in);


    public static void depositar() {
        System.out.println("======= DEPÓSITO =======");
        System.out.println("Informe um valor a ser depositado: ");
        float valor = teclado.nextFloat();
        if(valor > 0){
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public static void sacar(){
        System.out.println("======= SACAR ========");
        System.out.println("Informe um valor a ser sacado: ");
        float valor = teclado.nextFloat();
        if (valor > 0){
            conta.sacar(valor);
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public static void consultar(){
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }

    public static void main(String[] args) {
        int opcao;
        System.out.println("Bem vindo ao banco!");

        do{
            System.out.println("\nSelecione uma opção: ");
            System.out.println(" 1 - Depositar");
            System.out.println(" 2 - Sacar");
            System.out.println(" 3 - Consultar Saldo");
            System.out.println(" 0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }while (opcao > 0);
        teclado.close();
    }
}
