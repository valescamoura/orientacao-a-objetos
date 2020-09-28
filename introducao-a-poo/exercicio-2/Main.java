/*Exercícios - Introdução a POO
*Exercicio 2
*Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários
*(aumentando a idade) e imprima seu nome e sua idade.*/

public class Main {
    
    public static void main(String[] args){
    Pessoa pessoa = new Pessoa();
    pessoa.nome = "Maria";
    pessoa.idade = 25;

    System.out.println("Antes do aniversário:");
    pessoa.imprimirNome();
    pessoa.imprimirIdade();
    pessoa.fazAniversario();
    System.out.println("Depois do aniversário:");
    pessoa.imprimirNome();
    pessoa.imprimirIdade();
    System.out.println("");
    for(int i = 0; i < 5; i++){
        pessoa.fazAniversario();
    }
    System.out.println("Depois de mais 5 aniversários:");
    pessoa.imprimirNome();
    pessoa.imprimirIdade();
    }
}
