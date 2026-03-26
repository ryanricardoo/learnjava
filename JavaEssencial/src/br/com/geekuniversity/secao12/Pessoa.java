package br.com.geekuniversity.secao12;

public class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;


    public Pessoa(String nome, int ano_nascimento, String email){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }
    public String getNome(){  // é fiel e serve para retornar o que foi armazenado na variável
        return this.nome;
    }

    public void setNome(String nome){ // Faz alteração na variável por isso é sempre void
        this.nome = nome;
    }

    public int getAno_nascimento(){ //retornar o que foi armazenado na variável
        return this.ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento){
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
