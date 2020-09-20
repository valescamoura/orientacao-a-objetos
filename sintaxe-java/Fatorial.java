/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 3 
*Escreva um programa que solicite ao usuário um número inteiro e imprima o
*fatorial desse número*/

import java.util.Scanner;

class Fatorial{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        long numero, fatorial = 1;

        System.out.println("Digite um número inteiro e saiba seu fatorial: ");
        numero = teclado.nextLong();

        for(long i = 2; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial do número " + numero + " é igual a " + fatorial + ".");
    }
}
