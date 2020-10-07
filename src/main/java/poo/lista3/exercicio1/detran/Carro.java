package poo.lista3.exercicio1.detran;

public class Carro {
    private String modeloDoCarro;
    private int anoDoCarro;
    private String corDoCarro;
    private int qtdDePortas;
    private boolean arCondicionado;
    private boolean flex;
    private String chassi;
    private String placa;
    private boolean ipvaPago;
    private double valorIpva;
    private boolean vistoriado;
    private String donoDoCarro;
    private String municipio;

    public Carro(String modeloDoCarro, 
                int anoDoCarro, 
                String cor, 
                int qtdDePortas, 
                boolean arCondicionado, 
                boolean flex, 
                double valor, 
                String chassi,
                String placa,
                boolean ipvaPago,
                double valoIpva,
                boolean vistoriado,
                String donoDoCarro,
                String municipio){
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.corDoCarro = cor;
        this.arCondicionado = arCondicionado;
        this.qtdDePortas = qtdDePortas;
        this.arCondicionado = arCondicionado;
        this.flex = flex;    
        this.chassi = chassi;
        this.placa = placa;
        this.ipvaPago = ipvaPago;
        this.valorIpva = valoIpva;
        this.vistoriado = vistoriado;
        this.donoDoCarro = donoDoCarro;
        this.municipio = municipio;
    }

    /*
    * métodos getters necessários
    */

    public void vistoria(){}

    public void pagarIpva(){}

    public void emplacar(){}

    public void trocarPlacaPadraoMercosul(){}

    public void tranferirPropriedade(String novoDono){}

    public void trocarMunicipio(String novoMunicipio){}
    
    public void ligar(){
        System.out.println("Carro Ligado!");
    }
    
    public void desligar(){
        System.out.println("Carro Desligado!");
    }
    
    public void acelerar(){
        System.out.println("Acelerar carro");
    }
     
    public void frear(){
        System.out.println("Frear carro");
    }
      
    public void ligarFarois(){
        System.out.println("Farois Ligados!");
    }
       
    public void desligarFarois(){
        System.out.println("Farois desligados!");
    }
       
    public void ligarSeta(){
        System.out.println("Seta ligada!");
    }
        
    public void desligarSeta(){
        System.out.println("Seta desligada!");
    }
        
    public void ligarArCondicionado(){
        System.out.println("Ar Condicionado ligado!");
    }
        
    public void desligarArCondicionado(){
        System.out.println("Ar Condicionado desligado!");
    }
    
    public void acionarLimpadorParabrisa(){
        System.out.println("Limpador de para-brisa acionado!");
    }
         
    public void desligarLimpadorParabrisa(){
        System.out.println("Limpador de para-brisa desligado!");
    } 
}
