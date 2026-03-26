package br.com.geekuniversity.secao09;

public class Programa22 {
    public static void main(String[] args) {
        int numero = 4;

        Produto p0; // Objeto declarado

        Produto p1 = new Produto();  // Objeto declarado e inicializado; p1 é chamado de objeto ou instância do objeto

        p1.nome = "Notebook";
        p1.preco = 2.356f;
        p1.desconto = 15.0f;

        System.out.println("==================  Produtos  ==================");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto+ "%");


        p0 = new Produto();
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5.0f;
        System.out.println();

        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto+ "%");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Carlos";
        pessoa1.email = "carlos123@gmail.com";
        pessoa1.ano_nascimento = 1994;


        System.out.println("==================  Pessoas  ==================");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

    }
}
