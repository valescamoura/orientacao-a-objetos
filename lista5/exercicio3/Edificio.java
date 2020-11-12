package poo.lista5.exercicio3;

import poo.lista5.exercicio2.CarbonFootprint;

public abstract class Edificio implements CarbonFootprint{
    protected int numeroDePessoas;
    protected boolean energiaRenovavel;
    protected int numeroDeLampadas;
    protected boolean arCondicionado;
    protected float consumoDeEnergiaEmKwh;
    protected float emissaoDeCarbonoPorKwh;
    protected String cor;

    public Edificio(int numeroDePessoas, boolean energiaRenovavel, int numeroDeLampadas, boolean arCondicionado, float consumoDeEnergiaEmKwh, float emissaoDeCarbonoPorKwh, String cor){
        this.numeroDePessoas = numeroDePessoas;
        this.energiaRenovavel = energiaRenovavel;
        this.numeroDeLampadas = numeroDeLampadas;
        this.arCondicionado = arCondicionado;
        this.consumoDeEnergiaEmKwh = consumoDeEnergiaEmKwh;
        this.emissaoDeCarbonoPorKwh = emissaoDeCarbonoPorKwh;
        this.cor = cor;
    }

    public void pintarEdificio(String novaCor){
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
        System.out.println("Cor: "+cor);
        System.out.println("Emissão de carbono por Kwh: "+emissaoDeCarbonoPorKwh);
        System.out.println("consumo de energia em Kwh: "+consumoDeEnergiaEmKwh);
    }   


}
