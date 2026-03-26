package exerc_geek_university;

public class Exercicio10 {
    public static void main(String[] args) {
        int matriz[][] = {{1,55,74,14}, {4,55,85,22}, {8,4,16,4}, {999,19,41,47}, {100,36,65,58}};
        int valor = 999;
        boolean encontrei = false;

        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++) {
                if (matriz[l][c] == 999) {
                    System.out.println("A posição de " + valor + " na matriz é: " + "[" + l + "][" + c + "]");
                    encontrei = true;
                }
            }
        }
        if (encontrei == false) {
            System.out.println("O valor " + valor + " não foi encontrado na matriz.");
        }
    }
}


