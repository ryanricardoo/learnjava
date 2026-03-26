package exerc_geek_university;

public class Exercicio08 {
    public static void main(String[] args) {
        int A[] = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];
        A[4] = 66;

        System.out.println("O valor da soma pedida é: " + soma);

        for(int i = 0; i < A.length; i++){
            System.out.println("A[" + i + "] = " + A[i]);
        }


    }
}
