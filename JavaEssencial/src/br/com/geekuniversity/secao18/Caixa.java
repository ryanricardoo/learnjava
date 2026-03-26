package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Conta;
public class Caixa {
    private Conta[] contas;
    private int posiaoLivre;

    public Caixa(){
        contas = new Conta[100];
        posiaoLivre = 0;
    }
    public void adicionar(Conta nova){
        this.contas[this.posiaoLivre] = nova;
        this.posiaoLivre++;
    }

    public Conta pegar(int posicao){
        return this.contas[posicao];
    }
}
