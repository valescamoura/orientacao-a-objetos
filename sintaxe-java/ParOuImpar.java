import java.util.Scanner;

/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 5 
*Escreva um programa que, dada uma variável x com algum valor inteiro,
*temos um novo x de acordo com a seguinte regra:
*se x é par, x = x / 2
*se x é impar, x = 3 * x + 1
*imprime x
*O programa deve parar quando x tiver o valor final de 1. 
*Por exemplo, para x = 13, a saída será:
*40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/

class ParOuImpar{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.println("Digite um número inteiro: ");
        x = teclado.nextInt();

        while (x != 1){

            if(x % 2 == 0) x /= 2;
            else x = 3 * x + 1;

            //Formatar impressão
            if (x != 1) System.out.print(x + " -> ");
            else System.out.println(x);
        }
    }

}
