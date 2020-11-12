package poo.lista5.exercicio2;

public class Construcao implements CarbonFootprint{
    private int numeroDePessoas;
    private boolean energiaRenovavel;
    private int numeroDeLampadas;
    private boolean arCondicionado;
    private float consumoDeEnergiaEmKwh;
    private float emissaoDeCarbonoPorKwh;
    private String cor;

    public Construcao(int numeroDePessoas, boolean energiaRenovavel, int numeroDeLampadas, boolean arCondicionado, float consumoDeEnergiaEmKwh, float emissaoDeCarbonoPorKwh, String cor){
        this.numeroDePessoas = numeroDePessoas;
        this.energiaRenovavel = energiaRenovavel;
        this.numeroDeLampadas = numeroDeLampadas;
        this.arCondicionado = arCondicionado;
        this.consumoDeEnergiaEmKwh = consumoDeEnergiaEmKwh;
        this.emissaoDeCarbonoPorKwh = emissaoDeCarbonoPorKwh;
        this.cor = cor;
    }

    public void pintarConstrucao(String novaCor){
        this.cor = novaCor;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public void setConsumoDeEnergiaEmKwh(float consumoDeEnergiaEmKwh) {
        this.consumoDeEnergiaEmKwh = consumoDeEnergiaEmKwh;
    }

    public void setEmissaoDeCarbonoPorKwh(float emissaoDeCarbonoPorKwh) {
        this.emissaoDeCarbonoPorKwh = emissaoDeCarbonoPorKwh;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        return consumoDeEnergiaEmKwh * emissaoDeCarbonoPorKwh;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Construção");
        System.out.println("Cor: "+cor);
        System.out.println("Emissão de carbono por Kwh: "+emissaoDeCarbonoPorKwh);
        System.out.println("consumo de energia em Kwh: "+consumoDeEnergiaEmKwh);
    }   
}
