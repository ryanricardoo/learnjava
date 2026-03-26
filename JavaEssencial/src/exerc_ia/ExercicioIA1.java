package exerc_ia;

public class ExercicioIA1 {
    public static void main(String[] args) {

        int idade = 44;
        String status;
        // O que fica do lado esquerdo dos dois pontos é o true e o que fica na direito é o false.
        status = (idade >= 18) ? "Entrada autorizada, " + idade + " anos, maior de idade!" : "Entrada proibida, " + idade + " anos, menor de idade!";
        System.out.println(status);
    }
}

