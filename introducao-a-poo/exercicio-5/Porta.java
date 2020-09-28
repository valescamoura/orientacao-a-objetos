public class Porta{
    private String cor;
    private float largura;
    private float altura;
    private boolean aberta = false;

    //retorna true caso a porta esteja aberta
    boolean estaAberta(){
        return aberta;
    }

    //imprime se a porta está aberta ou nao
    void imprimirEstaAberta(){
        if(estaAberta()) System.out.println("A porta está aberta!");
        else System.out.println("A porta está fechada!");
        System.out.println("");
    }

    //abre a porta
    void abrePorta(){
        if(estaAberta()) System.out.println("A porta já está aberta. Não é possível abrir.");
        else aberta = true;
    }   
    
    //fecha a porta
    void fechaPorta(){
        if(estaAberta()) aberta = false;
        else System.out.println("A porta já está fechada. Não é possível fechar.");
    }

    //imprime a cor da porta
    void imprimirCorDaPorta(){
        System.out.println("A cor da porta é: "+cor);
    }

    //pinta a porta com uma nova cor
    void pintarPorta(String novaCor){
        cor = novaCor;
    }

    //imprime as dimensoes da porta
    void imprimirDimensaoDaPorta(){
        System.out.println("A largura da porta em metros é: "+largura);
        System.out.println("A altura da porta em metros é: "+altura);
    }

    //altera as dimensoes da porta
    void alterarDimensoes(float novaLargura, float novaAltura){
        altura = novaAltura;
        largura = novaLargura;
    }

    //imprime caracteristicas gerais da porta
    void mostrarPorta(){
        imprimirCorDaPorta();
        imprimirDimensaoDaPorta();
        System.out.println("");
    }
}
