package exerc_ia.LibrarySystem;

public class Livro {
    private String titulo, autor;
    private int totalPaginas = 0;
    private boolean emprestado = false;

    public Livro(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;

        if (this.totalPaginas < 1){
            this.totalPaginas = 1;
        }else{
            this.totalPaginas = totalPaginas;
            System.out.println("Registro salvo!");
        }
    }

    void emprestar(){
        if (this.emprestado == true){
            System.out.println("O livro ja está emprestado.");
        }else{
            System.out.println("Livro disponível!");
            this.emprestado = true;
        }
    }

    void devolver(){
        System.out.println("Livro disponível.");
        this.emprestado = false;
    }

    String getTitulo(){
        return this.titulo;
    }
    String getAutor(){
        return this.autor;
    }
    Integer getTotalPaginas(){
        return this.totalPaginas;
    }

}
