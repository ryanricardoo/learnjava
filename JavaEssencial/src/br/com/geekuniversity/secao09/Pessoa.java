package br.com.geekuniversity.secao09;

public class Pessoa {
    String nome, email;  //Atributo
    int ano_nascimento;  //Atributo


    public Pessoa(){

    }
    public Pessoa(String nome, String email, int ano_nascimento){
        //this significa este objeto
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano de Nascimento" + this.ano_nascimento);
    }
}
