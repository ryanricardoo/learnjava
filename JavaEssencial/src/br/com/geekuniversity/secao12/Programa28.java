package br.com.geekuniversity.secao12;

public class Programa28 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro da Silva", 1987, "pedro@gmail.com");

        System.out.println("======== PESSOA ==========");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Ano de Nascimento: " + p1.getAno_nascimento());
        System.out.println("Email: " + p1.getEmail());

        Aluno aluno1 = new Aluno("José Vinicius", 1995, "20254587851256");

        System.out.println();
        System.out.println("========== ALUNO ===========");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Ano de Nascimento: " + aluno1.getAno_nascimento());
        System.out.println("R.a. do aluno: " + aluno1.getRa());

        Professor pf1 = new Professor("João Luiz", 1979, "BRT4567");

        System.out.println();
        System.out.println("====== PROFESSOR ========");
        System.out.println("Nome: " + pf1.getNome());
        System.out.println("Ano de nascimento: " + pf1.getAno_nascimento());
        System.out.println("Matrícula: " + pf1.getMatricula());
    }
}
