package br.com.geekuniversity.secao13;

public class TreinamentoInicioTemporada extends Treinamento{

    @Override
    public void preparoFisico(){
        System.out.println("Preparo Físico de inicio de temporada");
    }
    @Override
    public void jogoTreino(){
        System.out.println("Jogo Treino de inicio de temporada");
    }
}
