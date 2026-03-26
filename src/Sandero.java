public class Sandero implements AcoesCarro{
    final int limiteVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        System.out.println("Passando mais uma marcha!!");
        this.velocidadeAtual += 10;
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {

    }

    @Override
    public void parar() {

    }
}
