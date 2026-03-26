package exerc_geek_university;

public class Exercicio14 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato();
        contato1.setNome("Marcio Luiz");
        contato1.setEmail("marcio@gmail.com");
        contato1.setTelefone("5555-99999");

        Contato contato2 = new Contato();
        contato2.setNome("Kaio Vinicius");
        contato2.setEmail("kaio@gmail.com");
        contato2.setTelefone("5512-97849");

        Contato contato3 = new Contato();
        contato3.setNome("Thiago José");
        contato3.setEmail("marcio@gmail.com");
        contato3.setTelefone("41526-91653");

        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);

        agenda.imprimeAgenda();
        agenda.imprimeContato(1);
        System.out.println(agenda.buscaContato("Thiago José"));
        agenda.removeContato(contato3);
        agenda.imprimeAgenda();
    }
}
