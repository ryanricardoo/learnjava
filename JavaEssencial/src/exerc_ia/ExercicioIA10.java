package exerc_ia;

public class ExercicioIA10 {
    public static void main(String[] args) {
        String nome[] = {"Paulo", "Thiago", "Lucas", "João"};

        System.out.println("Ordem original");
        for (int i = 0; i < nome.length; i++){
            System.out.println( nome[i]);
        }


        System.out.println("\n\nOrdem Invertida");
       for (int i = nome.length - 1; i >= 0; i--){
           System.out.println(nome[i]);
       }
    }
}
