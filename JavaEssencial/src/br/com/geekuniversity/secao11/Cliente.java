package br.com.geekuniversity.secao11;

public class Cliente implements Comparable{
    private String nome, endereco;
    private int idade;

    public Cliente(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = 0;

        this.mandar_mensagem();
    }
    private void mandar_mensagem(){
        System.out.println(this.nome + " mandou uma mensagem.");
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = (Cliente)outro;
        if(this.idade < aux.idade) {
            return -1;
        }else if(this.idade > aux.idade){
        return 1;
        }else{
            return 0;
        }

    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
