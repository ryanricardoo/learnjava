package exerc_ia.FaturSystem;

public abstract class Atendimento {
    private int id;
    protected double valorbase;

    public Atendimento(int id, double valor){
        this.id = id;
        this.valorbase = valor;
    }

    public abstract double calcularValorFinal();

    public final void protocolo(){
        System.out.println("PROTOCOLO-HOSP-2026" + this.id);
    }
}
