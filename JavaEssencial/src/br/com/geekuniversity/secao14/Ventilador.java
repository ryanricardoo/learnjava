package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico{

    private boolean ligado = false;


    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Ventilador sendo ligado!");
        }else{
            System.out.println("O ventilador ja está ligado!");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("O ventilador foi desligado!");
        }

    }
}
