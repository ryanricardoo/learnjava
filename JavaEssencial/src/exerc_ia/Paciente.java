package exerc_ia;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;

    public Paciente(String nome, String cpf, String telefone) {
        if (nome.length() <= 3) {
            System.out.println("Digite um nome válido: ");
        } else {
            this.nome = nome;
        }

        if (cpf.length() != 11) {
            this.cpf = "CPF INVÁLIDO";
        } else {
            this.cpf = cpf;
        }

        this.telefone = telefone;

        System.out.println("Processo de criação finalizado.");
    }


    public void exibirficha() {
        System.out.println("\n--- FICHA DO PACIENTE ---");
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("TEL: " + this.telefone);
    }

}