package exerc_geek_university;

public class Televisao {
    ControleRemoto controle = new ControleRemoto();
    int canal = 1, volume = 1;
    boolean ligada = false;

    void liga_desliga() {
        this.ligada = this.controle.liga_desliga(this.ligada);

        if(this.ligada) {
            System.out.println("A TV foi ligada!");
        }else{
            System.out.println("A TV foi desligada!");
        }
    }

    void diminuir_volume(){
        this.volume = this.controle.diminuir_volume(this.volume);

        System.out.println("O volume atual: "+ this.volume);
    }
    void aumentar_volume(){
        this.volume = this.controle.aumentar_volume(this.volume);
        System.out.println("O volume atual é: " + this.volume);
    }
    void diminuir_canal(){
        this.canal = this.controle.diminuir_canal(this.canal);
        System.out.println("Canal atual " + this.canal);
    }
    void aumentar_canal(){
        this.canal = this.controle.aumentar_canal(this.canal);
        System.out.println("Canal atual " + this.canal);
    }
    void mudar_canal(){
        this.canal = this.controle.mudar_canal(this.canal);
        System.out.println("O canal atual é " + this.canal);
    }
}
