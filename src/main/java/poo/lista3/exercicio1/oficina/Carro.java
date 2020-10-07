package poo.lista3.exercicio1.oficina;

public class Carro {
    private String modeloDoCarro;
    private int anoDoCarro;
    private String corDoCarro;
    private int qtdDePortas;
    private boolean arCondicionado;
    private boolean flex;
    private String chassi;
    private String[] pecasDefeituosas = new String[100];
    private boolean trocaDeOleo;
    private boolean trocaDeVelas;
    private boolean trocaDePneus;
    private boolean balanceamento;
    private boolean motordefeituoso;

    public Carro(String modeloDoCarro, 
                int anoDoCarro, 
                String cor, 
                int qtdDePortas, 
                boolean arCondicionado, 
                boolean flex, 
                String chassi, 
                String[] pecasDefeituosas,
                boolean trocaDeOleo,
                boolean trocaDeVelas,
                boolean trocaDePneus,
                boolean balanceamento,
                boolean motordefeituoso
    ){
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.corDoCarro = cor;
        this.arCondicionado = arCondicionado;
        this.qtdDePortas = qtdDePortas;
        this.arCondicionado = arCondicionado;
        this.flex = flex;
        this.chassi = chassi;
        this.pecasDefeituosas = pecasDefeituosas;
        this.trocaDeOleo = trocaDeOleo;
        this.trocaDeVelas = trocaDeVelas;
        this.trocaDePneus = trocaDePneus;
        this.balanceamento = balanceamento;
        this.motordefeituoso = motordefeituoso;
    }

    /*
    *    métodos getters necessários
    */

    public void consertarPecasDefeituosas(String[] pecasDefeituosas){
        System.out.println("Peças consertadas");
    }

    public void trocarOleo(){}

    public void trocarVelas(){}

    public void trocarPneus(){}

    public void balancear(){}

    public void consertarMotor(){}
    
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
