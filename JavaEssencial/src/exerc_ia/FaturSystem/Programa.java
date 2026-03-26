package exerc_ia.FaturSystem;

public class Programa{
    public static void main(String[] args) {
        Atendimento sus = new AtendimentoSUS(34, 456.89);
        Atendimento particular = new AtendimentoSUS(458, 600.5);


        sus.protocolo();
        System.out.println("Valor SUS: " + sus.calcularValorFinal());

        particular.protocolo();
        System.out.println("Valor particular: " + particular.calcularValorFinal());


    }
}
