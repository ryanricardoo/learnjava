
public class Carro {
    String modelo;
    Marca marca;
    Cor cor;

    public static void main(String[] args){
        Carro meuCarro = new Carro();
        Carro meuCarro1 = new Carro();
        Carro meuCarro2 = new Carro();
        Cor c = new Cor();
        Marca m = new Marca();
        Marca m1 = new Marca();
        Marca m2 = new Marca();
        c.nome = "Preto";
        m.nome = "Chevrolet";
        m1.nome = "Volkswagen";
        m2.nome = "Fiat";
        meuCarro.marca = m;
        meuCarro.modelo = "Onix";
        meuCarro1.marca = m1;
        meuCarro2.marca = m2;
        meuCarro1.modelo = "Voyage";
        meuCarro2.modelo = "Strada";

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        System.out.println("Meu primeiro carro teve a marca: " + meuCarro.marca.nome);
        System.out.println("Meu segundo carro teve a marca: " + meuCarro1.marca.nome);
        System.out.println("Meu terceiro carro teve a marca: " + meuCarro2.marca.nome);
    }
}

class Marca{
    String nome;

}

class Cor{
    String nome;
}

