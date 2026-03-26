package exerc_ia.LibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("===== FICHA TÉCNICA ======");

        String titulo = "";
        while(titulo.isEmpty()){
            System.out.print("Digite o título do livro: ");
            titulo = leitor.nextLine();

        }

        System.out.print("Digite o nome do Autor do livro: ");
        String autor = leitor.nextLine();

        int totalPaginas = 0;
        while(totalPaginas < 1){
            System.out.print("Digite o total de páginas do livro: ");
            totalPaginas = Integer.parseInt(leitor.nextLine());
        }

        Livro meuLivro = new Livro(titulo, autor, totalPaginas);

        System.out.println();

        System.out.println("======= INFORMAÇÕES DO LIVRO ==========");

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + totalPaginas);

        System.out.println("==================================");


    }
}
