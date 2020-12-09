package poo.lista9.questao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular quantidade de números primos entre 0 e o número n informado por você. (0<quantidade<n)");
        System.out.println("Digite um número inteiro não negativo: ");
        int num = scanner.nextInt();
        scanner.close();

        int meio = num/2;

        ThreadPrimos t1 = new ThreadPrimos(0, meio);
        ThreadPrimos t2 = new ThreadPrimos(meio, num);
    }   
}
