import java.math.BigInteger;

/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 4 
*Imprima os primeiros números da série de Fibonacci até passar de 100. A
*série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para
*calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o
*n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo
*elemento (ex: 8 = 5 + 3)*/

class Fibonacci{
    
    //retorna os 101 primeiros numeros da serie fibonacci
    public static void primeiros101numFib(){
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("1");
        BigInteger fib = new BigInteger("0");
        System.out.print("Primeiros 101 números da Série de Fibonacci: " + n1 + ", " + n2 + ", " );

        for(int i = 2; i <= 100; i++){
            fib = n1.add(n2);
            n1 = n2;
            n2 = fib;
            System.out.print(fib + ", ");
        }
        System.out.println("...");
    }
    
    public static void main(String[] args){
       int n1 = 0, n2 = 1, fib = 0;
        System.out.print("Série de Fibonacci até passar de 100: " + n1 + ", " + n2 + ", " );

        while(fib < 100){
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            System.out.print(fib + ", ");
        }
        System.out.println("...");

        System.out.println("");
        primeiros101numFib();
    }
}
