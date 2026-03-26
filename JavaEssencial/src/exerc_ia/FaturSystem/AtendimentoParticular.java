package exerc_ia.FaturSystem;

public class AtendimentoParticular extends Atendimento {

    public AtendimentoParticular(int id, double valorbase){
        super(id, valorbase);
    }

    @Override
    public double calcularValorFinal() {
        return this.valorbase * 1.15;
    }
}
