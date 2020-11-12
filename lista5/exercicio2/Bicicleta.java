package poo.lista5.exercicio2;

public class Bicicleta implements CarbonFootprint{
    private String cor;
    private int aro;

    public Bicicleta(String cor, int aro){
        this.cor = cor;
        this.aro = aro;
    }

    //a bicicleta não emite gás carbônico, apenas quem está pedalando
    //porém isso varia muito dependendo da dieta da pessoa.
    //portanto, foi considerado 0 nos cálculos.
    @Override
    public double getCarbonFootprint() {
        return 0;
    }

    public void pintarBicicleta(String novaCor){
        this.cor = novaCor;
    }

    public void mudarAro(int novoAro) {
        this.aro = novoAro;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Bicicleta");
        System.out.println("Cor: "+cor);
        System.out.println("Aro: "+aro);
    }
}
