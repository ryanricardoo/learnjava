import java.util.ArrayList;


public class Main{
    public static void main (String[] args) {
        String str = "Olá";

        String[] nomesArr = new String[10];
        nomesArr[0] = "Fernanda";

        ArrayList<String> nomes = new ArrayList<>(); //pode crescer durante o uso
        nomes.add("Fernanda");
        nomes.add("Marcos");
        nomes.add("Ryan");

        int[] colecaoInteiros = {1, 2, 3, 4, 5};
        colecaoInteiros[0] = 4;
        colecaoInteiros[1] = 7;
        System.out.println("Primeiro item do Array: " + colecaoInteiros[0]);
        System.out.println("Segundo item do Array: " + colecaoInteiros[1]);
        System.out.println("Array: " + colecaoInteiros);


        for(int i = 0; i < nomes.size(); i++){
                System.out.println(nomes);        }

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;
        System.out.println("Meu Double é: " + meuDouble);



        if (str.isBlank()) {
            System.out.println("Está vazio");
        } else if (str.equals("Olá")) { // Use .equals() para comparar Strings
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}

