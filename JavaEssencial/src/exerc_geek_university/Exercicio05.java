package exerc_geek_university;

public class Exercicio05 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; contador < 5; i++ ){
            if(i % 3 == 0){
                System.out.println("O número " + i + " é múltiplo de três");
                contador += 1;
            }
        }
    }
}
