package poo.lista5.exercicio2;

public class Carro implements CarbonFootprint{
    private String cor;
    private String combustivel;
    private float cilindrada;
    private float emissaoDeCarbonoPorKM; //gramas em 1 km
    private float distanciaPercorridaEmKM; //Km

    public Carro(String cor,  String combustivel, float cilindrada, float emissaoDeCarbonoPorKM, float distanciaPercorridaEmKM){
        this.cor = cor;
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
        this.emissaoDeCarbonoPorKM = emissaoDeCarbonoPorKM;
        this.distanciaPercorridaEmKM = distanciaPercorridaEmKM;
    }

    public void pintarCarro(String novaCor){
        this.cor = novaCor;
    }

    public void mudarCombustivel(String novoCombustivel, float novaEmissaoDeCarbonoPorKM){
        this.combustivel = novoCombustivel;
        this.emissaoDeCarbonoPorKM = novaEmissaoDeCarbonoPorKM;  
    }

    public void setDistanciaPercorridaEmKM(float distanciaPercorridaEmKM) {
        this.distanciaPercorridaEmKM = distanciaPercorridaEmKM;
    }
 
    @Override
    public double getCarbonFootprint() {
        return distanciaPercorridaEmKM*emissaoDeCarbonoPorKM;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Carro");
        System.out.println("Cor: "+cor);
        System.out.println("Combustível: "+combustivel);
        System.out.println("Cilindrada: "+cilindrada);
        System.out.println("Emissão de carbono por Km percorrido: "+emissaoDeCarbonoPorKM);
        System.out.println("Distância em Km percorrida: "+distanciaPercorridaEmKM);
    } 
}
