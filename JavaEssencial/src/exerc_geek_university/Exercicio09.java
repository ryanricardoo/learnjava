package exerc_geek_university;

public class Exercicio09 {
    public static void main(String[] args) {
        int matriz[][] = { {1,55,1,14}, {4,55,1,22}, {8,4,16,4}, {9,19,41,47}};
        int maior = 0;


        for (int l = 0; l < matriz.length; l++){          //posição de linha
            for(int c = 0; c < matriz.length; c++){      // posição da coluna
                if(matriz[l][c] > 10){                  //pergunta a linha e a coluna se há mais de 10 anos
                    maior = maior + 1;
                }
            }

        }

        System.out.println("A matriz possui " + maior + " valores maiores que 10!");
    }
}
