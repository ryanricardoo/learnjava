package br.com.geekuniversity.secao07;//Vetores parte 2

public class Programa17 {
    public static void main(String[] args) {
        int numeros[] = new int[10];


        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3;
        }

        // O array/vetor como definido na variável vai de 0..9
//        numeros[10] = 42;
//        System.out.println(numeros[10]);  -> isso vetor/array não aceita pois vai de 0...9

        // Não é possível aumentar ou diminuir o tamanho dos arrays, são fixos

        System.out.println(numeros[0]);
        System.out.println(numeros[3]);

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[3]);
    }
}
