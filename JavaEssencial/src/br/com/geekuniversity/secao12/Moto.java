package br.com.geekuniversity.secao12;

public class Moto {
    private String marca, modelo, cor;
    private int marcha;

    public Moto(String marca, String modelo, String cor, int marcha){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
    }
    
    void aumentarMarcha(){
        if(this.marcha < 5){
            this.marcha++;
            System.out.println("A marcha atual é a: " + this.marcha);
        }else {
            System.out.println("Marcha máxima!");
        }
    }
    void diminuirMarcha(){
        this.marcha = this.marcha - 1;
        System.out.println("Marcha reduzida!");

    }
    public void setMarcha(){
        this.marcha = this.marcha;
    }
    
    public void imprimir(){
        System.out.println("===== INFORMAÇÕES DA MOTO =====");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marcha: " + this.marcha);
    }
}
