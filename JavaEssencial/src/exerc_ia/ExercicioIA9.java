package exerc_ia;

import java.util.Scanner;

public class ExercicioIA9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double carrinho[] = new double[10];

        for (int i = 0; i < carrinho.length; i++){
            System.out.print("Digite os valores dos itens: " + (i + 1) + ": "); // o i inicia em 1 e não em 0 por causa do (i + 1)
            carrinho[i] = Double.parseDouble(teclado.nextLine());
        }

        double maiorVenda = carrinho[0];

        for (int i = 0; i < carrinho.length; i++){
            if (carrinho[i] > maiorVenda){
                maiorVenda = carrinho[i];
            }
        }
        System.out.println("O item mais caro custa: " + maiorVenda);

        teclado.close();


    }
}
