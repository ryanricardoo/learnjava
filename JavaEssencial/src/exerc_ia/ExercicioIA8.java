package exerc_ia;

public class ExercicioIA8 {
    public static void main(String[] args) {
        double total = 0;
        double carrinho[] = {19.30, 18.50, 33.48, 2.11, 0.89};

        for (int i = 0; i < carrinho.length; i++){
            total += carrinho[i];

        }
        System.out.println("O valor da conta é: " + total);

    }
}
