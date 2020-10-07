/*Exercícios - Introdução a POO
*Exercicio 5
*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as
*mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir
*o número de portas abertas.*/

package poo.lista3.exercicio3.ex5;

import poo.lista3.exercicio3.ex4.Porta;

public class Main {
    public static void main(String[] args){
        System.out.println("Construindo uma casa...");
        Casa casa = new Casa("Branco", 10);
        casa.imprimirCorDaCasa();

        System.out.println("Pintando a casa...");
        casa.pintarCasa("Azul");
        casa.imprimirCorDaCasa();

        Porta portaDaSala = new Porta("Marrom", 0.6f, 1.8f);
        Porta portaDaCozinha = new Porta("Preta", 0.5f, 1.9f); 
        Porta portaDoBanheiro = new Porta("Branca", 0.4f, 1.8f);

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
