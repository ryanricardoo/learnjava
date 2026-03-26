package br.com.geekuniversity.secao12;

public class Aluno extends Pessoa{
    private String ra;


    public Aluno(String nome, int ano_nascimento, String ra){
        super(nome, ano_nascimento, ra);
        this.ra = ra;
    }

    public String getRa(){
        return this.ra = ra;
    }
    public  void setRa(String ra){
        this.ra = ra;
    }

    public String toString(){
        return super.toString() + "\nAluno: " + this.getRa();
    }

    public String getNome(){
        return "Aluno: \n" + super.getNome();
    }
}
