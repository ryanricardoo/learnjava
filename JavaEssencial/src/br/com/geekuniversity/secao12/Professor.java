package br.com.geekuniversity.secao12;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int ano_nascimento, String matricula){
        super(nome, ano_nascimento, matricula);
        this.matricula = matricula;
    }
    public String getMatricula(){
            return this.matricula;
        }
    void setMatricula(){
            this.matricula = matricula;
        }
    public String toString(){
        return super.toString() + "\nMatrícula: " + this.getMatricula();
    }
    public String getNome(){
        return "Professor; \n" + super.getNome();
    }
}
