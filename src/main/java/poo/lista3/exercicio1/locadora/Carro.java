package poo.lista3.exercicio1.locadora;

public class Carro {

    private String modeloDoCarro;
    private int anoDoCarro;
    private String corDoCarro;
    private int qtdDePortas;
    private boolean arCondicionado;
    private boolean estaLocado;
    //outras informações como data de retirada, data de entrega, se o cliente fez seguro para o carrro ou não ficariam numa classe locação
    
    public Carro(String modeloDoCarro, int anoDoCarro, String cor, int qtdDePortas, boolean arCondicionado){
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.corDoCarro = cor;
        this.arCondicionado = arCondicionado;
        this.qtdDePortas = qtdDePortas;
    }
    
    public boolean isLocado(){
       return estaLocado;
    }
   
   //esse método seria chamado pelo método locar(Carro carro Cliente cliente) da classe locação para setar o carro como locado
    public void setLocado(boolean locado){
        this.estaLocado = locado;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public int getQtdDePortas() {
        return qtdDePortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }
    
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
