package exerc_geek_university;

public class Exercicio12 {
    static String data_texto(String data) {

        String[] partes = data.split("/");   // o split divide a string pelo que foi passado
        String mex_txt = "";

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);


        if (mes == 1) {
            mex_txt = "janeiro";
        } else if (mes == 2) {
            mex_txt = "fevereiro";
        } else if (mes == 3) {
            mex_txt = "março";
        } else if (mes == 4) {
            mex_txt = "abril";
        } else if (mes == 5) {
            mex_txt = "maio";
        } else if (mes == 6) {
            mex_txt = "junho";
        } else if (mes == 7) {
            mex_txt = "julho";
        } else if (mes == 8) {
            mex_txt = "agosto";
        } else if (mes == 9) {
            mex_txt = "setembro";
        } else if (mes == 10) {
            mex_txt = "outubro";
        } else if (mes == 11) {
            mex_txt = "novembro";
        } else if (mes == 12) {
            mex_txt = "dezembro";
        }


        return dia + " de " + mex_txt + " de " + ano;
    }

        public static void main(String[]args){
            System.out.println(data_texto("01/01/2024"));
            System.out.println(data_texto("13/12/2002"));
        }
    }
