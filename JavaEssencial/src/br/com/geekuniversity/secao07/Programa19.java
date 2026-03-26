package br.com.geekuniversity.secao07;

public class Programa19 {
    public static void main(String[] args) {

        int numeros[][] = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 14;
        numeros[1][0] = 5;
        numeros[1][1] = 7;
        numeros[1][2] = 11;
        numeros[2][0] = 56;
        numeros[2][1] = 32;
        numeros[2][2] = 18;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++) {
                System.out.println("numeros[" + i +  "][" + j + "] = " + numeros[i][j]);
            }
        }

    }
}
