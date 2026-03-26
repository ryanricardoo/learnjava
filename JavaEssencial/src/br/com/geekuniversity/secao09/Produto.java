package br.com.geekuniversity.secao09;

public class Produto {  //Classe
    String nome;  //Atributo
    float preco;   //Atributo
    float desconto;   //Atributo


    // Método para aumentar o preco do produto em 10
    void aumentar_preco(){
        this.preco = this.preco + 10;
    }

}
