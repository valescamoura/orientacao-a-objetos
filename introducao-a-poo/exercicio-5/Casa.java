public class Casa {
    private String cor;
    private int numeroDePortas = 10;
    private int qtdDePortas = 0;
    private Porta [] portas = new Porta[numeroDePortas];

    void imprimirCorDaCasa(){
        System.out.println("A cor da casa é "+cor+".");
    }

    void pintarCasa(String novaCor){
        cor = novaCor;
        System.out.println("A casa foi pintada!");
    }

    void quantasPortasEstaoAbertas(){
        int qtdPortasAbertas = 0;
        for(int i = 0; i < qtdDePortas; i++){
            if(portas[i].estaAberta()) qtdPortasAbertas ++;
        }
        System.out.println(qtdPortasAbertas+" portas estão abertas.");
    }

    void addPorta(Porta porta){
        if(qtdDePortas >= numeroDePortas){
            System.out.println("A casa já tem muitas portas, não é possível adicionar mais.");
        }
        else{
            portas[qtdDePortas] = porta;
            qtdDePortas++;
        }
    }
}
