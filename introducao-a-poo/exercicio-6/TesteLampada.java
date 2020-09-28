/*Exercícios - Introdução a POO
*Exercício 6
*Escreva uma classe para representar uma lâmpada que está à venda em um
*supermercado. Imagine que essa lâmpada possa ter três estados: apagada, acesa e
*meia-luz. Além disso, ela tem uma operação “estaLigada” que retorne verdadeiro se
*a lâmpada estiver ligada e falso, caso contrário. Crie uma classe TesteLampada que
*implementa o método main com as seguintes operações:
*a. Instancie 2 objetos dessa classe.
*b. Ligar um dos objetos de Lampada e desligar o outro.
*c. Mostrar na tela se as lâmpadas dos objetos estão ligadas ou desligadas*/

public class TesteLampada {
    public static void main(String[] args){
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        
        lampada1.acender();
        lampada2.apagar();

        if(lampada1.estaLigada()) System.out.println("A lâmpada está 1 está ligada!");
        else System.out.println("A lâmpada está 1 está desligada!");

        if(lampada2.estaLigada()) System.out.println("A lâmpada está 2 está ligada!");
        else System.out.println("A lâmpada está 2 está desligada!");
        
        lampada1.meiaLuz();
        System.out.println("Lâmpada 1 após ligar meia-luz...");
        lampada1.mostrarEstado();
        lampada2.acender();
        System.out.println("Lâmpada 2 após acender...");
        lampada2.mostrarEstado();
    }
}
