package exerc_geek_university;

public class Exercicio06 {
    public static void main(String[] args) {
        int n1;
        int n2= 1;
        int n3= 1;

        System.out.println("Contagem usando for: ");
        for(n1 = 1; n1 <= 100; n1++){
                System.out.print(n1 + " - ");
        }

        System.out.println("________________________________________________________________________________________________________________________________________________________");

        System.out.print("Contagem usando while: ");
        while(n2 <= 100){
            System.out.print(n2 +  " - ");
            n2 = n2 + 1;
        }

        System.out.println("________________________________________________________________________________________________________________________________________________________");

        System.out.println("Contagem usando do while:");
        do {
            System.out.print(n3 + " - ");
            n3 = n3 + 1;

        }while(n3 <= 100);
    }
}
