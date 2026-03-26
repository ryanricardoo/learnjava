package br.com.geekuniversity.secao04;

public class Programa06 {
    public static void main(String[] args) {
        int numero = 1;

        switch (numero){
            case 1:
                System.out.println("O número é 1");
                break;
            case 4:// o número representa o valor relacionado a condição e não número do caso
                System.out.println("O número é 4");
                break;
            case 8:
                System.out.println("O número é 8");
                break;
            default:
                System.out.println("O número é " + numero);
                break;
        }
    }
}
