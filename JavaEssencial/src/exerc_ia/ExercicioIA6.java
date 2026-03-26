package exerc_ia;

public class ExercicioIA6 {
    public static void main(String[] args) {
        int numeros[] = {12, 45, 7, 91, 23, 50, 6, 82, 3, 29};
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println(maior);
    }
}
