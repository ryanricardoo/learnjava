package br.com.geekuniversity.secao12;

public class Quadrado {
    private int lado, area, perimetro;

    void calcularArea(){
        this.area = this.lado * this.lado;
    }
    void calcularPerimetro(){
        this.perimetro = this.lado * 4;
    }

    public Quadrado(int lado, int area, int perimetro){
        this.lado = lado;
        this.calcularArea();
        this.calcularPerimetro();
    }

    void imprimir(){
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perimetro: " + this.perimetro);
    }
}
