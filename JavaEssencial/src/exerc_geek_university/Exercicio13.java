package exerc_geek_university;

public class Exercicio13 {
    static int maior(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static void main(String[] args) {
        int resultado = maior(21,22);
        System.out.println("O inteiro maior é " + resultado);
    }
}