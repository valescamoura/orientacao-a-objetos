/*Exercícios - Introdução a POO
*Exercicio 5
*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as
*mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir
*o número de portas abertas.*/

public class Main {
    public static void main(String[] args){
        Casa casa = new Casa();
        casa.pintarCasa("Amarela");
        casa.imprimirCorDaCasa();

        Porta portaDaSala = new Porta();
        portaDaSala.pintarPorta("Marrom");
        portaDaSala.alterarDimensoes(0.6f, 1.8f);
        
        Porta portaDaCozinha = new Porta();
        portaDaCozinha.pintarPorta("Preta");
        portaDaCozinha.alterarDimensoes(0.5f, 1.9f);

        Porta portaDoBanheiro = new Porta();
        portaDoBanheiro.pintarPorta("Branca");
        portaDoBanheiro.alterarDimensoes(0.4f, 1.8f);

        casa.addPorta(portaDaSala);
        casa.addPorta(portaDaCozinha);
        casa.addPorta(portaDoBanheiro);

        System.out.println("Após abrir 3 portas...");
        portaDaSala.abrePorta();
        portaDoBanheiro.abrePorta();
        portaDaCozinha.abrePorta();
        casa.quantasPortasEstaoAbertas();

        System.out.println("Após fechar 1 das portas...");
        portaDoBanheiro.fechaPorta();
        casa.quantasPortasEstaoAbertas();
    }
}
