package exerc_ia;

import java.util.Scanner;

public class ExercicioIA4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int depositar = 1;
        int dacar = 2;
        int sair = 3;
        int opcoes;


        do{
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Sair");
            System.out.print("Escolha uma das opções: ");
            opcoes = Integer.parseInt(teclado.nextLine());

            if(opcoes == 1 || opcoes == 2){
                System.out.println("Operação realizada com sucesso!");
            }else if(opcoes == 3){
                System.out.println("Fim!");
            }else{
                System.out.println("Opção Inválida");
            }
        }while(opcoes != 3);

        teclado.close();
    }
}
