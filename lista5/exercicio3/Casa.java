package poo.lista5.exercicio3;

public class Casa extends Edificio{
    public Casa(int numeroDePessoas, boolean energiaRenovavel, int numeroDeLampadas, boolean arCondicionado, float consumoDeEnergiaEmKwh, float emissaoDeCarbonoPorKwh, String cor){
        super(numeroDePessoas, energiaRenovavel, numeroDeLampadas, arCondicionado, consumoDeEnergiaEmKwh, emissaoDeCarbonoPorKwh, cor);
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Casa");
        super.imprimirInfo();
    } 
}
