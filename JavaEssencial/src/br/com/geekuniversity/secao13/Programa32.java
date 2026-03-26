package br.com.geekuniversity.secao13;

public class Programa32 {
    public static void main(String[] args) {
        TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
        TreinamentoFimTemporada tft = new TreinamentoFimTemporada();

        tit.treinoDiario();
        System.out.println();
        tft.treinoDiario();
    }

}
