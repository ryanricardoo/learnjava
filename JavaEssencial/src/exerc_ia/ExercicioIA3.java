package exerc_ia;

import java.util.Scanner;

public class ExercicioIA3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número à ser calculado: ");
        numero = Integer.parseInt(teclado.nextLine());
        for(int i = 0; i <= 10; i++){
            int calcular = numero * i;
            System.out.println(numero + " x " + i + " = " + calcular);

        }
    }
}
