package exerc_ia.FaturSystem;

public class AtendimentoSUS extends Atendimento {

    public AtendimentoSUS(int id, double valorbase){
        super(id, valorbase);
    }

    @Override
    public double calcularValorFinal() {
        return this.valorbase;
    }
}
