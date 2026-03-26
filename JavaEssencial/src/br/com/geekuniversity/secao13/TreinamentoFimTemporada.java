package br.com.geekuniversity.secao13;

public class TreinamentoFimTemporada extends Treinamento{

    @Override
    public void preparoFisico(){
        System.out.println("Preparo físico do fim da temporada");
    } @Override
    public void jogoTreino(){
        System.out.println("Jogo treino do fim da temporada");
    }
}
